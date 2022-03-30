package org.example.control;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Motherboard {
    @Id
    @GeneratedValue
    private Integer id;
    private String brand;
    private String series;
    private String model;
    private String socketType;  // ez lesz kapcsolatban a processzorral
    private String FormFactor;
    private int numOfRamSockets;
    private int price;

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

    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public String getFormFactor() {
        return FormFactor;
    }

    public void setFormFactor(String formFactor) {
        FormFactor = formFactor;
    }

    public int getNumOfRamSockets() {
        return numOfRamSockets;
    }

    public void setNumOfRamSockets(int numOfRamSockets) {
        this.numOfRamSockets = numOfRamSockets;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", socketType='" + socketType + '\'' +
                ", FormFactor='" + FormFactor + '\'' +
                ", numOfRamSockets=" + numOfRamSockets +
                ", price=" + price +
                '}';
    }
}
