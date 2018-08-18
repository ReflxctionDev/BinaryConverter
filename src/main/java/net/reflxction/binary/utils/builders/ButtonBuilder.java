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

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.control.Button;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

/**
 * Utility for building JavaFX buttons
 */
@SuppressWarnings("SameParameterValue")
public class ButtonBuilder {

    // The button
    private Button button;

    // X and Y position, width and height of the button
    private int x, y, width, height;

    // The color of the button text
    private Paint textColor;

    // The text inside the button
    private String text;

    // The button font
    private Font font;

    public ButtonBuilder() {
        button = new Button();
    }

    /**
     * Sets the X position
     *
     * @param x New value to set
     */
    public ButtonBuilder setX(int x) {
        this.x = x;
        return this;
    }

    /**
     * Sets the Y position
     *
     * @param y New value to set
     */
    public ButtonBuilder setY(int y) {
        this.y = y;
        return this;
    }

    /**
     * Sets the width of the button
     *
     * @param width New value to set
     */
    public ButtonBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Sets the height of the button
     *
     * @param height New value to set
     */
    public ButtonBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    /**
     * Sets the color of the button text
     *
     * @param color New value to set
     */
    public ButtonBuilder setTextColor(Paint color) {
        this.textColor = color;
        return this;
    }

    /**
     * Sets the button text
     *
     * @param text New value to set
     */
    public ButtonBuilder setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Sets the button font
     *
     * @param font New value to set
     */
    public ButtonBuilder setFont(Font font) {
        this.font = font;
        return this;
    }

    /**
     * Adds an action to the button
     *
     * @param eventType    Event to listen for.
     * @param eventHandler Action of the button when the event is triggered
     */
    public <T extends Event> ButtonBuilder addEventHandler(EventType<T> eventType, EventHandler<? super T> eventHandler) {
        button.addEventHandler(eventType, eventHandler);
        return this;
    }

    /**
     * Builds the button by setting all properties
     *
     * @return The button after being modified
     */
    public Button build() {
        // The position
        button.setTranslateX(x);
        button.setTranslateY(y);

        // The width
        button.setMinWidth(width);
        button.setPrefWidth(width);
        button.setMaxWidth(width);

        // The height
        button.setMinHeight(height);
        button.setPrefHeight(height);
        button.setMaxHeight(height);

        // The text fill
        button.setTextFill(textColor);

        // The text
        button.setText(text);

        // The button font
        button.setFont(font);

        return button;
    }

}
