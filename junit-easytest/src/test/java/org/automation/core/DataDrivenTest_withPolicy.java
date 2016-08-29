package org.automation.core;

import org.automation.Calculator;
import org.automation.policy.RegressionPolicyExample;
import org.easetech.easytest.annotation.TestPolicy;
import org.junit.Before;

/**
 * Created by shantonu on 8/29/16.
 */
@TestPolicy(RegressionPolicyExample.class)
public abstract class DataDrivenTest_withPolicy {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }
}
