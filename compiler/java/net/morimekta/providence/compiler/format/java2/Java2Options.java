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

package net.morimekta.providence.compiler.format.java2;

import org.kohsuke.args4j.Option;

/**
 * Options class for java 2 generator.
 */
public class Java2Options {
    @Option(name = "--android",
            usage = "Add android.os.Parcelable support on all structs.")
    public boolean android = false;

    @Option(name = "--jackson",
            usage = "Add jackson-databind annotations to all classes.")
    public boolean jackson = false;

    public enum Containers {
        // HashSet, HashMap
        DEFAULT,
        // LinkedHashSet, LinkedHashMap
        ORDERED,
        // TreeSet, TreeMap
        SORTED,
    }

    @Option(name = "--containers",
            usage = "Type of containers.")
    public Containers containers = Containers.DEFAULT;
}
