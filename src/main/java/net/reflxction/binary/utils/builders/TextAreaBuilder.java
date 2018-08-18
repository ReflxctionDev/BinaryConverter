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
package net.reflxction.binary.utils.builders;

import javafx.scene.control.TextArea;

/**
 * Utility for building text areas in JavaFX
 */
@SuppressWarnings("SameParameterValue")
public class TextAreaBuilder {

    // The text area
    private TextArea textArea;

    // The x and y position, the width and height of the area
    private int x, y, width, height;

    // Whether it should wrap text (start a new line when the current line is full)
    private boolean wrapText = true;

    // Whether the area can be written into
    private boolean editable;

    public TextAreaBuilder() {
        textArea = new TextArea();
    }

    /**
     * Sets the X position
     *
     * @param x New value to set
     */
    public TextAreaBuilder setX(int x) {
        this.x = x;
        return this;
    }

    /**
     * Sets the Y position
     *
     * @param y New value to set
     */
    public TextAreaBuilder setY(int y) {
        this.y = y;
        return this;
    }

    /**
     * Sets the area width
     *
     * @param width New value to set
     */
    public TextAreaBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Sets the area height
     *
     * @param height New value to set
     */
    public TextAreaBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * Sets whether it should wrap text or not (start a new line if the current one is full)
     *
     * @param wrapText New value to set
     */
    public TextAreaBuilder setWrapText(boolean wrapText) {
        this.wrapText = wrapText;
        return this;
    }

    /**
     * Sets whether the area can be written into
     *
     * @param editable New value to set
     */
    public TextAreaBuilder setEditable(boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * Builds the area by setting all properties
     *
     * @return The text area
     */
    public TextArea build() {
        textArea.setMinWidth(width);
        textArea.setPrefWidth(width);
        textArea.setMaxWidth(width);

        textArea.setMinHeight(height);
        textArea.setPrefHeight(height);
        textArea.setMaxHeight(height);

        textArea.setTranslateX(x);
        textArea.setTranslateY(y);

        textArea.setWrapText(wrapText);
        textArea.setEditable(editable);
        return textArea;
    }

}
