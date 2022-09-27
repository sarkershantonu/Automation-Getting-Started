package org.automation.example;

import org.automation.example.runner.TestNgRunner;

import java.io.File;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        System.out.println(" Application is Running");
        System.out.println(args.length);
        File suite = new File("./suites/ExceptionTests.xml");
        System.out.println(suite.getAbsolutePath());
        System.out.println(suite.getCanonicalPath());
        TestNgRunner runner = new TestNgRunner(suite.getCanonicalPath());
        runner.run();
    }
}
