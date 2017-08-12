package net.morimekta.providence.storage.hazelcast;


import net.morimekta.test.providence.storage.hazelcast.OptionalFields;

import com.hazelcast.core.IMap;
import org.junit.Test;

public class HazelcastMessageBuilderStorageTest extends TestBase {
    @Test
    public void testStorageConformity() {
        IMap<String, OptionalFields._Builder> map = instance.getMap(getClass().getName());
        HazelcastMessageBuilderStorage<String,OptionalFields,OptionalFields._Field,OptionalFields._Builder> storage =
                new HazelcastMessageBuilderStorage<>(map);
        assertConformity(storage);
    }
}
