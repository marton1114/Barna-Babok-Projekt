package hu.unideb.inf.model;

import java.util.List;

public interface MemoryDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMemory(Memory m);        // C
    public List<Memory> getMemories();    // R
    public void updateMemory(Memory m);      // U
    public void deleteMemory(Memory m);      // D
}