package org.automation.junit;

import org.automation.calculator.Calculator;
import org.junit.*;
import org.junit.rules.TestRule;


/**
 * Created by shantonu on 7/12/17.
 */

public class TestCalculator {

    private Calculator aCalculator;

    @Rule
    public TestRule htmlReporting = new HTMLReportWatcher();//this will generate a html file for each test.
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
