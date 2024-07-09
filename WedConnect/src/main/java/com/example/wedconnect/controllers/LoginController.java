package com.example.wedconnect.controllers;

import com.example.wedconnect.database.Database;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.example.wedconnect.user.User;

import static com.example.wedconnect.database.Database.loginUser;
import static com.example.wedconnect.database.Database.userExists;

public class LoginController extends MainController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    protected void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = new User(username, password);

        if (loginUser(user)) {
            System.out.println("Login successful!");
        } else if (userExists(username)) {
            System.out.println("Invalid password!");
        } else {
            System.out.println("User doesn't exist!");
        }
    }


}
