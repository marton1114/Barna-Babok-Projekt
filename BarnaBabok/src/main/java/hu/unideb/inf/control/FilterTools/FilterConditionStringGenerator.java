package hu.unideb.inf.control.FilterTools;

import javafx.scene.control.Slider;

public class FilterConditionStringGenerator {
    public static String generateConditionsMaxSlider(Slider MaxPriceSlider) {
        return "price <= " + MaxPriceSlider.getValue();
    }

    public static String generateConditionsSocketType(String socketType) {
        return "socketType = '" + socketType + "'";
    }

    public static String generateConditionsNumOfRAMSockets(int numOfModules) {
        return "numOfRAMSockets >= " + numOfModules;
    }

    public static String generateConditionsNumOfModules(int numOfRAMSockets) {
        return "numOfModules <= " + numOfRAMSockets;
    }
}
