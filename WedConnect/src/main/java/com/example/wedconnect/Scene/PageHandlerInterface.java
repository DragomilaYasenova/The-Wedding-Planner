package com.example.wedconnect.Scene;

import javafx.scene.control.Button;

import java.io.IOException;

public interface PageHandlerInterface {
    void changeScene(String fxmlPath, Button button) throws IOException;
}
