package org.automation.junit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/**
 * Created by shantonu on 7/12/17.
 */
public class HtmlReportListner extends RunListener {
    private ExtentHtmlReporter htmlReporter;
    private ExtentTest testLogger;
    private ExtentReports report;
    @Override
    public void testRunFinished(Result result) throws Exception {
        super.testRunFinished(result);
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        super.testFailure(failure);
        testLogger = report.createTest("testFailed:"+failure.get.getMessage());
        testLogger.fail(failure.getMessage());
    }

    @Override
    public void testIgnored(Description description) throws Exception {
        super.testIgnored(description);
        testLogger = report.createTest("testSkipped:"+description.getMethodName());
        testLogger.warning(description.getMethodName());
    }

    @Override
    public void testAssumptionFailure(Failure failure) {
        super.testAssumptionFailure(failure);
    }

    @Override
    public void testFinished(Description description) throws Exception {
        super.testFinished(description);
    }

    @Override
    public void testStarted(Description description) throws Exception {
        super.testStarted(description);
    }

    @Override
    public void testRunStarted(Description description) throws Exception {
        super.testRunStarted(description);
    }

    public HtmlReportListner() {
        super();
    }
}
