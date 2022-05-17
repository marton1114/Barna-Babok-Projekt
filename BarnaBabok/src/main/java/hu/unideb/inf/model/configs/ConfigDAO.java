package hu.unideb.inf.model.configs;

import hu.unideb.inf.model.components.Processor;

import java.util.List;

public interface ConfigDAO extends AutoCloseable {
    /** CRUD metódusok **/
    public void saveConfig(Config c);        				// C
    public List<Config> getConfigs();	                    // R
    public void updateConfig(Config c);      				// U
    public void deleteConfig(Config c);      				// D
}
