package epam.oksanaomelyanchuk.utils;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Propertiator {
    static final String path = "config.properties";

    public static String getPropertie (String name) {

        PropertiesConfiguration properties = null;

        try {
            properties = new PropertiesConfiguration(path);
        } catch (ConfigurationException e) {
            e.printStackTrace();
            return getPropertie("Chrome");
        }
        return properties.getProperty(name).toString();
    }

}
