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
package net.reflxction.binary.menus;

/**
 * A simple class to track the current windows
 */
class SceneHandler {

    // Instance of the handler
    static final SceneHandler HANDLER = new SceneHandler();

    /**
     * The current state of the handler.
     * If {@code true}, then it's the {@link BinaryMenu}.
     * If {@code false}, then it's the {@link AsciiMenu}.
     */
    private boolean state = false;

    /**
     * Whether it's the binary menu or not
     *
     * @return Whether it's the binary menu or not
     */
    boolean isBinary() {
        return state;
    }

    /**
     * Sets the scene to be {@link AsciiMenu}
     */
    void setAscii() {
        this.state = false;
    }

    /**
     * Sets the scene to be {@link BinaryMenu}
     */
    void setBinary() {
        this.state = true;
    }

}
