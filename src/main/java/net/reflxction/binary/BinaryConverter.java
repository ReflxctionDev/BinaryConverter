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
package net.reflxction.binary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.reflxction.binary.menus.ConverterMenu;

/**
 * BinaryConverter: A JavaFX application to convert binary to ascii and vice versa
 */
public class BinaryConverter extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    // The current stage. This is used to switch between the ascii menu and binary menu
    private static Stage currentStage;

    /**
     * Starts the JavaFX application
     *
     * @param primaryStage Main stage of the application
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene asciiScene = new Scene(new ConverterMenu(), 500, 600);
        currentStage = primaryStage;
        currentStage.setTitle("Binary <-> Ascii Converter");
        currentStage.setScene(asciiScene);
        currentStage.show();
    }

    //
    public static Stage getCurrentStage() {
        return currentStage;
    }
}
