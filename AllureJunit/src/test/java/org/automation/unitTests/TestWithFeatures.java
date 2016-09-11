package org.automation.unitTests;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Features;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithFeatures extends TestingCalculator{
    @Test
    @Features("Method Description : This will test addidtion")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
}
