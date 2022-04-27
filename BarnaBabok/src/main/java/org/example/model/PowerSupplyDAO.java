package org.example.model;

import java.util.List;

public interface PowerSupplyDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void savePowerSupply(PowerSupply ps);       // C
    public List<PowerSupply> getPowerSupplies();           // R
    public void updatePowerSupply(PowerSupply ps);     // U
    public void deletePowerSupply(PowerSupply ps);     // D
}