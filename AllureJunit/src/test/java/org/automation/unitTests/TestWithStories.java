package org.automation.unitTests;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Stories;

/**
 * Created by shantonu on 9/11/16.
 */
@Stories(value = {"Class Story : Addition","Class Story : Substruction"})
public class TestWithStories extends TestingCalculator {
    @Test
    @Stories(value = "Method Story : Addition")
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    @Stories("Method Story : Addition")
    public void testAddition2() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
}
