package net.morimekta.providence.storage.hazelcast;

import net.morimekta.providence.testing.generator.GeneratorWatcher;
import net.morimekta.providence.testing.generator.SimpleGeneratorWatcher;
import net.morimekta.test.providence.storage.hazelcast.HazelcastStore_Factory;
import net.morimekta.test.providence.storage.hazelcast.OptionalFields;

import com.google.common.collect.ImmutableList;
import com.hazelcast.config.Config;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.instance.HazelcastInstanceFactory;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class HazelcastMessageListStorageTest {
    private static HazelcastInstance instance;

    @Rule
    public SimpleGeneratorWatcher generator = GeneratorWatcher.create();

    @BeforeClass
    public static void setUpHazelcast() {
        Config config = new Config();
        config.setInstanceName("providence-storage-hazelcast");
        HazelcastStore_Factory.populateConfig(config);
        instance = HazelcastInstanceFactory.getOrCreateHazelcastInstance(config);
    }

    @Test
    public void testStorage() {
        IMap<String, List<OptionalFields>> map = instance.getMap(getClass().getName());

        HazelcastMessageListStorage<String,OptionalFields,OptionalFields._Field> storage =
                new HazelcastMessageListStorage<>(map);

        List<OptionalFields> orig = ImmutableList.of(
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor));

        storage.put("1234", orig);

        assertThat(storage.keys(), hasSize(1));
        assertThat(storage.keys(), hasItem("1234"));

        List<OptionalFields> opts = storage.get("1234");

        // Check that the values are the same.
        assertThat(opts, is(orig));
        // Check that the values have been serialized and deserialized (new instances).
        assertThat(opts.get(0), is(not(sameInstance(orig.get(0)))));
        assertThat(opts.get(1), is(not(sameInstance(orig.get(1)))));
    }
}
