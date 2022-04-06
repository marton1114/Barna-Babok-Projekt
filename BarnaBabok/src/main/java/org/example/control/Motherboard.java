package org.example.control;

import javax.persistence.Entity;

@Entity
public class Motherboard extends Componens {

    private String socketType;  // ez lesz kapcsolatban a processzorral
    private String FormFactor;
    private int numOfRamSockets;

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
