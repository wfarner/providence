package net.morimekta.providence.storage;

import net.morimekta.providence.PMessage;
import net.morimekta.providence.PMessageBuilder;
import net.morimekta.providence.descriptor.PField;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Interface for storing messages of a single type.
 */
public interface MessageStore<K, M extends PMessage<M,F>, F extends PField>
        extends MessageReadOnlyStore<K, M, F> {
    /**
     * @param values Put all key value pairs form this map into the storage.
     * @return Map of replaced values.
     */
    @Nonnull
    Map<K,M> putAll(@Nonnull Map<K,M> values);

    /**
     * Remove the values for the given keys.
     * @param keys Map of removed key value pairs.
     * @return Map of removed key value pairs.
     */
    @Nonnull
    Map<K,M> removeAll(Collection<K> keys);

    /**
     * @param key The key to put message at.
     * @param message The message to put.
     * @return Replaced value if any.
     */
    @Nullable
    default M put(@Nonnull K key, @Nonnull M message) {
        return putAll(ImmutableMap.of(key, message)).get(key);
    }

    @Nullable
    default M remove(@Nonnull K key) {
        return removeAll(ImmutableList.of(key)).get(key);
    }

    @Nullable
    @SuppressWarnings("unchecked")
    default <B extends PMessageBuilder<M,F>>
    B putBuilder(@Nonnull K key, @Nonnull B builder) {
        M tmp = put(key, builder.build());
        if (tmp != null) {
            return (B) tmp.mutate();
        }
        return null;
    }

    @Nonnull
    @SuppressWarnings("unchecked")
    default <B extends PMessageBuilder<M,F>>
    Map<K,B> putAllBuilders(@Nonnull Map<K,B> builders) {
        Map<K,M> instances = new HashMap<>();
        builders.forEach((k,b) -> instances.put(k, b.build()));
        Map<K,M> replaced = putAll(instances);
        Map<K,B> out = new HashMap<>();
        replaced.forEach((k,m) -> out.put(k,m==null?null:(B)m.mutate()));
        return out;
    }
}
