package hu.unideb.inf.model.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Motherboard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String socketType;  // ez lesz kapcsolatban a processzorral
    private String FormFactor;
    private int numOfRamSockets;
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