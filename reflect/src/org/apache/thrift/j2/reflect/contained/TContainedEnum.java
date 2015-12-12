/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.thrift.j2.reflect.contained;

import org.apache.thrift.j2.TEnumBuilder;
import org.apache.thrift.j2.TEnumValue;
import org.apache.thrift.j2.descriptor.TEnumDescriptor;

/**
 * Contained enum value. This emulates enum values to used in thrift
 * reflection.
 */
public class TContainedEnum
        implements TEnumValue<TContainedEnum> {
    private final int                             mValue;
    private final String                          mName;
    private final TEnumDescriptor<TContainedEnum> mType;
    private final String                          mComment;

    public TContainedEnum(String comment, int value, String name, TEnumDescriptor<TContainedEnum> type) {
        mComment = comment;
        mValue = value;
        mName = name;
        mType = type;
    }

    @Override
    public String getComment() {
        return mComment;
    }

    @Override
    public int getValue() {
        return mValue;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public TEnumDescriptor<TContainedEnum> descriptor() {
        return mType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof TContainedEnum)) {
            return false;
        }
        TContainedEnum other = (TContainedEnum) o;
        return other.descriptor().getQualifiedName(null).equals(mType.getQualifiedName(null)) &&
               other.getName().equals(mName) &&
               other.getValue() == mValue;
    }

    @Override
    public String toString() {
        return mName.toUpperCase();
    }

    public static class Builder
            extends TEnumBuilder<TContainedEnum> {
        private final TContainedEnumDescriptor mType;

        private TContainedEnum mValue = null;

        public Builder(TContainedEnumDescriptor type) {
            mType = type;
        }

        @Override
        public TContainedEnum build() {
            return mValue;
        }

        @Override
        public boolean isValid() {
            return mValue != null;
        }

        @Override
        public Builder setByValue(int id) {
            mValue = mType.getValueById(id);
            if (mValue == null) {
                throw new IllegalArgumentException("No value for id " + id);
            }
            return this;
        }

        @Override
        public Builder setByName(String name) {
            mValue = mType.getValueByName(name);
            if (mValue == null) {
                throw new IllegalArgumentException("No value for name " + name);
            }
            return this;
        }
    }
}
