package com.example.wedconnect.controllers;

import com.example.wedconnect.database.Database;
import com.example.wedconnect.user.User;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController extends MainController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    protected void handleRegister() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (password.equals(confirmPassword)) {
            User user = new User(username, password);
            Database.addUser(user);
        } else {
            System.out.println("Passwords do not match!");
        }
    }
}
