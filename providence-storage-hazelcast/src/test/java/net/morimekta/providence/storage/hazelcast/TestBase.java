package net.morimekta.providence.storage.hazelcast;

import net.morimekta.providence.storage.MessageListStore;
import net.morimekta.providence.storage.MessageStore;
import net.morimekta.providence.testing.generator.GeneratorWatcher;
import net.morimekta.providence.testing.generator.SimpleGeneratorWatcher;
import net.morimekta.test.providence.storage.hazelcast.HazelcastStore_Factory;
import net.morimekta.test.providence.storage.hazelcast.OptionalFields;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.hazelcast.config.Config;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.instance.HazelcastInstanceFactory;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class TestBase {
    static HazelcastInstance instance;

    @BeforeClass
    public static void setUpHazelcast() {
        Config config = new Config();
        config.setInstanceName("providence-storage-hazelcast");
        HazelcastStore_Factory.populateConfig(config);
        instance = HazelcastInstanceFactory.getOrCreateHazelcastInstance(config);
        IMap<String, Integer> map = instance.getMap("test");
        map.compute("test", (k, v) -> {
            if (v == null) {
                return 1;
            }
            return 1 + v;
        });
    }

    @Rule
    public SimpleGeneratorWatcher generator = GeneratorWatcher.create();

    OptionalFields                orig1;
    OptionalFields                orig2;
    OptionalFields._Builder       orig3;
    OptionalFields._Builder       orig4;
    List<OptionalFields>          list1;
    List<OptionalFields>          list2;
    List<OptionalFields._Builder> list3;
    List<OptionalFields._Builder> list4;

    @Before
    public void setUp() {
        orig1 = generator.generate(OptionalFields.kDescriptor);
        orig2 = generator.generate(OptionalFields.kDescriptor);
        orig3 = generator.generate(OptionalFields.kDescriptor).mutate();
        orig4 = generator.generate(OptionalFields.kDescriptor).mutate();

        list1 = ImmutableList.of(
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor));
        list2 = ImmutableList.of(
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor),
                generator.generate(OptionalFields.kDescriptor));
        list3 = ImmutableList.of(
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate());
        list4 = ImmutableList.of(
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate(),
                generator.generate(OptionalFields.kDescriptor).mutate());
    }

    void assertConformity(MessageStore<String, OptionalFields, OptionalFields._Field> storage) {
        assertThat(storage.put("1234", orig1), is(nullValue()));
        assertThat(storage.putAll(ImmutableMap.of("2345", orig2)).keySet(), hasSize(0));

        assertThat(storage.putBuilder("3456", orig3), is(nullValue()));
        assertThat(storage.putAllBuilders(ImmutableMap.of("4567", orig4)).keySet(), hasSize(0));

        assertThat(storage.keys(), hasSize(4));
        assertThat(storage.keys(), hasItem("1234"));
        assertThat(storage.keys(), hasItem("2345"));
        assertThat(storage.keys(), hasItem("3456"));
        assertThat(storage.keys(), hasItem("4567"));

        OptionalFields get1 = storage.get("1234");
        OptionalFields._Builder get2 = storage.getBuilder("2345");
        OptionalFields get3 = storage.get("3456");
        OptionalFields._Builder get4 = storage.getBuilder("4567");
        OptionalFields get5 = storage.get("5678");
        OptionalFields._Builder get6 = storage.getBuilder("6789");

        // Check that the values are the same.
        assertThat(get1, is(notNullValue()));
        assertThat(get2, is(notNullValue()));
        assertThat(get3, is(notNullValue()));
        assertThat(get4, is(notNullValue()));
        assertThat(get5, is(nullValue()));
        assertThat(get6, is(nullValue()));

        assertThat(get1, CoreMatchers.is(orig1));
        assertThat(get2, CoreMatchers.is(orig2.mutate()));
        assertThat(get3, CoreMatchers.is(orig3.build()));
        assertThat(get4, CoreMatchers.is(orig4));

        // Check that getting all conforms.
        Map<String, OptionalFields> map1 = storage.getAll(ImmutableList.of("1234", "3456", "5678"));
        assertThat(map1.keySet(), hasSize(2));
        assertThat(map1, hasEntry("1234", orig1));
        assertThat(map1, Matchers.hasEntry("3456", orig3.build()));

        Map<String, OptionalFields._Builder> map2 = storage.getAllBuilders(ImmutableList.of("1234", "3456", "5678"));
        assertThat(map2.keySet(), hasSize(2));
        assertThat(map2, Matchers.hasEntry("1234", orig1.mutate()));
        assertThat(map2, hasEntry("3456", orig3));

        // Check remove and removeAll.
        assertThat(storage.remove("1234"), CoreMatchers.is(orig1));
        Map<String, OptionalFields> map3 = storage.removeAll(ImmutableList.of("1234", "3456"));
        assertThat(map3.keySet(), hasSize(1));
        assertThat(map3, Matchers.hasEntry("3456", orig3.build()));

        assertThat(storage.get("1234"), is(nullValue()));
        assertThat(storage.get("3456"), is(nullValue()));

        assertThat(storage.containsKey("1234"), is(false));
        assertThat(storage.containsKey("2345"), is(true));

        // Check put overriding.
        assertThat(storage.put("2345", orig1), CoreMatchers.is(orig2));
        assertThat(storage.putBuilder("2345", orig3), CoreMatchers.is(orig1.mutate()));

        Map<String, OptionalFields> put1 = storage.putAll(ImmutableMap.of(
                "1234", orig1,
                "2345", orig2));
        assertThat(put1.keySet(), hasSize(1));
        assertThat(put1, Matchers.hasEntry("2345", orig3.build()));

        Map<String, OptionalFields._Builder> put2 = storage.putAllBuilders(ImmutableMap.of(
                "3456", orig3,
                "4567", orig4));

        assertThat(put2.keySet(), hasSize(1));
        assertThat(put2, hasEntry("4567", orig4));
    }

    void assertConformity(MessageListStore<String, OptionalFields, OptionalFields._Field> storage) {
        assertThat(storage.put("1234", list1), is(nullValue()));
        assertThat(storage.putAll(ImmutableMap.of("2345", list2)).keySet(), is(empty()));
        assertThat(storage.putBuilders("3456", list3), is(nullValue()));
        assertThat(storage.putAllBuilders(ImmutableMap.of("4567", list4)).keySet(), is(empty()));

        assertThat(storage.keys(), hasSize(4));
        assertThat(storage.keys(), hasItems("1234", "2345", "3456", "4567"));
        assertThat(storage.containsKey("1234"), is(true));
        assertThat(storage.containsKey("5678"), is(false));

        List<OptionalFields> opts = storage.get("1234");

        // Check that the values are the same.
        assertThat(opts, is(notNullValue()));
        assertThat(opts, is(list1));
    }
}
