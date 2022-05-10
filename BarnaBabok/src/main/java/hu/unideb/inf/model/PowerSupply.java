package hu.unideb.inf.model;

import javax.persistence.Entity;

@Entity
public class PowerSupply extends Componens {

    private String energyEfficiency;

    public String getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(String energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", series='" + series + '\'' +
                ", model='" + model + '\'' +
                ", energyEfficiency='" + energyEfficiency + '\'' +
                ", price=" + price +
                '}';
    }
}
