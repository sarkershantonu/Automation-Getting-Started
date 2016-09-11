package org.automation;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by shantonu on 9/11/16.
 */
public class ScreenCaptureUtil {

    public static void capture(String filePath) {
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            File file = new File(filePath);
            ImageIO.write(screencapture, "jpg", file);

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static byte[] capture() {
        byte[] out = null;
        try {
            BufferedImage screencapture = new Robot().createScreenCapture(
                    new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ImageIO.write(screencapture, ".png", bo);
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
