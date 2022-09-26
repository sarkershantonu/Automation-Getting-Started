package org.automation.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdhocTests extends CalculatorBaseTest {

    @Test
    public void testIntAdd(){
        Assert.assertEquals(calculator.add(5,3),8,"Addition Fail");
    }

    @Test
    public void testFloatAdd(){
        Assert.assertEquals(calculator.add(5.8,3.3),9.1,"Addition Fail");
    }
}
