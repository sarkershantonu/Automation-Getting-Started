package org.automation.webtest.core;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;

public class LoggingRule extends TestWatcher {
    private Logger logger;
    public LoggingRule(Logger logger) {
        this.logger = logger;
    }

    @Override
    protected void starting(Description description) {
        super.starting(description);
        logger.debug("Starting..."+ description.getMethodName());
    }

    /**
     * Invoked when a test method finishes (whether passing or failing)
     */
    @Override
    protected void finished(Description description) {
        super.finished(description);
        logger.debug("Finished..."+ description.getMethodName());
    }

    /**
     * invoke for test pass
     * @param description
     */
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        logger.info("PASS : "+ description.getMethodName());
    }

    /**
     * Invoked when a test fails
     */

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e,description);
        logger.error("TEST FAILED >>> "+ description.getMethodName() +" @"+description.getClassName()+" , \n ERROR = "+ e.getMessage());
        logger.error("Details>>> "+ ExceptionUtils.getStackTrace(e));
    }
}
