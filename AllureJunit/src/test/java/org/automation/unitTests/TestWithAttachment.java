package org.automation.unitTests;

import org.automation.MyRunner;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Attachment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by shantonu on 9/5/16.
 * todo
 */
@RunWith(MyRunner.class)
public class TestWithAttachment extends TestingCalculator {


    public byte[] screenCapture() {
        byte[] out = null;
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, ".jpg", bo);
            out = bo.toByteArray();
            bo.close();

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    @Test
    @Attachment(value = "Sample Screenshot", type = "image/png")
    public byte[] testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        return screenCapture();
    }
}

