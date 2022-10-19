package org.automation.junit5.reporting;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLoggerProcessor implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object o, ExtensionContext extensionContext) throws Exception {
        Logger logger = LoggerFactory.getLogger(o.getClass());
        logger.getClass().getMethod("setLogger", Logger.class).invoke(o,logger);
    }
}
