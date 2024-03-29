package org.automation.example.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CalculatorTestLogger implements ITestListener {

    private final Logger logger = LoggerFactory.getLogger(CalculatorTestLogger.class);
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        logger.debug(result.getMethod().getMethodName()+" Test ran Successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        logger.error(result.getMethod().getMethodName()+" >>> Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        logger.debug(result.getMethod().getMethodName()+" Test skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        logger.debug(context.getClass().getCanonicalName()+" Test ran finished");
    }
}
