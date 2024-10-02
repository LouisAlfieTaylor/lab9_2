package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void onNameButtonClick() {
        welcomeText.setText("Lukas Perkov");
    }


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onLouisButtonClick() {
        welcomeText.setText("My Button is really cool");
    }

}