package hu.unideb.inf.model.components;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HardDriveDisk {

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
    private int capacity;   // GB
    private int speed;  // RPM
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Gyártó: " + brand + '\n' +
                "Sorozat: " + series + '\n' +
                "Modell: " + model + '\n' +
                "Kapacitás: " + capacity + '\n' +
                "Fordulatszám: " + speed + '\n' +
                "Ár: " + price;
    }
}
