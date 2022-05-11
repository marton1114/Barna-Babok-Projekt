package hu.unideb.inf.control;

import hu.unideb.inf.model.components.Processor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TableColumn;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLSearchPageSceneController implements Initializable {

    @FXML
    private Slider MaxPriceSlider;

    @FXML
    private Label MaxPriceLabel;

    @FXML
    private TableColumn<Processor, String> brandTableColumn;

    @FXML
    private TableColumn<Processor, Integer> capacityTableColumn;

    @FXML
    private TableColumn<Processor, String> energyEfficiencyTableColumn;

    @FXML
    private TableColumn<Processor, String> formFactorTableColumn;

    @FXML
    private TableColumn<Processor, Double> frequencyTableColumn;

    @FXML
    private TableColumn<Processor, String> integratedGPUTableColumn;

    @FXML
    private TableColumn<Processor, String> modelTableColumn;

    @FXML
    private TableColumn<Processor, Integer> numOfCoresTableColumn;

    @FXML
    private TableColumn<Processor, Integer> numOfModulesTableColumn;

    @FXML
    private TableColumn<Processor, Integer> numOfRAMSocketsTableColumn;

    @FXML
    private TableColumn<Processor, Integer> powerTableColumn;

    @FXML
    private TableColumn<Processor, Double> priceTableColumn;

    @FXML
    private TableColumn<Processor, String> seriesTableColumn;

    @FXML
    private TableColumn<Processor, String> socketTypeTableColumn;

    @FXML
    private TableColumn<Processor, Integer> speedTableColumn;


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
        ComponentChoiceBox.setOnAction(this::updateColumns);
    }

    @FXML
    void updateSlider(MouseEvent event) {
        MaxPriceLabel.setText(String.format("%.2f", MaxPriceSlider.getValue()) + "$");
    }

    public void updateColumns(ActionEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();

        if (selectedComponent.equals("Processor")) {
            brandTableColumn.setVisible(true);
            capacityTableColumn.setVisible(false);
            energyEfficiencyTableColumn.setVisible(false);
            formFactorTableColumn.setVisible(false);
            frequencyTableColumn.setVisible(true);
            integratedGPUTableColumn.setVisible(true);
            modelTableColumn.setVisible(true);
            numOfCoresTableColumn.setVisible(true);
            numOfModulesTableColumn.setVisible(false);
            numOfRAMSocketsTableColumn.setVisible(false);
            powerTableColumn.setVisible(true);
            priceTableColumn.setVisible(true);
            seriesTableColumn.setVisible(true);
            socketTypeTableColumn.setVisible(true);
            speedTableColumn.setVisible(false);
        } else if (selectedComponent.equals("PowerSupply")) {
            brandTableColumn.setVisible(true);
            capacityTableColumn.setVisible(false);
            energyEfficiencyTableColumn.setVisible(true);
            formFactorTableColumn.setVisible(false);
            frequencyTableColumn.setVisible(false);
            integratedGPUTableColumn.setVisible(false);
            modelTableColumn.setVisible(true);
            numOfCoresTableColumn.setVisible(false);
            numOfModulesTableColumn.setVisible(false);
            numOfRAMSocketsTableColumn.setVisible(false);
            powerTableColumn.setVisible(false);
            priceTableColumn.setVisible(true);
            seriesTableColumn.setVisible(true);
            socketTypeTableColumn.setVisible(false);
            speedTableColumn.setVisible(false);
        } else if (selectedComponent.equals("Motherboard")) {
            brandTableColumn.setVisible(true);
            capacityTableColumn.setVisible(false);
            energyEfficiencyTableColumn.setVisible(false);
            formFactorTableColumn.setVisible(true);
            frequencyTableColumn.setVisible(false);
            integratedGPUTableColumn.setVisible(false);
            modelTableColumn.setVisible(true);
            numOfCoresTableColumn.setVisible(false);
            numOfModulesTableColumn.setVisible(false);
            numOfRAMSocketsTableColumn.setVisible(true);
            powerTableColumn.setVisible(false);
            priceTableColumn.setVisible(true);
            seriesTableColumn.setVisible(true);
            socketTypeTableColumn.setVisible(true);
            speedTableColumn.setVisible(false);
        } else if (selectedComponent.equals("Memory")) {
            brandTableColumn.setVisible(true);
            capacityTableColumn.setVisible(true);
            energyEfficiencyTableColumn.setVisible(false);
            formFactorTableColumn.setVisible(false);
            frequencyTableColumn.setVisible(true);
            integratedGPUTableColumn.setVisible(false);
            modelTableColumn.setVisible(true);
            numOfCoresTableColumn.setVisible(false);
            numOfModulesTableColumn.setVisible(true);
            numOfRAMSocketsTableColumn.setVisible(true);
            powerTableColumn.setVisible(false);
            priceTableColumn.setVisible(true);
            seriesTableColumn.setVisible(true);
            socketTypeTableColumn.setVisible(false);
            speedTableColumn.setVisible(false);
        } else if (selectedComponent.equals("HardDriveDisk")) {
            brandTableColumn.setVisible(true);
            capacityTableColumn.setVisible(true);
            energyEfficiencyTableColumn.setVisible(false);
            formFactorTableColumn.setVisible(false);
            frequencyTableColumn.setVisible(false);
            integratedGPUTableColumn.setVisible(false);
            modelTableColumn.setVisible(true);
            numOfCoresTableColumn.setVisible(false);
            numOfModulesTableColumn.setVisible(false);
            numOfRAMSocketsTableColumn.setVisible(false);
            powerTableColumn.setVisible(false);
            priceTableColumn.setVisible(true);
            seriesTableColumn.setVisible(true);
            socketTypeTableColumn.setVisible(false);
            speedTableColumn.setVisible(true);
        }
    }
}