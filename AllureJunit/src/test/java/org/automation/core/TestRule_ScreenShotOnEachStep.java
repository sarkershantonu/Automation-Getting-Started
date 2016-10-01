package org.automation.core;

import org.automation.ScreenCaptureUtil;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import ru.yandex.qatools.allure.annotations.Attachment;

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

    @Attachment(value = "Taking Screenshot with {method}", type = "image/png")
    public byte[] snap() {
        return ScreenCaptureUtil.capture();
    }
}
