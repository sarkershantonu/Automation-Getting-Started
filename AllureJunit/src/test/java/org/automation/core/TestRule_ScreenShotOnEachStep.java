package org.automation.core;

import io.qameta.allure.Attachment;
import org.automation.util.ScreenShot;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * Created by shantonu on 9/11/16.
 */
public class TestRule_ScreenShotOnEachStep extends TestWatcher {
    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        snap();
    }
    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        snap();
    }

    @Attachment(value = "Taking Screenshot with Junit rule", type = "image/png")
    public byte[] snap() {
        return ScreenShot.capture();
    }
}
