package org.automation.win.core;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumOptions;

/**
 * Created by shantonu on 7/6/17.
 * act as page base
 */
public class UiBase {
    private WiniumDriver driver ;
    private WiniumOptions options;

    public UiBase(){
        options = new WiniumOptionsForNotePad();

    }

    public void initDriver(){
        driver = new WiniumDriver(options);
    }
}
