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

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import net.reflxction.binary.BinaryConverter;
import net.reflxction.binary.utils.BinaryUtils;
import net.reflxction.binary.utils.builders.ButtonBuilder;
import net.reflxction.binary.utils.builders.TextAreaBuilder;
import net.reflxction.binary.utils.builders.TextBuilder;

/**
 * The ASCII menu (to convert text to binary)
 */
class AsciiMenu {

    /**
     * Adds the screen components to the stack pane (Which is {@link ConverterMenu})
     *
     * @param pane Pane to add to
     */
    void addComponents(StackPane pane) {
        Text binaryText = new TextBuilder("Binary") // The text above the binary text field
                .setFont(new Font("Arial", 32))
                .setColor(Color.BLACK)
                .setY(80)
                .build();
        Text asciiText = new TextBuilder("ASCII (Text)") // The text above the ascii area
                .setFont(new Font("Arial", 32))
                .setColor(Color.BLACK)
                .setY(-230)
                .build();
        TextArea asciiTextField = new TextAreaBuilder() // Text area to take ascii input
                .setWidth(350)
                .setHeight(80)
                .setX(10)
                .setEditable(true)
                .setWrapText(true)
                .setY(-150).build();
        TextArea binaryArea = new TextAreaBuilder() // Text area to display results
                .setWidth(350)
                .setHeight(80)
                .setX(10)
                .setY(150)
                .setWrapText(true)
                .build();
        Button convertButton = new ButtonBuilder() // The button to convert
                .setWidth(100)
                .setHeight(30)
                .setText("Convert")
                .setFont(new Font("Arial", 14))
                .setTextColor(Color.BLACK)
                .setX(-120)
                .setY(-20)
                .addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
                    String ascii = asciiTextField.getText();
                    String binary = BinaryUtils.asciiToBinary(ascii);
                    binaryArea.setText(binary);
                })
                .build();
        Button swapButton = new ButtonBuilder() // The button to swap the converter
                .setWidth(100)
                .setHeight(30)
                .setText("Swap")
                .setFont(new Font("Arial", 14))
                .setTextColor(Color.BLACK)
                .setX(120)
                .setY(-20)
                .addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
                    SceneHandler.HANDLER.setBinary();
                    pane.getChildren().clear();
                    this.addComponents(pane);
                    BinaryConverter.getCurrentStage().setScene(new Scene(new ConverterMenu(), 500, 600));
                })
                .build();
        addNodes(pane, asciiTextField, binaryArea, binaryText, asciiText, convertButton, swapButton);
    }

    /**
     * Adds multiple nodes to the screen in var args form
     *
     * @param pane Pane to add for
     * @param nodes Nodes to add to the screen
     */
    private void addNodes(StackPane pane, Node... nodes) {
        for (Node node : nodes) {
            pane.getChildren().add(node);
        }
    }
}
