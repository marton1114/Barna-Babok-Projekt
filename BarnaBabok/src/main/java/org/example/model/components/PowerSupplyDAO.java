<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/PowerSupplyDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/PowerSupplyDAO.java

import java.util.List;

public interface PowerSupplyDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void savePowerSupply(PowerSupply ps);       // C
    public List<PowerSupply> getPowerSupplies();           // R
    public void updatePowerSupply(PowerSupply ps);     // U
    public void deletePowerSupply(PowerSupply ps);     // D
}