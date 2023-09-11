package epam.oksanaomelyanchuk.core;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.Properties;


//import org.apache.log4j.Logger;

//import com.epam.reportportal.*;  log4j.Logger;
// freemarker.log.Logger;
//import org.apache.logging.slf4j.*;

import com.github.dockerjava.api.command.RootFS;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.spi.RootLogger;
import org.apache.logging.log4j.*;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.logging.log4j.core.async.AsyncLoggerConfig;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.config.builder.api.RootLoggerComponentBuilder;
import org.codehaus.groovy.tools.RootLoader;
import org.slf4j.spi.SLF4JServiceProvider.*;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogBuilder;


import epam.oksanaomelyanchuk.enums.LogType ;
import org.slf4j.LoggerFactory;

import javax.swing.*;

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