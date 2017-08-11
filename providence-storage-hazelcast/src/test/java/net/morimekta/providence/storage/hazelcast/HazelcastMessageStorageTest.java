package net.morimekta.providence.storage.hazelcast;

import net.morimekta.providence.testing.generator.GeneratorWatcher;
import net.morimekta.providence.testing.generator.SimpleGeneratorWatcher;
import net.morimekta.test.providence.storage.hazelcast.HazelcastStore_Factory;
import net.morimekta.test.providence.storage.hazelcast.OptionalFields;

import com.hazelcast.config.Config;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.instance.HazelcastInstanceFactory;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

/**
 * TODO(steineldar): Make a proper class description.
 */
public class HazelcastMessageStorageTest {
    private static HazelcastInstance instance;

    @Rule
    public SimpleGeneratorWatcher generator = GeneratorWatcher.create();

    @BeforeClass
    public static void setUpHazelcast() {
        Config config = new Config();
        config.setInstanceName("test-storage");
        HazelcastStore_Factory.populateConfig(config);
        instance = HazelcastInstanceFactory.getOrCreateHazelcastInstance(config);
    }

    @Test
    public void testStorage() {
        IMap<String, OptionalFields> map = instance.getMap("test");

        HazelcastMessageStorage<String,OptionalFields,OptionalFields._Field> storage =
                new HazelcastMessageStorage<>(map);

        OptionalFields orig = generator.generate(OptionalFields.kDescriptor);

        storage.put("1234", orig);

        assertThat(storage.keys(), hasSize(1));
        assertThat(storage.keys(), hasItem("1234"));

        OptionalFields opts = storage.get("1234");

        // Check that the values are the same.
        assertThat(opts, is(orig));
        // Check that the values have been serialized and deserialized (new instances).
        assertThat(opts, is(not(sameInstance(orig))));
    }
}
