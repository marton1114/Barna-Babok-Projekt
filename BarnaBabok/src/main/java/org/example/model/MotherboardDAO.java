package org.example.model;

import java.util.List;

public interface MotherboardDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMotherboard(Motherboard mb);       // C
    public List<Componens> getMotherboards();           // R
    public void updateMotherboard(Motherboard mb);     // U
    public void deleteMotherboard(Motherboard mb);     // D
}