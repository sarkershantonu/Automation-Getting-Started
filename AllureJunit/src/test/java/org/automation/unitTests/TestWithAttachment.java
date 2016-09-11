package org.automation.unitTests;

import org.automation.ScreenCaptureUtil;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import ru.yandex.qatools.allure.annotations.*;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestWithAttachment extends TestingCalculator {

    @Rule
    public TestWatcher failScreenShot =new TestWatcher() {
        @Override
        protected void failed(Throwable e, Description description) {
            super.failed(e, description);
            takeScreenshot();
        }

        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
            takeScreenshot();
        }

        @Attachment(value = "Sample Screenshot from {method}", type = "image/png")
        public byte[] takeScreenshot() {
            return ScreenCaptureUtil.capture();
        }
    };
    @Test
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        //attachThisMessage("Adding message with default text");
    }

    @Test
    public void testAdditionFail(){
        Assert.assertEquals(35.0, aCalculator.add(10.0,15.0), 0.01);
        //attachThisMessage("https://www.google.pl");
    }

    @Test
    public void testAddition3(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
        //attachScreen();
    }
    @Attachment(value = "Sample Screenshot from {method} and param {0}")
    private String attachThisMessage(String message){
        return message;
    }
    @Attachment(value = "Sample Screenshot from {method}", type = "image/png")
    private byte[] attachScreen(){
        return ScreenCaptureUtil.capture();
    }


}
