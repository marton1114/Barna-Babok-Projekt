package hu.unideb.inf.model.components;

import java.util.List;

public interface MemoryDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveMemory(Memory m);        // C
    public List<Memory> getMemories(String conditions);    // R
    public void updateMemory(Memory m);      // U
    public void deleteMemory(Memory m);      // D
}