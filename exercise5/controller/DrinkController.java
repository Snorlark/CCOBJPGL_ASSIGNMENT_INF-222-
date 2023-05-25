package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Soju soju = new Soju();
    Sanmig_light sanmig_light = new Sanmig_light();
    Redhorse redhorse = new Redhorse();
    Gsm_blue gsm_blue = new Gsm_blue();
    Alfonso alfonso = new Alfonso();

    public void initialize() {

        soju.setTaste("crisp, neutral spirit, but with more texture and less harsh string");
        soju.setPrice("PHP 150");

        sanmig_light.setTaste("little bit of grain sweetness, and it finishes suprisingly dry");
        sanmig_light.setPrice("PHP 100");

        redhorse.setTaste("distinctive, sweetish taste, balanced by a smooth bitterness");
        redhorse.setPrice("PHP 100");

        gsm_blue.setTaste("sweet, with a hint of citrus and eands with heat");
        gsm_blue.setPrice("PHP 120");

        alfonso.setTaste("soft and, though completely dry and sweet");
        alfonso.setPrice("PHP 400");
    }   

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Soju is " + soju.getTaste() + " and its price is " + soju.getPrice());
        }

        if (sourceButton.equals(btn2)) {
            alert.setContentText("Sanmig light is " + sanmig_light.getTaste() + " and its price is " + sanmig_light.getPrice());
        }

        if (sourceButton.equals(btn4)) {
            alert.setContentText("Red horse is " + redhorse.getTaste() + " and its price is " + redhorse.getPrice());
        }

        if (sourceButton.equals(btn3)) {
            alert.setContentText("GSM Blue is " + gsm_blue.getTaste() + " and its price is " + gsm_blue.getPrice());
        }

        if (sourceButton.equals(btn5)) {
            alert.setContentText("Alfonso is " + alfonso.getTaste() + " and its price is " + alfonso.getPrice());
        }

        alert.showAndWait();

    }
}