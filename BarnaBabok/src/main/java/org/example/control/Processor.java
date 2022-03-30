package org.example.control;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Processor {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String series;
    private String model;
    private double frequency;
    private String socketType; // ez lesz kapcsolatban az alaplappal
    private int numOfCores;
    private String integratedGPU;
    private int power;  // ez lesz kapcsolatban a táppal
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
