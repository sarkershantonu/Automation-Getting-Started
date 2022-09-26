package org.automation.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExceptionTests extends CalculatorBaseTest {

    @Test
    public void testAdd(){
        Assert.assertEquals(calculator.add(5.0,3L),8,"Addition Fail");
    }

    @Test
    public void testFail(){
        Assert.assertEquals(calculator.add(5.0,3),9,"Addition Fail");
    }
}
