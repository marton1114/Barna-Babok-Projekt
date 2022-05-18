package hu.unideb.inf.model.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private double frequency;
    private String socketType; // ez lesz kapcsolatban az alaplappal
    private int numOfCores;
    private String integratedGPU;
    private int power;  // ez lesz kapcsolatban a táppal
    protected String brand;
    protected String series;
    protected String model;
    protected double price;

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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public int getNumOfCores() {
        return numOfCores;
    }

    public void setNumOfCores(int numOfCores) {
        this.numOfCores = numOfCores;
    }

    public String getIntegratedGPU() {
        return integratedGPU;
    }

    public void setIntegratedGPU(String integratedGPU) {
        this.integratedGPU = integratedGPU;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                ", socketType='" + socketType + '\'' +
                ", numOfCores=" + numOfCores +
                ", integratedGPU='" + integratedGPU + '\'' +
                ", power=" + power +
                ", price=" + price;
    }
}
