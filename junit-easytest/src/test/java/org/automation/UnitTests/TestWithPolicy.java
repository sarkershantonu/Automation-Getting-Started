package org.automation.UnitTests;

import org.automation.Calculator;
import org.automation.policy.RegressionPolicy;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Repeat;
import org.easetech.easytest.annotation.TestPolicy;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@RunWith(DataDrivenTestRunner.class)
@TestPolicy(RegressionPolicy.class)
public class TestWithPolicy {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    @Repeat(times = 5)
    public void testAddFromCSV(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
