package org.automation.junit5.reporting;

import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.automation.junit5.reporting.TestStatus.*;

public class TestLoggerExtension implements TestWatcher, AfterAllCallback {
    private final Logger logger = LoggerFactory.getLogger(TestLoggerExtension.class);
    private List<TestStatus> testResults = new ArrayList<>();

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        Map<TestStatus, Long> summary = generateSummary();
        logger.info("Test Result Summary for {} {} ", context.getDisplayName(), summary.toString());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
        logger.debug("Test Disabled for test {}: with reason :- {}", context.getDisplayName(), reason.orElse("No reason"));
        testResults.add(DISABLED);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        logger.debug("Test Successful for test {}: ", context.getDisplayName());
        testResults.add(PASSED);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
        logger.info("Test Aborted for test {}: ", context.getDisplayName());
        testResults.add(ABORTED);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        logger.error("Test Failed for test {}: ", context.getDisplayName());
        testResults.add(FAILEd);
    }

    private Map<TestStatus, Long> generateSummary(){
        return testResults.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
    }
}
