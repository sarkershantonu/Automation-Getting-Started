package org.automation;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;
    private double result;



    @Before
    public void init(){
        calculator = new Calculator();
    }


    @Test
    public void testAdd() throws Throwable {

        Assert.assertEquals(5.0,calculator.add(3.0, 2.0),0.01);
    }


}
