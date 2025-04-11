package org.automation.unitTests;

import io.qameta.allure.TmsLink;
import org.automation.core.TestCalculatorBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithTestCaseId extends TestCalculatorBase {
    @Test
    @TmsLink(value = "ID#001")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @TmsLink(value = "ID#002")
    public void testSub(){//fail example
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }
    @Test
    @TmsLink(value = "ID#003")
    public void testMul(){
        Assert.assertEquals(250.0, aCalculator.mul(10.0,25.0), 0.01);
    }
    @Test
    @TmsLink(value = "ID#004")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
    @Test
    @TmsLink(value = "ID#005")
    public void testReminder(){
        Assert.assertEquals(1.0, aCalculator.mod(25.0,3.0), 0.01);
    }

}
