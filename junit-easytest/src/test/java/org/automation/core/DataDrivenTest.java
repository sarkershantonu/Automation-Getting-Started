package org.automation.core;

import org.automation.Calculator;
import org.easetech.easytest.annotation.Report;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 7/15/16.
 * this is default test template (parent class)
 */

public abstract class DataDrivenTest {
    protected Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }
}
