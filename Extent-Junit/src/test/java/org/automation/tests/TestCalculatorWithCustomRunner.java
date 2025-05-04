package org.automation.tests;

import org.automation.calculator.Calculator;
import org.automation.junit.HtmlReportRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by shantonu on 7/12/17.
 */

@RunWith(HtmlReportRunner.class)
public class TestCalculatorWithCustomRunner {

    private Calculator aCalculator;
    @Before
    public void initTest(){
        aCalculator = new Calculator();
    }

    @Test
    public void testAddPass(){
        Assert.assertEquals(25.0,aCalculator.add(10.0,15.0),0.1);

    }
    @Test
    public void testAddFail(){
        Assert.assertEquals(27.0,aCalculator.add(10.0,15.0),0.1);
    }

    @Test
    @Ignore("ignoring intentionally ")
    public void testAddSkip(){

    }


}
