package org.automation.junit5.reporting;

import org.junit.jupiter.api.TestReporter;

import java.util.Map;

public class CalculatorReporter implements TestReporter {
    @Override
    public void publishEntry(Map<String, String> map) {

    }

    @Override
    public void publishEntry(String key, String value) {
        TestReporter.super.publishEntry(key, value);
    }

    @Override
    public void publishEntry(String value) {
        TestReporter.super.publishEntry(value);
    }
}
