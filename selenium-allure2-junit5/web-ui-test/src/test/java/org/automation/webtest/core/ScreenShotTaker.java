package org.automation.webtest.core;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

public class ScreenShotTaker extends TestWatcher{

    private final TakesScreenshot takesScreenshot;

    public ScreenShotTaker(TakesScreenshot takesScreenshot) {
        this.takesScreenshot = takesScreenshot;
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e,description);
        failedStepScreenShot();
    }

    @Attachment("Failed Step Screen")
    public byte[] failedStepScreenShot(){
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }
}
