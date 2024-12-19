package designpattern.demo1;

import designpattern.demo1.Boisson.*;
import designpattern.demo1.Decorateurs.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CoffeeController {

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label costLabel;

    private Boisson boisson;

    @FXML
    protected void onBoissonButtonClick(javafx.event.ActionEvent event) {
        // Récupérer le nom de la boisson à partir du bouton cliqué
        Button clickedButton = (Button) event.getSource();
        String boissonType = clickedButton.getText();

        switch (boissonType) {
            case "Deca":
                boisson = new Deca();
                break;
            case "Espresso":
                boisson = new Espresso();
                break;
            case "Sumatra":
                boisson = new Sumatra();
                break;
        }

        updateDescriptionAndCost();
    }

    @FXML
    protected void onIngredientButtonClick(javafx.event.ActionEvent event) {

        if (boisson == null) return;

        Button clickedButton = (Button) event.getSource();
        String ingredientType = clickedButton.getText();

        switch (ingredientType) {
            case "Caramel":
                boisson = new Caramel(boisson);
                break;
            case "Chocolat":
                boisson = new Chocolat(boisson);
                break;
            case "Vanille":
                boisson = new Vanille(boisson);
                break;
        }

        updateDescriptionAndCost();
    }

    private void updateDescriptionAndCost() {
        if (boisson != null) {
            descriptionLabel.setText(boisson.getDescription());
            costLabel.setText(String.format("%.2f DH", boisson.cout()));
        }
    }
}
