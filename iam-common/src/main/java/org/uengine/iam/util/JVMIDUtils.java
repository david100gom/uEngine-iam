/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.uengine.iam.util;

import org.apache.commons.lang.math.JVMRandom;

/**
 * JVM에 따라 임의의 값을 생성하는 UUID Generator.
 *
 * @author Seungpil, Park
 * @since 0.1
 */
public class JVMIDUtils {

    /**
     * JVM Random 값을 생성하는 JVMRandom
     */
    protected static JVMRandom random = new JVMRandom();

    /**
     * 고유한 JVM UUID를 생성한다.
     *
     * @return 생성된 JVM UUID
     */
    public static String generateUUID() {
        return String.valueOf(random.nextInt(999999999));
    }
}