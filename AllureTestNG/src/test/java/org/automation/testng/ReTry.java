package org.automation.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTry implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(iTestResult.isSuccess()){
            return false;
        }else {
            if (counter < retryLimit) {
                System.out.println(">>>> " + counter);
                counter++;
                return true;
            }
            else
                return false;
        }
    }
}
