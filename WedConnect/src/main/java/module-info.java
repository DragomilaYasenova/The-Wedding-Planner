module com.example.wedconnect {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires javafx.web;


    opens com.example.wedconnect to javafx.fxml;
    exports com.example.wedconnect;
    exports com.example.wedconnect.controllers;
    opens com.example.wedconnect.controllers to javafx.fxml;
}