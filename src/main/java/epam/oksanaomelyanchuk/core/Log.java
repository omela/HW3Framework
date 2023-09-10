package epam.oksanaomelyanchuk.core;

import org.apache.logging.log4j.*;
import epam.oksanaomelyanchuk.enums.LogType ;

public class Log {
    private static Logger logger = null;

    public static Logger setName(String name) {
        logger =LogManager.getLogger(String.format("%s", name));

        return logger;
    }

    public static Logger getLogger() {
        if(logger != null) {
            return logger;
        } else {
            logger = setName("default test");
            return logger;
        }

    }
    public static void log(String message) {
        getLogger().info(message);
    }
    public static void log(String message, LogType type) {
        switch(type) {
            case INFO:
                getLogger().info(message);
                break;
            case ERROR:
                getLogger().error(message);
                break;
            case WARNING:
                getLogger().warn(message);
                break;
        }
    }
}