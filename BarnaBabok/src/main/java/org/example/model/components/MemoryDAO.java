<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/MemoryDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/MemoryDAO.java

import java.util.List;

public interface MemoryDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMemory(Memory m);        // C
    public List<Memory> getMemories();    // R
    public void updateMemory(Memory m);      // U
    public void deleteMemory(Memory m);      // D
}