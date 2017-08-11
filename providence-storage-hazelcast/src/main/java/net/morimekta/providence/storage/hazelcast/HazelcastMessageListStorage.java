package net.morimekta.providence.storage.hazelcast;

import net.morimekta.providence.PMessage;
import net.morimekta.providence.descriptor.PField;
import net.morimekta.providence.storage.MessageListStore;

import com.hazelcast.core.ICompletableFuture;
import com.hazelcast.core.IMap;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 *
 */
public class HazelcastMessageListStorage<
        K, M extends PMessage<M, F>, F extends PField>
        implements MessageListStore<K,M,F> {
    private final IMap<K, List<M>> hazelcastMap;

    public HazelcastMessageListStorage(IMap<K, List<M>> hazelcastMap) {
        this.hazelcastMap = hazelcastMap;
    }

    @Nonnull
    @Override
    public Map<K, List<M>> putAll(@Nonnull Map<K, List<M>> values) {
        Map<K, ICompletableFuture<List<M>>> futureMap = new HashMap<>();
        for (Map.Entry<K, List<M>> entry : values.entrySet()) {
            futureMap.put(entry.getKey(), hazelcastMap.putAsync(entry.getKey(), entry.getValue()));
        }
        Map<K, List<M>> out = new HashMap<>();
        for (Map.Entry<K, ICompletableFuture<List<M>>> futureEntry : futureMap.entrySet()) {
            try {
                List<M> value = futureEntry.getValue().get();
                if (value != null) {
                    out.put(futureEntry.getKey(), value);
                }
            } catch (ExecutionException | InterruptedException e) {
                // TODO: Figure out if we timed out or were interrupted...
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        return out;
    }

    @Nonnull
    @Override
    public Map<K, List<M>> removeAll(Collection<K> keys) {
        Map<K, ICompletableFuture<List<M>>> futureMap = new HashMap<>();
        for (K key : keys) {
            futureMap.put(key, hazelcastMap.removeAsync(key));
        }
        Map<K, List<M>> out = new HashMap<>();
        for (Map.Entry<K, ICompletableFuture<List<M>>> futureEntry : futureMap.entrySet()) {
            try {
                List<M> value = futureEntry.getValue().get();
                if (value != null) {
                    out.put(futureEntry.getKey(), value);
                }
            } catch (ExecutionException | InterruptedException e) {
                // TODO: Figure out if we timed out or were interrupted...
                throw new RuntimeException(e.getMessage(), e);
            }
        }
        return out;
    }

    @Nonnull
    @Override
    public Map<K, List<M>> getAll(@Nonnull Collection<K> keys) {
        Map<K, List<M>> out = new HashMap<>();
        hazelcastMap.getAll(new HashSet<>(keys)).forEach((k, v) -> {
            if (v != null) {
                out.put(k, v);
            }
        });
        return out;
    }

    @Override
    public boolean containsKey(@Nonnull K key) {
        return hazelcastMap.containsKey(key);
    }

    @Nonnull
    @Override
    public Collection<K> keys() {
        return hazelcastMap.keySet();
    }
}
