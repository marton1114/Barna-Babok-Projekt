package org.example.model;

import java.util.List;

public interface HardDriveDiskDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveHardDriveDisk(HardDriveDisk h);        // C
    public List<Componens> getHardDriveDisks();            // R
    public void updateHardDriveDisk(HardDriveDisk h);      // U
    public void deleteHardDriveDisk(HardDriveDisk h);      // D
}
