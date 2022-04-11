package org.example.control;

import javax.persistence.Entity;

@Entity
public class HardDriveDisk extends Componens {

    private int capacity;   // GB
    private int speed;  // RPM

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
        return "HardDriveDisk{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
