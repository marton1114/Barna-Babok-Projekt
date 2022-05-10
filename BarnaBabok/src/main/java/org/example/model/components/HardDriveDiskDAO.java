<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/HardDriveDiskDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/HardDriveDiskDAO.java

import java.util.List;

public interface HardDriveDiskDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveHardDriveDisk(HardDriveDisk h);        // C
    public List<HardDriveDisk> getHardDriveDisks();        // R
    public void updateHardDriveDisk(HardDriveDisk h);      // U
    public void deleteHardDriveDisk(HardDriveDisk h);      // D
}
