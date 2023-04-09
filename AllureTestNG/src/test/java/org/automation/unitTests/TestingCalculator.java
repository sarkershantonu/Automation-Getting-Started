package org.automation.unitTests;



import org.automation.Calculator;
import org.automation.util.ScreenShot;
import org.testng.annotations.BeforeClass;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;


/**
 * Created by shantonu on 9/10/16.
 */

public abstract class TestingCalculator {
    protected Calculator aCalculator = null;

    @BeforeClass
    @Step("Initiation in {method}")
    public void init(){
        aCalculator = new Calculator();
    }

    @Attachment(value = "Sample Screenshot from {method} and param {0}")
    protected String attachThisMessage(String message){
        return message;
    }
    @Attachment(value = "Sample Screenshot from {method}", type = "image/png")
    protected byte[] capturePNG() {
        return ScreenShot.capturePNG();
    }

    @Attachment(value = "Sample Screenshot from {method}", type = "image/jpg")
    protected byte[] capture() {
        return ScreenShot.capture();
    }
    @Attachment(value = "{0}", type = "text/html")
    public static String attachHtml(String html) {
        return html;
    }

}
