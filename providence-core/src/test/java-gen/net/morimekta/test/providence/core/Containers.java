package net.morimekta.test.providence.core;

@SuppressWarnings("unused")
@javax.annotation.Generated("providence-maven-plugin")
@javax.annotation.concurrent.Immutable
public class Containers
        implements net.morimekta.providence.PMessage<Containers,Containers._Field>,
                   Comparable<Containers>,
                   java.io.Serializable,
                   net.morimekta.providence.serializer.binary.BinaryWriter {
    private final static long serialVersionUID = 3106880629763954881L;

    private final transient java.util.List<Boolean> mBooleanList;
    private final transient java.util.List<Byte> mByteList;
    private final transient java.util.List<Short> mShortList;
    private final transient java.util.List<Integer> mIntegerList;
    private final transient java.util.List<Long> mLongList;
    private final transient java.util.List<Double> mDoubleList;
    private final transient java.util.List<String> mStringList;
    private final transient java.util.List<net.morimekta.util.Binary> mBinaryList;
    private final transient java.util.Set<Boolean> mBooleanSet;
    private final transient java.util.Set<Byte> mByteSet;
    private final transient java.util.Set<Short> mShortSet;
    private final transient java.util.Set<Integer> mIntegerSet;
    private final transient java.util.Set<Long> mLongSet;
    private final transient java.util.Set<Double> mDoubleSet;
    private final transient java.util.Set<String> mStringSet;
    private final transient java.util.Set<net.morimekta.util.Binary> mBinarySet;
    private final transient java.util.Map<Boolean,Boolean> mBooleanMap;
    private final transient java.util.Map<Byte,Byte> mByteMap;
    private final transient java.util.Map<Short,Short> mShortMap;
    private final transient java.util.Map<Integer,Integer> mIntegerMap;
    private final transient java.util.Map<Long,Long> mLongMap;
    private final transient java.util.Map<Double,Double> mDoubleMap;
    private final transient java.util.Map<String,String> mStringMap;
    private final transient java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary> mBinaryMap;
    private final transient java.util.List<net.morimekta.test.providence.core.Value> mEnumList;
    private final transient java.util.Set<net.morimekta.test.providence.core.Value> mEnumSet;
    private final transient java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> mEnumMap;
    private final transient java.util.List<net.morimekta.test.providence.core.DefaultFields> mMessageList;
    private final transient java.util.Set<net.morimekta.test.providence.core.DefaultFields> mMessageSet;
    private final transient java.util.Map<String,net.morimekta.test.providence.core.DefaultFields> mMessageMap;
    private final transient java.util.Map<net.morimekta.test.providence.core.CompactFields,String> mMessageKeyMap;
    private final transient net.morimekta.test.providence.core.RequiredFields mRequiredFields;
    private final transient net.morimekta.test.providence.core.DefaultFields mDefaultFields;
    private final transient net.morimekta.test.providence.core.OptionalFields mOptionalFields;
    private final transient net.morimekta.test.providence.core.UnionFields mUnionFields;
    private final transient net.morimekta.test.providence.core.ExceptionFields mExceptionFields;
    private final transient net.morimekta.test.providence.core.DefaultValues mDefaultValues;
    private final transient java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> mMapListCompact;
    private final transient java.util.List<java.util.Map<Integer,Integer>> mListMapNumbers;
    private final transient java.util.Set<java.util.List<Integer>> mSetListNumbers;
    private final transient java.util.List<java.util.List<Integer>> mListListNumbers;

    private volatile transient int tHashCode;

    // Transient object used during java deserialization.
    private transient Containers tSerializeInstance;

    private Containers(_Builder builder) {
        if (builder.isSetBooleanList()) {
            mBooleanList = com.google.common.collect.ImmutableList.copyOf(builder.mBooleanList);
        } else {
            mBooleanList = null;
        }
        if (builder.isSetByteList()) {
            mByteList = com.google.common.collect.ImmutableList.copyOf(builder.mByteList);
        } else {
            mByteList = null;
        }
        if (builder.isSetShortList()) {
            mShortList = com.google.common.collect.ImmutableList.copyOf(builder.mShortList);
        } else {
            mShortList = null;
        }
        if (builder.isSetIntegerList()) {
            mIntegerList = com.google.common.collect.ImmutableList.copyOf(builder.mIntegerList);
        } else {
            mIntegerList = null;
        }
        if (builder.isSetLongList()) {
            mLongList = com.google.common.collect.ImmutableList.copyOf(builder.mLongList);
        } else {
            mLongList = null;
        }
        if (builder.isSetDoubleList()) {
            mDoubleList = com.google.common.collect.ImmutableList.copyOf(builder.mDoubleList);
        } else {
            mDoubleList = null;
        }
        if (builder.isSetStringList()) {
            mStringList = com.google.common.collect.ImmutableList.copyOf(builder.mStringList);
        } else {
            mStringList = null;
        }
        if (builder.isSetBinaryList()) {
            mBinaryList = com.google.common.collect.ImmutableList.copyOf(builder.mBinaryList);
        } else {
            mBinaryList = null;
        }
        if (builder.isSetBooleanSet()) {
            mBooleanSet = com.google.common.collect.ImmutableSet.copyOf(builder.mBooleanSet);
        } else {
            mBooleanSet = null;
        }
        if (builder.isSetByteSet()) {
            mByteSet = com.google.common.collect.ImmutableSortedSet.copyOf(builder.mByteSet);
        } else {
            mByteSet = null;
        }
        if (builder.isSetShortSet()) {
            mShortSet = com.google.common.collect.ImmutableSet.copyOf(builder.mShortSet);
        } else {
            mShortSet = null;
        }
        if (builder.isSetIntegerSet()) {
            mIntegerSet = com.google.common.collect.ImmutableSet.copyOf(builder.mIntegerSet);
        } else {
            mIntegerSet = null;
        }
        if (builder.isSetLongSet()) {
            mLongSet = com.google.common.collect.ImmutableSet.copyOf(builder.mLongSet);
        } else {
            mLongSet = null;
        }
        if (builder.isSetDoubleSet()) {
            mDoubleSet = com.google.common.collect.ImmutableSet.copyOf(builder.mDoubleSet);
        } else {
            mDoubleSet = null;
        }
        if (builder.isSetStringSet()) {
            mStringSet = com.google.common.collect.ImmutableSet.copyOf(builder.mStringSet);
        } else {
            mStringSet = null;
        }
        if (builder.isSetBinarySet()) {
            mBinarySet = com.google.common.collect.ImmutableSet.copyOf(builder.mBinarySet);
        } else {
            mBinarySet = null;
        }
        if (builder.isSetBooleanMap()) {
            mBooleanMap = com.google.common.collect.ImmutableMap.copyOf(builder.mBooleanMap);
        } else {
            mBooleanMap = null;
        }
        if (builder.isSetByteMap()) {
            mByteMap = com.google.common.collect.ImmutableSortedMap.copyOf(builder.mByteMap);
        } else {
            mByteMap = null;
        }
        if (builder.isSetShortMap()) {
            mShortMap = com.google.common.collect.ImmutableMap.copyOf(builder.mShortMap);
        } else {
            mShortMap = null;
        }
        if (builder.isSetIntegerMap()) {
            mIntegerMap = com.google.common.collect.ImmutableMap.copyOf(builder.mIntegerMap);
        } else {
            mIntegerMap = null;
        }
        if (builder.isSetLongMap()) {
            mLongMap = com.google.common.collect.ImmutableMap.copyOf(builder.mLongMap);
        } else {
            mLongMap = null;
        }
        if (builder.isSetDoubleMap()) {
            mDoubleMap = com.google.common.collect.ImmutableMap.copyOf(builder.mDoubleMap);
        } else {
            mDoubleMap = null;
        }
        if (builder.isSetStringMap()) {
            mStringMap = com.google.common.collect.ImmutableMap.copyOf(builder.mStringMap);
        } else {
            mStringMap = null;
        }
        if (builder.isSetBinaryMap()) {
            mBinaryMap = com.google.common.collect.ImmutableMap.copyOf(builder.mBinaryMap);
        } else {
            mBinaryMap = null;
        }
        if (builder.isSetEnumList()) {
            mEnumList = com.google.common.collect.ImmutableList.copyOf(builder.mEnumList);
        } else {
            mEnumList = null;
        }
        if (builder.isSetEnumSet()) {
            mEnumSet = com.google.common.collect.ImmutableSet.copyOf(builder.mEnumSet);
        } else {
            mEnumSet = null;
        }
        if (builder.isSetEnumMap()) {
            mEnumMap = com.google.common.collect.ImmutableMap.copyOf(builder.mEnumMap);
        } else {
            mEnumMap = null;
        }
        if (builder.isSetMessageList()) {
            mMessageList = com.google.common.collect.ImmutableList.copyOf(builder.mMessageList);
        } else {
            mMessageList = null;
        }
        if (builder.isSetMessageSet()) {
            mMessageSet = com.google.common.collect.ImmutableSet.copyOf(builder.mMessageSet);
        } else {
            mMessageSet = null;
        }
        if (builder.isSetMessageMap()) {
            mMessageMap = com.google.common.collect.ImmutableMap.copyOf(builder.mMessageMap);
        } else {
            mMessageMap = null;
        }
        if (builder.isSetMessageKeyMap()) {
            mMessageKeyMap = com.google.common.collect.ImmutableMap.copyOf(builder.mMessageKeyMap);
        } else {
            mMessageKeyMap = null;
        }
        mRequiredFields = builder.mRequiredFields_builder != null ? builder.mRequiredFields_builder.build() : builder.mRequiredFields;
        mDefaultFields = builder.mDefaultFields_builder != null ? builder.mDefaultFields_builder.build() : builder.mDefaultFields;
        mOptionalFields = builder.mOptionalFields_builder != null ? builder.mOptionalFields_builder.build() : builder.mOptionalFields;
        mUnionFields = builder.mUnionFields_builder != null ? builder.mUnionFields_builder.build() : builder.mUnionFields;
        mExceptionFields = builder.mExceptionFields_builder != null ? builder.mExceptionFields_builder.build() : builder.mExceptionFields;
        mDefaultValues = builder.mDefaultValues_builder != null ? builder.mDefaultValues_builder.build() : builder.mDefaultValues;
        if (builder.isSetMapListCompact()) {
            mMapListCompact = com.google.common.collect.ImmutableMap.copyOf(builder.mMapListCompact);
        } else {
            mMapListCompact = null;
        }
        if (builder.isSetListMapNumbers()) {
            mListMapNumbers = com.google.common.collect.ImmutableList.copyOf(builder.mListMapNumbers);
        } else {
            mListMapNumbers = null;
        }
        if (builder.isSetSetListNumbers()) {
            mSetListNumbers = com.google.common.collect.ImmutableSet.copyOf(builder.mSetListNumbers);
        } else {
            mSetListNumbers = null;
        }
        if (builder.isSetListListNumbers()) {
            mListListNumbers = com.google.common.collect.ImmutableList.copyOf(builder.mListListNumbers);
        } else {
            mListListNumbers = null;
        }
    }

    public int numBooleanList() {
        return mBooleanList != null ? mBooleanList.size() : 0;
    }

    public boolean hasBooleanList() {
        return mBooleanList != null;
    }

    /**
     * all types as list&lt;x&gt;.
     *
     * @return The field value
     */
    public java.util.List<Boolean> getBooleanList() {
        return mBooleanList;
    }

    public int numByteList() {
        return mByteList != null ? mByteList.size() : 0;
    }

    public boolean hasByteList() {
        return mByteList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<Byte> getByteList() {
        return mByteList;
    }

    public int numShortList() {
        return mShortList != null ? mShortList.size() : 0;
    }

    public boolean hasShortList() {
        return mShortList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<Short> getShortList() {
        return mShortList;
    }

    public int numIntegerList() {
        return mIntegerList != null ? mIntegerList.size() : 0;
    }

    public boolean hasIntegerList() {
        return mIntegerList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<Integer> getIntegerList() {
        return mIntegerList;
    }

    public int numLongList() {
        return mLongList != null ? mLongList.size() : 0;
    }

    public boolean hasLongList() {
        return mLongList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<Long> getLongList() {
        return mLongList;
    }

    public int numDoubleList() {
        return mDoubleList != null ? mDoubleList.size() : 0;
    }

    public boolean hasDoubleList() {
        return mDoubleList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<Double> getDoubleList() {
        return mDoubleList;
    }

    public int numStringList() {
        return mStringList != null ? mStringList.size() : 0;
    }

    public boolean hasStringList() {
        return mStringList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<String> getStringList() {
        return mStringList;
    }

    public int numBinaryList() {
        return mBinaryList != null ? mBinaryList.size() : 0;
    }

    public boolean hasBinaryList() {
        return mBinaryList != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<net.morimekta.util.Binary> getBinaryList() {
        return mBinaryList;
    }

    public int numBooleanSet() {
        return mBooleanSet != null ? mBooleanSet.size() : 0;
    }

    public boolean hasBooleanSet() {
        return mBooleanSet != null;
    }

    /**
     * all types as set&lt;x&gt;.
     *
     * @return The field value
     */
    public java.util.Set<Boolean> getBooleanSet() {
        return mBooleanSet;
    }

    public int numByteSet() {
        return mByteSet != null ? mByteSet.size() : 0;
    }

    public boolean hasByteSet() {
        return mByteSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<Byte> getByteSet() {
        return mByteSet;
    }

    public int numShortSet() {
        return mShortSet != null ? mShortSet.size() : 0;
    }

    public boolean hasShortSet() {
        return mShortSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<Short> getShortSet() {
        return mShortSet;
    }

    public int numIntegerSet() {
        return mIntegerSet != null ? mIntegerSet.size() : 0;
    }

    public boolean hasIntegerSet() {
        return mIntegerSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<Integer> getIntegerSet() {
        return mIntegerSet;
    }

    public int numLongSet() {
        return mLongSet != null ? mLongSet.size() : 0;
    }

    public boolean hasLongSet() {
        return mLongSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<Long> getLongSet() {
        return mLongSet;
    }

    public int numDoubleSet() {
        return mDoubleSet != null ? mDoubleSet.size() : 0;
    }

    public boolean hasDoubleSet() {
        return mDoubleSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<Double> getDoubleSet() {
        return mDoubleSet;
    }

    public int numStringSet() {
        return mStringSet != null ? mStringSet.size() : 0;
    }

    public boolean hasStringSet() {
        return mStringSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<String> getStringSet() {
        return mStringSet;
    }

    public int numBinarySet() {
        return mBinarySet != null ? mBinarySet.size() : 0;
    }

    public boolean hasBinarySet() {
        return mBinarySet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<net.morimekta.util.Binary> getBinarySet() {
        return mBinarySet;
    }

    public int numBooleanMap() {
        return mBooleanMap != null ? mBooleanMap.size() : 0;
    }

    public boolean hasBooleanMap() {
        return mBooleanMap != null;
    }

    /**
     * all types as map&lt;x,x&gt;.
     *
     * @return The field value
     */
    public java.util.Map<Boolean,Boolean> getBooleanMap() {
        return mBooleanMap;
    }

    public int numByteMap() {
        return mByteMap != null ? mByteMap.size() : 0;
    }

    public boolean hasByteMap() {
        return mByteMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Byte,Byte> getByteMap() {
        return mByteMap;
    }

    public int numShortMap() {
        return mShortMap != null ? mShortMap.size() : 0;
    }

    public boolean hasShortMap() {
        return mShortMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Short,Short> getShortMap() {
        return mShortMap;
    }

    public int numIntegerMap() {
        return mIntegerMap != null ? mIntegerMap.size() : 0;
    }

    public boolean hasIntegerMap() {
        return mIntegerMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Integer,Integer> getIntegerMap() {
        return mIntegerMap;
    }

    public int numLongMap() {
        return mLongMap != null ? mLongMap.size() : 0;
    }

    public boolean hasLongMap() {
        return mLongMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Long,Long> getLongMap() {
        return mLongMap;
    }

    public int numDoubleMap() {
        return mDoubleMap != null ? mDoubleMap.size() : 0;
    }

    public boolean hasDoubleMap() {
        return mDoubleMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Double,Double> getDoubleMap() {
        return mDoubleMap;
    }

    public int numStringMap() {
        return mStringMap != null ? mStringMap.size() : 0;
    }

    public boolean hasStringMap() {
        return mStringMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<String,String> getStringMap() {
        return mStringMap;
    }

    public int numBinaryMap() {
        return mBinaryMap != null ? mBinaryMap.size() : 0;
    }

    public boolean hasBinaryMap() {
        return mBinaryMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary> getBinaryMap() {
        return mBinaryMap;
    }

    public int numEnumList() {
        return mEnumList != null ? mEnumList.size() : 0;
    }

    public boolean hasEnumList() {
        return mEnumList != null;
    }

    /**
     * Using enum as key and value in containers.
     *
     * @return The field value
     */
    public java.util.List<net.morimekta.test.providence.core.Value> getEnumList() {
        return mEnumList;
    }

    public int numEnumSet() {
        return mEnumSet != null ? mEnumSet.size() : 0;
    }

    public boolean hasEnumSet() {
        return mEnumSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<net.morimekta.test.providence.core.Value> getEnumSet() {
        return mEnumSet;
    }

    public int numEnumMap() {
        return mEnumMap != null ? mEnumMap.size() : 0;
    }

    public boolean hasEnumMap() {
        return mEnumMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> getEnumMap() {
        return mEnumMap;
    }

    public int numMessageList() {
        return mMessageList != null ? mMessageList.size() : 0;
    }

    public boolean hasMessageList() {
        return mMessageList != null;
    }

    /**
     * Using struct as key and value in containers.
     *
     * @return The field value
     */
    public java.util.List<net.morimekta.test.providence.core.DefaultFields> getMessageList() {
        return mMessageList;
    }

    public int numMessageSet() {
        return mMessageSet != null ? mMessageSet.size() : 0;
    }

    public boolean hasMessageSet() {
        return mMessageSet != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<net.morimekta.test.providence.core.DefaultFields> getMessageSet() {
        return mMessageSet;
    }

    public int numMessageMap() {
        return mMessageMap != null ? mMessageMap.size() : 0;
    }

    public boolean hasMessageMap() {
        return mMessageMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<String,net.morimekta.test.providence.core.DefaultFields> getMessageMap() {
        return mMessageMap;
    }

    public int numMessageKeyMap() {
        return mMessageKeyMap != null ? mMessageKeyMap.size() : 0;
    }

    public boolean hasMessageKeyMap() {
        return mMessageKeyMap != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<net.morimekta.test.providence.core.CompactFields,String> getMessageKeyMap() {
        return mMessageKeyMap;
    }

    public boolean hasRequiredFields() {
        return mRequiredFields != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.RequiredFields getRequiredFields() {
        return mRequiredFields;
    }

    public boolean hasDefaultFields() {
        return mDefaultFields != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.DefaultFields getDefaultFields() {
        return mDefaultFields;
    }

    public boolean hasOptionalFields() {
        return mOptionalFields != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.OptionalFields getOptionalFields() {
        return mOptionalFields;
    }

    public boolean hasUnionFields() {
        return mUnionFields != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.UnionFields getUnionFields() {
        return mUnionFields;
    }

    public boolean hasExceptionFields() {
        return mExceptionFields != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.ExceptionFields getExceptionFields() {
        return mExceptionFields;
    }

    public boolean hasDefaultValues() {
        return mDefaultValues != null;
    }

    /**
     * @return The field value
     */
    public net.morimekta.test.providence.core.DefaultValues getDefaultValues() {
        return mDefaultValues;
    }

    public int numMapListCompact() {
        return mMapListCompact != null ? mMapListCompact.size() : 0;
    }

    public boolean hasMapListCompact() {
        return mMapListCompact != null;
    }

    /**
     * @return The field value
     */
    public java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> getMapListCompact() {
        return mMapListCompact;
    }

    public int numListMapNumbers() {
        return mListMapNumbers != null ? mListMapNumbers.size() : 0;
    }

    public boolean hasListMapNumbers() {
        return mListMapNumbers != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<java.util.Map<Integer,Integer>> getListMapNumbers() {
        return mListMapNumbers;
    }

    public int numSetListNumbers() {
        return mSetListNumbers != null ? mSetListNumbers.size() : 0;
    }

    public boolean hasSetListNumbers() {
        return mSetListNumbers != null;
    }

    /**
     * @return The field value
     */
    public java.util.Set<java.util.List<Integer>> getSetListNumbers() {
        return mSetListNumbers;
    }

    public int numListListNumbers() {
        return mListListNumbers != null ? mListListNumbers.size() : 0;
    }

    public boolean hasListListNumbers() {
        return mListListNumbers != null;
    }

    /**
     * @return The field value
     */
    public java.util.List<java.util.List<Integer>> getListListNumbers() {
        return mListListNumbers;
    }

    @Override
    public boolean has(int key) {
        switch(key) {
            case 1: return mBooleanList != null;
            case 2: return mByteList != null;
            case 3: return mShortList != null;
            case 4: return mIntegerList != null;
            case 5: return mLongList != null;
            case 6: return mDoubleList != null;
            case 7: return mStringList != null;
            case 8: return mBinaryList != null;
            case 11: return mBooleanSet != null;
            case 12: return mByteSet != null;
            case 13: return mShortSet != null;
            case 14: return mIntegerSet != null;
            case 15: return mLongSet != null;
            case 16: return mDoubleSet != null;
            case 17: return mStringSet != null;
            case 18: return mBinarySet != null;
            case 21: return mBooleanMap != null;
            case 22: return mByteMap != null;
            case 23: return mShortMap != null;
            case 24: return mIntegerMap != null;
            case 25: return mLongMap != null;
            case 26: return mDoubleMap != null;
            case 27: return mStringMap != null;
            case 28: return mBinaryMap != null;
            case 31: return mEnumList != null;
            case 32: return mEnumSet != null;
            case 33: return mEnumMap != null;
            case 41: return mMessageList != null;
            case 42: return mMessageSet != null;
            case 43: return mMessageMap != null;
            case 44: return mMessageKeyMap != null;
            case 51: return mRequiredFields != null;
            case 52: return mDefaultFields != null;
            case 53: return mOptionalFields != null;
            case 54: return mUnionFields != null;
            case 55: return mExceptionFields != null;
            case 56: return mDefaultValues != null;
            case 61: return mMapListCompact != null;
            case 62: return mListMapNumbers != null;
            case 63: return mSetListNumbers != null;
            case 64: return mListListNumbers != null;
            default: return false;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get(int key) {
        switch(key) {
            case 1: return (T) mBooleanList;
            case 2: return (T) mByteList;
            case 3: return (T) mShortList;
            case 4: return (T) mIntegerList;
            case 5: return (T) mLongList;
            case 6: return (T) mDoubleList;
            case 7: return (T) mStringList;
            case 8: return (T) mBinaryList;
            case 11: return (T) mBooleanSet;
            case 12: return (T) mByteSet;
            case 13: return (T) mShortSet;
            case 14: return (T) mIntegerSet;
            case 15: return (T) mLongSet;
            case 16: return (T) mDoubleSet;
            case 17: return (T) mStringSet;
            case 18: return (T) mBinarySet;
            case 21: return (T) mBooleanMap;
            case 22: return (T) mByteMap;
            case 23: return (T) mShortMap;
            case 24: return (T) mIntegerMap;
            case 25: return (T) mLongMap;
            case 26: return (T) mDoubleMap;
            case 27: return (T) mStringMap;
            case 28: return (T) mBinaryMap;
            case 31: return (T) mEnumList;
            case 32: return (T) mEnumSet;
            case 33: return (T) mEnumMap;
            case 41: return (T) mMessageList;
            case 42: return (T) mMessageSet;
            case 43: return (T) mMessageMap;
            case 44: return (T) mMessageKeyMap;
            case 51: return (T) mRequiredFields;
            case 52: return (T) mDefaultFields;
            case 53: return (T) mOptionalFields;
            case 54: return (T) mUnionFields;
            case 55: return (T) mExceptionFields;
            case 56: return (T) mDefaultValues;
            case 61: return (T) mMapListCompact;
            case 62: return (T) mListMapNumbers;
            case 63: return (T) mSetListNumbers;
            case 64: return (T) mListListNumbers;
            default: return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || !o.getClass().equals(getClass())) return false;
        Containers other = (Containers) o;
        return java.util.Objects.equals(mBooleanList, other.mBooleanList) &&
               java.util.Objects.equals(mByteList, other.mByteList) &&
               java.util.Objects.equals(mShortList, other.mShortList) &&
               java.util.Objects.equals(mIntegerList, other.mIntegerList) &&
               java.util.Objects.equals(mLongList, other.mLongList) &&
               java.util.Objects.equals(mDoubleList, other.mDoubleList) &&
               java.util.Objects.equals(mStringList, other.mStringList) &&
               java.util.Objects.equals(mBinaryList, other.mBinaryList) &&
               java.util.Objects.equals(mBooleanSet, other.mBooleanSet) &&
               java.util.Objects.equals(mByteSet, other.mByteSet) &&
               java.util.Objects.equals(mShortSet, other.mShortSet) &&
               java.util.Objects.equals(mIntegerSet, other.mIntegerSet) &&
               java.util.Objects.equals(mLongSet, other.mLongSet) &&
               java.util.Objects.equals(mDoubleSet, other.mDoubleSet) &&
               java.util.Objects.equals(mStringSet, other.mStringSet) &&
               java.util.Objects.equals(mBinarySet, other.mBinarySet) &&
               java.util.Objects.equals(mBooleanMap, other.mBooleanMap) &&
               java.util.Objects.equals(mByteMap, other.mByteMap) &&
               java.util.Objects.equals(mShortMap, other.mShortMap) &&
               java.util.Objects.equals(mIntegerMap, other.mIntegerMap) &&
               java.util.Objects.equals(mLongMap, other.mLongMap) &&
               java.util.Objects.equals(mDoubleMap, other.mDoubleMap) &&
               java.util.Objects.equals(mStringMap, other.mStringMap) &&
               java.util.Objects.equals(mBinaryMap, other.mBinaryMap) &&
               java.util.Objects.equals(mEnumList, other.mEnumList) &&
               java.util.Objects.equals(mEnumSet, other.mEnumSet) &&
               java.util.Objects.equals(mEnumMap, other.mEnumMap) &&
               java.util.Objects.equals(mMessageList, other.mMessageList) &&
               java.util.Objects.equals(mMessageSet, other.mMessageSet) &&
               java.util.Objects.equals(mMessageMap, other.mMessageMap) &&
               java.util.Objects.equals(mMessageKeyMap, other.mMessageKeyMap) &&
               java.util.Objects.equals(mRequiredFields, other.mRequiredFields) &&
               java.util.Objects.equals(mDefaultFields, other.mDefaultFields) &&
               java.util.Objects.equals(mOptionalFields, other.mOptionalFields) &&
               java.util.Objects.equals(mUnionFields, other.mUnionFields) &&
               java.util.Objects.equals(mExceptionFields, other.mExceptionFields) &&
               java.util.Objects.equals(mDefaultValues, other.mDefaultValues) &&
               java.util.Objects.equals(mMapListCompact, other.mMapListCompact) &&
               java.util.Objects.equals(mListMapNumbers, other.mListMapNumbers) &&
               java.util.Objects.equals(mSetListNumbers, other.mSetListNumbers) &&
               java.util.Objects.equals(mListListNumbers, other.mListListNumbers);
    }

    @Override
    public int hashCode() {
        if (tHashCode == 0) {
            tHashCode = java.util.Objects.hash(
                    Containers.class,
                    _Field.BOOLEAN_LIST, mBooleanList,
                    _Field.BYTE_LIST, mByteList,
                    _Field.SHORT_LIST, mShortList,
                    _Field.INTEGER_LIST, mIntegerList,
                    _Field.LONG_LIST, mLongList,
                    _Field.DOUBLE_LIST, mDoubleList,
                    _Field.STRING_LIST, mStringList,
                    _Field.BINARY_LIST, mBinaryList,
                    _Field.BOOLEAN_SET, mBooleanSet,
                    _Field.BYTE_SET, mByteSet,
                    _Field.SHORT_SET, mShortSet,
                    _Field.INTEGER_SET, mIntegerSet,
                    _Field.LONG_SET, mLongSet,
                    _Field.DOUBLE_SET, mDoubleSet,
                    _Field.STRING_SET, mStringSet,
                    _Field.BINARY_SET, mBinarySet,
                    _Field.BOOLEAN_MAP, mBooleanMap,
                    _Field.BYTE_MAP, mByteMap,
                    _Field.SHORT_MAP, mShortMap,
                    _Field.INTEGER_MAP, mIntegerMap,
                    _Field.LONG_MAP, mLongMap,
                    _Field.DOUBLE_MAP, mDoubleMap,
                    _Field.STRING_MAP, mStringMap,
                    _Field.BINARY_MAP, mBinaryMap,
                    _Field.ENUM_LIST, mEnumList,
                    _Field.ENUM_SET, mEnumSet,
                    _Field.ENUM_MAP, mEnumMap,
                    _Field.MESSAGE_LIST, mMessageList,
                    _Field.MESSAGE_SET, mMessageSet,
                    _Field.MESSAGE_MAP, mMessageMap,
                    _Field.MESSAGE_KEY_MAP, mMessageKeyMap,
                    _Field.REQUIRED_FIELDS, mRequiredFields,
                    _Field.DEFAULT_FIELDS, mDefaultFields,
                    _Field.OPTIONAL_FIELDS, mOptionalFields,
                    _Field.UNION_FIELDS, mUnionFields,
                    _Field.EXCEPTION_FIELDS, mExceptionFields,
                    _Field.DEFAULT_VALUES, mDefaultValues,
                    _Field.MAP_LIST_COMPACT, mMapListCompact,
                    _Field.LIST_MAP_NUMBERS, mListMapNumbers,
                    _Field.SET_LIST_NUMBERS, mSetListNumbers,
                    _Field.LIST_LIST_NUMBERS, mListListNumbers);
        }
        return tHashCode;
    }

    @Override
    public String toString() {
        return "providence.Containers" + asString();
    }

    @Override
    @javax.annotation.Nonnull
    public String asString() {
        StringBuilder out = new StringBuilder();
        out.append("{");

        boolean first = true;
        if (hasBooleanList()) {
            first = false;
            out.append("booleanList:")
               .append(net.morimekta.util.Strings.asString(mBooleanList));
        }
        if (hasByteList()) {
            if (first) first = false;
            else out.append(',');
            out.append("byteList:")
               .append(net.morimekta.util.Strings.asString(mByteList));
        }
        if (hasShortList()) {
            if (first) first = false;
            else out.append(',');
            out.append("shortList:")
               .append(net.morimekta.util.Strings.asString(mShortList));
        }
        if (hasIntegerList()) {
            if (first) first = false;
            else out.append(',');
            out.append("integerList:")
               .append(net.morimekta.util.Strings.asString(mIntegerList));
        }
        if (hasLongList()) {
            if (first) first = false;
            else out.append(',');
            out.append("longList:")
               .append(net.morimekta.util.Strings.asString(mLongList));
        }
        if (hasDoubleList()) {
            if (first) first = false;
            else out.append(',');
            out.append("doubleList:")
               .append(net.morimekta.util.Strings.asString(mDoubleList));
        }
        if (hasStringList()) {
            if (first) first = false;
            else out.append(',');
            out.append("stringList:")
               .append(net.morimekta.util.Strings.asString(mStringList));
        }
        if (hasBinaryList()) {
            if (first) first = false;
            else out.append(',');
            out.append("binaryList:")
               .append(net.morimekta.util.Strings.asString(mBinaryList));
        }
        if (hasBooleanSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("booleanSet:")
               .append(net.morimekta.util.Strings.asString(mBooleanSet));
        }
        if (hasByteSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("byteSet:")
               .append(net.morimekta.util.Strings.asString(mByteSet));
        }
        if (hasShortSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("shortSet:")
               .append(net.morimekta.util.Strings.asString(mShortSet));
        }
        if (hasIntegerSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("integerSet:")
               .append(net.morimekta.util.Strings.asString(mIntegerSet));
        }
        if (hasLongSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("longSet:")
               .append(net.morimekta.util.Strings.asString(mLongSet));
        }
        if (hasDoubleSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("doubleSet:")
               .append(net.morimekta.util.Strings.asString(mDoubleSet));
        }
        if (hasStringSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("stringSet:")
               .append(net.morimekta.util.Strings.asString(mStringSet));
        }
        if (hasBinarySet()) {
            if (first) first = false;
            else out.append(',');
            out.append("binarySet:")
               .append(net.morimekta.util.Strings.asString(mBinarySet));
        }
        if (hasBooleanMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("booleanMap:")
               .append(net.morimekta.util.Strings.asString(mBooleanMap));
        }
        if (hasByteMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("byteMap:")
               .append(net.morimekta.util.Strings.asString(mByteMap));
        }
        if (hasShortMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("shortMap:")
               .append(net.morimekta.util.Strings.asString(mShortMap));
        }
        if (hasIntegerMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("integerMap:")
               .append(net.morimekta.util.Strings.asString(mIntegerMap));
        }
        if (hasLongMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("longMap:")
               .append(net.morimekta.util.Strings.asString(mLongMap));
        }
        if (hasDoubleMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("doubleMap:")
               .append(net.morimekta.util.Strings.asString(mDoubleMap));
        }
        if (hasStringMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("stringMap:")
               .append(net.morimekta.util.Strings.asString(mStringMap));
        }
        if (hasBinaryMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("binaryMap:")
               .append(net.morimekta.util.Strings.asString(mBinaryMap));
        }
        if (hasEnumList()) {
            if (first) first = false;
            else out.append(',');
            out.append("enumList:")
               .append(net.morimekta.util.Strings.asString(mEnumList));
        }
        if (hasEnumSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("enumSet:")
               .append(net.morimekta.util.Strings.asString(mEnumSet));
        }
        if (hasEnumMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("enumMap:")
               .append(net.morimekta.util.Strings.asString(mEnumMap));
        }
        if (hasMessageList()) {
            if (first) first = false;
            else out.append(',');
            out.append("messageList:")
               .append(net.morimekta.util.Strings.asString(mMessageList));
        }
        if (hasMessageSet()) {
            if (first) first = false;
            else out.append(',');
            out.append("messageSet:")
               .append(net.morimekta.util.Strings.asString(mMessageSet));
        }
        if (hasMessageMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("messageMap:")
               .append(net.morimekta.util.Strings.asString(mMessageMap));
        }
        if (hasMessageKeyMap()) {
            if (first) first = false;
            else out.append(',');
            out.append("messageKeyMap:")
               .append(net.morimekta.util.Strings.asString(mMessageKeyMap));
        }
        if (hasRequiredFields()) {
            if (first) first = false;
            else out.append(',');
            out.append("requiredFields:")
               .append(mRequiredFields.asString());
        }
        if (hasDefaultFields()) {
            if (first) first = false;
            else out.append(',');
            out.append("defaultFields:")
               .append(mDefaultFields.asString());
        }
        if (hasOptionalFields()) {
            if (first) first = false;
            else out.append(',');
            out.append("optionalFields:")
               .append(mOptionalFields.asString());
        }
        if (hasUnionFields()) {
            if (first) first = false;
            else out.append(',');
            out.append("unionFields:")
               .append(mUnionFields.asString());
        }
        if (hasExceptionFields()) {
            if (first) first = false;
            else out.append(',');
            out.append("exceptionFields:")
               .append(mExceptionFields.asString());
        }
        if (hasDefaultValues()) {
            if (first) first = false;
            else out.append(',');
            out.append("defaultValues:")
               .append(mDefaultValues.asString());
        }
        if (hasMapListCompact()) {
            if (first) first = false;
            else out.append(',');
            out.append("map_list_compact:")
               .append(net.morimekta.util.Strings.asString(mMapListCompact));
        }
        if (hasListMapNumbers()) {
            if (first) first = false;
            else out.append(',');
            out.append("list_map_numbers:")
               .append(net.morimekta.util.Strings.asString(mListMapNumbers));
        }
        if (hasSetListNumbers()) {
            if (first) first = false;
            else out.append(',');
            out.append("set_list_numbers:")
               .append(net.morimekta.util.Strings.asString(mSetListNumbers));
        }
        if (hasListListNumbers()) {
            if (!first) out.append(',');
            out.append("list_list_numbers:")
               .append(net.morimekta.util.Strings.asString(mListListNumbers));
        }
        out.append('}');
        return out.toString();
    }

    @Override
    public int compareTo(Containers other) {
        int c;

        c = Boolean.compare(mBooleanList != null, other.mBooleanList != null);
        if (c != 0) return c;
        if (mBooleanList != null) {
            c = Integer.compare(mBooleanList.hashCode(), other.mBooleanList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mByteList != null, other.mByteList != null);
        if (c != 0) return c;
        if (mByteList != null) {
            c = Integer.compare(mByteList.hashCode(), other.mByteList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mShortList != null, other.mShortList != null);
        if (c != 0) return c;
        if (mShortList != null) {
            c = Integer.compare(mShortList.hashCode(), other.mShortList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mIntegerList != null, other.mIntegerList != null);
        if (c != 0) return c;
        if (mIntegerList != null) {
            c = Integer.compare(mIntegerList.hashCode(), other.mIntegerList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mLongList != null, other.mLongList != null);
        if (c != 0) return c;
        if (mLongList != null) {
            c = Integer.compare(mLongList.hashCode(), other.mLongList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mDoubleList != null, other.mDoubleList != null);
        if (c != 0) return c;
        if (mDoubleList != null) {
            c = Integer.compare(mDoubleList.hashCode(), other.mDoubleList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mStringList != null, other.mStringList != null);
        if (c != 0) return c;
        if (mStringList != null) {
            c = Integer.compare(mStringList.hashCode(), other.mStringList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mBinaryList != null, other.mBinaryList != null);
        if (c != 0) return c;
        if (mBinaryList != null) {
            c = Integer.compare(mBinaryList.hashCode(), other.mBinaryList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mBooleanSet != null, other.mBooleanSet != null);
        if (c != 0) return c;
        if (mBooleanSet != null) {
            c = Integer.compare(mBooleanSet.hashCode(), other.mBooleanSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mByteSet != null, other.mByteSet != null);
        if (c != 0) return c;
        if (mByteSet != null) {
            c = Integer.compare(mByteSet.hashCode(), other.mByteSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mShortSet != null, other.mShortSet != null);
        if (c != 0) return c;
        if (mShortSet != null) {
            c = Integer.compare(mShortSet.hashCode(), other.mShortSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mIntegerSet != null, other.mIntegerSet != null);
        if (c != 0) return c;
        if (mIntegerSet != null) {
            c = Integer.compare(mIntegerSet.hashCode(), other.mIntegerSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mLongSet != null, other.mLongSet != null);
        if (c != 0) return c;
        if (mLongSet != null) {
            c = Integer.compare(mLongSet.hashCode(), other.mLongSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mDoubleSet != null, other.mDoubleSet != null);
        if (c != 0) return c;
        if (mDoubleSet != null) {
            c = Integer.compare(mDoubleSet.hashCode(), other.mDoubleSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mStringSet != null, other.mStringSet != null);
        if (c != 0) return c;
        if (mStringSet != null) {
            c = Integer.compare(mStringSet.hashCode(), other.mStringSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mBinarySet != null, other.mBinarySet != null);
        if (c != 0) return c;
        if (mBinarySet != null) {
            c = Integer.compare(mBinarySet.hashCode(), other.mBinarySet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mBooleanMap != null, other.mBooleanMap != null);
        if (c != 0) return c;
        if (mBooleanMap != null) {
            c = Integer.compare(mBooleanMap.hashCode(), other.mBooleanMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mByteMap != null, other.mByteMap != null);
        if (c != 0) return c;
        if (mByteMap != null) {
            c = Integer.compare(mByteMap.hashCode(), other.mByteMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mShortMap != null, other.mShortMap != null);
        if (c != 0) return c;
        if (mShortMap != null) {
            c = Integer.compare(mShortMap.hashCode(), other.mShortMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mIntegerMap != null, other.mIntegerMap != null);
        if (c != 0) return c;
        if (mIntegerMap != null) {
            c = Integer.compare(mIntegerMap.hashCode(), other.mIntegerMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mLongMap != null, other.mLongMap != null);
        if (c != 0) return c;
        if (mLongMap != null) {
            c = Integer.compare(mLongMap.hashCode(), other.mLongMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mDoubleMap != null, other.mDoubleMap != null);
        if (c != 0) return c;
        if (mDoubleMap != null) {
            c = Integer.compare(mDoubleMap.hashCode(), other.mDoubleMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mStringMap != null, other.mStringMap != null);
        if (c != 0) return c;
        if (mStringMap != null) {
            c = Integer.compare(mStringMap.hashCode(), other.mStringMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mBinaryMap != null, other.mBinaryMap != null);
        if (c != 0) return c;
        if (mBinaryMap != null) {
            c = Integer.compare(mBinaryMap.hashCode(), other.mBinaryMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mEnumList != null, other.mEnumList != null);
        if (c != 0) return c;
        if (mEnumList != null) {
            c = Integer.compare(mEnumList.hashCode(), other.mEnumList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mEnumSet != null, other.mEnumSet != null);
        if (c != 0) return c;
        if (mEnumSet != null) {
            c = Integer.compare(mEnumSet.hashCode(), other.mEnumSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mEnumMap != null, other.mEnumMap != null);
        if (c != 0) return c;
        if (mEnumMap != null) {
            c = Integer.compare(mEnumMap.hashCode(), other.mEnumMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mMessageList != null, other.mMessageList != null);
        if (c != 0) return c;
        if (mMessageList != null) {
            c = Integer.compare(mMessageList.hashCode(), other.mMessageList.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mMessageSet != null, other.mMessageSet != null);
        if (c != 0) return c;
        if (mMessageSet != null) {
            c = Integer.compare(mMessageSet.hashCode(), other.mMessageSet.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mMessageMap != null, other.mMessageMap != null);
        if (c != 0) return c;
        if (mMessageMap != null) {
            c = Integer.compare(mMessageMap.hashCode(), other.mMessageMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mMessageKeyMap != null, other.mMessageKeyMap != null);
        if (c != 0) return c;
        if (mMessageKeyMap != null) {
            c = Integer.compare(mMessageKeyMap.hashCode(), other.mMessageKeyMap.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mRequiredFields != null, other.mRequiredFields != null);
        if (c != 0) return c;
        if (mRequiredFields != null) {
            c = mRequiredFields.compareTo(other.mRequiredFields);
            if (c != 0) return c;
        }

        c = Boolean.compare(mDefaultFields != null, other.mDefaultFields != null);
        if (c != 0) return c;
        if (mDefaultFields != null) {
            c = mDefaultFields.compareTo(other.mDefaultFields);
            if (c != 0) return c;
        }

        c = Boolean.compare(mOptionalFields != null, other.mOptionalFields != null);
        if (c != 0) return c;
        if (mOptionalFields != null) {
            c = mOptionalFields.compareTo(other.mOptionalFields);
            if (c != 0) return c;
        }

        c = Boolean.compare(mUnionFields != null, other.mUnionFields != null);
        if (c != 0) return c;
        if (mUnionFields != null) {
            c = mUnionFields.compareTo(other.mUnionFields);
            if (c != 0) return c;
        }

        c = Boolean.compare(mExceptionFields != null, other.mExceptionFields != null);
        if (c != 0) return c;
        if (mExceptionFields != null) {
            c = mExceptionFields.compareTo(other.mExceptionFields);
            if (c != 0) return c;
        }

        c = Boolean.compare(mDefaultValues != null, other.mDefaultValues != null);
        if (c != 0) return c;
        if (mDefaultValues != null) {
            c = mDefaultValues.compareTo(other.mDefaultValues);
            if (c != 0) return c;
        }

        c = Boolean.compare(mMapListCompact != null, other.mMapListCompact != null);
        if (c != 0) return c;
        if (mMapListCompact != null) {
            c = Integer.compare(mMapListCompact.hashCode(), other.mMapListCompact.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mListMapNumbers != null, other.mListMapNumbers != null);
        if (c != 0) return c;
        if (mListMapNumbers != null) {
            c = Integer.compare(mListMapNumbers.hashCode(), other.mListMapNumbers.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mSetListNumbers != null, other.mSetListNumbers != null);
        if (c != 0) return c;
        if (mSetListNumbers != null) {
            c = Integer.compare(mSetListNumbers.hashCode(), other.mSetListNumbers.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mListListNumbers != null, other.mListListNumbers != null);
        if (c != 0) return c;
        if (mListListNumbers != null) {
            c = Integer.compare(mListListNumbers.hashCode(), other.mListListNumbers.hashCode());
            if (c != 0) return c;
        }

        return 0;
    }

    private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
        oos.defaultWriteObject();
        net.morimekta.providence.serializer.BinarySerializer serializer = new net.morimekta.providence.serializer.BinarySerializer(false);
        serializer.serialize(oos, this);
    }

    private void readObject(java.io.ObjectInputStream ois)
            throws java.io.IOException, ClassNotFoundException {
        ois.defaultReadObject();
        net.morimekta.providence.serializer.BinarySerializer serializer = new net.morimekta.providence.serializer.BinarySerializer(false);
        tSerializeInstance = serializer.deserialize(ois, kDescriptor);
    }

    private Object readResolve() throws java.io.ObjectStreamException {
        return tSerializeInstance;
    }

    @Override
    public int writeBinary(net.morimekta.util.io.BigEndianBinaryWriter writer) throws java.io.IOException {
        int length = 0;

        if (hasBooleanList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 1);
            length += writer.writeByte((byte) 2);
            length += writer.writeUInt32(mBooleanList.size());
            for (Boolean entry_1 : mBooleanList) {
                length += writer.writeUInt8(entry_1 ? (byte) 1 : (byte) 0);
            }
        }

        if (hasByteList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 2);
            length += writer.writeByte((byte) 3);
            length += writer.writeUInt32(mByteList.size());
            for (Byte entry_2 : mByteList) {
                length += writer.writeByte(entry_2);
            }
        }

        if (hasShortList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 3);
            length += writer.writeByte((byte) 6);
            length += writer.writeUInt32(mShortList.size());
            for (Short entry_3 : mShortList) {
                length += writer.writeShort(entry_3);
            }
        }

        if (hasIntegerList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 4);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mIntegerList.size());
            for (Integer entry_4 : mIntegerList) {
                length += writer.writeInt(entry_4);
            }
        }

        if (hasLongList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 5);
            length += writer.writeByte((byte) 10);
            length += writer.writeUInt32(mLongList.size());
            for (Long entry_5 : mLongList) {
                length += writer.writeLong(entry_5);
            }
        }

        if (hasDoubleList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 6);
            length += writer.writeByte((byte) 4);
            length += writer.writeUInt32(mDoubleList.size());
            for (Double entry_6 : mDoubleList) {
                length += writer.writeDouble(entry_6);
            }
        }

        if (hasStringList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 7);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mStringList.size());
            for (String entry_7 : mStringList) {
                net.morimekta.util.Binary tmp_8 = net.morimekta.util.Binary.wrap(entry_7.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_8.length());
                length += writer.writeBinary(tmp_8);
            }
        }

        if (hasBinaryList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 8);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mBinaryList.size());
            for (net.morimekta.util.Binary entry_9 : mBinaryList) {
                length += writer.writeUInt32(entry_9.length());
                length += writer.writeBinary(entry_9);
            }
        }

        if (hasBooleanSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 11);
            length += writer.writeByte((byte) 2);
            length += writer.writeUInt32(mBooleanSet.size());
            for (Boolean entry_10 : mBooleanSet) {
                length += writer.writeUInt8(entry_10 ? (byte) 1 : (byte) 0);
            }
        }

        if (hasByteSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 12);
            length += writer.writeByte((byte) 3);
            length += writer.writeUInt32(mByteSet.size());
            for (Byte entry_11 : mByteSet) {
                length += writer.writeByte(entry_11);
            }
        }

        if (hasShortSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 13);
            length += writer.writeByte((byte) 6);
            length += writer.writeUInt32(mShortSet.size());
            for (Short entry_12 : mShortSet) {
                length += writer.writeShort(entry_12);
            }
        }

        if (hasIntegerSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 14);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mIntegerSet.size());
            for (Integer entry_13 : mIntegerSet) {
                length += writer.writeInt(entry_13);
            }
        }

        if (hasLongSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 15);
            length += writer.writeByte((byte) 10);
            length += writer.writeUInt32(mLongSet.size());
            for (Long entry_14 : mLongSet) {
                length += writer.writeLong(entry_14);
            }
        }

        if (hasDoubleSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 16);
            length += writer.writeByte((byte) 4);
            length += writer.writeUInt32(mDoubleSet.size());
            for (Double entry_15 : mDoubleSet) {
                length += writer.writeDouble(entry_15);
            }
        }

        if (hasStringSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 17);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mStringSet.size());
            for (String entry_16 : mStringSet) {
                net.morimekta.util.Binary tmp_17 = net.morimekta.util.Binary.wrap(entry_16.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_17.length());
                length += writer.writeBinary(tmp_17);
            }
        }

        if (hasBinarySet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 18);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mBinarySet.size());
            for (net.morimekta.util.Binary entry_18 : mBinarySet) {
                length += writer.writeUInt32(entry_18.length());
                length += writer.writeBinary(entry_18);
            }
        }

        if (hasBooleanMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 21);
            length += writer.writeByte((byte) 2);
            length += writer.writeByte((byte) 2);
            length += writer.writeUInt32(mBooleanMap.size());
            for (java.util.Map.Entry<Boolean,Boolean> entry_19 : mBooleanMap.entrySet()) {
                length += writer.writeUInt8(entry_19.getKey() ? (byte) 1 : (byte) 0);
                length += writer.writeUInt8(entry_19.getValue() ? (byte) 1 : (byte) 0);
            }
        }

        if (hasByteMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 22);
            length += writer.writeByte((byte) 3);
            length += writer.writeByte((byte) 3);
            length += writer.writeUInt32(mByteMap.size());
            for (java.util.Map.Entry<Byte,Byte> entry_20 : mByteMap.entrySet()) {
                length += writer.writeByte(entry_20.getKey());
                length += writer.writeByte(entry_20.getValue());
            }
        }

        if (hasShortMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 23);
            length += writer.writeByte((byte) 6);
            length += writer.writeByte((byte) 6);
            length += writer.writeUInt32(mShortMap.size());
            for (java.util.Map.Entry<Short,Short> entry_21 : mShortMap.entrySet()) {
                length += writer.writeShort(entry_21.getKey());
                length += writer.writeShort(entry_21.getValue());
            }
        }

        if (hasIntegerMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 24);
            length += writer.writeByte((byte) 8);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mIntegerMap.size());
            for (java.util.Map.Entry<Integer,Integer> entry_22 : mIntegerMap.entrySet()) {
                length += writer.writeInt(entry_22.getKey());
                length += writer.writeInt(entry_22.getValue());
            }
        }

        if (hasLongMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 25);
            length += writer.writeByte((byte) 10);
            length += writer.writeByte((byte) 10);
            length += writer.writeUInt32(mLongMap.size());
            for (java.util.Map.Entry<Long,Long> entry_23 : mLongMap.entrySet()) {
                length += writer.writeLong(entry_23.getKey());
                length += writer.writeLong(entry_23.getValue());
            }
        }

        if (hasDoubleMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 26);
            length += writer.writeByte((byte) 4);
            length += writer.writeByte((byte) 4);
            length += writer.writeUInt32(mDoubleMap.size());
            for (java.util.Map.Entry<Double,Double> entry_24 : mDoubleMap.entrySet()) {
                length += writer.writeDouble(entry_24.getKey());
                length += writer.writeDouble(entry_24.getValue());
            }
        }

        if (hasStringMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 27);
            length += writer.writeByte((byte) 11);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mStringMap.size());
            for (java.util.Map.Entry<String,String> entry_25 : mStringMap.entrySet()) {
                net.morimekta.util.Binary tmp_26 = net.morimekta.util.Binary.wrap(entry_25.getKey().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_26.length());
                length += writer.writeBinary(tmp_26);
                net.morimekta.util.Binary tmp_27 = net.morimekta.util.Binary.wrap(entry_25.getValue().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_27.length());
                length += writer.writeBinary(tmp_27);
            }
        }

        if (hasBinaryMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 28);
            length += writer.writeByte((byte) 11);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mBinaryMap.size());
            for (java.util.Map.Entry<net.morimekta.util.Binary,net.morimekta.util.Binary> entry_28 : mBinaryMap.entrySet()) {
                length += writer.writeUInt32(entry_28.getKey().length());
                length += writer.writeBinary(entry_28.getKey());
                length += writer.writeUInt32(entry_28.getValue().length());
                length += writer.writeBinary(entry_28.getValue());
            }
        }

        if (hasEnumList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 31);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mEnumList.size());
            for (net.morimekta.test.providence.core.Value entry_29 : mEnumList) {
                length += writer.writeInt(entry_29.asInteger());
            }
        }

        if (hasEnumSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 32);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mEnumSet.size());
            for (net.morimekta.test.providence.core.Value entry_30 : mEnumSet) {
                length += writer.writeInt(entry_30.asInteger());
            }
        }

        if (hasEnumMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 33);
            length += writer.writeByte((byte) 8);
            length += writer.writeByte((byte) 8);
            length += writer.writeUInt32(mEnumMap.size());
            for (java.util.Map.Entry<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> entry_31 : mEnumMap.entrySet()) {
                length += writer.writeInt(entry_31.getKey().asInteger());
                length += writer.writeInt(entry_31.getValue().asInteger());
            }
        }

        if (hasMessageList()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 41);
            length += writer.writeByte((byte) 12);
            length += writer.writeUInt32(mMessageList.size());
            for (net.morimekta.test.providence.core.DefaultFields entry_32 : mMessageList) {
                length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, entry_32);
            }
        }

        if (hasMessageSet()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 42);
            length += writer.writeByte((byte) 12);
            length += writer.writeUInt32(mMessageSet.size());
            for (net.morimekta.test.providence.core.DefaultFields entry_33 : mMessageSet) {
                length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, entry_33);
            }
        }

        if (hasMessageMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 43);
            length += writer.writeByte((byte) 11);
            length += writer.writeByte((byte) 12);
            length += writer.writeUInt32(mMessageMap.size());
            for (java.util.Map.Entry<String,net.morimekta.test.providence.core.DefaultFields> entry_34 : mMessageMap.entrySet()) {
                net.morimekta.util.Binary tmp_35 = net.morimekta.util.Binary.wrap(entry_34.getKey().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_35.length());
                length += writer.writeBinary(tmp_35);
                length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, entry_34.getValue());
            }
        }

        if (hasMessageKeyMap()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 44);
            length += writer.writeByte((byte) 12);
            length += writer.writeByte((byte) 11);
            length += writer.writeUInt32(mMessageKeyMap.size());
            for (java.util.Map.Entry<net.morimekta.test.providence.core.CompactFields,String> entry_36 : mMessageKeyMap.entrySet()) {
                length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, entry_36.getKey());
                net.morimekta.util.Binary tmp_37 = net.morimekta.util.Binary.wrap(entry_36.getValue().getBytes(java.nio.charset.StandardCharsets.UTF_8));
                length += writer.writeUInt32(tmp_37.length());
                length += writer.writeBinary(tmp_37);
            }
        }

        if (hasRequiredFields()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 51);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mRequiredFields);
        }

        if (hasDefaultFields()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 52);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mDefaultFields);
        }

        if (hasOptionalFields()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 53);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mOptionalFields);
        }

        if (hasUnionFields()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 54);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mUnionFields);
        }

        if (hasExceptionFields()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 55);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mExceptionFields);
        }

        if (hasDefaultValues()) {
            length += writer.writeByte((byte) 12);
            length += writer.writeShort((short) 56);
            length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, mDefaultValues);
        }

        if (hasMapListCompact()) {
            length += writer.writeByte((byte) 13);
            length += writer.writeShort((short) 61);
            length += writer.writeByte((byte) 8);
            length += writer.writeByte((byte) 15);
            length += writer.writeUInt32(mMapListCompact.size());
            for (java.util.Map.Entry<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> entry_38 : mMapListCompact.entrySet()) {
                length += writer.writeInt(entry_38.getKey());
                length += writer.writeByte((byte) 12);
                length += writer.writeUInt32(entry_38.getValue().size());
                for (net.morimekta.test.providence.core.CompactFields entry_39 : entry_38.getValue()) {
                    length += net.morimekta.providence.serializer.binary.BinaryFormatUtils.writeMessage(writer, entry_39);
                }
            }
        }

        if (hasListMapNumbers()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 62);
            length += writer.writeByte((byte) 13);
            length += writer.writeUInt32(mListMapNumbers.size());
            for (java.util.Map<Integer,Integer> entry_40 : mListMapNumbers) {
                length += writer.writeByte((byte) 8);
                length += writer.writeByte((byte) 8);
                length += writer.writeUInt32(entry_40.size());
                for (java.util.Map.Entry<Integer,Integer> entry_41 : entry_40.entrySet()) {
                    length += writer.writeInt(entry_41.getKey());
                    length += writer.writeInt(entry_41.getValue());
                }
            }
        }

        if (hasSetListNumbers()) {
            length += writer.writeByte((byte) 14);
            length += writer.writeShort((short) 63);
            length += writer.writeByte((byte) 15);
            length += writer.writeUInt32(mSetListNumbers.size());
            for (java.util.List<Integer> entry_42 : mSetListNumbers) {
                length += writer.writeByte((byte) 8);
                length += writer.writeUInt32(entry_42.size());
                for (Integer entry_43 : entry_42) {
                    length += writer.writeInt(entry_43);
                }
            }
        }

        if (hasListListNumbers()) {
            length += writer.writeByte((byte) 15);
            length += writer.writeShort((short) 64);
            length += writer.writeByte((byte) 15);
            length += writer.writeUInt32(mListListNumbers.size());
            for (java.util.List<Integer> entry_44 : mListListNumbers) {
                length += writer.writeByte((byte) 8);
                length += writer.writeUInt32(entry_44.size());
                for (Integer entry_45 : entry_44) {
                    length += writer.writeInt(entry_45);
                }
            }
        }

        length += writer.writeByte((byte) 0);
        return length;
    }

    @javax.annotation.Nonnull
    @Override
    public _Builder mutate() {
        return new _Builder(this);
    }

    public enum _Field implements net.morimekta.providence.descriptor.PField {
        BOOLEAN_LIST(1, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "booleanList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.BOOL.provider()), null),
        BYTE_LIST(2, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "byteList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.BYTE.provider()), null),
        SHORT_LIST(3, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "shortList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.I16.provider()), null),
        INTEGER_LIST(4, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "integerList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider()), null),
        LONG_LIST(5, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "longList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.I64.provider()), null),
        DOUBLE_LIST(6, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "doubleList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.DOUBLE.provider()), null),
        STRING_LIST(7, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "stringList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.STRING.provider()), null),
        BINARY_LIST(8, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "binaryList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.BINARY.provider()), null),
        BOOLEAN_SET(11, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "booleanSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.BOOL.provider()), null),
        BYTE_SET(12, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "byteSet", net.morimekta.providence.descriptor.PSet.sortedProvider(net.morimekta.providence.descriptor.PPrimitive.BYTE.provider()), null),
        SHORT_SET(13, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "shortSet", net.morimekta.providence.descriptor.PSet.orderedProvider(net.morimekta.providence.descriptor.PPrimitive.I16.provider()), null),
        INTEGER_SET(14, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "integerSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider()), null),
        LONG_SET(15, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "longSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.I64.provider()), null),
        DOUBLE_SET(16, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "doubleSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.DOUBLE.provider()), null),
        STRING_SET(17, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "stringSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.STRING.provider()), null),
        BINARY_SET(18, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "binarySet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PPrimitive.BINARY.provider()), null),
        BOOLEAN_MAP(21, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "booleanMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.BOOL.provider(),net.morimekta.providence.descriptor.PPrimitive.BOOL.provider()), null),
        BYTE_MAP(22, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "byteMap", net.morimekta.providence.descriptor.PMap.sortedProvider(net.morimekta.providence.descriptor.PPrimitive.BYTE.provider(),net.morimekta.providence.descriptor.PPrimitive.BYTE.provider()), null),
        SHORT_MAP(23, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "shortMap", net.morimekta.providence.descriptor.PMap.orderedProvider(net.morimekta.providence.descriptor.PPrimitive.I16.provider(),net.morimekta.providence.descriptor.PPrimitive.I16.provider()), null),
        INTEGER_MAP(24, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "integerMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider(),net.morimekta.providence.descriptor.PPrimitive.I32.provider()), null),
        LONG_MAP(25, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "longMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.I64.provider(),net.morimekta.providence.descriptor.PPrimitive.I64.provider()), null),
        DOUBLE_MAP(26, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "doubleMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.DOUBLE.provider(),net.morimekta.providence.descriptor.PPrimitive.DOUBLE.provider()), null),
        STRING_MAP(27, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "stringMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.STRING.provider(),net.morimekta.providence.descriptor.PPrimitive.STRING.provider()), null),
        BINARY_MAP(28, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "binaryMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.BINARY.provider(),net.morimekta.providence.descriptor.PPrimitive.BINARY.provider()), null),
        ENUM_LIST(31, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "enumList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.test.providence.core.Value.provider()), null),
        ENUM_SET(32, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "enumSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.test.providence.core.Value.provider()), null),
        ENUM_MAP(33, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "enumMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.test.providence.core.Value.provider(),net.morimekta.test.providence.core.Value.provider()), null),
        MESSAGE_LIST(41, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "messageList", net.morimekta.providence.descriptor.PList.provider(net.morimekta.test.providence.core.DefaultFields.provider()), null),
        MESSAGE_SET(42, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "messageSet", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.test.providence.core.DefaultFields.provider()), null),
        MESSAGE_MAP(43, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "messageMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.STRING.provider(),net.morimekta.test.providence.core.DefaultFields.provider()), null),
        MESSAGE_KEY_MAP(44, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "messageKeyMap", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.test.providence.core.CompactFields.provider(),net.morimekta.providence.descriptor.PPrimitive.STRING.provider()), null),
        REQUIRED_FIELDS(51, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "requiredFields", net.morimekta.test.providence.core.RequiredFields.provider(), null),
        DEFAULT_FIELDS(52, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "defaultFields", net.morimekta.test.providence.core.DefaultFields.provider(), null),
        OPTIONAL_FIELDS(53, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "optionalFields", net.morimekta.test.providence.core.OptionalFields.provider(), null),
        UNION_FIELDS(54, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "unionFields", net.morimekta.test.providence.core.UnionFields.provider(), null),
        EXCEPTION_FIELDS(55, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "exceptionFields", net.morimekta.test.providence.core.ExceptionFields.provider(), null),
        DEFAULT_VALUES(56, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "defaultValues", net.morimekta.test.providence.core.DefaultValues.provider(), null),
        MAP_LIST_COMPACT(61, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "map_list_compact", net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider(),net.morimekta.providence.descriptor.PList.provider(net.morimekta.test.providence.core.CompactFields.provider())), null),
        LIST_MAP_NUMBERS(62, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "list_map_numbers", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PMap.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider(),net.morimekta.providence.descriptor.PPrimitive.I32.provider())), null),
        SET_LIST_NUMBERS(63, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "set_list_numbers", net.morimekta.providence.descriptor.PSet.provider(net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider())), null),
        LIST_LIST_NUMBERS(64, net.morimekta.providence.descriptor.PRequirement.OPTIONAL, "list_list_numbers", net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PList.provider(net.morimekta.providence.descriptor.PPrimitive.I32.provider())), null),
        ;

        private final int mId;
        private final net.morimekta.providence.descriptor.PRequirement mRequired;
        private final String mName;
        private final net.morimekta.providence.descriptor.PDescriptorProvider mTypeProvider;
        private final net.morimekta.providence.descriptor.PValueProvider<?> mDefaultValue;

        _Field(int id, net.morimekta.providence.descriptor.PRequirement required, String name, net.morimekta.providence.descriptor.PDescriptorProvider typeProvider, net.morimekta.providence.descriptor.PValueProvider<?> defaultValue) {
            mId = id;
            mRequired = required;
            mName = name;
            mTypeProvider = typeProvider;
            mDefaultValue = defaultValue;
        }

        @Override
        public int getId() { return mId; }

        @Override
        public net.morimekta.providence.descriptor.PRequirement getRequirement() { return mRequired; }

        @Override
        public net.morimekta.providence.descriptor.PDescriptor getDescriptor() { return mTypeProvider.descriptor(); }

        @Override
        public String getName() { return mName; }

        @Override
        public boolean hasDefaultValue() { return mDefaultValue != null; }

        @Override
        public Object getDefaultValue() {
            return hasDefaultValue() ? mDefaultValue.get() : null;
        }

        @Override
        public String toString() {
            return net.morimekta.providence.descriptor.PField.asString(this);
        }

        /**
         * @param id Field name
         * @return The identified field or null
         */
        public static _Field findById(int id) {
            switch (id) {
                case 1: return _Field.BOOLEAN_LIST;
                case 2: return _Field.BYTE_LIST;
                case 3: return _Field.SHORT_LIST;
                case 4: return _Field.INTEGER_LIST;
                case 5: return _Field.LONG_LIST;
                case 6: return _Field.DOUBLE_LIST;
                case 7: return _Field.STRING_LIST;
                case 8: return _Field.BINARY_LIST;
                case 11: return _Field.BOOLEAN_SET;
                case 12: return _Field.BYTE_SET;
                case 13: return _Field.SHORT_SET;
                case 14: return _Field.INTEGER_SET;
                case 15: return _Field.LONG_SET;
                case 16: return _Field.DOUBLE_SET;
                case 17: return _Field.STRING_SET;
                case 18: return _Field.BINARY_SET;
                case 21: return _Field.BOOLEAN_MAP;
                case 22: return _Field.BYTE_MAP;
                case 23: return _Field.SHORT_MAP;
                case 24: return _Field.INTEGER_MAP;
                case 25: return _Field.LONG_MAP;
                case 26: return _Field.DOUBLE_MAP;
                case 27: return _Field.STRING_MAP;
                case 28: return _Field.BINARY_MAP;
                case 31: return _Field.ENUM_LIST;
                case 32: return _Field.ENUM_SET;
                case 33: return _Field.ENUM_MAP;
                case 41: return _Field.MESSAGE_LIST;
                case 42: return _Field.MESSAGE_SET;
                case 43: return _Field.MESSAGE_MAP;
                case 44: return _Field.MESSAGE_KEY_MAP;
                case 51: return _Field.REQUIRED_FIELDS;
                case 52: return _Field.DEFAULT_FIELDS;
                case 53: return _Field.OPTIONAL_FIELDS;
                case 54: return _Field.UNION_FIELDS;
                case 55: return _Field.EXCEPTION_FIELDS;
                case 56: return _Field.DEFAULT_VALUES;
                case 61: return _Field.MAP_LIST_COMPACT;
                case 62: return _Field.LIST_MAP_NUMBERS;
                case 63: return _Field.SET_LIST_NUMBERS;
                case 64: return _Field.LIST_LIST_NUMBERS;
            }
            return null;
        }

        /**
         * @param name Field name
         * @return The named field or null
         */
        public static _Field findByName(String name) {
            switch (name) {
                case "booleanList": return _Field.BOOLEAN_LIST;
                case "byteList": return _Field.BYTE_LIST;
                case "shortList": return _Field.SHORT_LIST;
                case "integerList": return _Field.INTEGER_LIST;
                case "longList": return _Field.LONG_LIST;
                case "doubleList": return _Field.DOUBLE_LIST;
                case "stringList": return _Field.STRING_LIST;
                case "binaryList": return _Field.BINARY_LIST;
                case "booleanSet": return _Field.BOOLEAN_SET;
                case "byteSet": return _Field.BYTE_SET;
                case "shortSet": return _Field.SHORT_SET;
                case "integerSet": return _Field.INTEGER_SET;
                case "longSet": return _Field.LONG_SET;
                case "doubleSet": return _Field.DOUBLE_SET;
                case "stringSet": return _Field.STRING_SET;
                case "binarySet": return _Field.BINARY_SET;
                case "booleanMap": return _Field.BOOLEAN_MAP;
                case "byteMap": return _Field.BYTE_MAP;
                case "shortMap": return _Field.SHORT_MAP;
                case "integerMap": return _Field.INTEGER_MAP;
                case "longMap": return _Field.LONG_MAP;
                case "doubleMap": return _Field.DOUBLE_MAP;
                case "stringMap": return _Field.STRING_MAP;
                case "binaryMap": return _Field.BINARY_MAP;
                case "enumList": return _Field.ENUM_LIST;
                case "enumSet": return _Field.ENUM_SET;
                case "enumMap": return _Field.ENUM_MAP;
                case "messageList": return _Field.MESSAGE_LIST;
                case "messageSet": return _Field.MESSAGE_SET;
                case "messageMap": return _Field.MESSAGE_MAP;
                case "messageKeyMap": return _Field.MESSAGE_KEY_MAP;
                case "requiredFields": return _Field.REQUIRED_FIELDS;
                case "defaultFields": return _Field.DEFAULT_FIELDS;
                case "optionalFields": return _Field.OPTIONAL_FIELDS;
                case "unionFields": return _Field.UNION_FIELDS;
                case "exceptionFields": return _Field.EXCEPTION_FIELDS;
                case "defaultValues": return _Field.DEFAULT_VALUES;
                case "map_list_compact": return _Field.MAP_LIST_COMPACT;
                case "list_map_numbers": return _Field.LIST_MAP_NUMBERS;
                case "set_list_numbers": return _Field.SET_LIST_NUMBERS;
                case "list_list_numbers": return _Field.LIST_LIST_NUMBERS;
            }
            return null;
        }
        /**
         * @param id Field name
         * @return The identified field
         * @throws IllegalArgumentException If no such field
         */
        public static _Field fieldForId(int id) {
            _Field field = findById(id);
            if (field == null) {
                throw new IllegalArgumentException("No such field id " + id + " in providence.Containers");
            }
            return field;
        }

        /**
         * @param name Field name
         * @return The named field
         * @throws IllegalArgumentException If no such field
         */
        public static _Field fieldForName(String name) {
            _Field field = findByName(name);
            if (field == null) {
                throw new IllegalArgumentException("No such field \"" + name + "\" in providence.Containers");
            }
            return field;
        }

    }

    @javax.annotation.Nonnull
    public static net.morimekta.providence.descriptor.PStructDescriptorProvider<Containers,_Field> provider() {
        return new _Provider();
    }

    @Override
    @javax.annotation.Nonnull
    public net.morimekta.providence.descriptor.PStructDescriptor<Containers,_Field> descriptor() {
        return kDescriptor;
    }

    public static final net.morimekta.providence.descriptor.PStructDescriptor<Containers,_Field> kDescriptor;

    private static class _Descriptor
            extends net.morimekta.providence.descriptor.PStructDescriptor<Containers,_Field> {
        public _Descriptor() {
            super("providence", "Containers", _Builder::new, false);
        }

        @Override
        @javax.annotation.Nonnull
        public _Field[] getFields() {
            return _Field.values();
        }

        @Override
        @javax.annotation.Nullable
        public _Field findFieldByName(String name) {
            return _Field.findByName(name);
        }

        @Override
        @javax.annotation.Nullable
        public _Field findFieldById(int id) {
            return _Field.findById(id);
        }
    }

    static {
        kDescriptor = new _Descriptor();
    }

    private final static class _Provider extends net.morimekta.providence.descriptor.PStructDescriptorProvider<Containers,_Field> {
        @Override
        public net.morimekta.providence.descriptor.PStructDescriptor<Containers,_Field> descriptor() {
            return kDescriptor;
        }
    }

    /**
     * Make a providence.Containers builder.
     * @return The builder instance.
     */
    public static _Builder builder() {
        return new _Builder();
    }

    public static class _Builder
            extends net.morimekta.providence.PMessageBuilder<Containers,_Field>
            implements net.morimekta.providence.serializer.binary.BinaryReader {
        private java.util.BitSet optionals;
        private java.util.BitSet modified;

        private java.util.List<Boolean> mBooleanList;
        private java.util.List<Byte> mByteList;
        private java.util.List<Short> mShortList;
        private java.util.List<Integer> mIntegerList;
        private java.util.List<Long> mLongList;
        private java.util.List<Double> mDoubleList;
        private java.util.List<String> mStringList;
        private java.util.List<net.morimekta.util.Binary> mBinaryList;
        private java.util.Set<Boolean> mBooleanSet;
        private java.util.Set<Byte> mByteSet;
        private java.util.Set<Short> mShortSet;
        private java.util.Set<Integer> mIntegerSet;
        private java.util.Set<Long> mLongSet;
        private java.util.Set<Double> mDoubleSet;
        private java.util.Set<String> mStringSet;
        private java.util.Set<net.morimekta.util.Binary> mBinarySet;
        private java.util.Map<Boolean,Boolean> mBooleanMap;
        private java.util.Map<Byte,Byte> mByteMap;
        private java.util.Map<Short,Short> mShortMap;
        private java.util.Map<Integer,Integer> mIntegerMap;
        private java.util.Map<Long,Long> mLongMap;
        private java.util.Map<Double,Double> mDoubleMap;
        private java.util.Map<String,String> mStringMap;
        private java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary> mBinaryMap;
        private java.util.List<net.morimekta.test.providence.core.Value> mEnumList;
        private java.util.Set<net.morimekta.test.providence.core.Value> mEnumSet;
        private java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> mEnumMap;
        private java.util.List<net.morimekta.test.providence.core.DefaultFields> mMessageList;
        private java.util.Set<net.morimekta.test.providence.core.DefaultFields> mMessageSet;
        private java.util.Map<String,net.morimekta.test.providence.core.DefaultFields> mMessageMap;
        private java.util.Map<net.morimekta.test.providence.core.CompactFields,String> mMessageKeyMap;
        private net.morimekta.test.providence.core.RequiredFields mRequiredFields;
        private net.morimekta.test.providence.core.RequiredFields._Builder mRequiredFields_builder;
        private net.morimekta.test.providence.core.DefaultFields mDefaultFields;
        private net.morimekta.test.providence.core.DefaultFields._Builder mDefaultFields_builder;
        private net.morimekta.test.providence.core.OptionalFields mOptionalFields;
        private net.morimekta.test.providence.core.OptionalFields._Builder mOptionalFields_builder;
        private net.morimekta.test.providence.core.UnionFields mUnionFields;
        private net.morimekta.test.providence.core.UnionFields._Builder mUnionFields_builder;
        private net.morimekta.test.providence.core.ExceptionFields mExceptionFields;
        private net.morimekta.test.providence.core.ExceptionFields._Builder mExceptionFields_builder;
        private net.morimekta.test.providence.core.DefaultValues mDefaultValues;
        private net.morimekta.test.providence.core.DefaultValues._Builder mDefaultValues_builder;
        private java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> mMapListCompact;
        private java.util.List<java.util.Map<Integer,Integer>> mListMapNumbers;
        private java.util.Set<java.util.List<Integer>> mSetListNumbers;
        private java.util.List<java.util.List<Integer>> mListListNumbers;

        /**
         * Make a providence.Containers builder.
         */
        public _Builder() {
            optionals = new java.util.BitSet(41);
            modified = new java.util.BitSet(41);
        }

        /**
         * Make a mutating builder off a base providence.Containers.
         *
         * @param base The base Containers
         */
        public _Builder(Containers base) {
            this();

            if (base.hasBooleanList()) {
                optionals.set(0);
                mBooleanList = base.mBooleanList;
            }
            if (base.hasByteList()) {
                optionals.set(1);
                mByteList = base.mByteList;
            }
            if (base.hasShortList()) {
                optionals.set(2);
                mShortList = base.mShortList;
            }
            if (base.hasIntegerList()) {
                optionals.set(3);
                mIntegerList = base.mIntegerList;
            }
            if (base.hasLongList()) {
                optionals.set(4);
                mLongList = base.mLongList;
            }
            if (base.hasDoubleList()) {
                optionals.set(5);
                mDoubleList = base.mDoubleList;
            }
            if (base.hasStringList()) {
                optionals.set(6);
                mStringList = base.mStringList;
            }
            if (base.hasBinaryList()) {
                optionals.set(7);
                mBinaryList = base.mBinaryList;
            }
            if (base.hasBooleanSet()) {
                optionals.set(8);
                mBooleanSet = base.mBooleanSet;
            }
            if (base.hasByteSet()) {
                optionals.set(9);
                mByteSet = base.mByteSet;
            }
            if (base.hasShortSet()) {
                optionals.set(10);
                mShortSet = base.mShortSet;
            }
            if (base.hasIntegerSet()) {
                optionals.set(11);
                mIntegerSet = base.mIntegerSet;
            }
            if (base.hasLongSet()) {
                optionals.set(12);
                mLongSet = base.mLongSet;
            }
            if (base.hasDoubleSet()) {
                optionals.set(13);
                mDoubleSet = base.mDoubleSet;
            }
            if (base.hasStringSet()) {
                optionals.set(14);
                mStringSet = base.mStringSet;
            }
            if (base.hasBinarySet()) {
                optionals.set(15);
                mBinarySet = base.mBinarySet;
            }
            if (base.hasBooleanMap()) {
                optionals.set(16);
                mBooleanMap = base.mBooleanMap;
            }
            if (base.hasByteMap()) {
                optionals.set(17);
                mByteMap = base.mByteMap;
            }
            if (base.hasShortMap()) {
                optionals.set(18);
                mShortMap = base.mShortMap;
            }
            if (base.hasIntegerMap()) {
                optionals.set(19);
                mIntegerMap = base.mIntegerMap;
            }
            if (base.hasLongMap()) {
                optionals.set(20);
                mLongMap = base.mLongMap;
            }
            if (base.hasDoubleMap()) {
                optionals.set(21);
                mDoubleMap = base.mDoubleMap;
            }
            if (base.hasStringMap()) {
                optionals.set(22);
                mStringMap = base.mStringMap;
            }
            if (base.hasBinaryMap()) {
                optionals.set(23);
                mBinaryMap = base.mBinaryMap;
            }
            if (base.hasEnumList()) {
                optionals.set(24);
                mEnumList = base.mEnumList;
            }
            if (base.hasEnumSet()) {
                optionals.set(25);
                mEnumSet = base.mEnumSet;
            }
            if (base.hasEnumMap()) {
                optionals.set(26);
                mEnumMap = base.mEnumMap;
            }
            if (base.hasMessageList()) {
                optionals.set(27);
                mMessageList = base.mMessageList;
            }
            if (base.hasMessageSet()) {
                optionals.set(28);
                mMessageSet = base.mMessageSet;
            }
            if (base.hasMessageMap()) {
                optionals.set(29);
                mMessageMap = base.mMessageMap;
            }
            if (base.hasMessageKeyMap()) {
                optionals.set(30);
                mMessageKeyMap = base.mMessageKeyMap;
            }
            if (base.hasRequiredFields()) {
                optionals.set(31);
                mRequiredFields = base.mRequiredFields;
            }
            if (base.hasDefaultFields()) {
                optionals.set(32);
                mDefaultFields = base.mDefaultFields;
            }
            if (base.hasOptionalFields()) {
                optionals.set(33);
                mOptionalFields = base.mOptionalFields;
            }
            if (base.hasUnionFields()) {
                optionals.set(34);
                mUnionFields = base.mUnionFields;
            }
            if (base.hasExceptionFields()) {
                optionals.set(35);
                mExceptionFields = base.mExceptionFields;
            }
            if (base.hasDefaultValues()) {
                optionals.set(36);
                mDefaultValues = base.mDefaultValues;
            }
            if (base.hasMapListCompact()) {
                optionals.set(37);
                mMapListCompact = base.mMapListCompact;
            }
            if (base.hasListMapNumbers()) {
                optionals.set(38);
                mListMapNumbers = base.mListMapNumbers;
            }
            if (base.hasSetListNumbers()) {
                optionals.set(39);
                mSetListNumbers = base.mSetListNumbers;
            }
            if (base.hasListListNumbers()) {
                optionals.set(40);
                mListListNumbers = base.mListListNumbers;
            }
        }

        @javax.annotation.Nonnull
        @Override
        public _Builder merge(Containers from) {
            if (from.hasBooleanList()) {
                optionals.set(0);
                modified.set(0);
                mBooleanList = from.getBooleanList();
            }

            if (from.hasByteList()) {
                optionals.set(1);
                modified.set(1);
                mByteList = from.getByteList();
            }

            if (from.hasShortList()) {
                optionals.set(2);
                modified.set(2);
                mShortList = from.getShortList();
            }

            if (from.hasIntegerList()) {
                optionals.set(3);
                modified.set(3);
                mIntegerList = from.getIntegerList();
            }

            if (from.hasLongList()) {
                optionals.set(4);
                modified.set(4);
                mLongList = from.getLongList();
            }

            if (from.hasDoubleList()) {
                optionals.set(5);
                modified.set(5);
                mDoubleList = from.getDoubleList();
            }

            if (from.hasStringList()) {
                optionals.set(6);
                modified.set(6);
                mStringList = from.getStringList();
            }

            if (from.hasBinaryList()) {
                optionals.set(7);
                modified.set(7);
                mBinaryList = from.getBinaryList();
            }

            if (from.hasBooleanSet()) {
                optionals.set(8);
                modified.set(8);
                mutableBooleanSet().addAll(from.getBooleanSet());
            }

            if (from.hasByteSet()) {
                optionals.set(9);
                modified.set(9);
                mutableByteSet().addAll(from.getByteSet());
            }

            if (from.hasShortSet()) {
                optionals.set(10);
                modified.set(10);
                mutableShortSet().addAll(from.getShortSet());
            }

            if (from.hasIntegerSet()) {
                optionals.set(11);
                modified.set(11);
                mutableIntegerSet().addAll(from.getIntegerSet());
            }

            if (from.hasLongSet()) {
                optionals.set(12);
                modified.set(12);
                mutableLongSet().addAll(from.getLongSet());
            }

            if (from.hasDoubleSet()) {
                optionals.set(13);
                modified.set(13);
                mutableDoubleSet().addAll(from.getDoubleSet());
            }

            if (from.hasStringSet()) {
                optionals.set(14);
                modified.set(14);
                mutableStringSet().addAll(from.getStringSet());
            }

            if (from.hasBinarySet()) {
                optionals.set(15);
                modified.set(15);
                mutableBinarySet().addAll(from.getBinarySet());
            }

            if (from.hasBooleanMap()) {
                optionals.set(16);
                modified.set(16);
                mutableBooleanMap().putAll(from.getBooleanMap());
            }

            if (from.hasByteMap()) {
                optionals.set(17);
                modified.set(17);
                mutableByteMap().putAll(from.getByteMap());
            }

            if (from.hasShortMap()) {
                optionals.set(18);
                modified.set(18);
                mutableShortMap().putAll(from.getShortMap());
            }

            if (from.hasIntegerMap()) {
                optionals.set(19);
                modified.set(19);
                mutableIntegerMap().putAll(from.getIntegerMap());
            }

            if (from.hasLongMap()) {
                optionals.set(20);
                modified.set(20);
                mutableLongMap().putAll(from.getLongMap());
            }

            if (from.hasDoubleMap()) {
                optionals.set(21);
                modified.set(21);
                mutableDoubleMap().putAll(from.getDoubleMap());
            }

            if (from.hasStringMap()) {
                optionals.set(22);
                modified.set(22);
                mutableStringMap().putAll(from.getStringMap());
            }

            if (from.hasBinaryMap()) {
                optionals.set(23);
                modified.set(23);
                mutableBinaryMap().putAll(from.getBinaryMap());
            }

            if (from.hasEnumList()) {
                optionals.set(24);
                modified.set(24);
                mEnumList = from.getEnumList();
            }

            if (from.hasEnumSet()) {
                optionals.set(25);
                modified.set(25);
                mutableEnumSet().addAll(from.getEnumSet());
            }

            if (from.hasEnumMap()) {
                optionals.set(26);
                modified.set(26);
                mutableEnumMap().putAll(from.getEnumMap());
            }

            if (from.hasMessageList()) {
                optionals.set(27);
                modified.set(27);
                mMessageList = from.getMessageList();
            }

            if (from.hasMessageSet()) {
                optionals.set(28);
                modified.set(28);
                mutableMessageSet().addAll(from.getMessageSet());
            }

            if (from.hasMessageMap()) {
                optionals.set(29);
                modified.set(29);
                mutableMessageMap().putAll(from.getMessageMap());
            }

            if (from.hasMessageKeyMap()) {
                optionals.set(30);
                modified.set(30);
                mutableMessageKeyMap().putAll(from.getMessageKeyMap());
            }

            if (from.hasRequiredFields()) {
                optionals.set(31);
                modified.set(31);
                if (mRequiredFields_builder != null) {
                    mRequiredFields_builder.merge(from.getRequiredFields());
                } else if (mRequiredFields != null) {
                    mRequiredFields_builder = mRequiredFields.mutate().merge(from.getRequiredFields());
                    mRequiredFields = null;
                } else {
                    mRequiredFields = from.getRequiredFields();
                }
            }

            if (from.hasDefaultFields()) {
                optionals.set(32);
                modified.set(32);
                if (mDefaultFields_builder != null) {
                    mDefaultFields_builder.merge(from.getDefaultFields());
                } else if (mDefaultFields != null) {
                    mDefaultFields_builder = mDefaultFields.mutate().merge(from.getDefaultFields());
                    mDefaultFields = null;
                } else {
                    mDefaultFields = from.getDefaultFields();
                }
            }

            if (from.hasOptionalFields()) {
                optionals.set(33);
                modified.set(33);
                if (mOptionalFields_builder != null) {
                    mOptionalFields_builder.merge(from.getOptionalFields());
                } else if (mOptionalFields != null) {
                    mOptionalFields_builder = mOptionalFields.mutate().merge(from.getOptionalFields());
                    mOptionalFields = null;
                } else {
                    mOptionalFields = from.getOptionalFields();
                }
            }

            if (from.hasUnionFields()) {
                optionals.set(34);
                modified.set(34);
                if (mUnionFields_builder != null) {
                    mUnionFields_builder.merge(from.getUnionFields());
                } else if (mUnionFields != null) {
                    mUnionFields_builder = mUnionFields.mutate().merge(from.getUnionFields());
                    mUnionFields = null;
                } else {
                    mUnionFields = from.getUnionFields();
                }
            }

            if (from.hasExceptionFields()) {
                optionals.set(35);
                modified.set(35);
                if (mExceptionFields_builder != null) {
                    mExceptionFields_builder.merge(from.getExceptionFields());
                } else if (mExceptionFields != null) {
                    mExceptionFields_builder = mExceptionFields.mutate().merge(from.getExceptionFields());
                    mExceptionFields = null;
                } else {
                    mExceptionFields = from.getExceptionFields();
                }
            }

            if (from.hasDefaultValues()) {
                optionals.set(36);
                modified.set(36);
                if (mDefaultValues_builder != null) {
                    mDefaultValues_builder.merge(from.getDefaultValues());
                } else if (mDefaultValues != null) {
                    mDefaultValues_builder = mDefaultValues.mutate().merge(from.getDefaultValues());
                    mDefaultValues = null;
                } else {
                    mDefaultValues = from.getDefaultValues();
                }
            }

            if (from.hasMapListCompact()) {
                optionals.set(37);
                modified.set(37);
                mutableMapListCompact().putAll(from.getMapListCompact());
            }

            if (from.hasListMapNumbers()) {
                optionals.set(38);
                modified.set(38);
                mListMapNumbers = from.getListMapNumbers();
            }

            if (from.hasSetListNumbers()) {
                optionals.set(39);
                modified.set(39);
                mutableSetListNumbers().addAll(from.getSetListNumbers());
            }

            if (from.hasListListNumbers()) {
                optionals.set(40);
                modified.set(40);
                mListListNumbers = from.getListListNumbers();
            }
            return this;
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBooleanList(java.util.Collection<Boolean> value) {
            if (value == null) {
                return clearBooleanList();
            }

            optionals.set(0);
            modified.set(0);
            mBooleanList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToBooleanList(boolean... values) {
            optionals.set(0);
            modified.set(0);
            java.util.List<Boolean> _container = mutableBooleanList();
            for (boolean item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @return True if booleanList has been set.
         */
        public boolean isSetBooleanList() {
            return optionals.get(0);
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @return True if booleanList has been modified.
         */
        public boolean isModifiedBooleanList() {
            return modified.get(0);
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBooleanList() {
            optionals.clear(0);
            modified.set(0);
            mBooleanList = null;
            return this;
        }

        /**
         * all types as list&lt;x&gt;.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Boolean> mutableBooleanList() {
            optionals.set(0);
            modified.set(0);

            if (mBooleanList == null) {
                mBooleanList = new java.util.LinkedList<>();
            } else if (!(mBooleanList instanceof java.util.LinkedList)) {
                mBooleanList = new java.util.LinkedList<>(mBooleanList);
            }
            return mBooleanList;
        }

        /**
         * Sets the value of byteList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setByteList(java.util.Collection<Byte> value) {
            if (value == null) {
                return clearByteList();
            }

            optionals.set(1);
            modified.set(1);
            mByteList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to byteList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToByteList(byte... values) {
            optionals.set(1);
            modified.set(1);
            java.util.List<Byte> _container = mutableByteList();
            for (byte item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the byteList field.
         *
         * @return True if byteList has been set.
         */
        public boolean isSetByteList() {
            return optionals.get(1);
        }

        /**
         * Checks if byteList has been modified since the _Builder was created.
         *
         * @return True if byteList has been modified.
         */
        public boolean isModifiedByteList() {
            return modified.get(1);
        }

        /**
         * Clears the byteList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearByteList() {
            optionals.clear(1);
            modified.set(1);
            mByteList = null;
            return this;
        }

        /**
         * Gets the builder for the contained byteList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Byte> mutableByteList() {
            optionals.set(1);
            modified.set(1);

            if (mByteList == null) {
                mByteList = new java.util.LinkedList<>();
            } else if (!(mByteList instanceof java.util.LinkedList)) {
                mByteList = new java.util.LinkedList<>(mByteList);
            }
            return mByteList;
        }

        /**
         * Sets the value of shortList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setShortList(java.util.Collection<Short> value) {
            if (value == null) {
                return clearShortList();
            }

            optionals.set(2);
            modified.set(2);
            mShortList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to shortList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToShortList(short... values) {
            optionals.set(2);
            modified.set(2);
            java.util.List<Short> _container = mutableShortList();
            for (short item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the shortList field.
         *
         * @return True if shortList has been set.
         */
        public boolean isSetShortList() {
            return optionals.get(2);
        }

        /**
         * Checks if shortList has been modified since the _Builder was created.
         *
         * @return True if shortList has been modified.
         */
        public boolean isModifiedShortList() {
            return modified.get(2);
        }

        /**
         * Clears the shortList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearShortList() {
            optionals.clear(2);
            modified.set(2);
            mShortList = null;
            return this;
        }

        /**
         * Gets the builder for the contained shortList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Short> mutableShortList() {
            optionals.set(2);
            modified.set(2);

            if (mShortList == null) {
                mShortList = new java.util.LinkedList<>();
            } else if (!(mShortList instanceof java.util.LinkedList)) {
                mShortList = new java.util.LinkedList<>(mShortList);
            }
            return mShortList;
        }

        /**
         * Sets the value of integerList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setIntegerList(java.util.Collection<Integer> value) {
            if (value == null) {
                return clearIntegerList();
            }

            optionals.set(3);
            modified.set(3);
            mIntegerList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to integerList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToIntegerList(int... values) {
            optionals.set(3);
            modified.set(3);
            java.util.List<Integer> _container = mutableIntegerList();
            for (int item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the integerList field.
         *
         * @return True if integerList has been set.
         */
        public boolean isSetIntegerList() {
            return optionals.get(3);
        }

        /**
         * Checks if integerList has been modified since the _Builder was created.
         *
         * @return True if integerList has been modified.
         */
        public boolean isModifiedIntegerList() {
            return modified.get(3);
        }

        /**
         * Clears the integerList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearIntegerList() {
            optionals.clear(3);
            modified.set(3);
            mIntegerList = null;
            return this;
        }

        /**
         * Gets the builder for the contained integerList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Integer> mutableIntegerList() {
            optionals.set(3);
            modified.set(3);

            if (mIntegerList == null) {
                mIntegerList = new java.util.LinkedList<>();
            } else if (!(mIntegerList instanceof java.util.LinkedList)) {
                mIntegerList = new java.util.LinkedList<>(mIntegerList);
            }
            return mIntegerList;
        }

        /**
         * Sets the value of longList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setLongList(java.util.Collection<Long> value) {
            if (value == null) {
                return clearLongList();
            }

            optionals.set(4);
            modified.set(4);
            mLongList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to longList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToLongList(long... values) {
            optionals.set(4);
            modified.set(4);
            java.util.List<Long> _container = mutableLongList();
            for (long item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the longList field.
         *
         * @return True if longList has been set.
         */
        public boolean isSetLongList() {
            return optionals.get(4);
        }

        /**
         * Checks if longList has been modified since the _Builder was created.
         *
         * @return True if longList has been modified.
         */
        public boolean isModifiedLongList() {
            return modified.get(4);
        }

        /**
         * Clears the longList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearLongList() {
            optionals.clear(4);
            modified.set(4);
            mLongList = null;
            return this;
        }

        /**
         * Gets the builder for the contained longList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Long> mutableLongList() {
            optionals.set(4);
            modified.set(4);

            if (mLongList == null) {
                mLongList = new java.util.LinkedList<>();
            } else if (!(mLongList instanceof java.util.LinkedList)) {
                mLongList = new java.util.LinkedList<>(mLongList);
            }
            return mLongList;
        }

        /**
         * Sets the value of doubleList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setDoubleList(java.util.Collection<Double> value) {
            if (value == null) {
                return clearDoubleList();
            }

            optionals.set(5);
            modified.set(5);
            mDoubleList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to doubleList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToDoubleList(double... values) {
            optionals.set(5);
            modified.set(5);
            java.util.List<Double> _container = mutableDoubleList();
            for (double item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the doubleList field.
         *
         * @return True if doubleList has been set.
         */
        public boolean isSetDoubleList() {
            return optionals.get(5);
        }

        /**
         * Checks if doubleList has been modified since the _Builder was created.
         *
         * @return True if doubleList has been modified.
         */
        public boolean isModifiedDoubleList() {
            return modified.get(5);
        }

        /**
         * Clears the doubleList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearDoubleList() {
            optionals.clear(5);
            modified.set(5);
            mDoubleList = null;
            return this;
        }

        /**
         * Gets the builder for the contained doubleList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<Double> mutableDoubleList() {
            optionals.set(5);
            modified.set(5);

            if (mDoubleList == null) {
                mDoubleList = new java.util.LinkedList<>();
            } else if (!(mDoubleList instanceof java.util.LinkedList)) {
                mDoubleList = new java.util.LinkedList<>(mDoubleList);
            }
            return mDoubleList;
        }

        /**
         * Sets the value of stringList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setStringList(java.util.Collection<String> value) {
            if (value == null) {
                return clearStringList();
            }

            optionals.set(6);
            modified.set(6);
            mStringList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to stringList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToStringList(String... values) {
            optionals.set(6);
            modified.set(6);
            java.util.List<String> _container = mutableStringList();
            for (String item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the stringList field.
         *
         * @return True if stringList has been set.
         */
        public boolean isSetStringList() {
            return optionals.get(6);
        }

        /**
         * Checks if stringList has been modified since the _Builder was created.
         *
         * @return True if stringList has been modified.
         */
        public boolean isModifiedStringList() {
            return modified.get(6);
        }

        /**
         * Clears the stringList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearStringList() {
            optionals.clear(6);
            modified.set(6);
            mStringList = null;
            return this;
        }

        /**
         * Gets the builder for the contained stringList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<String> mutableStringList() {
            optionals.set(6);
            modified.set(6);

            if (mStringList == null) {
                mStringList = new java.util.LinkedList<>();
            } else if (!(mStringList instanceof java.util.LinkedList)) {
                mStringList = new java.util.LinkedList<>(mStringList);
            }
            return mStringList;
        }

        /**
         * Sets the value of binaryList.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBinaryList(java.util.Collection<net.morimekta.util.Binary> value) {
            if (value == null) {
                return clearBinaryList();
            }

            optionals.set(7);
            modified.set(7);
            mBinaryList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to binaryList.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToBinaryList(net.morimekta.util.Binary... values) {
            optionals.set(7);
            modified.set(7);
            java.util.List<net.morimekta.util.Binary> _container = mutableBinaryList();
            for (net.morimekta.util.Binary item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the binaryList field.
         *
         * @return True if binaryList has been set.
         */
        public boolean isSetBinaryList() {
            return optionals.get(7);
        }

        /**
         * Checks if binaryList has been modified since the _Builder was created.
         *
         * @return True if binaryList has been modified.
         */
        public boolean isModifiedBinaryList() {
            return modified.get(7);
        }

        /**
         * Clears the binaryList field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBinaryList() {
            optionals.clear(7);
            modified.set(7);
            mBinaryList = null;
            return this;
        }

        /**
         * Gets the builder for the contained binaryList.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<net.morimekta.util.Binary> mutableBinaryList() {
            optionals.set(7);
            modified.set(7);

            if (mBinaryList == null) {
                mBinaryList = new java.util.LinkedList<>();
            } else if (!(mBinaryList instanceof java.util.LinkedList)) {
                mBinaryList = new java.util.LinkedList<>(mBinaryList);
            }
            return mBinaryList;
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBooleanSet(java.util.Collection<Boolean> value) {
            if (value == null) {
                return clearBooleanSet();
            }

            optionals.set(8);
            modified.set(8);
            mBooleanSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToBooleanSet(boolean... values) {
            optionals.set(8);
            modified.set(8);
            java.util.Set<Boolean> _container = mutableBooleanSet();
            for (boolean item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @return True if booleanSet has been set.
         */
        public boolean isSetBooleanSet() {
            return optionals.get(8);
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @return True if booleanSet has been modified.
         */
        public boolean isModifiedBooleanSet() {
            return modified.get(8);
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBooleanSet() {
            optionals.clear(8);
            modified.set(8);
            mBooleanSet = null;
            return this;
        }

        /**
         * all types as set&lt;x&gt;.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Boolean> mutableBooleanSet() {
            optionals.set(8);
            modified.set(8);

            if (mBooleanSet == null) {
                mBooleanSet = new java.util.HashSet<>();
            } else if (!(mBooleanSet instanceof java.util.HashSet)) {
                mBooleanSet = new java.util.HashSet<>(mBooleanSet);
            }
            return mBooleanSet;
        }

        /**
         * Sets the value of byteSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setByteSet(java.util.Collection<Byte> value) {
            if (value == null) {
                return clearByteSet();
            }

            optionals.set(9);
            modified.set(9);
            mByteSet = com.google.common.collect.ImmutableSortedSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to byteSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToByteSet(byte... values) {
            optionals.set(9);
            modified.set(9);
            java.util.Set<Byte> _container = mutableByteSet();
            for (byte item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the byteSet field.
         *
         * @return True if byteSet has been set.
         */
        public boolean isSetByteSet() {
            return optionals.get(9);
        }

        /**
         * Checks if byteSet has been modified since the _Builder was created.
         *
         * @return True if byteSet has been modified.
         */
        public boolean isModifiedByteSet() {
            return modified.get(9);
        }

        /**
         * Clears the byteSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearByteSet() {
            optionals.clear(9);
            modified.set(9);
            mByteSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained byteSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Byte> mutableByteSet() {
            optionals.set(9);
            modified.set(9);

            if (mByteSet == null) {
                mByteSet = new java.util.TreeSet<>();
            } else if (!(mByteSet instanceof java.util.TreeSet)) {
                mByteSet = new java.util.TreeSet<>(mByteSet);
            }
            return mByteSet;
        }

        /**
         * Sets the value of shortSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setShortSet(java.util.Collection<Short> value) {
            if (value == null) {
                return clearShortSet();
            }

            optionals.set(10);
            modified.set(10);
            mShortSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to shortSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToShortSet(short... values) {
            optionals.set(10);
            modified.set(10);
            java.util.Set<Short> _container = mutableShortSet();
            for (short item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the shortSet field.
         *
         * @return True if shortSet has been set.
         */
        public boolean isSetShortSet() {
            return optionals.get(10);
        }

        /**
         * Checks if shortSet has been modified since the _Builder was created.
         *
         * @return True if shortSet has been modified.
         */
        public boolean isModifiedShortSet() {
            return modified.get(10);
        }

        /**
         * Clears the shortSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearShortSet() {
            optionals.clear(10);
            modified.set(10);
            mShortSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained shortSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Short> mutableShortSet() {
            optionals.set(10);
            modified.set(10);

            if (mShortSet == null) {
                mShortSet = new java.util.LinkedHashSet<>();
            } else if (!(mShortSet instanceof java.util.LinkedHashSet)) {
                mShortSet = new java.util.LinkedHashSet<>(mShortSet);
            }
            return mShortSet;
        }

        /**
         * Sets the value of integerSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setIntegerSet(java.util.Collection<Integer> value) {
            if (value == null) {
                return clearIntegerSet();
            }

            optionals.set(11);
            modified.set(11);
            mIntegerSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to integerSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToIntegerSet(int... values) {
            optionals.set(11);
            modified.set(11);
            java.util.Set<Integer> _container = mutableIntegerSet();
            for (int item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the integerSet field.
         *
         * @return True if integerSet has been set.
         */
        public boolean isSetIntegerSet() {
            return optionals.get(11);
        }

        /**
         * Checks if integerSet has been modified since the _Builder was created.
         *
         * @return True if integerSet has been modified.
         */
        public boolean isModifiedIntegerSet() {
            return modified.get(11);
        }

        /**
         * Clears the integerSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearIntegerSet() {
            optionals.clear(11);
            modified.set(11);
            mIntegerSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained integerSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Integer> mutableIntegerSet() {
            optionals.set(11);
            modified.set(11);

            if (mIntegerSet == null) {
                mIntegerSet = new java.util.HashSet<>();
            } else if (!(mIntegerSet instanceof java.util.HashSet)) {
                mIntegerSet = new java.util.HashSet<>(mIntegerSet);
            }
            return mIntegerSet;
        }

        /**
         * Sets the value of longSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setLongSet(java.util.Collection<Long> value) {
            if (value == null) {
                return clearLongSet();
            }

            optionals.set(12);
            modified.set(12);
            mLongSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to longSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToLongSet(long... values) {
            optionals.set(12);
            modified.set(12);
            java.util.Set<Long> _container = mutableLongSet();
            for (long item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the longSet field.
         *
         * @return True if longSet has been set.
         */
        public boolean isSetLongSet() {
            return optionals.get(12);
        }

        /**
         * Checks if longSet has been modified since the _Builder was created.
         *
         * @return True if longSet has been modified.
         */
        public boolean isModifiedLongSet() {
            return modified.get(12);
        }

        /**
         * Clears the longSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearLongSet() {
            optionals.clear(12);
            modified.set(12);
            mLongSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained longSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Long> mutableLongSet() {
            optionals.set(12);
            modified.set(12);

            if (mLongSet == null) {
                mLongSet = new java.util.HashSet<>();
            } else if (!(mLongSet instanceof java.util.HashSet)) {
                mLongSet = new java.util.HashSet<>(mLongSet);
            }
            return mLongSet;
        }

        /**
         * Sets the value of doubleSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setDoubleSet(java.util.Collection<Double> value) {
            if (value == null) {
                return clearDoubleSet();
            }

            optionals.set(13);
            modified.set(13);
            mDoubleSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to doubleSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToDoubleSet(double... values) {
            optionals.set(13);
            modified.set(13);
            java.util.Set<Double> _container = mutableDoubleSet();
            for (double item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the doubleSet field.
         *
         * @return True if doubleSet has been set.
         */
        public boolean isSetDoubleSet() {
            return optionals.get(13);
        }

        /**
         * Checks if doubleSet has been modified since the _Builder was created.
         *
         * @return True if doubleSet has been modified.
         */
        public boolean isModifiedDoubleSet() {
            return modified.get(13);
        }

        /**
         * Clears the doubleSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearDoubleSet() {
            optionals.clear(13);
            modified.set(13);
            mDoubleSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained doubleSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<Double> mutableDoubleSet() {
            optionals.set(13);
            modified.set(13);

            if (mDoubleSet == null) {
                mDoubleSet = new java.util.HashSet<>();
            } else if (!(mDoubleSet instanceof java.util.HashSet)) {
                mDoubleSet = new java.util.HashSet<>(mDoubleSet);
            }
            return mDoubleSet;
        }

        /**
         * Sets the value of stringSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setStringSet(java.util.Collection<String> value) {
            if (value == null) {
                return clearStringSet();
            }

            optionals.set(14);
            modified.set(14);
            mStringSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to stringSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToStringSet(String... values) {
            optionals.set(14);
            modified.set(14);
            java.util.Set<String> _container = mutableStringSet();
            for (String item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the stringSet field.
         *
         * @return True if stringSet has been set.
         */
        public boolean isSetStringSet() {
            return optionals.get(14);
        }

        /**
         * Checks if stringSet has been modified since the _Builder was created.
         *
         * @return True if stringSet has been modified.
         */
        public boolean isModifiedStringSet() {
            return modified.get(14);
        }

        /**
         * Clears the stringSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearStringSet() {
            optionals.clear(14);
            modified.set(14);
            mStringSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained stringSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<String> mutableStringSet() {
            optionals.set(14);
            modified.set(14);

            if (mStringSet == null) {
                mStringSet = new java.util.HashSet<>();
            } else if (!(mStringSet instanceof java.util.HashSet)) {
                mStringSet = new java.util.HashSet<>(mStringSet);
            }
            return mStringSet;
        }

        /**
         * Sets the value of binarySet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBinarySet(java.util.Collection<net.morimekta.util.Binary> value) {
            if (value == null) {
                return clearBinarySet();
            }

            optionals.set(15);
            modified.set(15);
            mBinarySet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to binarySet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToBinarySet(net.morimekta.util.Binary... values) {
            optionals.set(15);
            modified.set(15);
            java.util.Set<net.morimekta.util.Binary> _container = mutableBinarySet();
            for (net.morimekta.util.Binary item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the binarySet field.
         *
         * @return True if binarySet has been set.
         */
        public boolean isSetBinarySet() {
            return optionals.get(15);
        }

        /**
         * Checks if binarySet has been modified since the _Builder was created.
         *
         * @return True if binarySet has been modified.
         */
        public boolean isModifiedBinarySet() {
            return modified.get(15);
        }

        /**
         * Clears the binarySet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBinarySet() {
            optionals.clear(15);
            modified.set(15);
            mBinarySet = null;
            return this;
        }

        /**
         * Gets the builder for the contained binarySet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<net.morimekta.util.Binary> mutableBinarySet() {
            optionals.set(15);
            modified.set(15);

            if (mBinarySet == null) {
                mBinarySet = new java.util.HashSet<>();
            } else if (!(mBinarySet instanceof java.util.HashSet)) {
                mBinarySet = new java.util.HashSet<>(mBinarySet);
            }
            return mBinarySet;
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBooleanMap(java.util.Map<Boolean,Boolean> value) {
            if (value == null) {
                return clearBooleanMap();
            }

            optionals.set(16);
            modified.set(16);
            mBooleanMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInBooleanMap(boolean key, boolean value) {
            optionals.set(16);
            modified.set(16);
            mutableBooleanMap().put(key, value);
            return this;
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @return True if booleanMap has been set.
         */
        public boolean isSetBooleanMap() {
            return optionals.get(16);
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @return True if booleanMap has been modified.
         */
        public boolean isModifiedBooleanMap() {
            return modified.get(16);
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBooleanMap() {
            optionals.clear(16);
            modified.set(16);
            mBooleanMap = null;
            return this;
        }

        /**
         * all types as map&lt;x,x&gt;.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Boolean,Boolean> mutableBooleanMap() {
            optionals.set(16);
            modified.set(16);

            if (mBooleanMap == null) {
                mBooleanMap = new java.util.HashMap<>();
            } else if (!(mBooleanMap instanceof java.util.HashMap)) {
                mBooleanMap = new java.util.HashMap<>(mBooleanMap);
            }
            return mBooleanMap;
        }

        /**
         * Sets the value of byteMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setByteMap(java.util.Map<Byte,Byte> value) {
            if (value == null) {
                return clearByteMap();
            }

            optionals.set(17);
            modified.set(17);
            mByteMap = com.google.common.collect.ImmutableSortedMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to byteMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInByteMap(byte key, byte value) {
            optionals.set(17);
            modified.set(17);
            mutableByteMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the byteMap field.
         *
         * @return True if byteMap has been set.
         */
        public boolean isSetByteMap() {
            return optionals.get(17);
        }

        /**
         * Checks if byteMap has been modified since the _Builder was created.
         *
         * @return True if byteMap has been modified.
         */
        public boolean isModifiedByteMap() {
            return modified.get(17);
        }

        /**
         * Clears the byteMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearByteMap() {
            optionals.clear(17);
            modified.set(17);
            mByteMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained byteMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Byte,Byte> mutableByteMap() {
            optionals.set(17);
            modified.set(17);

            if (mByteMap == null) {
                mByteMap = new java.util.TreeMap<>();
            } else if (!(mByteMap instanceof java.util.TreeMap)) {
                mByteMap = new java.util.TreeMap<>(mByteMap);
            }
            return mByteMap;
        }

        /**
         * Sets the value of shortMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setShortMap(java.util.Map<Short,Short> value) {
            if (value == null) {
                return clearShortMap();
            }

            optionals.set(18);
            modified.set(18);
            mShortMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to shortMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInShortMap(short key, short value) {
            optionals.set(18);
            modified.set(18);
            mutableShortMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the shortMap field.
         *
         * @return True if shortMap has been set.
         */
        public boolean isSetShortMap() {
            return optionals.get(18);
        }

        /**
         * Checks if shortMap has been modified since the _Builder was created.
         *
         * @return True if shortMap has been modified.
         */
        public boolean isModifiedShortMap() {
            return modified.get(18);
        }

        /**
         * Clears the shortMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearShortMap() {
            optionals.clear(18);
            modified.set(18);
            mShortMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained shortMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Short,Short> mutableShortMap() {
            optionals.set(18);
            modified.set(18);

            if (mShortMap == null) {
                mShortMap = new java.util.LinkedHashMap<>();
            } else if (!(mShortMap instanceof java.util.LinkedHashMap)) {
                mShortMap = new java.util.LinkedHashMap<>(mShortMap);
            }
            return mShortMap;
        }

        /**
         * Sets the value of integerMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setIntegerMap(java.util.Map<Integer,Integer> value) {
            if (value == null) {
                return clearIntegerMap();
            }

            optionals.set(19);
            modified.set(19);
            mIntegerMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to integerMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInIntegerMap(int key, int value) {
            optionals.set(19);
            modified.set(19);
            mutableIntegerMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the integerMap field.
         *
         * @return True if integerMap has been set.
         */
        public boolean isSetIntegerMap() {
            return optionals.get(19);
        }

        /**
         * Checks if integerMap has been modified since the _Builder was created.
         *
         * @return True if integerMap has been modified.
         */
        public boolean isModifiedIntegerMap() {
            return modified.get(19);
        }

        /**
         * Clears the integerMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearIntegerMap() {
            optionals.clear(19);
            modified.set(19);
            mIntegerMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained integerMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Integer,Integer> mutableIntegerMap() {
            optionals.set(19);
            modified.set(19);

            if (mIntegerMap == null) {
                mIntegerMap = new java.util.HashMap<>();
            } else if (!(mIntegerMap instanceof java.util.HashMap)) {
                mIntegerMap = new java.util.HashMap<>(mIntegerMap);
            }
            return mIntegerMap;
        }

        /**
         * Sets the value of longMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setLongMap(java.util.Map<Long,Long> value) {
            if (value == null) {
                return clearLongMap();
            }

            optionals.set(20);
            modified.set(20);
            mLongMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to longMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInLongMap(long key, long value) {
            optionals.set(20);
            modified.set(20);
            mutableLongMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the longMap field.
         *
         * @return True if longMap has been set.
         */
        public boolean isSetLongMap() {
            return optionals.get(20);
        }

        /**
         * Checks if longMap has been modified since the _Builder was created.
         *
         * @return True if longMap has been modified.
         */
        public boolean isModifiedLongMap() {
            return modified.get(20);
        }

        /**
         * Clears the longMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearLongMap() {
            optionals.clear(20);
            modified.set(20);
            mLongMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained longMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Long,Long> mutableLongMap() {
            optionals.set(20);
            modified.set(20);

            if (mLongMap == null) {
                mLongMap = new java.util.HashMap<>();
            } else if (!(mLongMap instanceof java.util.HashMap)) {
                mLongMap = new java.util.HashMap<>(mLongMap);
            }
            return mLongMap;
        }

        /**
         * Sets the value of doubleMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setDoubleMap(java.util.Map<Double,Double> value) {
            if (value == null) {
                return clearDoubleMap();
            }

            optionals.set(21);
            modified.set(21);
            mDoubleMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to doubleMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInDoubleMap(double key, double value) {
            optionals.set(21);
            modified.set(21);
            mutableDoubleMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the doubleMap field.
         *
         * @return True if doubleMap has been set.
         */
        public boolean isSetDoubleMap() {
            return optionals.get(21);
        }

        /**
         * Checks if doubleMap has been modified since the _Builder was created.
         *
         * @return True if doubleMap has been modified.
         */
        public boolean isModifiedDoubleMap() {
            return modified.get(21);
        }

        /**
         * Clears the doubleMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearDoubleMap() {
            optionals.clear(21);
            modified.set(21);
            mDoubleMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained doubleMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Double,Double> mutableDoubleMap() {
            optionals.set(21);
            modified.set(21);

            if (mDoubleMap == null) {
                mDoubleMap = new java.util.HashMap<>();
            } else if (!(mDoubleMap instanceof java.util.HashMap)) {
                mDoubleMap = new java.util.HashMap<>(mDoubleMap);
            }
            return mDoubleMap;
        }

        /**
         * Sets the value of stringMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setStringMap(java.util.Map<String,String> value) {
            if (value == null) {
                return clearStringMap();
            }

            optionals.set(22);
            modified.set(22);
            mStringMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to stringMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInStringMap(String key, String value) {
            optionals.set(22);
            modified.set(22);
            mutableStringMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the stringMap field.
         *
         * @return True if stringMap has been set.
         */
        public boolean isSetStringMap() {
            return optionals.get(22);
        }

        /**
         * Checks if stringMap has been modified since the _Builder was created.
         *
         * @return True if stringMap has been modified.
         */
        public boolean isModifiedStringMap() {
            return modified.get(22);
        }

        /**
         * Clears the stringMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearStringMap() {
            optionals.clear(22);
            modified.set(22);
            mStringMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained stringMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<String,String> mutableStringMap() {
            optionals.set(22);
            modified.set(22);

            if (mStringMap == null) {
                mStringMap = new java.util.HashMap<>();
            } else if (!(mStringMap instanceof java.util.HashMap)) {
                mStringMap = new java.util.HashMap<>(mStringMap);
            }
            return mStringMap;
        }

        /**
         * Sets the value of binaryMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setBinaryMap(java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary> value) {
            if (value == null) {
                return clearBinaryMap();
            }

            optionals.set(23);
            modified.set(23);
            mBinaryMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to binaryMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInBinaryMap(net.morimekta.util.Binary key, net.morimekta.util.Binary value) {
            optionals.set(23);
            modified.set(23);
            mutableBinaryMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the binaryMap field.
         *
         * @return True if binaryMap has been set.
         */
        public boolean isSetBinaryMap() {
            return optionals.get(23);
        }

        /**
         * Checks if binaryMap has been modified since the _Builder was created.
         *
         * @return True if binaryMap has been modified.
         */
        public boolean isModifiedBinaryMap() {
            return modified.get(23);
        }

        /**
         * Clears the binaryMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearBinaryMap() {
            optionals.clear(23);
            modified.set(23);
            mBinaryMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained binaryMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary> mutableBinaryMap() {
            optionals.set(23);
            modified.set(23);

            if (mBinaryMap == null) {
                mBinaryMap = new java.util.HashMap<>();
            } else if (!(mBinaryMap instanceof java.util.HashMap)) {
                mBinaryMap = new java.util.HashMap<>(mBinaryMap);
            }
            return mBinaryMap;
        }

        /**
         * Using enum as key and value in containers.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setEnumList(java.util.Collection<net.morimekta.test.providence.core.Value> value) {
            if (value == null) {
                return clearEnumList();
            }

            optionals.set(24);
            modified.set(24);
            mEnumList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Using enum as key and value in containers.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToEnumList(net.morimekta.test.providence.core.Value... values) {
            optionals.set(24);
            modified.set(24);
            java.util.List<net.morimekta.test.providence.core.Value> _container = mutableEnumList();
            for (net.morimekta.test.providence.core.Value item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Using enum as key and value in containers.
         *
         * @return True if enumList has been set.
         */
        public boolean isSetEnumList() {
            return optionals.get(24);
        }

        /**
         * Using enum as key and value in containers.
         *
         * @return True if enumList has been modified.
         */
        public boolean isModifiedEnumList() {
            return modified.get(24);
        }

        /**
         * Using enum as key and value in containers.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearEnumList() {
            optionals.clear(24);
            modified.set(24);
            mEnumList = null;
            return this;
        }

        /**
         * Using enum as key and value in containers.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<net.morimekta.test.providence.core.Value> mutableEnumList() {
            optionals.set(24);
            modified.set(24);

            if (mEnumList == null) {
                mEnumList = new java.util.LinkedList<>();
            } else if (!(mEnumList instanceof java.util.LinkedList)) {
                mEnumList = new java.util.LinkedList<>(mEnumList);
            }
            return mEnumList;
        }

        /**
         * Sets the value of enumSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setEnumSet(java.util.Collection<net.morimekta.test.providence.core.Value> value) {
            if (value == null) {
                return clearEnumSet();
            }

            optionals.set(25);
            modified.set(25);
            mEnumSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to enumSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToEnumSet(net.morimekta.test.providence.core.Value... values) {
            optionals.set(25);
            modified.set(25);
            java.util.Set<net.morimekta.test.providence.core.Value> _container = mutableEnumSet();
            for (net.morimekta.test.providence.core.Value item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the enumSet field.
         *
         * @return True if enumSet has been set.
         */
        public boolean isSetEnumSet() {
            return optionals.get(25);
        }

        /**
         * Checks if enumSet has been modified since the _Builder was created.
         *
         * @return True if enumSet has been modified.
         */
        public boolean isModifiedEnumSet() {
            return modified.get(25);
        }

        /**
         * Clears the enumSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearEnumSet() {
            optionals.clear(25);
            modified.set(25);
            mEnumSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained enumSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<net.morimekta.test.providence.core.Value> mutableEnumSet() {
            optionals.set(25);
            modified.set(25);

            if (mEnumSet == null) {
                mEnumSet = new java.util.HashSet<>();
            } else if (!(mEnumSet instanceof java.util.HashSet)) {
                mEnumSet = new java.util.HashSet<>(mEnumSet);
            }
            return mEnumSet;
        }

        /**
         * Sets the value of enumMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setEnumMap(java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> value) {
            if (value == null) {
                return clearEnumMap();
            }

            optionals.set(26);
            modified.set(26);
            mEnumMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to enumMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInEnumMap(net.morimekta.test.providence.core.Value key, net.morimekta.test.providence.core.Value value) {
            optionals.set(26);
            modified.set(26);
            mutableEnumMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the enumMap field.
         *
         * @return True if enumMap has been set.
         */
        public boolean isSetEnumMap() {
            return optionals.get(26);
        }

        /**
         * Checks if enumMap has been modified since the _Builder was created.
         *
         * @return True if enumMap has been modified.
         */
        public boolean isModifiedEnumMap() {
            return modified.get(26);
        }

        /**
         * Clears the enumMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearEnumMap() {
            optionals.clear(26);
            modified.set(26);
            mEnumMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained enumMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> mutableEnumMap() {
            optionals.set(26);
            modified.set(26);

            if (mEnumMap == null) {
                mEnumMap = new java.util.HashMap<>();
            } else if (!(mEnumMap instanceof java.util.HashMap)) {
                mEnumMap = new java.util.HashMap<>(mEnumMap);
            }
            return mEnumMap;
        }

        /**
         * Using struct as key and value in containers.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setMessageList(java.util.Collection<net.morimekta.test.providence.core.DefaultFields> value) {
            if (value == null) {
                return clearMessageList();
            }

            optionals.set(27);
            modified.set(27);
            mMessageList = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Using struct as key and value in containers.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToMessageList(net.morimekta.test.providence.core.DefaultFields... values) {
            optionals.set(27);
            modified.set(27);
            java.util.List<net.morimekta.test.providence.core.DefaultFields> _container = mutableMessageList();
            for (net.morimekta.test.providence.core.DefaultFields item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Using struct as key and value in containers.
         *
         * @return True if messageList has been set.
         */
        public boolean isSetMessageList() {
            return optionals.get(27);
        }

        /**
         * Using struct as key and value in containers.
         *
         * @return True if messageList has been modified.
         */
        public boolean isModifiedMessageList() {
            return modified.get(27);
        }

        /**
         * Using struct as key and value in containers.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearMessageList() {
            optionals.clear(27);
            modified.set(27);
            mMessageList = null;
            return this;
        }

        /**
         * Using struct as key and value in containers.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<net.morimekta.test.providence.core.DefaultFields> mutableMessageList() {
            optionals.set(27);
            modified.set(27);

            if (mMessageList == null) {
                mMessageList = new java.util.LinkedList<>();
            } else if (!(mMessageList instanceof java.util.LinkedList)) {
                mMessageList = new java.util.LinkedList<>(mMessageList);
            }
            return mMessageList;
        }

        /**
         * Sets the value of messageSet.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setMessageSet(java.util.Collection<net.morimekta.test.providence.core.DefaultFields> value) {
            if (value == null) {
                return clearMessageSet();
            }

            optionals.set(28);
            modified.set(28);
            mMessageSet = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to messageSet.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToMessageSet(net.morimekta.test.providence.core.DefaultFields... values) {
            optionals.set(28);
            modified.set(28);
            java.util.Set<net.morimekta.test.providence.core.DefaultFields> _container = mutableMessageSet();
            for (net.morimekta.test.providence.core.DefaultFields item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the messageSet field.
         *
         * @return True if messageSet has been set.
         */
        public boolean isSetMessageSet() {
            return optionals.get(28);
        }

        /**
         * Checks if messageSet has been modified since the _Builder was created.
         *
         * @return True if messageSet has been modified.
         */
        public boolean isModifiedMessageSet() {
            return modified.get(28);
        }

        /**
         * Clears the messageSet field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearMessageSet() {
            optionals.clear(28);
            modified.set(28);
            mMessageSet = null;
            return this;
        }

        /**
         * Gets the builder for the contained messageSet.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<net.morimekta.test.providence.core.DefaultFields> mutableMessageSet() {
            optionals.set(28);
            modified.set(28);

            if (mMessageSet == null) {
                mMessageSet = new java.util.HashSet<>();
            } else if (!(mMessageSet instanceof java.util.HashSet)) {
                mMessageSet = new java.util.HashSet<>(mMessageSet);
            }
            return mMessageSet;
        }

        /**
         * Sets the value of messageMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setMessageMap(java.util.Map<String,net.morimekta.test.providence.core.DefaultFields> value) {
            if (value == null) {
                return clearMessageMap();
            }

            optionals.set(29);
            modified.set(29);
            mMessageMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to messageMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInMessageMap(String key, net.morimekta.test.providence.core.DefaultFields value) {
            optionals.set(29);
            modified.set(29);
            mutableMessageMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the messageMap field.
         *
         * @return True if messageMap has been set.
         */
        public boolean isSetMessageMap() {
            return optionals.get(29);
        }

        /**
         * Checks if messageMap has been modified since the _Builder was created.
         *
         * @return True if messageMap has been modified.
         */
        public boolean isModifiedMessageMap() {
            return modified.get(29);
        }

        /**
         * Clears the messageMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearMessageMap() {
            optionals.clear(29);
            modified.set(29);
            mMessageMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained messageMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<String,net.morimekta.test.providence.core.DefaultFields> mutableMessageMap() {
            optionals.set(29);
            modified.set(29);

            if (mMessageMap == null) {
                mMessageMap = new java.util.HashMap<>();
            } else if (!(mMessageMap instanceof java.util.HashMap)) {
                mMessageMap = new java.util.HashMap<>(mMessageMap);
            }
            return mMessageMap;
        }

        /**
         * Sets the value of messageKeyMap.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setMessageKeyMap(java.util.Map<net.morimekta.test.providence.core.CompactFields,String> value) {
            if (value == null) {
                return clearMessageKeyMap();
            }

            optionals.set(30);
            modified.set(30);
            mMessageKeyMap = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to messageKeyMap.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInMessageKeyMap(net.morimekta.test.providence.core.CompactFields key, String value) {
            optionals.set(30);
            modified.set(30);
            mutableMessageKeyMap().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the messageKeyMap field.
         *
         * @return True if messageKeyMap has been set.
         */
        public boolean isSetMessageKeyMap() {
            return optionals.get(30);
        }

        /**
         * Checks if messageKeyMap has been modified since the _Builder was created.
         *
         * @return True if messageKeyMap has been modified.
         */
        public boolean isModifiedMessageKeyMap() {
            return modified.get(30);
        }

        /**
         * Clears the messageKeyMap field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearMessageKeyMap() {
            optionals.clear(30);
            modified.set(30);
            mMessageKeyMap = null;
            return this;
        }

        /**
         * Gets the builder for the contained messageKeyMap.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<net.morimekta.test.providence.core.CompactFields,String> mutableMessageKeyMap() {
            optionals.set(30);
            modified.set(30);

            if (mMessageKeyMap == null) {
                mMessageKeyMap = new java.util.HashMap<>();
            } else if (!(mMessageKeyMap instanceof java.util.HashMap)) {
                mMessageKeyMap = new java.util.HashMap<>(mMessageKeyMap);
            }
            return mMessageKeyMap;
        }

        /**
         * Sets the value of requiredFields.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setRequiredFields(net.morimekta.test.providence.core.RequiredFields value) {
            if (value == null) {
                return clearRequiredFields();
            }

            optionals.set(31);
            modified.set(31);
            mRequiredFields = value;
            mRequiredFields_builder = null;
            return this;
        }

        /**
         * Checks for presence of the requiredFields field.
         *
         * @return True if requiredFields has been set.
         */
        public boolean isSetRequiredFields() {
            return optionals.get(31);
        }

        /**
         * Checks if requiredFields has been modified since the _Builder was created.
         *
         * @return True if requiredFields has been modified.
         */
        public boolean isModifiedRequiredFields() {
            return modified.get(31);
        }

        /**
         * Clears the requiredFields field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearRequiredFields() {
            optionals.clear(31);
            modified.set(31);
            mRequiredFields = null;
            mRequiredFields_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained requiredFields.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.RequiredFields._Builder mutableRequiredFields() {
            optionals.set(31);
            modified.set(31);

            if (mRequiredFields != null) {
                mRequiredFields_builder = mRequiredFields.mutate();
                mRequiredFields = null;
            } else if (mRequiredFields_builder == null) {
                mRequiredFields_builder = net.morimekta.test.providence.core.RequiredFields.builder();
            }
            return mRequiredFields_builder;
        }

        /**
         * Gets the value for the contained requiredFields.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.RequiredFields getRequiredFields() {

            if (mRequiredFields_builder != null) {
                return mRequiredFields_builder.build();
            }
            return mRequiredFields;
        }

        /**
         * Sets the value of defaultFields.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setDefaultFields(net.morimekta.test.providence.core.DefaultFields value) {
            if (value == null) {
                return clearDefaultFields();
            }

            optionals.set(32);
            modified.set(32);
            mDefaultFields = value;
            mDefaultFields_builder = null;
            return this;
        }

        /**
         * Checks for presence of the defaultFields field.
         *
         * @return True if defaultFields has been set.
         */
        public boolean isSetDefaultFields() {
            return optionals.get(32);
        }

        /**
         * Checks if defaultFields has been modified since the _Builder was created.
         *
         * @return True if defaultFields has been modified.
         */
        public boolean isModifiedDefaultFields() {
            return modified.get(32);
        }

        /**
         * Clears the defaultFields field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearDefaultFields() {
            optionals.clear(32);
            modified.set(32);
            mDefaultFields = null;
            mDefaultFields_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained defaultFields.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.DefaultFields._Builder mutableDefaultFields() {
            optionals.set(32);
            modified.set(32);

            if (mDefaultFields != null) {
                mDefaultFields_builder = mDefaultFields.mutate();
                mDefaultFields = null;
            } else if (mDefaultFields_builder == null) {
                mDefaultFields_builder = net.morimekta.test.providence.core.DefaultFields.builder();
            }
            return mDefaultFields_builder;
        }

        /**
         * Gets the value for the contained defaultFields.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.DefaultFields getDefaultFields() {

            if (mDefaultFields_builder != null) {
                return mDefaultFields_builder.build();
            }
            return mDefaultFields;
        }

        /**
         * Sets the value of optionalFields.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setOptionalFields(net.morimekta.test.providence.core.OptionalFields value) {
            if (value == null) {
                return clearOptionalFields();
            }

            optionals.set(33);
            modified.set(33);
            mOptionalFields = value;
            mOptionalFields_builder = null;
            return this;
        }

        /**
         * Checks for presence of the optionalFields field.
         *
         * @return True if optionalFields has been set.
         */
        public boolean isSetOptionalFields() {
            return optionals.get(33);
        }

        /**
         * Checks if optionalFields has been modified since the _Builder was created.
         *
         * @return True if optionalFields has been modified.
         */
        public boolean isModifiedOptionalFields() {
            return modified.get(33);
        }

        /**
         * Clears the optionalFields field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearOptionalFields() {
            optionals.clear(33);
            modified.set(33);
            mOptionalFields = null;
            mOptionalFields_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained optionalFields.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.OptionalFields._Builder mutableOptionalFields() {
            optionals.set(33);
            modified.set(33);

            if (mOptionalFields != null) {
                mOptionalFields_builder = mOptionalFields.mutate();
                mOptionalFields = null;
            } else if (mOptionalFields_builder == null) {
                mOptionalFields_builder = net.morimekta.test.providence.core.OptionalFields.builder();
            }
            return mOptionalFields_builder;
        }

        /**
         * Gets the value for the contained optionalFields.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.OptionalFields getOptionalFields() {

            if (mOptionalFields_builder != null) {
                return mOptionalFields_builder.build();
            }
            return mOptionalFields;
        }

        /**
         * Sets the value of unionFields.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setUnionFields(net.morimekta.test.providence.core.UnionFields value) {
            if (value == null) {
                return clearUnionFields();
            }

            optionals.set(34);
            modified.set(34);
            mUnionFields = value;
            mUnionFields_builder = null;
            return this;
        }

        /**
         * Checks for presence of the unionFields field.
         *
         * @return True if unionFields has been set.
         */
        public boolean isSetUnionFields() {
            return optionals.get(34);
        }

        /**
         * Checks if unionFields has been modified since the _Builder was created.
         *
         * @return True if unionFields has been modified.
         */
        public boolean isModifiedUnionFields() {
            return modified.get(34);
        }

        /**
         * Clears the unionFields field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearUnionFields() {
            optionals.clear(34);
            modified.set(34);
            mUnionFields = null;
            mUnionFields_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained unionFields.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.UnionFields._Builder mutableUnionFields() {
            optionals.set(34);
            modified.set(34);

            if (mUnionFields != null) {
                mUnionFields_builder = mUnionFields.mutate();
                mUnionFields = null;
            } else if (mUnionFields_builder == null) {
                mUnionFields_builder = net.morimekta.test.providence.core.UnionFields.builder();
            }
            return mUnionFields_builder;
        }

        /**
         * Gets the value for the contained unionFields.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.UnionFields getUnionFields() {

            if (mUnionFields_builder != null) {
                return mUnionFields_builder.build();
            }
            return mUnionFields;
        }

        /**
         * Sets the value of exceptionFields.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setExceptionFields(net.morimekta.test.providence.core.ExceptionFields value) {
            if (value == null) {
                return clearExceptionFields();
            }

            optionals.set(35);
            modified.set(35);
            mExceptionFields = value;
            mExceptionFields_builder = null;
            return this;
        }

        /**
         * Checks for presence of the exceptionFields field.
         *
         * @return True if exceptionFields has been set.
         */
        public boolean isSetExceptionFields() {
            return optionals.get(35);
        }

        /**
         * Checks if exceptionFields has been modified since the _Builder was created.
         *
         * @return True if exceptionFields has been modified.
         */
        public boolean isModifiedExceptionFields() {
            return modified.get(35);
        }

        /**
         * Clears the exceptionFields field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearExceptionFields() {
            optionals.clear(35);
            modified.set(35);
            mExceptionFields = null;
            mExceptionFields_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained exceptionFields.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.ExceptionFields._Builder mutableExceptionFields() {
            optionals.set(35);
            modified.set(35);

            if (mExceptionFields != null) {
                mExceptionFields_builder = mExceptionFields.mutate();
                mExceptionFields = null;
            } else if (mExceptionFields_builder == null) {
                mExceptionFields_builder = net.morimekta.test.providence.core.ExceptionFields.builder();
            }
            return mExceptionFields_builder;
        }

        /**
         * Gets the value for the contained exceptionFields.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.ExceptionFields getExceptionFields() {

            if (mExceptionFields_builder != null) {
                return mExceptionFields_builder.build();
            }
            return mExceptionFields;
        }

        /**
         * Sets the value of defaultValues.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setDefaultValues(net.morimekta.test.providence.core.DefaultValues value) {
            if (value == null) {
                return clearDefaultValues();
            }

            optionals.set(36);
            modified.set(36);
            mDefaultValues = value;
            mDefaultValues_builder = null;
            return this;
        }

        /**
         * Checks for presence of the defaultValues field.
         *
         * @return True if defaultValues has been set.
         */
        public boolean isSetDefaultValues() {
            return optionals.get(36);
        }

        /**
         * Checks if defaultValues has been modified since the _Builder was created.
         *
         * @return True if defaultValues has been modified.
         */
        public boolean isModifiedDefaultValues() {
            return modified.get(36);
        }

        /**
         * Clears the defaultValues field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearDefaultValues() {
            optionals.clear(36);
            modified.set(36);
            mDefaultValues = null;
            mDefaultValues_builder = null;
            return this;
        }

        /**
         * Gets the builder for the contained defaultValues.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public net.morimekta.test.providence.core.DefaultValues._Builder mutableDefaultValues() {
            optionals.set(36);
            modified.set(36);

            if (mDefaultValues != null) {
                mDefaultValues_builder = mDefaultValues.mutate();
                mDefaultValues = null;
            } else if (mDefaultValues_builder == null) {
                mDefaultValues_builder = net.morimekta.test.providence.core.DefaultValues.builder();
            }
            return mDefaultValues_builder;
        }

        /**
         * Gets the value for the contained defaultValues.
         *
         * @return The field value
         */
        public net.morimekta.test.providence.core.DefaultValues getDefaultValues() {

            if (mDefaultValues_builder != null) {
                return mDefaultValues_builder.build();
            }
            return mDefaultValues;
        }

        /**
         * Sets the value of map_list_compact.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setMapListCompact(java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> value) {
            if (value == null) {
                return clearMapListCompact();
            }

            optionals.set(37);
            modified.set(37);
            mMapListCompact = com.google.common.collect.ImmutableMap.copyOf(value);
            return this;
        }

        /**
         * Adds a mapping to map_list_compact.
         *
         * @param key The inserted key
         * @param value The inserted value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder putInMapListCompact(int key, java.util.List<net.morimekta.test.providence.core.CompactFields> value) {
            optionals.set(37);
            modified.set(37);
            mutableMapListCompact().put(key, value);
            return this;
        }

        /**
         * Checks for presence of the map_list_compact field.
         *
         * @return True if map_list_compact has been set.
         */
        public boolean isSetMapListCompact() {
            return optionals.get(37);
        }

        /**
         * Checks if map_list_compact has been modified since the _Builder was created.
         *
         * @return True if map_list_compact has been modified.
         */
        public boolean isModifiedMapListCompact() {
            return modified.get(37);
        }

        /**
         * Clears the map_list_compact field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearMapListCompact() {
            optionals.clear(37);
            modified.set(37);
            mMapListCompact = null;
            return this;
        }

        /**
         * Gets the builder for the contained map_list_compact.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>> mutableMapListCompact() {
            optionals.set(37);
            modified.set(37);

            if (mMapListCompact == null) {
                mMapListCompact = new java.util.HashMap<>();
            } else if (!(mMapListCompact instanceof java.util.HashMap)) {
                mMapListCompact = new java.util.HashMap<>(mMapListCompact);
            }
            return mMapListCompact;
        }

        /**
         * Sets the value of list_map_numbers.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setListMapNumbers(java.util.Collection<java.util.Map<Integer,Integer>> value) {
            if (value == null) {
                return clearListMapNumbers();
            }

            optionals.set(38);
            modified.set(38);
            mListMapNumbers = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to list_map_numbers.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToListMapNumbers(java.util.Map<Integer,Integer>... values) {
            optionals.set(38);
            modified.set(38);
            java.util.List<java.util.Map<Integer,Integer>> _container = mutableListMapNumbers();
            for (java.util.Map<Integer,Integer> item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the list_map_numbers field.
         *
         * @return True if list_map_numbers has been set.
         */
        public boolean isSetListMapNumbers() {
            return optionals.get(38);
        }

        /**
         * Checks if list_map_numbers has been modified since the _Builder was created.
         *
         * @return True if list_map_numbers has been modified.
         */
        public boolean isModifiedListMapNumbers() {
            return modified.get(38);
        }

        /**
         * Clears the list_map_numbers field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearListMapNumbers() {
            optionals.clear(38);
            modified.set(38);
            mListMapNumbers = null;
            return this;
        }

        /**
         * Gets the builder for the contained list_map_numbers.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<java.util.Map<Integer,Integer>> mutableListMapNumbers() {
            optionals.set(38);
            modified.set(38);

            if (mListMapNumbers == null) {
                mListMapNumbers = new java.util.LinkedList<>();
            } else if (!(mListMapNumbers instanceof java.util.LinkedList)) {
                mListMapNumbers = new java.util.LinkedList<>(mListMapNumbers);
            }
            return mListMapNumbers;
        }

        /**
         * Sets the value of set_list_numbers.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setSetListNumbers(java.util.Collection<java.util.List<Integer>> value) {
            if (value == null) {
                return clearSetListNumbers();
            }

            optionals.set(39);
            modified.set(39);
            mSetListNumbers = com.google.common.collect.ImmutableSet.copyOf(value);
            return this;
        }

        /**
         * Adds entries to set_list_numbers.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToSetListNumbers(java.util.List<Integer>... values) {
            optionals.set(39);
            modified.set(39);
            java.util.Set<java.util.List<Integer>> _container = mutableSetListNumbers();
            for (java.util.List<Integer> item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the set_list_numbers field.
         *
         * @return True if set_list_numbers has been set.
         */
        public boolean isSetSetListNumbers() {
            return optionals.get(39);
        }

        /**
         * Checks if set_list_numbers has been modified since the _Builder was created.
         *
         * @return True if set_list_numbers has been modified.
         */
        public boolean isModifiedSetListNumbers() {
            return modified.get(39);
        }

        /**
         * Clears the set_list_numbers field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearSetListNumbers() {
            optionals.clear(39);
            modified.set(39);
            mSetListNumbers = null;
            return this;
        }

        /**
         * Gets the builder for the contained set_list_numbers.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.Set<java.util.List<Integer>> mutableSetListNumbers() {
            optionals.set(39);
            modified.set(39);

            if (mSetListNumbers == null) {
                mSetListNumbers = new java.util.HashSet<>();
            } else if (!(mSetListNumbers instanceof java.util.HashSet)) {
                mSetListNumbers = new java.util.HashSet<>(mSetListNumbers);
            }
            return mSetListNumbers;
        }

        /**
         * Sets the value of list_list_numbers.
         *
         * @param value The new value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder setListListNumbers(java.util.Collection<java.util.List<Integer>> value) {
            if (value == null) {
                return clearListListNumbers();
            }

            optionals.set(40);
            modified.set(40);
            mListListNumbers = com.google.common.collect.ImmutableList.copyOf(value);
            return this;
        }

        /**
         * Adds entries to list_list_numbers.
         *
         * @param values The added value
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder addToListListNumbers(java.util.List<Integer>... values) {
            optionals.set(40);
            modified.set(40);
            java.util.List<java.util.List<Integer>> _container = mutableListListNumbers();
            for (java.util.List<Integer> item : values) {
                _container.add(item);
            }
            return this;
        }

        /**
         * Checks for presence of the list_list_numbers field.
         *
         * @return True if list_list_numbers has been set.
         */
        public boolean isSetListListNumbers() {
            return optionals.get(40);
        }

        /**
         * Checks if list_list_numbers has been modified since the _Builder was created.
         *
         * @return True if list_list_numbers has been modified.
         */
        public boolean isModifiedListListNumbers() {
            return modified.get(40);
        }

        /**
         * Clears the list_list_numbers field.
         *
         * @return The builder
         */
        @javax.annotation.Nonnull
        public _Builder clearListListNumbers() {
            optionals.clear(40);
            modified.set(40);
            mListListNumbers = null;
            return this;
        }

        /**
         * Gets the builder for the contained list_list_numbers.
         *
         * @return The field builder
         */
        @javax.annotation.Nonnull
        public java.util.List<java.util.List<Integer>> mutableListListNumbers() {
            optionals.set(40);
            modified.set(40);

            if (mListListNumbers == null) {
                mListListNumbers = new java.util.LinkedList<>();
            } else if (!(mListListNumbers instanceof java.util.LinkedList)) {
                mListListNumbers = new java.util.LinkedList<>(mListListNumbers);
            }
            return mListListNumbers;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) return true;
            if (o == null || !o.getClass().equals(getClass())) return false;
            Containers._Builder other = (Containers._Builder) o;
            return java.util.Objects.equals(optionals, other.optionals) &&
                   java.util.Objects.equals(mBooleanList, other.mBooleanList) &&
                   java.util.Objects.equals(mByteList, other.mByteList) &&
                   java.util.Objects.equals(mShortList, other.mShortList) &&
                   java.util.Objects.equals(mIntegerList, other.mIntegerList) &&
                   java.util.Objects.equals(mLongList, other.mLongList) &&
                   java.util.Objects.equals(mDoubleList, other.mDoubleList) &&
                   java.util.Objects.equals(mStringList, other.mStringList) &&
                   java.util.Objects.equals(mBinaryList, other.mBinaryList) &&
                   java.util.Objects.equals(mBooleanSet, other.mBooleanSet) &&
                   java.util.Objects.equals(mByteSet, other.mByteSet) &&
                   java.util.Objects.equals(mShortSet, other.mShortSet) &&
                   java.util.Objects.equals(mIntegerSet, other.mIntegerSet) &&
                   java.util.Objects.equals(mLongSet, other.mLongSet) &&
                   java.util.Objects.equals(mDoubleSet, other.mDoubleSet) &&
                   java.util.Objects.equals(mStringSet, other.mStringSet) &&
                   java.util.Objects.equals(mBinarySet, other.mBinarySet) &&
                   java.util.Objects.equals(mBooleanMap, other.mBooleanMap) &&
                   java.util.Objects.equals(mByteMap, other.mByteMap) &&
                   java.util.Objects.equals(mShortMap, other.mShortMap) &&
                   java.util.Objects.equals(mIntegerMap, other.mIntegerMap) &&
                   java.util.Objects.equals(mLongMap, other.mLongMap) &&
                   java.util.Objects.equals(mDoubleMap, other.mDoubleMap) &&
                   java.util.Objects.equals(mStringMap, other.mStringMap) &&
                   java.util.Objects.equals(mBinaryMap, other.mBinaryMap) &&
                   java.util.Objects.equals(mEnumList, other.mEnumList) &&
                   java.util.Objects.equals(mEnumSet, other.mEnumSet) &&
                   java.util.Objects.equals(mEnumMap, other.mEnumMap) &&
                   java.util.Objects.equals(mMessageList, other.mMessageList) &&
                   java.util.Objects.equals(mMessageSet, other.mMessageSet) &&
                   java.util.Objects.equals(mMessageMap, other.mMessageMap) &&
                   java.util.Objects.equals(mMessageKeyMap, other.mMessageKeyMap) &&
                   java.util.Objects.equals(getRequiredFields(), other.getRequiredFields()) &&
                   java.util.Objects.equals(getDefaultFields(), other.getDefaultFields()) &&
                   java.util.Objects.equals(getOptionalFields(), other.getOptionalFields()) &&
                   java.util.Objects.equals(getUnionFields(), other.getUnionFields()) &&
                   java.util.Objects.equals(getExceptionFields(), other.getExceptionFields()) &&
                   java.util.Objects.equals(getDefaultValues(), other.getDefaultValues()) &&
                   java.util.Objects.equals(mMapListCompact, other.mMapListCompact) &&
                   java.util.Objects.equals(mListMapNumbers, other.mListMapNumbers) &&
                   java.util.Objects.equals(mSetListNumbers, other.mSetListNumbers) &&
                   java.util.Objects.equals(mListListNumbers, other.mListListNumbers);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(
                    Containers.class, optionals,
                    _Field.BOOLEAN_LIST, mBooleanList,
                    _Field.BYTE_LIST, mByteList,
                    _Field.SHORT_LIST, mShortList,
                    _Field.INTEGER_LIST, mIntegerList,
                    _Field.LONG_LIST, mLongList,
                    _Field.DOUBLE_LIST, mDoubleList,
                    _Field.STRING_LIST, mStringList,
                    _Field.BINARY_LIST, mBinaryList,
                    _Field.BOOLEAN_SET, mBooleanSet,
                    _Field.BYTE_SET, mByteSet,
                    _Field.SHORT_SET, mShortSet,
                    _Field.INTEGER_SET, mIntegerSet,
                    _Field.LONG_SET, mLongSet,
                    _Field.DOUBLE_SET, mDoubleSet,
                    _Field.STRING_SET, mStringSet,
                    _Field.BINARY_SET, mBinarySet,
                    _Field.BOOLEAN_MAP, mBooleanMap,
                    _Field.BYTE_MAP, mByteMap,
                    _Field.SHORT_MAP, mShortMap,
                    _Field.INTEGER_MAP, mIntegerMap,
                    _Field.LONG_MAP, mLongMap,
                    _Field.DOUBLE_MAP, mDoubleMap,
                    _Field.STRING_MAP, mStringMap,
                    _Field.BINARY_MAP, mBinaryMap,
                    _Field.ENUM_LIST, mEnumList,
                    _Field.ENUM_SET, mEnumSet,
                    _Field.ENUM_MAP, mEnumMap,
                    _Field.MESSAGE_LIST, mMessageList,
                    _Field.MESSAGE_SET, mMessageSet,
                    _Field.MESSAGE_MAP, mMessageMap,
                    _Field.MESSAGE_KEY_MAP, mMessageKeyMap,
                    _Field.REQUIRED_FIELDS, getRequiredFields(),
                    _Field.DEFAULT_FIELDS, getDefaultFields(),
                    _Field.OPTIONAL_FIELDS, getOptionalFields(),
                    _Field.UNION_FIELDS, getUnionFields(),
                    _Field.EXCEPTION_FIELDS, getExceptionFields(),
                    _Field.DEFAULT_VALUES, getDefaultValues(),
                    _Field.MAP_LIST_COMPACT, mMapListCompact,
                    _Field.LIST_MAP_NUMBERS, mListMapNumbers,
                    _Field.SET_LIST_NUMBERS, mSetListNumbers,
                    _Field.LIST_LIST_NUMBERS, mListListNumbers);
        }

        @Override
        @SuppressWarnings("unchecked")
        public net.morimekta.providence.PMessageBuilder mutator(int key) {
            switch (key) {
                case 51: return mutableRequiredFields();
                case 52: return mutableDefaultFields();
                case 53: return mutableOptionalFields();
                case 54: return mutableUnionFields();
                case 55: return mutableExceptionFields();
                case 56: return mutableDefaultValues();
                default: throw new IllegalArgumentException("Not a message field ID: " + key);
            }
        }

        @javax.annotation.Nonnull
        @Override
        @SuppressWarnings("unchecked")
        public _Builder set(int key, Object value) {
            if (value == null) return clear(key);
            switch (key) {
                case 1: setBooleanList((java.util.List<Boolean>) value); break;
                case 2: setByteList((java.util.List<Byte>) value); break;
                case 3: setShortList((java.util.List<Short>) value); break;
                case 4: setIntegerList((java.util.List<Integer>) value); break;
                case 5: setLongList((java.util.List<Long>) value); break;
                case 6: setDoubleList((java.util.List<Double>) value); break;
                case 7: setStringList((java.util.List<String>) value); break;
                case 8: setBinaryList((java.util.List<net.morimekta.util.Binary>) value); break;
                case 11: setBooleanSet((java.util.Set<Boolean>) value); break;
                case 12: setByteSet((java.util.Set<Byte>) value); break;
                case 13: setShortSet((java.util.Set<Short>) value); break;
                case 14: setIntegerSet((java.util.Set<Integer>) value); break;
                case 15: setLongSet((java.util.Set<Long>) value); break;
                case 16: setDoubleSet((java.util.Set<Double>) value); break;
                case 17: setStringSet((java.util.Set<String>) value); break;
                case 18: setBinarySet((java.util.Set<net.morimekta.util.Binary>) value); break;
                case 21: setBooleanMap((java.util.Map<Boolean,Boolean>) value); break;
                case 22: setByteMap((java.util.Map<Byte,Byte>) value); break;
                case 23: setShortMap((java.util.Map<Short,Short>) value); break;
                case 24: setIntegerMap((java.util.Map<Integer,Integer>) value); break;
                case 25: setLongMap((java.util.Map<Long,Long>) value); break;
                case 26: setDoubleMap((java.util.Map<Double,Double>) value); break;
                case 27: setStringMap((java.util.Map<String,String>) value); break;
                case 28: setBinaryMap((java.util.Map<net.morimekta.util.Binary,net.morimekta.util.Binary>) value); break;
                case 31: setEnumList((java.util.List<net.morimekta.test.providence.core.Value>) value); break;
                case 32: setEnumSet((java.util.Set<net.morimekta.test.providence.core.Value>) value); break;
                case 33: setEnumMap((java.util.Map<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value>) value); break;
                case 41: setMessageList((java.util.List<net.morimekta.test.providence.core.DefaultFields>) value); break;
                case 42: setMessageSet((java.util.Set<net.morimekta.test.providence.core.DefaultFields>) value); break;
                case 43: setMessageMap((java.util.Map<String,net.morimekta.test.providence.core.DefaultFields>) value); break;
                case 44: setMessageKeyMap((java.util.Map<net.morimekta.test.providence.core.CompactFields,String>) value); break;
                case 51: setRequiredFields((net.morimekta.test.providence.core.RequiredFields) value); break;
                case 52: setDefaultFields((net.morimekta.test.providence.core.DefaultFields) value); break;
                case 53: setOptionalFields((net.morimekta.test.providence.core.OptionalFields) value); break;
                case 54: setUnionFields((net.morimekta.test.providence.core.UnionFields) value); break;
                case 55: setExceptionFields((net.morimekta.test.providence.core.ExceptionFields) value); break;
                case 56: setDefaultValues((net.morimekta.test.providence.core.DefaultValues) value); break;
                case 61: setMapListCompact((java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>>) value); break;
                case 62: setListMapNumbers((java.util.List<java.util.Map<Integer,Integer>>) value); break;
                case 63: setSetListNumbers((java.util.Set<java.util.List<Integer>>) value); break;
                case 64: setListListNumbers((java.util.List<java.util.List<Integer>>) value); break;
                default: break;
            }
            return this;
        }

        @Override
        public boolean isSet(int key) {
            switch (key) {
                case 1: return optionals.get(0);
                case 2: return optionals.get(1);
                case 3: return optionals.get(2);
                case 4: return optionals.get(3);
                case 5: return optionals.get(4);
                case 6: return optionals.get(5);
                case 7: return optionals.get(6);
                case 8: return optionals.get(7);
                case 11: return optionals.get(8);
                case 12: return optionals.get(9);
                case 13: return optionals.get(10);
                case 14: return optionals.get(11);
                case 15: return optionals.get(12);
                case 16: return optionals.get(13);
                case 17: return optionals.get(14);
                case 18: return optionals.get(15);
                case 21: return optionals.get(16);
                case 22: return optionals.get(17);
                case 23: return optionals.get(18);
                case 24: return optionals.get(19);
                case 25: return optionals.get(20);
                case 26: return optionals.get(21);
                case 27: return optionals.get(22);
                case 28: return optionals.get(23);
                case 31: return optionals.get(24);
                case 32: return optionals.get(25);
                case 33: return optionals.get(26);
                case 41: return optionals.get(27);
                case 42: return optionals.get(28);
                case 43: return optionals.get(29);
                case 44: return optionals.get(30);
                case 51: return optionals.get(31);
                case 52: return optionals.get(32);
                case 53: return optionals.get(33);
                case 54: return optionals.get(34);
                case 55: return optionals.get(35);
                case 56: return optionals.get(36);
                case 61: return optionals.get(37);
                case 62: return optionals.get(38);
                case 63: return optionals.get(39);
                case 64: return optionals.get(40);
                default: break;
            }
            return false;
        }

        @Override
        public boolean isModified(int key) {
            switch (key) {
                case 1: return modified.get(0);
                case 2: return modified.get(1);
                case 3: return modified.get(2);
                case 4: return modified.get(3);
                case 5: return modified.get(4);
                case 6: return modified.get(5);
                case 7: return modified.get(6);
                case 8: return modified.get(7);
                case 11: return modified.get(8);
                case 12: return modified.get(9);
                case 13: return modified.get(10);
                case 14: return modified.get(11);
                case 15: return modified.get(12);
                case 16: return modified.get(13);
                case 17: return modified.get(14);
                case 18: return modified.get(15);
                case 21: return modified.get(16);
                case 22: return modified.get(17);
                case 23: return modified.get(18);
                case 24: return modified.get(19);
                case 25: return modified.get(20);
                case 26: return modified.get(21);
                case 27: return modified.get(22);
                case 28: return modified.get(23);
                case 31: return modified.get(24);
                case 32: return modified.get(25);
                case 33: return modified.get(26);
                case 41: return modified.get(27);
                case 42: return modified.get(28);
                case 43: return modified.get(29);
                case 44: return modified.get(30);
                case 51: return modified.get(31);
                case 52: return modified.get(32);
                case 53: return modified.get(33);
                case 54: return modified.get(34);
                case 55: return modified.get(35);
                case 56: return modified.get(36);
                case 61: return modified.get(37);
                case 62: return modified.get(38);
                case 63: return modified.get(39);
                case 64: return modified.get(40);
                default: break;
            }
            return false;
        }

        @Override
        public _Builder addTo(int key, Object value) {
            switch (key) {
                case 1: addToBooleanList((boolean) value); break;
                case 2: addToByteList((byte) value); break;
                case 3: addToShortList((short) value); break;
                case 4: addToIntegerList((int) value); break;
                case 5: addToLongList((long) value); break;
                case 6: addToDoubleList((double) value); break;
                case 7: addToStringList((String) value); break;
                case 8: addToBinaryList((net.morimekta.util.Binary) value); break;
                case 11: addToBooleanSet((boolean) value); break;
                case 12: addToByteSet((byte) value); break;
                case 13: addToShortSet((short) value); break;
                case 14: addToIntegerSet((int) value); break;
                case 15: addToLongSet((long) value); break;
                case 16: addToDoubleSet((double) value); break;
                case 17: addToStringSet((String) value); break;
                case 18: addToBinarySet((net.morimekta.util.Binary) value); break;
                case 31: addToEnumList((net.morimekta.test.providence.core.Value) value); break;
                case 32: addToEnumSet((net.morimekta.test.providence.core.Value) value); break;
                case 41: addToMessageList((net.morimekta.test.providence.core.DefaultFields) value); break;
                case 42: addToMessageSet((net.morimekta.test.providence.core.DefaultFields) value); break;
                case 62: addToListMapNumbers((java.util.Map<Integer,Integer>) value); break;
                case 63: addToSetListNumbers((java.util.List<Integer>) value); break;
                case 64: addToListListNumbers((java.util.List<Integer>) value); break;
                default: break;
            }
            return this;
        }

        @javax.annotation.Nonnull
        @Override
        public _Builder clear(int key) {
            switch (key) {
                case 1: clearBooleanList(); break;
                case 2: clearByteList(); break;
                case 3: clearShortList(); break;
                case 4: clearIntegerList(); break;
                case 5: clearLongList(); break;
                case 6: clearDoubleList(); break;
                case 7: clearStringList(); break;
                case 8: clearBinaryList(); break;
                case 11: clearBooleanSet(); break;
                case 12: clearByteSet(); break;
                case 13: clearShortSet(); break;
                case 14: clearIntegerSet(); break;
                case 15: clearLongSet(); break;
                case 16: clearDoubleSet(); break;
                case 17: clearStringSet(); break;
                case 18: clearBinarySet(); break;
                case 21: clearBooleanMap(); break;
                case 22: clearByteMap(); break;
                case 23: clearShortMap(); break;
                case 24: clearIntegerMap(); break;
                case 25: clearLongMap(); break;
                case 26: clearDoubleMap(); break;
                case 27: clearStringMap(); break;
                case 28: clearBinaryMap(); break;
                case 31: clearEnumList(); break;
                case 32: clearEnumSet(); break;
                case 33: clearEnumMap(); break;
                case 41: clearMessageList(); break;
                case 42: clearMessageSet(); break;
                case 43: clearMessageMap(); break;
                case 44: clearMessageKeyMap(); break;
                case 51: clearRequiredFields(); break;
                case 52: clearDefaultFields(); break;
                case 53: clearOptionalFields(); break;
                case 54: clearUnionFields(); break;
                case 55: clearExceptionFields(); break;
                case 56: clearDefaultValues(); break;
                case 61: clearMapListCompact(); break;
                case 62: clearListMapNumbers(); break;
                case 63: clearSetListNumbers(); break;
                case 64: clearListListNumbers(); break;
                default: break;
            }
            return this;
        }

        @Override
        public boolean valid() {
            return true;
        }

        @Override
        public void validate() {
        }

        @javax.annotation.Nonnull
        @Override
        public net.morimekta.providence.descriptor.PStructDescriptor<Containers,_Field> descriptor() {
            return kDescriptor;
        }

        @Override
        public void readBinary(net.morimekta.util.io.BigEndianBinaryReader reader, boolean strict) throws java.io.IOException {
            byte type = reader.expectByte();
            while (type != 0) {
                int field = reader.expectShort();
                switch (field) {
                    case 1: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Boolean> b_1 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_3 = reader.expectByte();
                            if (t_3 == 2) {
                                final int len_2 = reader.expectUInt32();
                                for (int i_4 = 0; i_4 < len_2; ++i_4) {
                                    boolean key_5 = reader.expectUInt8() == 1;
                                    b_1.add(key_5);
                                }
                                mBooleanList = b_1.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_3) + " for providence.Containers.booleanList, should be bool(2)");
                            }
                            optionals.set(0);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.booleanList, should be struct(12)");
                        }
                        break;
                    }
                    case 2: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Byte> b_6 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_8 = reader.expectByte();
                            if (t_8 == 3) {
                                final int len_7 = reader.expectUInt32();
                                for (int i_9 = 0; i_9 < len_7; ++i_9) {
                                    byte key_10 = reader.expectByte();
                                    b_6.add(key_10);
                                }
                                mByteList = b_6.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_8) + " for providence.Containers.byteList, should be byte(3)");
                            }
                            optionals.set(1);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.byteList, should be struct(12)");
                        }
                        break;
                    }
                    case 3: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Short> b_11 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_13 = reader.expectByte();
                            if (t_13 == 6) {
                                final int len_12 = reader.expectUInt32();
                                for (int i_14 = 0; i_14 < len_12; ++i_14) {
                                    short key_15 = reader.expectShort();
                                    b_11.add(key_15);
                                }
                                mShortList = b_11.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_13) + " for providence.Containers.shortList, should be i16(6)");
                            }
                            optionals.set(2);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.shortList, should be struct(12)");
                        }
                        break;
                    }
                    case 4: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Integer> b_16 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_18 = reader.expectByte();
                            if (t_18 == 8) {
                                final int len_17 = reader.expectUInt32();
                                for (int i_19 = 0; i_19 < len_17; ++i_19) {
                                    int key_20 = reader.expectInt();
                                    b_16.add(key_20);
                                }
                                mIntegerList = b_16.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_18) + " for providence.Containers.integerList, should be i32(8)");
                            }
                            optionals.set(3);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.integerList, should be struct(12)");
                        }
                        break;
                    }
                    case 5: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Long> b_21 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_23 = reader.expectByte();
                            if (t_23 == 10) {
                                final int len_22 = reader.expectUInt32();
                                for (int i_24 = 0; i_24 < len_22; ++i_24) {
                                    long key_25 = reader.expectLong();
                                    b_21.add(key_25);
                                }
                                mLongList = b_21.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_23) + " for providence.Containers.longList, should be i64(10)");
                            }
                            optionals.set(4);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.longList, should be struct(12)");
                        }
                        break;
                    }
                    case 6: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<Double> b_26 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_28 = reader.expectByte();
                            if (t_28 == 4) {
                                final int len_27 = reader.expectUInt32();
                                for (int i_29 = 0; i_29 < len_27; ++i_29) {
                                    double key_30 = reader.expectDouble();
                                    b_26.add(key_30);
                                }
                                mDoubleList = b_26.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_28) + " for providence.Containers.doubleList, should be double(4)");
                            }
                            optionals.set(5);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.doubleList, should be struct(12)");
                        }
                        break;
                    }
                    case 7: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<String> b_31 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_33 = reader.expectByte();
                            if (t_33 == 11) {
                                final int len_32 = reader.expectUInt32();
                                for (int i_34 = 0; i_34 < len_32; ++i_34) {
                                    int len_36 = reader.expectUInt32();
                                    String key_35 = new String(reader.expectBytes(len_36), java.nio.charset.StandardCharsets.UTF_8);
                                    b_31.add(key_35);
                                }
                                mStringList = b_31.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_33) + " for providence.Containers.stringList, should be string(11)");
                            }
                            optionals.set(6);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.stringList, should be struct(12)");
                        }
                        break;
                    }
                    case 8: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<net.morimekta.util.Binary> b_37 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_39 = reader.expectByte();
                            if (t_39 == 11) {
                                final int len_38 = reader.expectUInt32();
                                for (int i_40 = 0; i_40 < len_38; ++i_40) {
                                    int len_42 = reader.expectUInt32();
                                    net.morimekta.util.Binary key_41 = reader.expectBinary(len_42);
                                    b_37.add(key_41);
                                }
                                mBinaryList = b_37.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_39) + " for providence.Containers.binaryList, should be string(11)");
                            }
                            optionals.set(7);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.binaryList, should be struct(12)");
                        }
                        break;
                    }
                    case 11: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<Boolean> b_43 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_45 = reader.expectByte();
                            if (t_45 == 2) {
                                final int len_44 = reader.expectUInt32();
                                for (int i_46 = 0; i_46 < len_44; ++i_46) {
                                    boolean key_47 = reader.expectUInt8() == 1;
                                    b_43.add(key_47);
                                }
                                mBooleanSet = b_43.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_45) + " for providence.Containers.booleanSet, should be bool(2)");
                            }
                            optionals.set(8);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.booleanSet, should be struct(12)");
                        }
                        break;
                    }
                    case 12: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.SortedBuilder<Byte> b_48 = new net.morimekta.providence.descriptor.PSet.SortedBuilder<>();
                            byte t_50 = reader.expectByte();
                            if (t_50 == 3) {
                                final int len_49 = reader.expectUInt32();
                                for (int i_51 = 0; i_51 < len_49; ++i_51) {
                                    byte key_52 = reader.expectByte();
                                    b_48.add(key_52);
                                }
                                mByteSet = b_48.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_50) + " for providence.Containers.byteSet, should be byte(3)");
                            }
                            optionals.set(9);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.byteSet, should be struct(12)");
                        }
                        break;
                    }
                    case 13: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.OrderedBuilder<Short> b_53 = new net.morimekta.providence.descriptor.PSet.OrderedBuilder<>();
                            byte t_55 = reader.expectByte();
                            if (t_55 == 6) {
                                final int len_54 = reader.expectUInt32();
                                for (int i_56 = 0; i_56 < len_54; ++i_56) {
                                    short key_57 = reader.expectShort();
                                    b_53.add(key_57);
                                }
                                mShortSet = b_53.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_55) + " for providence.Containers.shortSet, should be i16(6)");
                            }
                            optionals.set(10);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.shortSet, should be struct(12)");
                        }
                        break;
                    }
                    case 14: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<Integer> b_58 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_60 = reader.expectByte();
                            if (t_60 == 8) {
                                final int len_59 = reader.expectUInt32();
                                for (int i_61 = 0; i_61 < len_59; ++i_61) {
                                    int key_62 = reader.expectInt();
                                    b_58.add(key_62);
                                }
                                mIntegerSet = b_58.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_60) + " for providence.Containers.integerSet, should be i32(8)");
                            }
                            optionals.set(11);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.integerSet, should be struct(12)");
                        }
                        break;
                    }
                    case 15: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<Long> b_63 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_65 = reader.expectByte();
                            if (t_65 == 10) {
                                final int len_64 = reader.expectUInt32();
                                for (int i_66 = 0; i_66 < len_64; ++i_66) {
                                    long key_67 = reader.expectLong();
                                    b_63.add(key_67);
                                }
                                mLongSet = b_63.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_65) + " for providence.Containers.longSet, should be i64(10)");
                            }
                            optionals.set(12);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.longSet, should be struct(12)");
                        }
                        break;
                    }
                    case 16: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<Double> b_68 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_70 = reader.expectByte();
                            if (t_70 == 4) {
                                final int len_69 = reader.expectUInt32();
                                for (int i_71 = 0; i_71 < len_69; ++i_71) {
                                    double key_72 = reader.expectDouble();
                                    b_68.add(key_72);
                                }
                                mDoubleSet = b_68.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_70) + " for providence.Containers.doubleSet, should be double(4)");
                            }
                            optionals.set(13);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.doubleSet, should be struct(12)");
                        }
                        break;
                    }
                    case 17: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<String> b_73 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_75 = reader.expectByte();
                            if (t_75 == 11) {
                                final int len_74 = reader.expectUInt32();
                                for (int i_76 = 0; i_76 < len_74; ++i_76) {
                                    int len_78 = reader.expectUInt32();
                                    String key_77 = new String(reader.expectBytes(len_78), java.nio.charset.StandardCharsets.UTF_8);
                                    b_73.add(key_77);
                                }
                                mStringSet = b_73.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_75) + " for providence.Containers.stringSet, should be string(11)");
                            }
                            optionals.set(14);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.stringSet, should be struct(12)");
                        }
                        break;
                    }
                    case 18: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<net.morimekta.util.Binary> b_79 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_81 = reader.expectByte();
                            if (t_81 == 11) {
                                final int len_80 = reader.expectUInt32();
                                for (int i_82 = 0; i_82 < len_80; ++i_82) {
                                    int len_84 = reader.expectUInt32();
                                    net.morimekta.util.Binary key_83 = reader.expectBinary(len_84);
                                    b_79.add(key_83);
                                }
                                mBinarySet = b_79.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_81) + " for providence.Containers.binarySet, should be string(11)");
                            }
                            optionals.set(15);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.binarySet, should be struct(12)");
                        }
                        break;
                    }
                    case 21: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<Boolean,Boolean> b_85 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_87 = reader.expectByte();
                            byte t_88 = reader.expectByte();
                            if (t_87 == 2 && t_88 == 2) {
                                final int len_86 = reader.expectUInt32();
                                for (int i_89 = 0; i_89 < len_86; ++i_89) {
                                    boolean key_90 = reader.expectUInt8() == 1;
                                    boolean val_91 = reader.expectUInt8() == 1;
                                    b_85.put(key_90, val_91);
                                }
                                mBooleanMap = b_85.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_87) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_88) +
                                        " for providence.Containers.booleanMap, should be bool(2) and bool(2)");
                            }
                            optionals.set(16);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.booleanMap, should be struct(12)");
                        }
                        break;
                    }
                    case 22: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.SortedBuilder<Byte,Byte> b_92 = new net.morimekta.providence.descriptor.PMap.SortedBuilder<>();
                            byte t_94 = reader.expectByte();
                            byte t_95 = reader.expectByte();
                            if (t_94 == 3 && t_95 == 3) {
                                final int len_93 = reader.expectUInt32();
                                for (int i_96 = 0; i_96 < len_93; ++i_96) {
                                    byte key_97 = reader.expectByte();
                                    byte val_98 = reader.expectByte();
                                    b_92.put(key_97, val_98);
                                }
                                mByteMap = b_92.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_94) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_95) +
                                        " for providence.Containers.byteMap, should be byte(3) and byte(3)");
                            }
                            optionals.set(17);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.byteMap, should be struct(12)");
                        }
                        break;
                    }
                    case 23: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.OrderedBuilder<Short,Short> b_99 = new net.morimekta.providence.descriptor.PMap.OrderedBuilder<>();
                            byte t_101 = reader.expectByte();
                            byte t_102 = reader.expectByte();
                            if (t_101 == 6 && t_102 == 6) {
                                final int len_100 = reader.expectUInt32();
                                for (int i_103 = 0; i_103 < len_100; ++i_103) {
                                    short key_104 = reader.expectShort();
                                    short val_105 = reader.expectShort();
                                    b_99.put(key_104, val_105);
                                }
                                mShortMap = b_99.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_101) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_102) +
                                        " for providence.Containers.shortMap, should be i16(6) and i16(6)");
                            }
                            optionals.set(18);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.shortMap, should be struct(12)");
                        }
                        break;
                    }
                    case 24: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<Integer,Integer> b_106 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_108 = reader.expectByte();
                            byte t_109 = reader.expectByte();
                            if (t_108 == 8 && t_109 == 8) {
                                final int len_107 = reader.expectUInt32();
                                for (int i_110 = 0; i_110 < len_107; ++i_110) {
                                    int key_111 = reader.expectInt();
                                    int val_112 = reader.expectInt();
                                    b_106.put(key_111, val_112);
                                }
                                mIntegerMap = b_106.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_108) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_109) +
                                        " for providence.Containers.integerMap, should be i32(8) and i32(8)");
                            }
                            optionals.set(19);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.integerMap, should be struct(12)");
                        }
                        break;
                    }
                    case 25: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<Long,Long> b_113 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_115 = reader.expectByte();
                            byte t_116 = reader.expectByte();
                            if (t_115 == 10 && t_116 == 10) {
                                final int len_114 = reader.expectUInt32();
                                for (int i_117 = 0; i_117 < len_114; ++i_117) {
                                    long key_118 = reader.expectLong();
                                    long val_119 = reader.expectLong();
                                    b_113.put(key_118, val_119);
                                }
                                mLongMap = b_113.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_115) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_116) +
                                        " for providence.Containers.longMap, should be i64(10) and i64(10)");
                            }
                            optionals.set(20);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.longMap, should be struct(12)");
                        }
                        break;
                    }
                    case 26: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<Double,Double> b_120 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_122 = reader.expectByte();
                            byte t_123 = reader.expectByte();
                            if (t_122 == 4 && t_123 == 4) {
                                final int len_121 = reader.expectUInt32();
                                for (int i_124 = 0; i_124 < len_121; ++i_124) {
                                    double key_125 = reader.expectDouble();
                                    double val_126 = reader.expectDouble();
                                    b_120.put(key_125, val_126);
                                }
                                mDoubleMap = b_120.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_122) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_123) +
                                        " for providence.Containers.doubleMap, should be double(4) and double(4)");
                            }
                            optionals.set(21);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.doubleMap, should be struct(12)");
                        }
                        break;
                    }
                    case 27: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<String,String> b_127 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_129 = reader.expectByte();
                            byte t_130 = reader.expectByte();
                            if (t_129 == 11 && t_130 == 11) {
                                final int len_128 = reader.expectUInt32();
                                for (int i_131 = 0; i_131 < len_128; ++i_131) {
                                    int len_134 = reader.expectUInt32();
                                    String key_132 = new String(reader.expectBytes(len_134), java.nio.charset.StandardCharsets.UTF_8);
                                    int len_135 = reader.expectUInt32();
                                    String val_133 = new String(reader.expectBytes(len_135), java.nio.charset.StandardCharsets.UTF_8);
                                    b_127.put(key_132, val_133);
                                }
                                mStringMap = b_127.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_129) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_130) +
                                        " for providence.Containers.stringMap, should be string(11) and string(11)");
                            }
                            optionals.set(22);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.stringMap, should be struct(12)");
                        }
                        break;
                    }
                    case 28: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<net.morimekta.util.Binary,net.morimekta.util.Binary> b_136 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_138 = reader.expectByte();
                            byte t_139 = reader.expectByte();
                            if (t_138 == 11 && t_139 == 11) {
                                final int len_137 = reader.expectUInt32();
                                for (int i_140 = 0; i_140 < len_137; ++i_140) {
                                    int len_143 = reader.expectUInt32();
                                    net.morimekta.util.Binary key_141 = reader.expectBinary(len_143);
                                    int len_144 = reader.expectUInt32();
                                    net.morimekta.util.Binary val_142 = reader.expectBinary(len_144);
                                    b_136.put(key_141, val_142);
                                }
                                mBinaryMap = b_136.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_138) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_139) +
                                        " for providence.Containers.binaryMap, should be string(11) and string(11)");
                            }
                            optionals.set(23);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.binaryMap, should be struct(12)");
                        }
                        break;
                    }
                    case 31: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<net.morimekta.test.providence.core.Value> b_145 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_147 = reader.expectByte();
                            if (t_147 == 8) {
                                final int len_146 = reader.expectUInt32();
                                for (int i_148 = 0; i_148 < len_146; ++i_148) {
                                    net.morimekta.test.providence.core.Value key_149 = net.morimekta.test.providence.core.Value.findById(reader.expectInt());
                                    b_145.add(key_149);
                                }
                                mEnumList = b_145.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_147) + " for providence.Containers.enumList, should be i32(8)");
                            }
                            optionals.set(24);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.enumList, should be struct(12)");
                        }
                        break;
                    }
                    case 32: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<net.morimekta.test.providence.core.Value> b_150 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_152 = reader.expectByte();
                            if (t_152 == 8) {
                                final int len_151 = reader.expectUInt32();
                                for (int i_153 = 0; i_153 < len_151; ++i_153) {
                                    net.morimekta.test.providence.core.Value key_154 = net.morimekta.test.providence.core.Value.findById(reader.expectInt());
                                    b_150.add(key_154);
                                }
                                mEnumSet = b_150.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_152) + " for providence.Containers.enumSet, should be i32(8)");
                            }
                            optionals.set(25);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.enumSet, should be struct(12)");
                        }
                        break;
                    }
                    case 33: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<net.morimekta.test.providence.core.Value,net.morimekta.test.providence.core.Value> b_155 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_157 = reader.expectByte();
                            byte t_158 = reader.expectByte();
                            if (t_157 == 8 && t_158 == 8) {
                                final int len_156 = reader.expectUInt32();
                                for (int i_159 = 0; i_159 < len_156; ++i_159) {
                                    net.morimekta.test.providence.core.Value key_160 = net.morimekta.test.providence.core.Value.findById(reader.expectInt());
                                    net.morimekta.test.providence.core.Value val_161 = net.morimekta.test.providence.core.Value.findById(reader.expectInt());
                                    b_155.put(key_160, val_161);
                                }
                                mEnumMap = b_155.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_157) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_158) +
                                        " for providence.Containers.enumMap, should be i32(8) and i32(8)");
                            }
                            optionals.set(26);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.enumMap, should be struct(12)");
                        }
                        break;
                    }
                    case 41: {
                        if (type == 15) {
                            net.morimekta.providence.descriptor.PList.DefaultBuilder<net.morimekta.test.providence.core.DefaultFields> b_162 = new net.morimekta.providence.descriptor.PList.DefaultBuilder<>();
                            byte t_164 = reader.expectByte();
                            if (t_164 == 12) {
                                final int len_163 = reader.expectUInt32();
                                for (int i_165 = 0; i_165 < len_163; ++i_165) {
                                    net.morimekta.test.providence.core.DefaultFields key_166 = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.DefaultFields.kDescriptor, strict);
                                    b_162.add(key_166);
                                }
                                mMessageList = b_162.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_164) + " for providence.Containers.messageList, should be struct(12)");
                            }
                            optionals.set(27);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.messageList, should be struct(12)");
                        }
                        break;
                    }
                    case 42: {
                        if (type == 14) {
                            net.morimekta.providence.descriptor.PSet.DefaultBuilder<net.morimekta.test.providence.core.DefaultFields> b_167 = new net.morimekta.providence.descriptor.PSet.DefaultBuilder<>();
                            byte t_169 = reader.expectByte();
                            if (t_169 == 12) {
                                final int len_168 = reader.expectUInt32();
                                for (int i_170 = 0; i_170 < len_168; ++i_170) {
                                    net.morimekta.test.providence.core.DefaultFields key_171 = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.DefaultFields.kDescriptor, strict);
                                    b_167.add(key_171);
                                }
                                mMessageSet = b_167.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException("Wrong item type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_169) + " for providence.Containers.messageSet, should be struct(12)");
                            }
                            optionals.set(28);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.messageSet, should be struct(12)");
                        }
                        break;
                    }
                    case 43: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<String,net.morimekta.test.providence.core.DefaultFields> b_172 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_174 = reader.expectByte();
                            byte t_175 = reader.expectByte();
                            if (t_174 == 11 && t_175 == 12) {
                                final int len_173 = reader.expectUInt32();
                                for (int i_176 = 0; i_176 < len_173; ++i_176) {
                                    int len_179 = reader.expectUInt32();
                                    String key_177 = new String(reader.expectBytes(len_179), java.nio.charset.StandardCharsets.UTF_8);
                                    net.morimekta.test.providence.core.DefaultFields val_178 = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.DefaultFields.kDescriptor, strict);
                                    b_172.put(key_177, val_178);
                                }
                                mMessageMap = b_172.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_174) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_175) +
                                        " for providence.Containers.messageMap, should be string(11) and struct(12)");
                            }
                            optionals.set(29);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.messageMap, should be struct(12)");
                        }
                        break;
                    }
                    case 44: {
                        if (type == 13) {
                            net.morimekta.providence.descriptor.PMap.DefaultBuilder<net.morimekta.test.providence.core.CompactFields,String> b_180 = new net.morimekta.providence.descriptor.PMap.DefaultBuilder<>();
                            byte t_182 = reader.expectByte();
                            byte t_183 = reader.expectByte();
                            if (t_182 == 12 && t_183 == 11) {
                                final int len_181 = reader.expectUInt32();
                                for (int i_184 = 0; i_184 < len_181; ++i_184) {
                                    net.morimekta.test.providence.core.CompactFields key_185 = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.CompactFields.kDescriptor, strict);
                                    int len_187 = reader.expectUInt32();
                                    String val_186 = new String(reader.expectBytes(len_187), java.nio.charset.StandardCharsets.UTF_8);
                                    b_180.put(key_185, val_186);
                                }
                                mMessageKeyMap = b_180.build();
                            } else {
                                throw new net.morimekta.providence.serializer.SerializerException(
                                        "Wrong key type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_182) +
                                        " or value type " + net.morimekta.providence.serializer.binary.BinaryType.asString(t_183) +
                                        " for providence.Containers.messageKeyMap, should be struct(12) and string(11)");
                            }
                            optionals.set(30);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.messageKeyMap, should be struct(12)");
                        }
                        break;
                    }
                    case 51: {
                        if (type == 12) {
                            mRequiredFields = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.RequiredFields.kDescriptor, strict);
                            optionals.set(31);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.requiredFields, should be struct(12)");
                        }
                        break;
                    }
                    case 52: {
                        if (type == 12) {
                            mDefaultFields = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.DefaultFields.kDescriptor, strict);
                            optionals.set(32);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.defaultFields, should be struct(12)");
                        }
                        break;
                    }
                    case 53: {
                        if (type == 12) {
                            mOptionalFields = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.OptionalFields.kDescriptor, strict);
                            optionals.set(33);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.optionalFields, should be struct(12)");
                        }
                        break;
                    }
                    case 54: {
                        if (type == 12) {
                            mUnionFields = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.UnionFields.kDescriptor, strict);
                            optionals.set(34);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.unionFields, should be struct(12)");
                        }
                        break;
                    }
                    case 55: {
                        if (type == 12) {
                            mExceptionFields = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.ExceptionFields.kDescriptor, strict);
                            optionals.set(35);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.exceptionFields, should be struct(12)");
                        }
                        break;
                    }
                    case 56: {
                        if (type == 12) {
                            mDefaultValues = net.morimekta.providence.serializer.binary.BinaryFormatUtils.readMessage(reader, net.morimekta.test.providence.core.DefaultValues.kDescriptor, strict);
                            optionals.set(36);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.defaultValues, should be struct(12)");
                        }
                        break;
                    }
                    case 61: {
                        if (type == 13) {
                            mMapListCompact = (java.util.Map<Integer,java.util.List<net.morimekta.test.providence.core.CompactFields>>) net.morimekta.providence.serializer.binary.BinaryFormatUtils.readFieldValue(reader, new net.morimekta.providence.serializer.binary.BinaryFormatUtils.FieldInfo(field, type), _Field.MAP_LIST_COMPACT.getDescriptor(), strict);
                            optionals.set(37);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.map_list_compact, should be struct(12)");
                        }
                        break;
                    }
                    case 62: {
                        if (type == 15) {
                            mListMapNumbers = (java.util.List<java.util.Map<Integer,Integer>>) net.morimekta.providence.serializer.binary.BinaryFormatUtils.readFieldValue(reader, new net.morimekta.providence.serializer.binary.BinaryFormatUtils.FieldInfo(field, type), _Field.LIST_MAP_NUMBERS.getDescriptor(), strict);
                            optionals.set(38);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.list_map_numbers, should be struct(12)");
                        }
                        break;
                    }
                    case 63: {
                        if (type == 14) {
                            mSetListNumbers = (java.util.Set<java.util.List<Integer>>) net.morimekta.providence.serializer.binary.BinaryFormatUtils.readFieldValue(reader, new net.morimekta.providence.serializer.binary.BinaryFormatUtils.FieldInfo(field, type), _Field.SET_LIST_NUMBERS.getDescriptor(), strict);
                            optionals.set(39);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.set_list_numbers, should be struct(12)");
                        }
                        break;
                    }
                    case 64: {
                        if (type == 15) {
                            mListListNumbers = (java.util.List<java.util.List<Integer>>) net.morimekta.providence.serializer.binary.BinaryFormatUtils.readFieldValue(reader, new net.morimekta.providence.serializer.binary.BinaryFormatUtils.FieldInfo(field, type), _Field.LIST_LIST_NUMBERS.getDescriptor(), strict);
                            optionals.set(40);
                        } else {
                            throw new net.morimekta.providence.serializer.SerializerException("Wrong type " + net.morimekta.providence.serializer.binary.BinaryType.asString(type) + " for providence.Containers.list_list_numbers, should be struct(12)");
                        }
                        break;
                    }
                    default: {
                        net.morimekta.providence.serializer.binary.BinaryFormatUtils.readFieldValue(reader, new net.morimekta.providence.serializer.binary.BinaryFormatUtils.FieldInfo(field, type), null, false);
                        break;
                    }
                }
                type = reader.expectByte();
            }
        }

        @Override
        public Containers build() {
            return new Containers(this);
        }
    }
}
