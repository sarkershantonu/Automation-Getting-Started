package org.automation.unitTests.attachment;

import io.qameta.allure.Attachment;
import junit.framework.AssertionFailedError;
import org.automation.core.MyRunner;
import org.automation.util.ScreenShot;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by shantonu on 9/5/16.

 */
@RunWith(MyRunner.class)
public class TestWithAttachment_directFromTestMethod_customRunner extends TestingCalculator {

    @Test
    @Attachment(value = "Sample Screenshot", type = "image/png")
    public byte[] testAddition() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        if(ScreenShot.capture()==null){
            throw new AssertionFailedError();
        }
        return ScreenShot.capture();
    }


    @Test
    @Attachment
    public String testAdditionAndTextAttachment() {
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
        return "This text will be attached";
    }

}

