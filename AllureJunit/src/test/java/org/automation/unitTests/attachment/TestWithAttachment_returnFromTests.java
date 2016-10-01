package org.automation.unitTests.attachment;

import junit.framework.AssertionFailedError;
import org.automation.core.MyRunner;
import org.automation.ScreenCaptureUtil;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.yandex.qatools.allure.annotations.Attachment;


/**
 * Created by shantonu on 9/5/16.

 */
@RunWith(MyRunner.class)
public class TestWithAttachment_returnFromTests extends TestingCalculator {

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
        return "Test Complete for addition";

    }

    @Test
    @Attachment
    public String testAdditionWithAttachment() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        return "This text will be attached";
    }

}

