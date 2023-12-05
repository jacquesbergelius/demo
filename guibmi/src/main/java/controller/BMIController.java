package controller;

import view.BMI;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import java.util.Locale;

public class BMIController {

    @FXML
    private Slider heightSlider;

    @FXML
    private Slider weightSlider;

    @FXML
    private Label bmiLabel;

    @FXML
    private Label heightLabel;

    @FXML
    private Label weightLabel;

    @FXML
    private void updateBMI() {
        System.out.println("updateBMI() called");
        double height = heightSlider.getValue()/100.0;
        double weight = weightSlider.getValue();
        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI: " + bmi);

       heightLabel.setText(String.format(Locale.US, "%.0f cm", heightSlider.getValue()));
       weightLabel.setText(String.format(Locale.US, "%.0f kg", weightSlider.getValue()));

        String bmiFormatted = String.format(Locale.US, "%.1f", bmi);
        bmiLabel.setText(bmiFormatted);
    }

    public static void main(String[] args) {
        BMI.launch(BMI.class);
    }
}