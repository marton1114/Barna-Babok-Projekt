package hu.unideb.inf.control;

import hu.unideb.inf.control.FilterTools.FilterConditionStringGenerator;
import hu.unideb.inf.control.FilterTools.Search;
import hu.unideb.inf.model.components.*;
import hu.unideb.inf.model.configs.ActualConfig;
import hu.unideb.inf.model.configs.ActualConfigDAO;
import hu.unideb.inf.model.configs.JPAActualConfigDAO;
import javafx.beans.property.*;
import javafx.beans.value.ObservableListValue;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
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

    /****************Actual Config Table******************************/
    @FXML
    private TableColumn<ActualConfig, String> ActualConfigHardDriveDiskTableColumn;

    @FXML
    private TableColumn<ActualConfig, String> ActualConfigMemoryTableColumn;

    @FXML
    private TableColumn<ActualConfig, String> ActualConfigMotherboardTableColumn;

    @FXML
    private TableColumn<ActualConfig, String> ActualConfigNameTableColumn;

    @FXML
    private TableColumn<ActualConfig, String> ActualConfigPowerSupplyTableColumn;

    @FXML
    private TableColumn<ActualConfig, String> ActualConfigProcessorTableColumn;

    @FXML
    private TableColumn<ActualConfig, Double> ActualConfigPriceTableColumn;

    @FXML
    private TableView<ActualConfig> ActualConfigTableView;
    /****************************************************************/
    @FXML
    private TextField keywordTextField;

    @FXML
    private Slider MaxPriceSlider;

    @FXML
    private Label MaxPriceLabel;

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

    @FXML
    private ChoiceBox<String> ComponentChoiceBox;

    @FXML
    private TableView<PCComponentWrapper> productTableView;

    @FXML
    private TableView<PCComponentWrapper> ActualProcessorTable;

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

    private String[] components = {
            "Processor",
            "PowerSupply",
            "Motherboard",
            "Memory",
            "HardDriveDisk"
    };

    @FXML
    void handleAddComponentButtonClicked(MouseEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();   // checkbox-ban kiválasztott komponenst jelöli

        ObservableList<PCComponentWrapper> items = FXCollections.observableArrayList();

        if (selectedComponent.equals(components[0])) {
            items.add(productTableView.getSelectionModel().getSelectedItem());
        }
        ActualProcessorTable.setItems(items);

        processorBrandTableColumn.setCellValueFactory(e -> e.getValue().getProcessorBrand());
        processorFrequencyTableColumn.setCellValueFactory(e -> e.getValue().getProcessorFrequency());
        processorIntegratedGPUTableColumn.setCellValueFactory(e -> e.getValue().getProcessorIntegratedGPU());
        processorModelTableColumn.setCellValueFactory(e -> e.getValue().getProcessorModel());
        processorNumOfCoresTableColumn.setCellValueFactory(e -> e.getValue().getProcessorNumOfCores());
        processorPowerTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPower());
        processorPriceTableColumn.setCellValueFactory(e -> e.getValue().getProcessorPrice());
        processorSeriesTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSeries());
        processorSocketTypeTableColumn.setCellValueFactory(e -> e.getValue().getProcessorSocketType());
    }

    @FXML
    void handleDeleteComponentButtonClicked(MouseEvent event) {
        // komponens törlése az aktuális config tabról
    }

    /* A függvény feltölti elemekkel a kereső táblázatot */
    @FXML
    void handleRefreshButtonClicked(MouseEvent event) {
        String selectedComponent = ComponentChoiceBox.getValue();

        ObservableList<PCComponentWrapper> items = FXCollections.observableArrayList();

        if (selectedComponent.equals(components[0])) {
            try (ProcessorDAO pDAO = new JpaProcessorDAO();) {
                String conditions = FilterConditionStringGenerator.generateConditions(MaxPriceSlider);
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
                String conditions = FilterConditionStringGenerator.generateConditions(MaxPriceSlider);
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
                String conditions = FilterConditionStringGenerator.generateConditions(MaxPriceSlider);
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
                String conditions = FilterConditionStringGenerator.generateConditions(MaxPriceSlider);
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
                String conditions = FilterConditionStringGenerator.generateConditions(MaxPriceSlider);
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