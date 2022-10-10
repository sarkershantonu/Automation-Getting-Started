package org.automation.example;

import org.automation.example.runner.TestNgRunner;

import java.io.IOException;
import java.util.List;

import static org.automation.example.config.AppConfigHelper.loadAppProperties;
import static org.automation.example.config.SuiteLoaderFromFile.*;

public class TestingApplication {
    public static void main(String[] args) throws IOException {
        System.out.println(" Trying to run test");
        loadAppProperties();
        List<String> files = getSuitesWithPath();
        TestNgRunner runner = new TestNgRunner(files);
        runner.run();
    }
}
