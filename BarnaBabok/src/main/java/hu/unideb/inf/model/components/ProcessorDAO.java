package hu.unideb.inf.model.components;

import java.util.List;

public interface ProcessorDAO extends AutoCloseable {
    
	/** CRUD metódusok **/
    public void saveProcessor(Processor p);        				// C
    public List<Processor> getProcessors(String conditions);	// R + filtering
    public void updateProcessor(Processor p);      				// U
    public void deleteProcessor(Processor p);      				// D
}
