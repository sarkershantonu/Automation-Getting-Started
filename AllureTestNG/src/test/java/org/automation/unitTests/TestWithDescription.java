package org.automation.unitTests;

import io.qameta.allure.Description;
import org.automation.core.TestCalculatorBase;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by shantonu on 9/11/16.
 */

public class TestWithDescription extends TestCalculatorBase {
    @Test
    @Description("Method Description : This will test addidtion")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Description("Method Description : This will test Division")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
