package org.example.control;

import javax.persistence.Entity;

@Entity
public class Memory extends Componens {

    private int capacity;   // GB
    private int numOfModules;   // => ha capacity == 16 és numOfModules == 2, akkor 2x8GB
    private double frequency;   // MHz
    private int price;  // $

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumOfModules() {
        return numOfModules;
    }

    public void setNumOfModules(int numOfModules) {
        this.numOfModules = numOfModules;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", numOfModules=" + numOfModules +
                ", frequency=" + frequency +
                ", price=" + price +
                '}';
    }
}
