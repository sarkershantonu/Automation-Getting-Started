package org.performance;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestingCalculator {
    protected Calculator aCalculator = null;

    @Before
    public void init(){
        aCalculator = new Calculator();
    }
    @Test
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

    @Test
    public void testSub(){
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }

}
