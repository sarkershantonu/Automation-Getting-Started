package org.automation.junit5.tests.allure;

import io.qameta.allure.*;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shantonu on 4/24/2021
 */
public class TestWithAttachmentExamples extends CalculatorTestBase {


    @Test
    public void testAddWIthScreenshot() throws IOException, AWTException {
        assertEquals(30,myCal.add(25,5));
        capturePNG();
    }

    @Attachment
    public byte[] capturePNG() throws IOException, AWTException {
        byte[] out = null;
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, "png", bo);
            out = bo.toByteArray();
            bo.close();
        return out;
    }
    @Attachment
    public byte[] capture() {
        byte[] out = null;
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, "jpg", bo);
            out = bo.toByteArray();
            bo.close();
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }


}
