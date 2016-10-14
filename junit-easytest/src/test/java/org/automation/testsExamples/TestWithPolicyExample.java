package org.automation.testsExamples;

import org.automation.core.DataDrivenTest;
import org.automation.policy.PolicyExample;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.TestPolicy;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/16/16.
 */
@RunWith(DataDrivenTestRunner.class)
@TestPolicy(PolicyExample.class)
public class TestWithPolicyExample extends DataDrivenTest {

    @Test
    public void  testAddFromExcel(@Param(name = "a") Double a, @Param(name = "b") Double b, @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
