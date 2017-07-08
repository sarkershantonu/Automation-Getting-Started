package org.automation.win.app.notepad;

import org.automation.win.app.config.PropertyUtil;
import org.openqa.selenium.winium.WiniumDriver;

import java.io.File;

/**
 * Created by shantonu on 7/6/17.
 */
public class Notepad {

    private WiniumDriver driver;

    public Notepad(WiniumDriver driver) {
        this.driver = driver;
    }

    public void close() {
        driver.close();
        driver.quit();

    }

    public void saveFileAs(String fileNameWithExtention) {
        String file_path = PropertyUtil.USER_HOME + "/" + System.currentTimeMillis() + fileNameWithExtention;
        File file = new File(file_path);
        System.out.println(file.getAbsolutePath());
        driver.findElementByName("File").click();
        driver.findElementByName("Save As...").click();
        driver.findElementByClassName("Edit").sendKeys(file.getAbsolutePath().replace("/", "\\\\"));
        //driver.findElementByClassName("Edit").sendKeys(System.currentTimeMillis()+fileNameWithExtention);
        //  driver.findElementByName("Save");
        driver.getKeyboard().pressKey("\n");

    }
    //this is required for remote PC path
    public void saveFileInSpecificLocation(String completePathWithExt) {
        driver.findElementByName("File").click();
        driver.findElementByName("Save As...").click();
        driver.findElementByClassName("Edit").sendKeys(completePathWithExt);
        driver.getKeyboard().pressKey("\n");

    }

    public void type(String text) {
        driver.findElementByClassName("Edit").sendKeys(text);
    }
}
