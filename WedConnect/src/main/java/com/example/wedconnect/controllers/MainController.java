package com.example.wedconnect.controllers;

import com.example.wedconnect.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Objects;

public class MainController {
    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Button backButton;

    @FXML
    protected void handleLoginPage() throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/example/wedconnect/pages/login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/example/wedconnect/styles.css")).toExternalForm());
        stage.setScene(scene);
    }

    @FXML
    protected void handleRegisterPage() throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/example/wedconnect/pages/register.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/example/wedconnect/styles.css")).toExternalForm());
        stage.setScene(scene);
    }

    @FXML
    protected void handleBack() throws IOException {
        Stage stage = (Stage) backButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/example/wedconnect/index.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/example/wedconnect/styles.css")).toExternalForm());
        stage.setScene(scene);
    }
}
