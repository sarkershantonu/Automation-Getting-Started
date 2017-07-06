package org.automation.win;

import org.automation.win.app.notepad.Notepad;
import org.automation.win.core.WindowsDesktop;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;

/**
 * Created by shantonu on 7/6/17.
 */
public class TestNotepad {
    private WiniumDriver driver;
    private Notepad notepad;


    @BeforeClass
    public void init() throws MalformedURLException {
        driver = new WindowsDesktop().initDriver();
        notepad = new Notepad(driver);
    }

    @Test
    public void testTyping(){
        notepad.type("Shantonu Demo");
    }
}
