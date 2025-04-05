package org.automation.unitTests;

import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 9/11/16.
 */
@Features( {@Feature("Class Feature : Add"),@Feature("Class Feature : divide")})
public class TestWithFeatures extends TestingCalculator{
    @Test
    @Feature("Method Features : Addition")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Feature("Method Features : division ")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
