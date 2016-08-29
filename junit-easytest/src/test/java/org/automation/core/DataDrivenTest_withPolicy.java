package org.automation.core;

import org.automation.Calculator;
import org.automation.policy.RegressionPolicyExample;
import org.easetech.easytest.annotation.TestPolicy;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 8/29/16.
 */
@TestPolicy(RegressionPolicyExample.class)
@RunWith(DataDrivenTestRunner.class)
public abstract class DataDrivenTest_withPolicy {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }
}
