package org.automation.unitTests.attachment;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithAttachment extends TestingCalculator {

    @Test
    public void testAdditionFail() {
        Assert.assertEquals(35.0, aCalculator.add(10.0, 15.0), 0.01);
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        attach();//=> not using allure, local saving
    }
    @Test
    @Issue("255")
    public void testAdditionForText() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        attachThisMessage("This is for attaching a text response from test");
    }
}
