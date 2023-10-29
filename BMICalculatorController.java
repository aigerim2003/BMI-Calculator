package com.example.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class BMICalculatorController {
    @FXML
    private TextField weightTextField;

    @FXML
    private TextField heightTextField;

    @FXML
    private Label bmiLabel;

    @FXML
    private Label statusLabel;

    public void calculateBMI() {
        double weight = Double.parseDouble(weightTextField.getText());
        double height = Double.parseDouble(heightTextField.getText());
        boolean isEnglishUnits = false; // Change this to true if you want to use English units

        double bmi = BMICalculator.calculateBMI(weight, height, isEnglishUnits);
        String status = BMICalculator.determineBMIStatus(bmi);

        bmiLabel.setText("BMI: " + String.format("%.2f", bmi));
        statusLabel.setText("Status: " + status);
    }

    @FXML
    private void clearInputFields() {
        weightTextField.clear();
        heightTextField.clear();
        bmiLabel.setText("");
        statusLabel.setText("");
    }
    @FXML
    private void exitApplication() {
        javafx.application.Platform.exit();
    }
    @FXML
    private void displayHelpInformation() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BMI Calculator Help");
        alert.setHeaderText("How to Use the BMI Calculator");
        alert.setContentText("Provide your weight and height, then click 'Calculate BMI' to see your BMI and status.");
        alert.showAndWait();
    }
}



