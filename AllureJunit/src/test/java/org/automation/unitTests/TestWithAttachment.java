package org.automation.unitTests;

import org.automation.ScreenCaptureUtil;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithAttachment extends TestingCalculator {

    @Test
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        attachThisMessage("Adding message with default text");
    }

    @Test
    public void testAddition2(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        attachThisMessage("https://www.google.pl");
    }

    @Test
    public void testAddition3(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        attachScreen();
    }
    @Attachment
    private String attachThisMessage(String message){
        return message;
    }
    @Attachment(value = "Sample Screenshot", type = "image/png")
    private byte[] attachScreen(){
        return ScreenCaptureUtil.capture();
    }


}
