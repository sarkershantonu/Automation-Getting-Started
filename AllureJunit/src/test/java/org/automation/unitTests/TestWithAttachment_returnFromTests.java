package org.automation.unitTests;

import junit.framework.AssertionFailedError;
import org.automation.MyRunner;
import org.automation.ScreenCaptureUtil;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Attachment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by shantonu on 9/5/16.
 * todo
 */
@RunWith(MyRunner.class)
public class TestWithAttachment_returnFromTests extends TestingCalculator {


//    @Attachment(value = "Sample Screenshot", type = "image/png")


    @Test
    @Attachment(value = "Sample Screenshot", type = "image/png")
    public byte[] testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);

        if(ScreenCaptureUtil.capture()==null){
            throw new AssertionFailedError();
        }
        return ScreenCaptureUtil.capture();
    }
    @Test
    @Attachment
    public String testAddition2() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        ScreenCaptureUtil.capture("./Images/ScreenShot.jpg");
        return "See image ScreenShot.jpg";

    }
    @Test
    @Attachment
    public void test(){
        throw new AssertionFailedError();
    }

}

