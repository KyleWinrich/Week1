package com.example.helloworld;
import org.apache.log4j.*;

/**
 * Created by Student on 1/27/2016.
 */
public class LoggingExample {

    private org.apache.log4j.Logger log = Logger.getLogger(this.getClass());

    public LoggingExample() {
        log.trace("Trace message");
        log.debug("Debug Message");
        log.info("Info message");
        log.warn("Warn message");
        log.error("Error message");
        log.fatal("Fatal message");
    }
}
