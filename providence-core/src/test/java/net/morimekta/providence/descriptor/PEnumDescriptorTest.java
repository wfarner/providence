package net.morimekta.providence.descriptor;

import net.morimekta.providence.PEnumValue;
import net.morimekta.test.providence.core.Value;
import net.morimekta.test.providence.core.calculator.Operator;

import org.junit.Test;

import javax.annotation.Nonnull;
import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class PEnumDescriptorTest {
    @Test
    public void testEnumDescriptor() {
        PEnumDescriptor<Value> vd = Value.kDescriptor;
        PEnumDescriptor<Operator> od = Operator.kDescriptor;

        assertThat(vd, is(not(od)));
        assertThat(vd.equals(null), is(false));
        assertThat(vd.equals(new Object()), is(false));
        assertThat(vd.hashCode(), is(not(od.hashCode())));
        assertThat(vd.getBuilderSupplier(), is(notNullValue()));
        assertThat(vd.equals(vd), is(true));
        assertThat(vd.toString(), is("providence.Value"));
    }

    @Test
    public void testEquals() {
        Dummy base = new Dummy(Value.values());
        Dummy same = new Dummy(Value.values());
        Dummy size = new Dummy(Operator.values());
        Dummy diff = new Dummy(Arrays.copyOfRange(
                Operator.values(), 0, Value.values().length));

        assertThat(base, is(base));
        assertThat(base, is(same));
        assertThat(base, not(size));
        assertThat(base, not(diff));
    }

    @Test
    public void testValue() {
        assertThat(Operator.kDescriptor.valueForId(4), is(Operator.MULTIPLY));
        assertThat(Operator.kDescriptor.valueForName("ADD"), is(Operator.ADD));
        try {
            Operator.kDescriptor.valueForId(55);
            fail("no exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("No calculator.Operator for id 55"));
        }
        try {
            Operator.kDescriptor.valueForName("MODULO");
            fail("no exception");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("No calculator.Operator for name \"MODULO\""));
        }
    }

    private static class Dummy extends PEnumDescriptor {
        private PEnumValue[] values;

        Dummy(PEnumValue[] values) {
            super("package", "Name", Value.kDescriptor.getBuilderSupplier());
            this.values = values;
        }

        @Nonnull
        @Override
        public PEnumValue[] getValues() {
            return values;
        }

        @Override
        public PEnumValue findById(int id) {
            for (PEnumValue val : values) {
                if (val.asInteger() == id) {
                    return val;
                }
            }
            return null;
        }

        @Override
        public PEnumValue findByName(String name) {
            for (PEnumValue val : values) {
                if (val.asString().equals(name)) {
                    return val;
                }
            }
            return null;
        }
    }
}
