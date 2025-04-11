package org.automation.unitTests;

import io.qameta.allure.Issue;
import org.automation.core.TestCalculatorBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithAttachment extends TestCalculatorBase {
    @Test
    public void testAdditionFail() {
        Assert.assertEquals(35.0, aCalculator.add(10.0, 15.0), 0.01);
        capturePNG();//the image attachment
    }

    @Test
    public void testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        capture();//the image attachment
    }
    @Test
    @Issue("255")
    public void testAdditionForText() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        attachThisMessage("This is for attaching a text response from test");//the text attachment
    }
}
