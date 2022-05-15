package hu.unideb.inf.control;

import hu.unideb.inf.Main;
import hu.unideb.inf.model.DataHandler;
import hu.unideb.inf.model.components.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FXMLSearchPageSceneController implements Initializable {

    @FXML
    private Slider MaxPriceSlider;

    @FXML
    private Label MaxPriceLabel;

    @FXML
    private TableColumn<Object, String> brandTableColumn;

    @FXML
    private TableColumn<Object, Integer> capacityTableColumn;

    @FXML
    private TableColumn<Object, String> energyEfficiencyTableColumn;

    @FXML
    private TableColumn<Object, String> formFactorTableColumn;

    @FXML
    private TableColumn<Object, Double> frequencyTableColumn;

    @FXML
    private TableColumn<Object, String> integratedGPUTableColumn;

    @FXML
    private TableColumn<Object, String> modelTableColumn;

    @FXML
    private TableColumn<Object, Integer> numOfCoresTableColumn;

    @FXML
    private TableColumn<Object, Integer> numOfModulesTableColumn;

    @FXML
    private TableColumn<Object, Integer> numOfRAMSocketsTableColumn;

    @FXML
    private TableColumn<Object, Integer> powerTableColumn;

    @FXML
    private TableColumn<Object, Double> priceTableColumn;

    @FXML
    private TableColumn<Object, String> seriesTableColumn;

    @FXML
    private TableColumn<Object, String> socketTypeTableColumn;

    @FXML
    private TableColumn<Object, Integer> speedTableColumn;


    @FXML
    private ChoiceBox<String> ComponentChoiceBox;

    private String[] components = {
            "Processor",
            "PowerSupply",
            "Motherboard",
            "Memory",
            "HardDriveDisk"
    };

    @FXML
    private TableView<Object> productTableView;

    /* A függvény feltölti elemekkel a kereső táblázatot */
    @FXML
    void handleRefreshButtonClicked(MouseEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();
        ObservableList<Object> items = FXCollections.observableArrayList();

        /*                           Processor     */
        if (selectedComponent.equals(components[0])) {
            try (ProcessorDAO pDAO = new JpaProcessorDAO();) {
                List<Processor> compList = pDAO.getProcessors("");

                for (var elem : compList) {
                    items.add(elem);
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("brand"));
                frequencyTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("frequency"));
                integratedGPUTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("integratedGPU"));
                modelTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("model"));
                numOfCoresTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("numOfCores"));
                powerTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("power"));
                priceTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("price"));
                seriesTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("series"));
                socketTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("socketType"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[1])) {
            try (PowerSupplyDAO pDAO = new JpaPowerSupplyDAO();) {
                List<PowerSupply> compList = pDAO.getPowerSupplies("");

                for (var elem : compList) {
                    items.add(elem);
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("brand"));
                energyEfficiencyTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("energyEfficiency"));;
                modelTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("model"));
                priceTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("price"));
                seriesTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("series"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[2])) {
            try (MotherboardDAO pDAO = new JpaMotherboardDAO();) {
                List<Motherboard> compList = pDAO.getMotherboards("");

                for (var elem : compList) {
                    items.add(elem);
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("brand"));
                seriesTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("series"));
                modelTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("model"));
                formFactorTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("FormFactor"));
                numOfRAMSocketsTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("numOfRAMSockets"));
                priceTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("price"));
                socketTypeTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("socketType"));

            } catch (Exception e) {
                e.printStackTrace();
            }


        } else if (selectedComponent.equals(components[3])) {
            try (MemoryDAO pDAO = new JpaMemoryDAO();) {
                List<Memory> compList = pDAO.getMemories("");

                for (var elem : compList) {
                    items.add(elem);
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("brand"));
                capacityTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("capacity"));
                frequencyTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("frequency"));
                modelTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("model"));
                numOfModulesTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("numOfModules"));
                numOfRAMSocketsTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Integer>("numOfModules"));
                priceTableColumn.setCellValueFactory(new PropertyValueFactory<Object, Double>("price"));
                seriesTableColumn.setCellValueFactory(new PropertyValueFactory<Object, String>("series"));

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[4])) {

        }

    }

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

        productTableView.getItems().clear();    // más elem kiválasztásakor resetelődjön a tábla

        if (selectedComponent.equals(components[0])) {
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
        } else if (selectedComponent.equals(components[1])) {
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
        } else if (selectedComponent.equals(components[2])) {
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
        } else if (selectedComponent.equals(components[3])) {
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
        } else if (selectedComponent.equals(components[4])) {
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