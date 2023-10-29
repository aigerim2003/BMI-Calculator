package com.example.bmicalculator;

public class BMICalculator {
    public static double calculateBMI(double weight, double height, boolean isEnglishUnits) {
        double bmi;
        if (isEnglishUnits) {
            bmi = (weight / (height * height)) * 703;
        } else {
            bmi = weight / (height * height);
        }
        return bmi;
    }

    public static String determineBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}


