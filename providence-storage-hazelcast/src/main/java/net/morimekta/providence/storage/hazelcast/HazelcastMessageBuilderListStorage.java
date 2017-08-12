package net.morimekta.providence.storage.hazelcast;

import net.morimekta.providence.PMessage;
import net.morimekta.providence.PMessageBuilder;
import net.morimekta.providence.descriptor.PField;
import net.morimekta.providence.storage.MessageListStore;

import com.google.common.collect.ImmutableMap;
import com.hazelcast.core.ICompletableFuture;
import com.hazelcast.core.IMap;
import com.hazelcast.nio.serialization.Portable;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import static net.morimekta.providence.storage.MessageStoreUtils.buildAll;
import static net.morimekta.providence.storage.MessageStoreUtils.mutateAll;

/**
 * Hazelcast list store backed by lists of portable builder objects of the messages. The
 * backing map will
 */
public class HazelcastMessageBuilderListStorage<
        Key,
        Message extends PMessage<Message, Field>,
        Field extends PField,
        Builder extends PMessageBuilder<Message, Field> & Portable>
        implements MessageListStore<Key, Message, Field> {
    private final IMap<Key, List<Builder>> hazelcastMap;

    public HazelcastMessageBuilderListStorage(IMap<Key, List<Builder>> hazelcastMap) {
        this.hazelcastMap = hazelcastMap;
    }

    @Nonnull
    @Override
    public Map<Key, List<Message>> putAll(@Nonnull Map<Key, List<Message>> values) {
        Map<Key, List<Builder>> tmpIn = new HashMap<>();
        values.forEach((key, list) -> tmpIn.put(key, mutateAll(list)));
        Map<Key, List<Builder>> tmpOut = putAllBuilders(tmpIn);
        Map<Key, List<Message>> ret = new HashMap<>();
        tmpOut.forEach((key, list) -> ret.put(key, buildAll(list)));
        return ImmutableMap.copyOf(ret);
    }

    @Nonnull
    @Override
    @SuppressWarnings("unchecked")
    public <B extends PMessageBuilder<Message, Field>> Map<Key, List<B>> putAllBuilders(@Nonnull Map<Key, List<B>> builders) {
        Map<Key, ICompletableFuture<List<Builder>>> futureMap = new HashMap<>();
        builders.forEach((key, list) -> futureMap.put(key, hazelcastMap.putAsync(key, new ArrayList<>((List<Builder>)list))));
        Map<Key, List<B>> ret = new HashMap<>();
        futureMap.forEach((key, future) -> {
            try {
                List<B> value = (List<B>) future.get();
                if (value != null) {
                    ret.put(key, value);
                }
            } catch (ExecutionException | InterruptedException e) {
                // TODO: Figure out if we timed out or were interrupted...
                throw new RuntimeException(e.getMessage(), e);
            }
        });
        return ret;
    }

    @Nonnull
    @Override
    public Map<Key, List<Message>> removeAll(Collection<Key> keys) {
        Map<Key, ICompletableFuture<List<Builder>>> futureMap = new HashMap<>();
        for (Key key : keys) {
            futureMap.put(key, hazelcastMap.removeAsync(key));
        }
        Map<Key, List<Message>> out = new HashMap<>();
        for (Map.Entry<Key, ICompletableFuture<List<Builder>>> futureEntry : futureMap.entrySet()) {
            try {
                List<Builder> value = futureEntry.getValue().get();
                if (value != null) {
                    out.put(futureEntry.getKey(), buildAll(value));
                }
            } catch (ExecutionException | InterruptedException e) {
                // TODO: Figure out if we timed out or were interrupted...
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        return ImmutableMap.copyOf(out);
    }

    @Nonnull
    @Override
    public Map<Key, List<Message>> getAll(@Nonnull Collection<Key> keys) {
        Map<Key, List<Builder>> tmp = getAllBuilders(keys);
        Map<Key, List<Message>> ret = new HashMap<>();
        tmp.forEach((key, list) -> ret.put(key, buildAll(list)));
        return ImmutableMap.copyOf(ret);
    }

    @Nonnull
    @Override
    @SuppressWarnings("unchecked")
    public <B extends PMessageBuilder<Message, Field>> Map<Key, List<B>> getAllBuilders(@Nonnull Collection<Key> keys) {
        Map<Key, List<B>> out = new HashMap<>();
        hazelcastMap.getAll(new HashSet<>(keys)).forEach((key, v) -> {
            if (v != null) {
                out.put(key, (List<B>) v);
            }
        });
        return out;
    }

    @Override
    public boolean containsKey(@Nonnull Key key) {
        return hazelcastMap.containsKey(key);
    }

    @Nonnull
    @Override
    public Collection<Key> keys() {
        return hazelcastMap.keySet();
    }
}
