package org.example.model;

import java.util.List;

public interface MemoryDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMemory(Memory m);        // C
    public List<Componens> getMemories();    // R
    public void updateMemory(Memory m);      // U
    public void deleteMemory(Memory m);      // D
}