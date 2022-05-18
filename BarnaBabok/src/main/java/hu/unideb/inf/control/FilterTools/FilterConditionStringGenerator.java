package hu.unideb.inf.control.FilterTools;

import javafx.scene.control.Slider;

public class FilterConditionStringGenerator {
    public static String generateConditions(Slider MaxPriceSlider) {
        return "price <= " + MaxPriceSlider.getValue();
    }

    public static String generateConditions(String socketType) {
        return "socketType = '" + socketType + "'";
    }

    public static String generateConditions(int numOfRAMSockets) {
        return "numOfRAMSockets >= " + numOfRAMSockets;
    }
}
