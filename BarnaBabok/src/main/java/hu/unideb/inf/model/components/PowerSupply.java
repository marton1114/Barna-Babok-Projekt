package hu.unideb.inf.model.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PowerSupply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    protected String brand;
    protected String series;
    protected String model;
    private int power;
    private String energyEfficiency;
    protected double price;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(String energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public String toString() {
        return "Gyártó: " + brand + '\n' +
                "Sorozat: " + series + '\n' +
                "Modell: " + model + '\n' +
                "Effektivitás: " + energyEfficiency + '\n' +
                "Ár: " + price;
    }
}
