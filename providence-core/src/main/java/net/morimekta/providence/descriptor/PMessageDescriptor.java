/*
 * Copyright 2015 Providence Authors
 *
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
package net.morimekta.providence.descriptor;

import net.morimekta.providence.PMessage;
import net.morimekta.providence.PMessageBuilder;
import net.morimekta.providence.PMessageBuilderFactory;
import net.morimekta.providence.PMessageVariant;
import net.morimekta.providence.PType;

import javax.annotation.Nonnull;
import java.util.Objects;

/**
 * Descriptor base class for all messages.
 */
public abstract class PMessageDescriptor<T extends PMessage<T, F>, F extends PField> extends PDeclaredDescriptor<T> {
    private final PMessageBuilderFactory<T, F> factory;
    private final boolean                      simple;

    public PMessageDescriptor(String programName,
                              String name,
                              PMessageBuilderFactory<T, F> factory,
                              boolean simple) {
        super(programName, name);

        this.factory = factory;
        this.simple = simple;
    }

    /**
     * @return An unmodifiable list of fields that the struct holds.
     */
    @Nonnull
    public abstract F[] getFields();

    /**
     * @param name Name of field to get.
     * @return The field if present.
     */
    public abstract F getField(String name);

    /**
     * @param key The ID of the field to get.
     * @return The field if present.
     */
    public abstract F getField(int key);

    /**
     * @return The struct variant.
     */
    public abstract PMessageVariant getVariant();

    /**
     * @return True if the message is simple. A simple message contains no
     *         containers, and no sub-messages.
     */
    public boolean isSimple() {
        return simple;
    }

    @Nonnull
    @Override
    public PType getType() {
        return PType.MESSAGE;
    }

    @Override
    public PMessageBuilder<T, F> builder() {
        return factory.builder();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || !(o.getClass().equals(getClass()))) {
            return false;
        }
        PMessageDescriptor<?, ?> other = (PMessageDescriptor<?, ?>) o;
        if (!getQualifiedName().equals(other.getQualifiedName()) ||
            !getVariant().equals(other.getVariant()) ||
            getFields().length != other.getFields().length) {
            return false;
        }
        for (PField field : getFields()) {
            if (!field.equals(other.getField(field.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = Objects.hash(getClass(),
                                getQualifiedName(),
                                getVariant());
        for (PField field : getFields()) {
            hash += Objects.hash(hash, field.hashCode());
        }
        return hash;
    }

    /**
     * Get the actual builder factory instance. For contained structs only.
     * @return The builder factory.
     */
    protected PMessageBuilderFactory<T, F> getFactoryInternal() {
        return factory;
    }
}