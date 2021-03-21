package org.automation.junit5.core;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogProcessor implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
        Logger logger = LoggerFactory.getLogger(testInstance.getClass());
        logger.getClass().getMethod("setLogger", Logger.class).invoke(testInstance,logger);
    }
}
