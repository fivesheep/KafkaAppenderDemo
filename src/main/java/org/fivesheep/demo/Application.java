package org.fivesheep.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by young on 11/22/16.
 */
public class Application {
    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info(Application.class.getName());
        LOGGER.info("Hello World");
        LOGGER.info("More logs");

    }
}
