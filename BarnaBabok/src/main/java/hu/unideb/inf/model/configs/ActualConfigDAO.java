package hu.unideb.inf.model.configs;

import java.util.List;

public interface ActualConfigDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveActualConfig(Config c);        				// C
    public List<Config> getActualConfigs();	                    // R
    public void updateActualConfig(Config c);      				// U
    public void deleteActualConfig(Config c);      				// D
}
