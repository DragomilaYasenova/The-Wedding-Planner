package com.example.wedconnect.controllers;

import com.example.wedconnect.Scene.PageHandler;
import com.example.wedconnect.Scene.PageHandlerInterface;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class PageController {
    private final PageHandlerInterface pageHandlerInterface = new PageHandler();

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Button backButton;

    @FXML
    protected void handleBack() throws IOException {
        pageHandlerInterface.changeScene("/com/example/wedconnect/index.fxml", backButton);
    }

    @FXML
    protected void handleLoginPage() throws IOException {
        pageHandlerInterface.changeScene("/com/example/wedconnect/pages/login.fxml", loginButton);
    }

    @FXML
    protected void handleRegisterPage() throws IOException {
        pageHandlerInterface.changeScene("/com/example/wedconnect/pages/register.fxml", registerButton);
    }

    @FXML
    protected void handleClientHomePage() throws IOException {
        pageHandlerInterface.changeScene("/com/example/wedconnect/pages/clientHomePage.fxml", backButton);
    }
}
