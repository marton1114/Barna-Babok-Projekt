package hu.unideb.inf.control;

import hu.unideb.inf.control.FilterTools.FilterConditionStringGenerator;
import hu.unideb.inf.control.FilterTools.Search;
import hu.unideb.inf.model.components.*;
import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FXMLSearchPageSceneController implements Initializable {
    static class PCComponentWrapper {
        private Processor processor;
        private PowerSupply powerSupply;
        private Motherboard motherboard;
        private Memory memory;
        private HardDriveDisk hardDriveDisk;

        public Processor getProcessor() {
            return processor;
        }

        public void setProcessor(Processor processor) {
            this.processor = processor;
        }

        public PowerSupply getPowerSupply() {
            return powerSupply;
        }

        public void setPowerSupply(PowerSupply powerSupply) {
            this.powerSupply = powerSupply;
        }

        public Motherboard getMotherboard() {
            return motherboard;
        }

        public void setMotherboard(Motherboard motherboard) {
            this.motherboard = motherboard;
        }

        public Memory getMemory() {
            return memory;
        }

        public void setMemory(Memory memory) {
            this.memory = memory;
        }

        public HardDriveDisk getHardDriveDisk() {
            return hardDriveDisk;
        }

        public void setHardDriveDisk(HardDriveDisk hardDriveDisk) {
            this.hardDriveDisk = hardDriveDisk;
        }

        public PCComponentWrapper(HardDriveDisk hardDriveDisk) {
            this.hardDriveDisk = hardDriveDisk;
        }

        public PCComponentWrapper(Memory memory) {
            this.memory = memory;
        }

        public PCComponentWrapper(Motherboard motherboard) {
            this.motherboard = motherboard;
        }

        public PCComponentWrapper(PowerSupply powerSupply) {
            this.powerSupply = powerSupply;
        }

        public PCComponentWrapper(Processor processor) {
            this.processor = processor;
        }

        public StringProperty getProcessorBrand() {
            return new SimpleStringProperty(processor.getBrand());
        }

        public ObservableValue<Double> getProcessorFrequency() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return processor.getFrequency();
                }
            };
        }

        public StringProperty getProcessorIntegratedGPU() {
            return new SimpleStringProperty(processor.getIntegratedGPU());
        }

        public StringProperty getProcessorModel() {
            return new SimpleStringProperty(processor.getModel());
        }

        public ObservableValue<Integer> getProcessorNumOfCores() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return processor.getNumOfCores();
                }
            };
        }

        public ObservableValue<Integer> getProcessorPower() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return processor.getPower();
                }
            };
        }

        public ObservableValue<Double> getProcessorPrice() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return processor.getPrice();
                }
            };
        }

        public StringProperty getProcessorSeries() {
            return new SimpleStringProperty(processor.getSeries());
        }

        public StringProperty getProcessorSocketType() {
            return new SimpleStringProperty(processor.getSocketType());
        }

        public StringProperty getPowerSupplyBrand() {
            return new SimpleStringProperty(powerSupply.getBrand());
        }

        public StringProperty getPowerSupplyEnergyEfficiency() {
            return new SimpleStringProperty(powerSupply.getEnergyEfficiency());
        }

        public StringProperty getPowerSupplyModel() {
            return new SimpleStringProperty(powerSupply.getModel());
        }

        public ObservableValue<Double> getPowerSupplyPrice() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return powerSupply.getPrice();
                }
            };
        }

        public StringProperty getPowerSupplySeries() {
            return new SimpleStringProperty(powerSupply.getSeries());
        }

        public StringProperty getMotherboardBrand() {
            return new SimpleStringProperty(motherboard.getBrand());
        }

        public StringProperty getMotherboardSeries() {
            return new SimpleStringProperty(motherboard.getSeries());
        }

        public StringProperty getMotherboardModel() {
            return new SimpleStringProperty(motherboard.getModel());
        }

        public StringProperty getMotherboardFormFactor() {
            return new SimpleStringProperty(motherboard.getFormFactor());
        }

        public ObservableValue<Integer> getMotherboardNumOfRAMSockets() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return motherboard.getNumOfRamSockets();
                }
            };
        }

        public ObservableValue<Double> getMotherboardPrice() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return motherboard.getPrice();
                }
            };
        }

        public StringProperty getMotherboardSocketType() {
            return new SimpleStringProperty(motherboard.getSocketType());
        }

        public StringProperty getMemoryBrand() {
            return new SimpleStringProperty(memory.getBrand());
        }

        public ObservableValue<Integer> getMemoryCapacity() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return memory.getCapacity();
                }
            };
        }

        public ObservableValue<Double> getMemoryFrequency() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return memory.getFrequency();
                }
            };
        }

        public StringProperty getMemoryModel() {
            return new SimpleStringProperty(memory.getModel());
        }

        public ObservableValue<Integer> getMemoryNumOfModules() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return memory.getNumOfModules();
                }
            };
        }

        public ObservableValue<Double> getMemoryPrice() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return memory.getPrice();
                }
            };
        }

        public StringProperty getMemorySeries() {
            return new SimpleStringProperty(memory.getSeries());
        }

        public StringProperty getHardDriveDiskBrand() {
            return new SimpleStringProperty(hardDriveDisk.getBrand());
        }

        public ObservableValue<Integer> getHardDriveDiskCapacity() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return hardDriveDisk.getCapacity();
                }
            };
        }

        public StringProperty getHardDriveDiskModel() {
            return new SimpleStringProperty(hardDriveDisk.getModel());
        }

        public ObservableValue<Double> getHardDriveDiskPrice() {
            return new ObservableValueBase<Double>() {
                @Override
                public Double getValue() {
                    return hardDriveDisk.getPrice();
                }
            };
        }

        public StringProperty getHardDriveDiskSeries() {
            return new SimpleStringProperty(hardDriveDisk.getSeries());
        }

        public ObservableValue<Integer> getHardDriveDiskSpeed() {
            return new ObservableValueBase<Integer>() {
                @Override
                public Integer getValue() {
                    return hardDriveDisk.getSpeed();
                }
            };
        }
    }

    // Kereső
    @FXML
    private TextField keywordTextField;

    // Maximális ár slider
    @FXML
    private Slider MaxPriceSlider;

    // Maximális ár sliderjéhez tartózó indikátor cimke
    @FXML
    private Label MaxPriceLabel;

    // Choicebox a keresendő elemhez
    @FXML
    private ChoiceBox<String> ComponentChoiceBox;

    private String[] components = {
            "Processor",
            "PowerSupply",
            "Motherboard",
            "Memory",
            "HardDriveDisk"
    };

    // Keresőfelület elemeinek a deklarációi
    @FXML
    private TableView<PCComponentWrapper> productTableView;

    @FXML
    private TableColumn<PCComponentWrapper, String> brandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> capacityTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> energyEfficiencyTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> formFactorTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> frequencyTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> integratedGPUTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> modelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> numOfCoresTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> numOfModulesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> numOfRAMSocketsTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> powerTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> priceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> seriesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> socketTypeTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> speedTableColumn;

    // Aktuális konfiguráció menüpont elemeinek a deklarációi
    @FXML
    private TableView<PCComponentWrapper> actualProcessorTable;

    @FXML
    private TableColumn<PCComponentWrapper, String> processorBrandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> processorFrequencyTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> processorIntegratedGPUTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> processorModelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> processorNumOfCoresTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> processorPowerTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> processorPriceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> processorSeriesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> processorSocketTypeTableColumn;


    @FXML
    private TableView<PCComponentWrapper> actualPowerSupplyTable;

    @FXML
    private TableColumn<PCComponentWrapper, String> powerSupplyBrandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> powerSupplyEnergyEfficiencyTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> powerSupplyModelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> powerSupplyPriceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> powerSupplySeriesTableColumn;


    @FXML
    private TableView<PCComponentWrapper> actualMotherboardTable;

    @FXML
    private TableColumn<PCComponentWrapper, String> motherboardBrandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> motherboardFormFactorTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> motherboardModelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> motherboardNumOfRAMSocketsTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> motherboardPriceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> motherboardSeriesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> motherboardSocketTypeTableColumn;


    @FXML
    private TableView<PCComponentWrapper> actualMemoryTable;

    @FXML
    private TableColumn<PCComponentWrapper, String> memoryBrandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> memoryCapacityTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> memoryFrequencyTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> memoryModelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> memoryNumOfModulesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> memoryPriceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> memorySeriesTableColumn;


    @FXML
    private TableView<PCComponentWrapper> actualHardDriveDiskTable;

    @FXML
    private TableColumn<PCComponentWrapper, String> hardDriveDiskBrandTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> hardDriveDiskCapacityTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> hardDriveDiskModelTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Double> hardDriveDiskPriceTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, String> hardDriveDiskSeriesTableColumn;

    @FXML
    private TableColumn<PCComponentWrapper, Integer> hardDriveDiskSpeedTableColumn;

    // Aktuális konfig alkatrészeinek a törlésére szolgáló gombok
    @FXML
    private Button deleteActualHardDriveDiskButton;

    @FXML
    private Button deleteActualMemoryButton;

    @FXML
    private Button deleteActualMotherboardButton;

    @FXML
    private Button deleteActualPowerSupplyButton;

    @FXML
    private Button deleteActualProcessorButton;

    // Aktuális konfig alkatrészeinek a figyelmeztető üzenetei
    @FXML
    private Label actualProcessorWarningLabel;

    @FXML
    private Label actualPowerSupplyWarningLabel;

    @FXML
    private Label actualMotherboardWarningLabel;

    @FXML
    private Label actualMemoryWarningLabel;

    @FXML
    private Label actualHardDriveDiskWarningLabel;

    // tab
    @FXML
    private TabPane tabPane;

    public void setSelectedTabPaneTab(int i) {
        tabPane.getSelectionModel().select(i);
    }

    @FXML
    void handleAddComponentButtonClicked(MouseEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();   // checkbox-ban kiválasztott komponenst jelöli

        ObservableList<PCComponentWrapper> items = FXCollections.observableArrayList();

        if (selectedComponent.equals(components[0])) {
            actualProcessorTable.setVisible(true);
            deleteActualProcessorButton.setDisable(false);
            deleteActualProcessorButton.setVisible(true);
            actualProcessorWarningLabel.setVisible(false);

            items.add(productTableView.getSelectionModel().getSelectedItem());

            actualProcessorTable.setItems(items);

            processorBrandTableColumn.setCellValueFactory(e -> e.getValue().getProcessorBrand());
            processorFrequencyTableColumn.setCellValueFactory(e -> e.getValue().getProcessorFrequency());
            processorIntegratedGPUTableColumn.setCellValueFactory(e -> e.getValue().getProcessorIntegratedGPU());
            processorModelTableColumn.setCellValueFactory(e -> e.getValue().getProcessorModel());
            processorNumOfCoresTableColumn.setCellValueFactory(e -> e.getValue().getProcessorNumOfCores());
            processorPowerTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPower());
            processorPriceTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPrice());
            processorSeriesTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSeries());
            processorSocketTypeTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSocketType());
        } else if (selectedComponent.equals(components[1])) {
            actualPowerSupplyTable.setVisible(true);
            deleteActualPowerSupplyButton.setDisable(false);
            deleteActualPowerSupplyButton.setVisible(true);
            actualPowerSupplyWarningLabel.setVisible(false);

            items.add(productTableView.getSelectionModel().getSelectedItem());

            actualPowerSupplyTable.setItems(items);

            powerSupplyBrandTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyBrand());
            powerSupplyEnergyEfficiencyTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyEnergyEfficiency());
            powerSupplyModelTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyModel());
            powerSupplyPriceTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyPrice());
            powerSupplySeriesTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplySeries());
        } else if (selectedComponent.equals(components[2])) {
            actualMotherboardTable.setVisible(true);
            deleteActualMotherboardButton.setDisable(false);
            deleteActualMotherboardButton.setVisible(true);
            actualMotherboardWarningLabel.setVisible(false);

            items.add(productTableView.getSelectionModel().getSelectedItem());

            actualMotherboardTable.setItems(items);

            motherboardBrandTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardBrand());
            motherboardSeriesTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardSeries());
            motherboardModelTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardModel());
            motherboardFormFactorTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardFormFactor());
            motherboardNumOfRAMSocketsTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardNumOfRAMSockets());
            motherboardPriceTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardPrice());
            motherboardSocketTypeTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardSocketType());

        } else if (selectedComponent.equals(components[3])) {
            actualMemoryTable.setVisible(true);
            deleteActualMemoryButton.setDisable(false);
            deleteActualMemoryButton.setVisible(true);
            actualMemoryWarningLabel.setVisible(false);

            items.add(productTableView.getSelectionModel().getSelectedItem());

            actualMemoryTable.setItems(items);



            memoryBrandTableColumn.setCellValueFactory(e -> e.getValue().getMemoryBrand());
            memoryCapacityTableColumn.setCellValueFactory(e -> e.getValue().getMemoryCapacity());
            memoryFrequencyTableColumn.setCellValueFactory(e -> e.getValue().getMemoryFrequency());
            memoryModelTableColumn.setCellValueFactory(e -> e.getValue().getMemoryModel());
            memoryNumOfModulesTableColumn.setCellValueFactory(e -> e.getValue().getMemoryNumOfModules());
            memoryPriceTableColumn.setCellValueFactory(e -> e.getValue().getMemoryPrice());
            memorySeriesTableColumn.setCellValueFactory(e -> e.getValue().getMemorySeries());

        } else if (selectedComponent.equals(components[4])) {
            actualHardDriveDiskTable.setVisible(true);
            deleteActualHardDriveDiskButton.setDisable(false);
            deleteActualHardDriveDiskButton.setVisible(true);
            actualHardDriveDiskWarningLabel.setVisible(false);

            items.add(productTableView.getSelectionModel().getSelectedItem());

            actualHardDriveDiskTable.setItems(items);

            hardDriveDiskBrandTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskBrand());
            hardDriveDiskCapacityTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskCapacity());
            hardDriveDiskModelTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskModel());
            hardDriveDiskPriceTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskPrice());
            hardDriveDiskSeriesTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskSeries());
            hardDriveDiskSpeedTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskSpeed());
        }

    }

    @FXML
    void handleDeleteActualProcessorButtonClicked(MouseEvent event) {
        actualProcessorTable.getItems().remove(actualProcessorTable.getItems().get(0));
        actualProcessorTable.setVisible(false);
        deleteActualProcessorButton.setDisable(true);
        deleteActualProcessorButton.setVisible(false);
        actualProcessorWarningLabel.setVisible(true);
    }

    @FXML
    void handleDeleteActualPowerSupplyButtonClicked(MouseEvent event) {
        actualPowerSupplyTable.getItems().remove(actualPowerSupplyTable.getItems().get(0));
        actualPowerSupplyTable.setVisible(false);
        deleteActualPowerSupplyButton.setDisable(true);
        deleteActualPowerSupplyButton.setVisible(false);
        actualPowerSupplyWarningLabel.setVisible(true);
    }

    @FXML
    void handleDeleteActualMotherboardButtonClicked(MouseEvent event) {
        actualMotherboardTable.getItems().remove(actualMotherboardTable.getItems().get(0));
        actualMotherboardTable.setVisible(false);
        deleteActualMotherboardButton.setDisable(true);
        deleteActualMotherboardButton.setVisible(false);
        actualMotherboardWarningLabel.setVisible(true);
    }

    @FXML
    void handleDeleteActualMemoryButtonClicked(MouseEvent event) {
        actualMemoryTable.getItems().remove(actualMemoryTable.getItems().get(0));
        actualMemoryTable.setVisible(false);
        deleteActualMemoryButton.setDisable(true);
        deleteActualMemoryButton.setVisible(false);
        actualMemoryWarningLabel.setVisible(true);
    }

    @FXML
    void handleDeleteActualHardDriveDiskButtonClicked(MouseEvent event) {
        actualHardDriveDiskTable.getItems().remove(actualHardDriveDiskTable.getItems().get(0));
        actualHardDriveDiskTable.setVisible(false);
        deleteActualHardDriveDiskButton.setDisable(true);
        deleteActualHardDriveDiskButton.setVisible(false);
        actualHardDriveDiskWarningLabel.setVisible(true);
    }

    /* A függvény feltölti elemekkel a kereső táblázatot */
    @FXML
    void handleRefreshButtonClicked(MouseEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();

        ObservableList<PCComponentWrapper> items = FXCollections.observableArrayList();

        if (selectedComponent.equals(components[0])) {
            try (ProcessorDAO pDAO = new JpaProcessorDAO();) {
                String conditions = " where ";

                conditions += FilterConditionStringGenerator.generateConditionsMaxSlider(MaxPriceSlider);
                if (! actualMotherboardTable.getItems().isEmpty()) {
                    conditions += " and ";
                    conditions += FilterConditionStringGenerator.generateConditionsSocketType(actualMotherboardTable.getItems().get(0).getMotherboardSocketType().get());
                }

                List<Processor> compList = pDAO.getProcessors(conditions);

                for (var elem : compList) {
                    String bsm = elem.getBrand() + elem.getSeries() + elem.getModel();
                    if (Search.contains(bsm, keywordTextField.getText()))
                        items.add(new PCComponentWrapper(elem));
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(e -> e.getValue().getProcessorBrand());
                frequencyTableColumn.setCellValueFactory(e -> e.getValue().getProcessorFrequency());
                integratedGPUTableColumn.setCellValueFactory(e -> e.getValue().getProcessorIntegratedGPU());
                modelTableColumn.setCellValueFactory(e -> e.getValue().getProcessorModel());
                numOfCoresTableColumn.setCellValueFactory(e -> e.getValue().getProcessorNumOfCores());
                powerTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPower());
                priceTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPrice());
                seriesTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSeries());
                socketTypeTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSocketType());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[1])) {
            try (PowerSupplyDAO pDAO = new JpaPowerSupplyDAO();) {
                String conditions = " where ";
                conditions += FilterConditionStringGenerator.generateConditionsMaxSlider(MaxPriceSlider);

                List<PowerSupply> compList = pDAO.getPowerSupplies(conditions);

                for (var elem : compList) {
                    String bsm = elem.getBrand() + elem.getSeries() + elem.getModel();
                    if (Search.contains(bsm, keywordTextField.getText()))
                        items.add(new PCComponentWrapper(elem));
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyBrand());
                energyEfficiencyTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyEnergyEfficiency());
                modelTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyModel());
                priceTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplyPrice());
                seriesTableColumn.setCellValueFactory(e -> e.getValue().getPowerSupplySeries());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[2])) {
            try (MotherboardDAO pDAO = new JpaMotherboardDAO();) {
                String conditions = " where ";

                conditions += FilterConditionStringGenerator.generateConditionsMaxSlider(MaxPriceSlider);
                if (! actualProcessorTable.getItems().isEmpty()) {
                    conditions += " and ";
                    conditions += FilterConditionStringGenerator.generateConditionsSocketType(actualProcessorTable.getItems().get(0).getProcessorSocketType().get());
                }
                if (! actualMemoryTable.getItems().isEmpty()) {
                    conditions += " and ";
                    conditions += FilterConditionStringGenerator.generateConditionsNumOfRAMSockets(actualMemoryTable.getItems().get(0).getMemoryNumOfModules().getValue());
                }

                List<Motherboard> compList = pDAO.getMotherboards(conditions);

                for (var elem : compList) {
                    String bsm = elem.getBrand() + elem.getSeries() + elem.getModel();
                    if (Search.contains(bsm, keywordTextField.getText()))
                        items.add(new PCComponentWrapper(elem));
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardBrand());
                seriesTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardSeries());
                modelTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardModel());
                formFactorTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardFormFactor());
                numOfRAMSocketsTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardNumOfRAMSockets());
                priceTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardPrice());
                socketTypeTableColumn.setCellValueFactory(e -> e.getValue().getMotherboardSocketType());

            } catch (Exception e) {
                e.printStackTrace();
            }


        } else if (selectedComponent.equals(components[3])) {
            try (MemoryDAO pDAO = new JpaMemoryDAO();) {
                String conditions = " where ";
                conditions += FilterConditionStringGenerator.generateConditionsMaxSlider(MaxPriceSlider);
                if (! actualMotherboardTable.getItems().isEmpty()) {
                    conditions += " and ";
                    conditions += FilterConditionStringGenerator.generateConditionsNumOfModules(actualMotherboardTable.getItems().get(0).getMotherboardNumOfRAMSockets().getValue());
                }

                List<Memory> compList = pDAO.getMemories(conditions);

                for (var elem : compList) {
                    String bsm = elem.getBrand() + elem.getSeries() + elem.getModel();
                    if (Search.contains(bsm, keywordTextField.getText()))
                        items.add(new PCComponentWrapper(elem));
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(e -> e.getValue().getMemoryBrand());
                capacityTableColumn.setCellValueFactory(e -> e.getValue().getMemoryCapacity());
                frequencyTableColumn.setCellValueFactory(e -> e.getValue().getMemoryFrequency());
                modelTableColumn.setCellValueFactory(e -> e.getValue().getMemoryModel());
                numOfModulesTableColumn.setCellValueFactory(e -> e.getValue().getMemoryNumOfModules());
                priceTableColumn.setCellValueFactory(e -> e.getValue().getMemoryPrice());
                seriesTableColumn.setCellValueFactory(e -> e.getValue().getMemorySeries());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (selectedComponent.equals(components[4])) {
            try (HardDriveDiskDAO pDAO = new JpaHardDriveDiskDAO();) {
                String conditions = " where ";
                conditions += FilterConditionStringGenerator.generateConditionsMaxSlider(MaxPriceSlider);

                List<HardDriveDisk> compList = pDAO.getHardDriveDisks(conditions);

                for (var elem : compList) {
                    String bsm = elem.getBrand() + elem.getSeries() + elem.getModel();
                    if (Search.contains(bsm, keywordTextField.getText()))
                        items.add(new PCComponentWrapper(elem));
                }

                productTableView.setItems(items);

                brandTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskBrand());
                capacityTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskCapacity());
                modelTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskModel());
                priceTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskPrice());
                seriesTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskSeries());
                speedTableColumn.setCellValueFactory(e -> e.getValue().getHardDriveDiskSpeed());

            } catch (Exception e) {
                e.printStackTrace();
            }
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
            numOfRAMSocketsTableColumn.setVisible(false);
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