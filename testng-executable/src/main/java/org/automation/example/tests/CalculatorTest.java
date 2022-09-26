package org.automation.example.tests;

import org.automation.example.app.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {
    private Calculator calculator;

    @BeforeClass
    public void initClass(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(calculator.add(5,3),8,"Addition Fail");
    }
}
