package net.morimekta.providence.storage.hazelcast;

import net.morimekta.test.providence.storage.hazelcast.OptionalFields;

import com.hazelcast.core.IMap;
import org.junit.Test;

import java.util.List;

public class HazelcastMessageBuilderListStorageTest extends TestBase {
    @Test
    public void testStorageConformity() {
        IMap<String, List<OptionalFields._Builder>> map = instance.getMap(getClass().getName());
        HazelcastMessageBuilderListStorage<String,OptionalFields,OptionalFields._Field,OptionalFields._Builder> storage =
                new HazelcastMessageBuilderListStorage<>(map);
        assertConformity(storage);
    }
}
