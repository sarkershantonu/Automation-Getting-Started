package org.automation.junit;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by shantonu on 7/12/17.
 * this is a junit test rule, so applied for each and every test
 */
public class HTMLReportWatcher extends TestWatcher{
    private ExtentHtmlReporter htmlReporter;
    private ExtentTest testLogger;
    private ExtentReports report;

    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        testLogger = report.createTest("testPassed:"+description.getMethodName());
        testLogger.pass(description.getMethodName());
        System.out.println("passed>>>");
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        System.out.println("Failed>>>");
        testLogger = report.createTest("testFailed:"+description.getMethodName());
        testLogger.fail(description.getMethodName());

    }

    @Override
    protected void skipped(AssumptionViolatedException e, Description description) {

        testLogger = report.createTest("testSkipped:"+description.getMethodName());
        testLogger.warning(description.getMethodName());
        super.skipped(e, description);
        System.out.println("Skipped>>>");
    }

    @Override
    protected void finished(Description description) {
        super.finished(description);
        report.flush();
        System.out.println("Finished>>>");
    }


    @Override
    protected void starting(Description description) {
        super.starting(description);
    }

    private void init(){
        report = new ExtentReports();
        htmlReporter = new ExtentHtmlReporter("./Reports/"+System.currentTimeMillis()+"_index.html");
        report.attachReporter(htmlReporter);
        try {
            report.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostAddress());
            report.setSystemInfo("Env", InetAddress.getLocalHost().getCanonicalHostName());
            report.setSystemInfo("user",System.getProperty("user.name"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public HTMLReportWatcher() {
        super();
        init();
    }

}