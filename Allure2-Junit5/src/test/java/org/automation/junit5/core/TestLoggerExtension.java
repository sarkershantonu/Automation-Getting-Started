package org.automation.junit5.core;

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

/**
 * Created by shantonu on 3/29/2021
 */
public class TestLoggerExtension implements TestWatcher, AfterAllCallback {
    private enum Status {PASSED, FAILED, ABORTED, DISABLED}

    Logger logger = LoggerFactory.getLogger(TestLoggerExtension.class);
    private List<Status> results = new ArrayList<>();

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        Map<Status, Long> summary = results.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
        logger.info("Test result summary for {} {}", context.getDisplayName(), summary.toString());
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        logger.info("Test Disabled for test {}: with reason :- {}", context.getDisplayName(), reason.orElse("No reason"));
        results.add(Status.DISABLED);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        logger.info("Test Successful for test {}: ", context.getDisplayName());
        results.add(Status.PASSED);
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        logger.info("Test Aborted for test {}: ", context.getDisplayName());
        results.add(Status.ABORTED);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        logger.info("Test Failed for test {}: ", context.getDisplayName());

        results.add(Status.FAILED);
    }
}
