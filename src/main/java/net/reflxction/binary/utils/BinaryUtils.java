/*
 * * Copyright 2018 github.com/ReflxctionDev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.reflxction.binary.utils;

/**
 * A simple utility to convert ascii to binary and vice versa
 */
public class BinaryUtils {

    /**
     * Converts an ASCII string to binary bytes
     *
     * @param ascii ASCII (text) to convert
     * @return The binary form of the text
     */
    public static String asciiToBinary(String ascii) {
        byte[] bytes = ascii.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        return binary.toString();
    }

    /**
     * Converts a binary string to ASCII (text) form
     *
     * @param binary Binary to convert
     * @return ASCII (text) form of the binary
     */
    public static String binaryToAscii(String binary) {
        StringBuilder builder = new StringBuilder();
        char c;
        for (int i = 0; i <= binary.length() - 8; i += 9) {
            c = (char) Integer.parseInt(binary.substring(i, i + 8), 2);
            builder.append(c);
        }
        return builder.toString();
    }

}
