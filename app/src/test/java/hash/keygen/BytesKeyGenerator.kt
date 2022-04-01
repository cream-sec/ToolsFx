/*
 * Copyright 2011-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package hash.keygen

/**
 * A generator for unique byte array-based keys.
 *
 * @author Keith Donald
 */
interface BytesKeyGenerator {
    /**
     * Get the length, in bytes, of keys created by this generator. Most unique keys are at least 8
     * bytes in length.
     */
    val keyLength: Int

    /** Generate a new key. */
    fun generateKey(): ByteArray
}
