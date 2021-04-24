package org.automation.junit5.core;

import io.qameta.allure.Attachment;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by shantonu on 4/25/2021
 */
public class ScreenShotUtil {
    @Attachment
    public static byte[] capturePNG() throws IOException, AWTException {
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
    public static byte[] capture() {
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
