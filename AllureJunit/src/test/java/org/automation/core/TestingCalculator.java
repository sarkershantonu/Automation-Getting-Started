package org.automation.core;

import org.automation.Calculator;
import org.automation.util.ScreenShot;
import org.junit.Before;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by shantonu on 9/10/16.
 */
public abstract class TestingCalculator {
    protected Calculator aCalculator = null;

    @Before
    @Step("Initiation in {method}")
    public void init(){
        aCalculator = new Calculator();
    }

    @Attachment(value = "Sample Screenshot from {method} and param {0}")
    protected String attachThisMessage(String message){
        return message;
    }
    @Attachment(value = "Sample Screenshot from {method}", type = "image/png")
    protected byte[] attachPNG() {
        return ScreenShot.capturePNG();
    }

    @Attachment(value = "Sample Screenshot from {method}", type = "image/jpg")
    protected byte[] attach() {
        return ScreenShot.capture();
    }

    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }


}
