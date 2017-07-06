package org.automation.win.app.notepad;

import org.automation.win.core.WindowsDesktop;
import org.openqa.selenium.winium.WiniumDriver;

/**
 * Created by shantonu on 7/6/17.
 */
public class Notepad {

    public WiniumDriver driver;

    public Notepad(WiniumDriver driver) {
        this.driver = driver;
    }

    public void type(String text){
        driver.findElementByClassName("Edit").sendKeys(text);
    }
}
