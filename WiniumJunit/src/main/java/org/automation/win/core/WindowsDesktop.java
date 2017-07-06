package org.automation.win.core;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumOptions;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by shantonu on 7/6/17.
 * act as browser of selenium
 */
public class WindowsDesktop {
    private WiniumDriver driver ;
    private WiniumOptions options;
    public URL host;

    public WindowsDesktop(){
        options = new WiniumOptionsForNotePad();
    }
    public WiniumDriver initDriver() throws MalformedURLException {
        host = new URL("http://"+System.getProperty("winium.host")+":"+System.getProperty("winium.port"));
        driver = new WiniumDriver(host,options);
        return driver;
    }
}
