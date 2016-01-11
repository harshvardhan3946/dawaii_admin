package com.dawaaii.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;

/**
 * Created by rohit on 10/1/16.
 */
public final class ReadPropertyFileUtility {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReadPropertyFileUtility.class);

    private ReadPropertyFileUtility() {
    }

    public static String readPropertyFromFile(String propKey, String propFile) {
        LOGGER.debug("readPropertyFromFile method is called");
        ResourceBundle rb = ResourceBundle.getBundle(propFile);
        return rb.getString(propKey);
    }
}