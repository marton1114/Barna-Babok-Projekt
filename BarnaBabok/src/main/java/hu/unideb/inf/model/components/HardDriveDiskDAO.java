package hu.unideb.inf.model.components;

import java.util.List;

public interface HardDriveDiskDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveHardDriveDisk(HardDriveDisk h);        // C
    public List<HardDriveDisk> getHardDriveDisks();        // R
    public void updateHardDriveDisk(HardDriveDisk h);      // U
    public void deleteHardDriveDisk(HardDriveDisk h);      // D
}
