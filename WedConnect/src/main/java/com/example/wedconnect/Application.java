package com.example.wedconnect;

import com.example.wedconnect.database.Database;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/example/wedconnect/index.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/example/wedconnect/styles.css")).toExternalForm());

        stage.setTitle("Welcome to WedConnect Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}