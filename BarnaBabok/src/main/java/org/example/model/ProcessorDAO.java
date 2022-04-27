package org.example.model;

import java.util.List;

public interface ProcessorDAO extends AutoCloseable {
    
	/** CRUD metódusok **/
    public void saveProcessor(Processor p);        // C
    public List<Processor> getProcessors();        // R
    public void updateProcessor(Processor p);      // U
    public void deleteProcessor(Processor p);      // D
}
