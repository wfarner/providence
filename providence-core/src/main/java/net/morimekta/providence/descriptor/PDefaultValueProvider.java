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

/**
 * Provider for default value. This provider assumes the value is already an
 * instance object.
 */
public class PDefaultValueProvider<V> implements PValueProvider<V> {
    private final V value;

    public PDefaultValueProvider(V value) {
        this.value = value;
    }

    @Override
    public V get() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof PValueProvider)) {
            return false;
        }
        PValueProvider<?> other = (PValueProvider<?>) o;
        return value.equals(other.get());
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
