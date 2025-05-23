package org.automation.unitTests.attachment;

import io.qameta.allure.Description;
import org.automation.core.TestRule_ScreenShotOnEachStep;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

/**
 * Created by shantonu on 9/11/16.
 */


public class TestWithAttachment_withEachStepSnapRule extends TestingCalculator {

    @Rule
    public TestWatcher screenShotInEachStep = new TestRule_ScreenShotOnEachStep();

    @Test
    @Description("Attachment as text")
    public void testAdditionFail() {
        Assert.assertEquals(35.0, aCalculator.add(10.0, 15.0), 0.01);
        attachThisMessage("https://www.google.pl");
    }

    @Test

    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }

}
