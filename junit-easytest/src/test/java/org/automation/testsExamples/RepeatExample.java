package org.automation.testsExamples;

import org.automation.core.DataDrivenTest;
import org.automation.policy.PolicyExample;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.annotation.Repeat;
import org.easetech.easytest.annotation.TestPolicy;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/26/16.
 */

@RunWith(DataDrivenTestRunner.class)
@TestPolicy(PolicyExample.class)
public class RepeatExample extends DataDrivenTest {
    @Test
    @Repeat(times = 5)
    public void testAddFromExcel(@Param(name = "a") Double a,
                                 @Param(name = "b") Double b,
                                 @Param(name = "expected") Double expected) {
        Assert.assertEquals(expected, calculator.add(a, b), 0.1);
    }
}
