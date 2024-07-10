package com.example.wedconnect.Scene;

import com.example.wedconnect.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PageHandler implements PageHandlerInterface {

    @Override
    public void changeScene(String fxmlPath, Button button) throws IOException {
        Stage stage = (Stage) button.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(fxmlPath));
        Scene scene = new Scene(fxmlLoader.load(), 1300, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/example/wedconnect/styles.css")).toExternalForm());
        stage.setScene(scene);
    }
}
