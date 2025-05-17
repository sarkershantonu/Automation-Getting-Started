package org.automation.testng;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.IConfigurationListener2;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by shantonu on 7/12/17.
 */
public class TestListnerForReporting implements ITestListener, IConfigurationListener2 {


    private ExtentSparkReporter htmlReporter;
    private ExtentTest testLogger;
    private ExtentReports report;
    public TestListnerForReporting(){
        report = new ExtentReports();
        htmlReporter = new ExtentSparkReporter("./Reports/index.html");
        report.attachReporter(htmlReporter);
        try {
            report.setSystemInfo("Host Name", InetAddress.getLocalHost().getHostAddress());
            report.setSystemInfo("Env", InetAddress.getLocalHost().getCanonicalHostName());
            report.setSystemInfo("user",System.getProperty("user.name"));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void onTestStart(ITestResult result) {

    }

    public void onTestSuccess(ITestResult result) {
        testLogger = report.createTest("testPassed:"+result.getMethod().getMethodName());
        testLogger.pass(result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
        testLogger = report.createTest("testFailed:"+result.getMethod().getMethodName());
        testLogger.fail(result.getMethod().getMethodName());
    }

    public void onTestSkipped(ITestResult result) {
        testLogger = report.createTest("testSkipped:"+result.getMethod().getMethodName());
        testLogger.warning(result.getMethod().getMethodName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        testLogger = report.createTest("testPartiallyPassed:"+result.getMethod().getMethodName());
        testLogger.fail(result.getMethod().getMethodName());

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        report.flush();
    }

    public void beforeConfiguration(ITestResult tr) {

    }

    public void onConfigurationSuccess(ITestResult itr) {

    }

    public void onConfigurationFailure(ITestResult itr) {

    }

    public void onConfigurationSkip(ITestResult itr) {

    }
}
