package hu.unideb.inf.model.configs;

import java.util.List;

public interface ActualConfigDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveActualConfig(ActualConfig c);        				// C
    public List<ActualConfig> getActualConfigs();	                    // R
    public void updateActualConfig(ActualConfig c);      				// U
    public void deleteActualConfig(ActualConfig c);      				// D
}
