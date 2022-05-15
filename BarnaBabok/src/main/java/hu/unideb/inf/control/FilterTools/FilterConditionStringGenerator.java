package hu.unideb.inf.control.FilterTools;

import javafx.scene.control.Slider;

public class FilterConditionStringGenerator {
    public static String generateConditions(Slider MaxPriceSlider) {
        return " where price <= " + MaxPriceSlider.getValue();
    }
}
