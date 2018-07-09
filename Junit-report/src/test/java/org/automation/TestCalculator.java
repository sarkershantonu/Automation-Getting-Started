package org.automation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by SSarker on 7/9/2018.
 */
public class TestCalculator {
    private Calculator aCalculator;
    @Before
    public void init(){
        aCalculator = new Calculator();
    }
    @Test
    public void addition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }
}
