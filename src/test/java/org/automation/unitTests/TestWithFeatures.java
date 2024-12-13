package org.automation.unitTests;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;

/**
 * Created by shantonu on 9/11/16.
 */
@Features(value = {"Class Feature : Add","Class Feature : divide"})
public class TestWithFeatures extends TestingCalculator{
    @Test
    @Features("Method Features : Addition")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Features("Method Features : division ")
    public void testDiv(){
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
}
