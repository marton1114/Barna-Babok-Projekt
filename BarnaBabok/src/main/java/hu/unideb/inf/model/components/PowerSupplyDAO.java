package hu.unideb.inf.model.components;

import java.util.List;

public interface PowerSupplyDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void savePowerSupply(PowerSupply ps);       // C
    public List<PowerSupply> getPowerSupplies(String conditions);           // R
    public void updatePowerSupply(PowerSupply ps);     // U
    public void deletePowerSupply(PowerSupply ps);     // D
}