package org.example.gameiohanna;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Launcher extends Application{
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Main Menu");

        Button startBtn = new Button("Начать игру");
        Button settingsBtn = new Button("Настройки");
        Button exitBtn = new Button("Выход");

        startBtn.setOnAction(e -> startGame(primaryStage));
        settingsBtn.setOnAction(e -> System.out.println("Открыть настройки..."));
        exitBtn.setOnAction(e -> primaryStage.close());

        VBox layout = new VBox(20, startBtn, settingsBtn, exitBtn);
        layout.setStyle("-fx-background-color: black; -fx-alignment: center;");

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void startGame(Stage stage) {
        System.out.println("Игра началась!");
        // Здесь меняем сцену на сцену игры
    }


    public static void main(String[] args) {
        Application.launch(Launcher.class, args);
    }


}
