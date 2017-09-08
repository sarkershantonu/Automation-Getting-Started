package org.automation.support.steps.junit;

import org.junit.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by shantonu on 9/7/17.
 * todo, this will watch test execution and keep steps automatically
 * Another way to implement steps[more flexible]
 */
public class StepWatcher extends TestWatcher {
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
    }

    @Override
    protected void skipped(AssumptionViolatedException e, Description description) {
        super.skipped(e, description);
    }

    @Override
    protected void starting(Description description) {
        super.starting(description);
    }

    @Override
    protected void finished(Description description) {
        super.finished(description);
    }
}
