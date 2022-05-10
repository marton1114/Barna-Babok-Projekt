<<<<<<< HEAD
package hu.unideb.inf.model.components;
=======
<<<<<<<< HEAD:BarnaBabok/src/main/java/hu/unideb/inf/model/components/ProcessorDAO.java
package hu.unideb.inf.model.components;
========
package org.example.model.components;
>>>>>>>> c8f865d964484e97083b3607f4faa8077bb9ceea:BarnaBabok/src/main/java/org/example/model/components/ProcessorDAO.java
>>>>>>> dev_marci

import java.util.List;

public interface ProcessorDAO extends AutoCloseable {
    
	/** CRUD metódusok **/
    public void saveProcessor(Processor p);        				// C
    public List<Processor> getProcessors(String conditions);	// R + filtering
    public void updateProcessor(Processor p);      				// U
    public void deleteProcessor(Processor p);      				// D
}
