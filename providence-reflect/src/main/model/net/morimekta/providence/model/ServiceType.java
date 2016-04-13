package net.morimekta.providence.model;

import net.morimekta.providence.PMessage;
import net.morimekta.providence.PMessageBuilder;
import net.morimekta.providence.PMessageBuilderFactory;
import net.morimekta.providence.PType;
import net.morimekta.providence.descriptor.PDescriptor;
import net.morimekta.providence.descriptor.PDescriptorProvider;
import net.morimekta.providence.descriptor.PField;
import net.morimekta.providence.descriptor.PList;
import net.morimekta.providence.descriptor.PMap;
import net.morimekta.providence.descriptor.PPrimitive;
import net.morimekta.providence.descriptor.PRequirement;
import net.morimekta.providence.descriptor.PStructDescriptor;
import net.morimekta.providence.descriptor.PStructDescriptorProvider;
import net.morimekta.providence.descriptor.PValueProvider;
import net.morimekta.providence.util.PTypeUtils;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * service (extends <extend>)? {
 *   (<method> [;,]?)*
 * }
 */
@SuppressWarnings("unused")
public class ServiceType
        implements PMessage<ServiceType>, Serializable, Comparable<ServiceType> {
    private final static long serialVersionUID = 789757775761432238L;

    private final String mComment;
    private final String mName;
    private final String mExtend;
    private final List<ServiceMethod> mMethods;
    private final Map<String,String> mAnnotations;
    
    private volatile int tHashCode;

    private ServiceType(_Builder builder) {
        mComment = builder.mComment;
        mName = builder.mName;
        mExtend = builder.mExtend;
        mMethods = Collections.unmodifiableList(new LinkedList<>(builder.mMethods));
        mAnnotations = Collections.unmodifiableMap(new LinkedHashMap<>(builder.mAnnotations));
    }

    public ServiceType(String pComment,
                       String pName,
                       String pExtend,
                       List<ServiceMethod> pMethods,
                       Map<String,String> pAnnotations) {
        mComment = pComment;
        mName = pName;
        mExtend = pExtend;
        mMethods = Collections.unmodifiableList(new LinkedList<>(pMethods));
        mAnnotations = Collections.unmodifiableMap(new LinkedHashMap<>(pAnnotations));
    }

    public boolean hasComment() {
        return mComment != null;
    }

    public String getComment() {
        return mComment;
    }

    public boolean hasName() {
        return mName != null;
    }

    public String getName() {
        return mName;
    }

    public boolean hasExtend() {
        return mExtend != null;
    }

    public String getExtend() {
        return mExtend;
    }

    public int numMethods() {
        return mMethods != null ? mMethods.size() : 0;
    }

    public List<ServiceMethod> getMethods() {
        return mMethods;
    }

    public int numAnnotations() {
        return mAnnotations != null ? mAnnotations.size() : 0;
    }

    public Map<String,String> getAnnotations() {
        return mAnnotations;
    }

    @Override
    public boolean has(int key) {
        switch(key) {
            case 1: return hasComment();
            case 2: return hasName();
            case 3: return hasExtend();
            case 4: return numMethods() > 0;
            case 5: return numAnnotations() > 0;
            default: return false;
        }
    }

    @Override
    public int num(int key) {
        switch(key) {
            case 1: return hasComment() ? 1 : 0;
            case 2: return hasName() ? 1 : 0;
            case 3: return hasExtend() ? 1 : 0;
            case 4: return numMethods();
            case 5: return numAnnotations();
            default: return 0;
        }
    }

    @Override
    public Object get(int key) {
        switch(key) {
            case 1: return getComment();
            case 2: return getName();
            case 3: return getExtend();
            case 4: return getMethods();
            case 5: return getAnnotations();
            default: return null;
        }
    }

    @Override
    public boolean isCompact() {
        return false;
    }

    @Override
    public boolean isSimple() {
        return descriptor().isSimple();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof ServiceType)) return false;
        ServiceType other = (ServiceType) o;
        return Objects.equals(mComment, other.mComment) &&
               Objects.equals(mName, other.mName) &&
               Objects.equals(mExtend, other.mExtend) &&
               PTypeUtils.equals(mMethods, other.mMethods) &&
               PTypeUtils.equals(mAnnotations, other.mAnnotations);
    }

    @Override
    public int hashCode() {
        if (tHashCode == 0) {
            tHashCode = Objects.hash(
                    ServiceType.class,
                    _Field.COMMENT, mComment,
                    _Field.NAME, mName,
                    _Field.EXTEND, mExtend,
                    _Field.METHODS, PTypeUtils.hashCode(mMethods),
                    _Field.ANNOTATIONS, PTypeUtils.hashCode(mAnnotations));
        }
        return tHashCode;
    }

    @Override
    public String toString() {
        return "model.ServiceType" + asString();
    }

    @Override
    public String asString() {
        StringBuilder out = new StringBuilder();
        out.append("{");

        boolean first = true;
        if (hasComment()) {
            first = false;
            out.append("comment:");
            out.append('\"').append(mComment).append('\"');
        }
        if (hasName()) {
            if (!first) out.append(',');
            first = false;
            out.append("name:");
            out.append('\"').append(mName).append('\"');
        }
        if (hasExtend()) {
            if (!first) out.append(',');
            first = false;
            out.append("extend:");
            out.append('\"').append(mExtend).append('\"');
        }
        if (numMethods() > 0) {
            if (!first) out.append(',');
            first = false;
            out.append("methods:");
            out.append(PTypeUtils.toString(mMethods));
        }
        if (numAnnotations() > 0) {
            if (!first) out.append(',');
            first = false;
            out.append("annotations:");
            out.append(PTypeUtils.toString(mAnnotations));
        }
        out.append('}');
        return out.toString();
    }

    @Override
    public int compareTo(ServiceType other) {
        int c;

        c = Boolean.compare(mComment != null, other.mComment != null);
        if (c != 0) return c;
        if (mComment != null) {
            c = mComment.compareTo(other.mComment);
            if (c != 0) return c;
        }

        c = Boolean.compare(mName != null, other.mName != null);
        if (c != 0) return c;
        if (mName != null) {
            c = mName.compareTo(other.mName);
            if (c != 0) return c;
        }

        c = Boolean.compare(mExtend != null, other.mExtend != null);
        if (c != 0) return c;
        if (mExtend != null) {
            c = mExtend.compareTo(other.mExtend);
            if (c != 0) return c;
        }

        c = Boolean.compare(mMethods != null, other.mMethods != null);
        if (c != 0) return c;
        if (mMethods != null) {
            c = Integer.compare(mMethods.hashCode(), other.mMethods.hashCode());
            if (c != 0) return c;
        }

        c = Boolean.compare(mAnnotations != null, other.mAnnotations != null);
        if (c != 0) return c;
        if (mAnnotations != null) {
            c = Integer.compare(mAnnotations.hashCode(), other.mAnnotations.hashCode());
            if (c != 0) return c;
        }

        return 0;
    }

    public enum _Field implements PField {
        COMMENT(1, PRequirement.DEFAULT, "comment", PPrimitive.STRING.provider(), null),
        NAME(2, PRequirement.REQUIRED, "name", PPrimitive.STRING.provider(), null),
        EXTEND(3, PRequirement.DEFAULT, "extend", PPrimitive.STRING.provider(), null),
        METHODS(4, PRequirement.DEFAULT, "methods", PList.provider(ServiceMethod.provider()), null),
        ANNOTATIONS(5, PRequirement.DEFAULT, "annotations", PMap.provider(PPrimitive.STRING.provider(),PPrimitive.STRING.provider()), null),
        ;

        private final int mKey;
        private final PRequirement mRequired;
        private final String mName;
        private final PDescriptorProvider<?> mTypeProvider;
        private final PValueProvider<?> mDefaultValue;

        _Field(int key, PRequirement required, String name, PDescriptorProvider<?> typeProvider, PValueProvider<?> defaultValue) {
            mKey = key;
            mRequired = required;
            mName = name;
            mTypeProvider = typeProvider;
            mDefaultValue = defaultValue;
        }

        @Override
        public String getComment() { return null; }

        @Override
        public int getKey() { return mKey; }

        @Override
        public PRequirement getRequirement() { return mRequired; }

        @Override
        public PType getType() { return getDescriptor().getType(); }

        @Override
        public PDescriptor<?> getDescriptor() { return mTypeProvider.descriptor(); }

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
            StringBuilder builder = new StringBuilder();
            builder.append("ServiceType._Field(")
                   .append(mKey)
                   .append(": ");
            if (mRequired != PRequirement.DEFAULT) {
                builder.append(mRequired.label).append(" ");
            }
            builder.append(getDescriptor().getQualifiedName(null))
                   .append(' ')
                   .append(mName)
                   .append(')');
            return builder.toString();
        }

        public static _Field forKey(int key) {
            switch (key) {
                case 1: return _Field.COMMENT;
                case 2: return _Field.NAME;
                case 3: return _Field.EXTEND;
                case 4: return _Field.METHODS;
                case 5: return _Field.ANNOTATIONS;
                default: return null;
            }
        }

        public static _Field forName(String name) {
            switch (name) {
                case "comment": return _Field.COMMENT;
                case "name": return _Field.NAME;
                case "extend": return _Field.EXTEND;
                case "methods": return _Field.METHODS;
                case "annotations": return _Field.ANNOTATIONS;
            }
            return null;
        }
    }

    public static PStructDescriptorProvider<ServiceType,_Field> provider() {
        return new _Provider();
    }

    @Override
    public PStructDescriptor<ServiceType,_Field> descriptor() {
        return kDescriptor;
    }

    public static final PStructDescriptor<ServiceType,_Field> kDescriptor;

    private static class _Descriptor
            extends PStructDescriptor<ServiceType,_Field> {
        public _Descriptor() {
            super(null, "model", "ServiceType", new _Factory(), false, false);
        }

        @Override
        public _Field[] getFields() {
            return _Field.values();
        }

        @Override
        public _Field getField(String name) {
            return _Field.forName(name);
        }

        @Override
        public _Field getField(int key) {
            return _Field.forKey(key);
        }
    }

    static {
        kDescriptor = new _Descriptor();
    }

    private final static class _Provider extends PStructDescriptorProvider<ServiceType,_Field> {
        @Override
        public PStructDescriptor<ServiceType,_Field> descriptor() {
            return kDescriptor;
        }
    }

    private final static class _Factory
            extends PMessageBuilderFactory<ServiceType> {
        @Override
        public _Builder builder() {
            return new _Builder();
        }
    }

    @Override
    public _Builder mutate() {
        return new _Builder(this);
    }

    public static _Builder builder() {
        return new _Builder();
    }

    public static class _Builder
            extends PMessageBuilder<ServiceType> {
        private BitSet optionals;

        private String mComment;
        private String mName;
        private String mExtend;
        private List<ServiceMethod> mMethods;
        private Map<String,String> mAnnotations;


        public _Builder() {
            optionals = new BitSet(5);
            mMethods = new LinkedList<>();
            mAnnotations = new LinkedHashMap<>();
        }

        public _Builder(ServiceType base) {
            this();

            if (base.hasComment()) {
                optionals.set(0);
                mComment = base.mComment;
            }
            if (base.hasName()) {
                optionals.set(1);
                mName = base.mName;
            }
            if (base.hasExtend()) {
                optionals.set(2);
                mExtend = base.mExtend;
            }
            if (base.numMethods() > 0) {
                optionals.set(3);
                mMethods.addAll(base.mMethods);
            }
            if (base.numAnnotations() > 0) {
                optionals.set(4);
                mAnnotations.putAll(base.mAnnotations);
            }
        }

        public _Builder setComment(String value) {
            optionals.set(0);
            mComment = value;
            return this;
        }
        public _Builder clearComment() {
            optionals.set(0, false);
            mComment = null;
            return this;
        }
        public _Builder setName(String value) {
            optionals.set(1);
            mName = value;
            return this;
        }
        public _Builder clearName() {
            optionals.set(1, false);
            mName = null;
            return this;
        }
        public _Builder setExtend(String value) {
            optionals.set(2);
            mExtend = value;
            return this;
        }
        public _Builder clearExtend() {
            optionals.set(2, false);
            mExtend = null;
            return this;
        }
        public _Builder setMethods(Collection<ServiceMethod> value) {
            optionals.set(3);
            mMethods.clear();
            mMethods.addAll(value);
            return this;
        }
        public _Builder addToMethods(ServiceMethod... values) {
            optionals.set(3);
            for (ServiceMethod item : values) {
                mMethods.add(item);
            }
            return this;
        }

        public _Builder clearMethods() {
            optionals.set(3, false);
            mMethods.clear();
            return this;
        }
        public _Builder setAnnotations(Map<String,String> value) {
            optionals.set(4);
            mAnnotations.clear();
            mAnnotations.putAll(value);
            return this;
        }
        public _Builder putInAnnotations(String key, String value) {
            optionals.set(4);
            mAnnotations.put(key, value);
            return this;
        }

        public _Builder clearAnnotations() {
            optionals.set(4, false);
            mAnnotations.clear();
            return this;
        }
        @Override
        public _Builder set(int key, Object value) {
            if (value == null) return clear(key);
            switch (key) {
                case 1: setComment((String) value); break;
                case 2: setName((String) value); break;
                case 3: setExtend((String) value); break;
                case 4: setMethods((List<ServiceMethod>) value); break;
                case 5: setAnnotations((Map<String,String>) value); break;
            }
            return this;
        }

        @Override
        public _Builder addTo(int key, Object value) {
            switch (key) {
                case 4: addToMethods((ServiceMethod) value); break;
                default: break;
            }
            return this;
        }

        @Override
        public _Builder clear(int key) {
            switch (key) {
                case 1: clearComment(); break;
                case 2: clearName(); break;
                case 3: clearExtend(); break;
                case 4: clearMethods(); break;
                case 5: clearAnnotations(); break;
            }
            return this;
        }

        @Override
        public boolean isValid() {
            return optionals.get(1);
        }

        @Override
        public ServiceType build() {
            return new ServiceType(this);
        }
    }
}
