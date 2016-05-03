package net.morimekta.providence.generator.format.java.tiny;

import net.morimekta.providence.generator.format.java.utils.JField;
import net.morimekta.providence.generator.format.java.utils.JHelper;
import net.morimekta.providence.generator.format.java.utils.JMessage;
import net.morimekta.providence.generator.format.java.utils.JOptions;
import net.morimekta.util.Strings;
import net.morimekta.util.io.IndentedPrintWriter;

import java.util.Objects;

/**
 * @author Stein Eldar Johnsen
 * @since 08.01.16.
 */
public class TinyMessageOverridesFormat {
    private final IndentedPrintWriter writer;

    public TinyMessageOverridesFormat(IndentedPrintWriter writer, JOptions options, JHelper helper) {
        this.writer = writer;
    }

    public void appendOverrides(JMessage message) {

        // Object

        appendEquals(message);
        appendHashCode(message);
        appendToString(message);
        appendAsString(message);
        appendCompareTo(message);
    }

    private void appendEquals(JMessage<?> message) {
        writer.appendln("@Override")
              .appendln("public boolean equals(Object o) {")
              .begin()
              .formatln("if (o == null || !(o instanceof %s)) return false;", message.instanceType());
        if (message.fields()
                   .size() > 0) {
            boolean first = true;
            writer.formatln("%s other = (%s) o;", message.instanceType(), message.instanceType())
                  .appendln("return ");
            if (message.isUnion()) {
                writer.format("%s.equals(tUnionField, other.tUnionField)",
                              Objects.class.getName());
                first = false;
            }
            for (JField field : message.fields()) {
                if (first) {
                    first = false;
                } else {
                    writer.append(" &&")
                          .appendln("       ");
                }
                writer.format("%s.equals(%s, other.%s)",
                              Objects.class.getName(),
                              field.member(), field.member());
            }
            writer.append(';');
        } else {
            writer.appendln("return true;");
        }
        writer.end()
              .appendln("}")
              .newline();
    }

    private void appendHashCode(JMessage<?> message) {
        writer.appendln("@Override")
              .appendln("public int hashCode() {")
              .begin()
              .appendln("if (tHashCode == 0) {")
              .begin()
              .formatln("tHashCode = %s.hash(",
                        Objects.class.getName())
              .begin("        ")
              .formatln("%s.class", message.instanceType());
        for (JField field : message.fields()) {
            writer.append(",");
            writer.formatln("_Field.%s, %s", field.fieldEnum(), field.member());
        }

        writer.end()
              .append(");")
              .end()
              .appendln('}')
              .appendln("return tHashCode;")
              .end()
              .appendln("}")
              .newline();
    }

    private void appendToString(JMessage<?> message) {
        writer.appendln("@Override")
              .appendln("public String toString() {")
              .begin()
              .formatln("return \"%s\" + asString();",
                        message.descriptor()
                               .getQualifiedName(null))
              .end()
              .appendln('}')
              .newline();
    }

    private void appendAsString(JMessage<?> message) {
        writer.appendln("public String asString() {")
              .begin()
              .appendln("StringBuilder out = new StringBuilder();")
              .appendln("out.append(\"{\");")
              .newline();

        if (message.isUnion()) {
            writer.appendln("switch (tUnionField) {")
                  .begin();

            for (JField field : message.fields()) {
                writer.formatln("case %s: {", field.fieldEnum())
                      .begin()
                      .formatln("out.append(\"%s:\");", field.name());

                switch (field.type()) {
                    case BOOL:
                        writer.formatln("out.append(%s);", field.member());
                        break;
                    case BYTE:
                        writer.formatln("out.append(%s);", field.member());
                        break;
                    case I16:
                        writer.formatln("out.append(%s);", field.member());
                        break;
                    case I32:
                        writer.formatln("out.append(%s);", field.member());
                        break;
                    case I64:
                        writer.formatln("out.append(%s);", field.member());
                        break;
                    case DOUBLE:
                        writer.formatln("out.append(%s.asString(%s));", Strings.class.getName(), field.member());
                        break;
                    case STRING:
                        writer.formatln("out.append('\\\"').append(%s).append('\\\"');", field.member());
                        break;
                    case BINARY:
                        writer.formatln("out.append(\"b64(\").append(%s.toBase64()).append(')');", field.member());
                        break;
                    case ENUM:
                        writer.formatln("out.append(%s.getName());", field.member());
                        break;
                    case MESSAGE:
                        writer.formatln("out.append(%s.asString());", field.member());
                        break;
                    case SET:
                    case LIST:
                    case MAP:
                        writer.formatln("out.append(%s.asString(%s));",
                                        Strings.class.getName(),
                                        field.member());
                        break;
                }

                writer.appendln("break;")
                      .end()
                      .appendln('}');
            }
            writer.end()
                  .appendln('}');
        } else {
            writer.appendln("boolean first = true;");

            boolean first = true;
            for (JField field : message.fields()) {
                if (field.container()) {
                    writer.formatln("if (%s() > 0) {", field.counter());
                } else {
                    writer.formatln("if (%s()) {", field.presence());
                }
                writer.begin();
                if (first) {
                    first = false;
                } else {
                    writer.appendln("if (!first) out.append(',');");
                }
                writer.appendln("first = false;")
                      .formatln("out.append(\"%s:\");", field.name());

                switch (field.type()) {
                    case BOOL:
                        writer.formatln("out.append(%s ? \"true\" : \"false\");", field.member());
                        break;
                    case BYTE:
                        writer.formatln("out.append(Byte.toString(%s));", field.member());
                        break;
                    case I16:
                        writer.formatln("out.append(Short.toString(%s));", field.member());
                        break;
                    case I32:
                        writer.formatln("out.append(Integer.toString(%s));", field.member());
                        break;
                    case I64:
                        writer.formatln("out.append(Long.toString(%s));", field.member());
                        break;
                    case DOUBLE:
                        writer.formatln("out.append(%s.asString(%s));",
                                        Strings.class.getName(),
                                        field.member());
                        break;
                    case STRING:
                        writer.formatln("out.append('\\\"').append(%s).append('\\\"');", field.member());
                        break;
                    case BINARY:
                        writer.formatln("out.append(\"hex(\").append(%s.toHexString()).append(')');", field.member());
                        break;
                    case ENUM:
                        writer.formatln("out.append(%s.getName());", field.member());
                        break;
                    case MESSAGE:
                        writer.formatln("out.append(%s.asString());", field.member());
                        break;
                    case SET:
                    case LIST:
                    case MAP:
                        writer.formatln("out.append(%s.asString(%s));",
                                        Strings.class.getName(),
                                        field.member());
                        break;
                }

                writer.end()
                      .appendln('}');
            }
        }

        writer.appendln("out.append('}');")
              .appendln("return out.toString();")
              .end()
              .appendln("}")
              .newline();
    }

    private void appendCompareTo(JMessage<?> message) {
        writer.appendln("@Override")
              .formatln("public int compareTo(%s other) {", message.instanceType())
              .begin();

        if (message.isUnion()) {
            writer.appendln("int c = Integer.compare(tUnionField.getKey(), other.tUnionField.getKey());")
                  .appendln("if (c != 0) return c;")
                  .newline()
                  .appendln("switch (tUnionField) {")
                  .begin();

            for (JField field : message.fields()) {
                writer.formatln("case %s:", field.fieldEnum())
                      .begin();

                switch (field.type()) {
                    case BOOL:
                        writer.formatln("return Boolean.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case BYTE:
                        writer.formatln("return Byte.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I16:
                        writer.formatln("return Short.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I32:
                        writer.formatln("return Integer.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I64:
                        writer.formatln("return Long.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case DOUBLE:
                        writer.formatln("return Double.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case STRING:
                    case BINARY:
                    case MESSAGE:
                        writer.formatln("return %s.compareTo(other.%s);", field.member(), field.member());
                        break;
                    case ENUM:
                        writer.formatln("return Integer.compare(%s.getValue(), other.%s.getValue());",
                                        field.member(),
                                        field.member());
                        break;
                    case SET:
                    case LIST:
                    case MAP:
                        // containers aren't really comparable, just make some consistent comparison.
                        writer.formatln("return Integer.compare(%s.hashCode(), other.%s.hashCode());",
                                        field.member(),
                                        field.member());
                        break;
                }

                writer.end();
            }
            writer.appendln("default: return 0;")
                  .end()
                  .appendln('}');
        } else {
            writer.appendln("int c;");

            for (JField field : message.fields()) {
                writer.newline();

                if (!field.alwaysPresent()) {
                    writer.formatln("c = Boolean.compare(%s != null, other.%s != null);",
                                    field.member(),
                                    field.member())
                          .appendln("if (c != 0) return c;")
                          .formatln("if (%s != null) {", field.member())
                          .begin();
                }
                switch (field.type()) {
                    case BOOL:
                        writer.formatln("c = Boolean.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case BYTE:
                        writer.formatln("c = Byte.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I16:
                        writer.formatln("c = Short.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I32:
                        writer.formatln("c = Integer.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case I64:
                        writer.formatln("c = Long.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case DOUBLE:
                        writer.formatln("c = Double.compare(%s, other.%s);", field.member(), field.member());
                        break;
                    case STRING:
                    case BINARY:
                    case MESSAGE:
                        writer.formatln("c = %s.compareTo(other.%s);", field.member(), field.member());
                        break;
                    case ENUM:
                        writer.formatln("c = Integer.compare(%s.getValue(), %s.getValue());",
                                        field.member(),
                                        field.member());
                        break;
                    case SET:
                    case LIST:
                    case MAP:
                        writer.formatln("c = Integer.compare(%s.hashCode(), other.%s.hashCode());",
                                        field.member(),
                                        field.member());
                        break;
                }
                writer.appendln("if (c != 0) return c;");

                if (!field.alwaysPresent()) {
                    writer.end()
                          .appendln('}');
                }
            }
            writer.newline()
                  .appendln("return 0;");
        }

        writer.end()
              .appendln("}")
              .newline();
    }
}