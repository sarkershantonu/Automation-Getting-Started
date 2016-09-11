package org.automation.core;

import org.automation.CalculatorWithSteps;
import org.automation.ScreenCaptureUtil;
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
    protected CalculatorWithSteps aCalculator = null;

    @Before
    @Step("Initiation in {method}")
    public void init(){
        aCalculator = new CalculatorWithSteps();
    }

    @Attachment(value = "Sample Screenshot from {method} and param {0}")
    protected String attachThisMessage(String message){
        return message;
    }
    @Attachment(value = "Sample Screenshot from {method}", type = "image/png")
    protected byte[] attachPNG() {
        return ScreenCaptureUtil.capturePNG();
    }

    @Attachment(value = "Sample Screenshot from {method}", type = "image/jpg")
    protected byte[] attach() {
        return ScreenCaptureUtil.capture();
    }

    protected void saveAsImage(byte[] imageAsByteArray, String name) {
        InputStream in = new ByteArrayInputStream(imageAsByteArray);
        BufferedImage bImageFromConvert = null;
        File file;
        try {
            file = new File("./Images/"+name);
            bImageFromConvert = ImageIO.read(new ByteArrayInputStream(imageAsByteArray));
            ImageIO.write(bImageFromConvert, "jpg", file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
