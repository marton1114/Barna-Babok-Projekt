package hu.unideb.inf.control;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLSearchPageSceneController implements Initializable {

    @FXML
    private ChoiceBox<String> ComponentChoiceBox;

    private String[] components = {
            "Processor",
            "PowerSupply",
            "Motherboard",
            "Memory",
            "HardDriveDisk"
    };

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ComponentChoiceBox.getItems().addAll(components);
    }

    public void updateFilters(ActionEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();

        if (selectedComponent.equals("Processor")) {

        } else if (selectedComponent.equals("PowerSupply")) {
            // filterek
        } else if (selectedComponent.equals("Motherboard")) {
            // filterek
        } else if (selectedComponent.equals("Memory")) {
            // filterek
        } else if (selectedComponent.equals("HardDriveDisk")) {
            // filterek
        }
    }
}