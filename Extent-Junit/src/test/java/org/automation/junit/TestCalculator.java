package org.automation.junit;

import org.automation.calculator.Calculator;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by shantonu on 7/12/17.
 */
@Listeners(TestListnerForReporting.class)
public class TestCalculator {

    private Calculator aCalculator;

    @BeforeTest
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
    public void testAddSkip(){

        throw new SkipException("Skipping a test");
    }
}
