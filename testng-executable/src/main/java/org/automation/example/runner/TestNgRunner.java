package org.automation.example.runner;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestNgRunner {

    private final List<String> suites;

    public TestNgRunner(String... suiteFiles) {
        suites = new ArrayList<>(Arrays.asList(suiteFiles));
    }
    public TestNgRunner(List<String> suiteFiles) {
        suites = suiteFiles;
    }
    public void run(){
        TestNG ng = new TestNG();
        ng.setTestSuites(suites);
        ng.setDefaultTestName("Calculator Test");
        ng.setUseDefaultListeners(false);
        ng.run();
    }
}
