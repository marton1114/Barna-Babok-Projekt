package hu.unideb.inf.model;

import java.util.List;

public interface MotherboardDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMotherboard(Motherboard mb);       // C
    public List<Motherboard> getMotherboards();           // R
    public void updateMotherboard(Motherboard mb);     // U
    public void deleteMotherboard(Motherboard mb);     // D
}