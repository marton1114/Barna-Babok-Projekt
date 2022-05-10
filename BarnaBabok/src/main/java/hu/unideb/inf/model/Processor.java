package hu.unideb.inf.model;

import javax.persistence.Entity;

@Entity
public class Processor extends Componens {

    private double frequency;
    private String socketType; // ez lesz kapcsolatban az alaplappal
    private int numOfCores;
    private String integratedGPU;
    private int power;  // ez lesz kapcsolatban a táppal

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
        return "Processor{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                ", socketType='" + socketType + '\'' +
                ", numOfCores=" + numOfCores +
                ", integratedGPU='" + integratedGPU + '\'' +
                ", power=" + power +
                ", price=" + price +
                '}';
    }
}
