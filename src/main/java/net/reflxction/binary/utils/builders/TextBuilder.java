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

import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * A utility for building texts in JavaFX
 */
public class TextBuilder {

    // The text
    private Text text;

    public TextBuilder(String text) {
        this.text = new Text(text);
    }

    // The color of the text
    private Paint color;

    // The x and y positions
    private int x, y;

    // The font
    private Font font;

    /**
     * Sets the X position of the text
     *
     * @param x New value to set
     */
    public TextBuilder setX(int x) {
        this.x = x;
        return this;
    }

    /**
     * Sets the Y position of the text
     *
     * @param y New value to set
     */
    public TextBuilder setY(int y) {
        this.y = y;
        return this;
    }

    /**
     * Sets the text font
     *
     * @param font New value to set
     */
    public TextBuilder setFont(Font font) {
        this.font = font;
        return this;
    }

    /**
     * Sets the color of the text
     *
     * @param color New value to set
     */
    public TextBuilder setColor(Paint color) {
        this.color = color;
        return this;
    }

    /**
     * Builds the text by setting all the properties
     *
     * @return The text after being modified
     */
    public Text build() {
        text.setTranslateX(x);
        text.setTranslateY(y);
        text.setFont(font);
        text.setFill(color);
        return text;
    }

}
