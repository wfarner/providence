namespace java net.morimekta.test.providence.storage.hazelcast

const i32 FACTORY_ID = 1234;

enum Value {
   FIRST = 1,
   SECOND = 2,
   THIRD = 3,
   FOURTH = 5,
   FIFTH = 8,
   SIXTH = 13,
   SEVENTH = 21,
   EIGHTH = 34,
   NINTH = 55,
   TENTH = 89,
   ELEVENTH = 144,
   TWELWETH = 233,
   /** @Deprecated */
   THIRTEENTH = 377,
   FOURTEENTH = 610,
   FIFTEENTH = 987,
   SIXTEENTH = 1597,
   SEVENTEENTH = 2584,
   EIGHTEENTH = 4181,
   NINTEENTH = 6765,
   TWENTIETH = 10946
}

struct OptionalFields {
    1: optional bool booleanValue;
    2: optional byte byteValue,
    3: optional i16 shortValue
    4: optional i32 integerValue;
    5: optional i64 longValue,
    6: optional double doubleValue
    7: optional string stringValue;
    8: optional binary binaryValue,
    9: optional Value enumValue;
} (hazelcast.class.id = "1")
