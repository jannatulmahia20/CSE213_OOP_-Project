package com.example.movieproduction.usee7and8;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TheaterManagerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}