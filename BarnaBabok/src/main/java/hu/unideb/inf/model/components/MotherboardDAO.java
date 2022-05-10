<<<<<<< HEAD
package hu.unideb.inf.model.components;
=======
<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/MotherboardDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/MotherboardDAO.java
>>>>>>> dev_marci

import java.util.List;

public interface MotherboardDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMotherboard(Motherboard mb);       // C
    public List<Motherboard> getMotherboards();           // R
    public void updateMotherboard(Motherboard mb);     // U
    public void deleteMotherboard(Motherboard mb);     // D
}