package org.automation.unitTests.attachment;

import org.automation.ScreenCaptureUtil;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import ru.yandex.qatools.allure.annotations.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

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
        saveAsImage(attach(),"A3.jpg");//=> not using allure, local saving
    }
    @Test
    @Issue("255")
    public void testAdditionForText() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        attachThisMessage("This is for attaching a text response from test");
    }



}
