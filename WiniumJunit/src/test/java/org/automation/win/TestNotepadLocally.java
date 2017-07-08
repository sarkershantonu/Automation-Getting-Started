package org.automation.win;

import org.automation.win.app.notepad.Notepad;
import org.automation.win.app.config.PropertyUtil;
import org.automation.win.core.WindowsDesktop;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;

/**
 * Created by shantonu on 7/6/17.
 */
public class TestNotepadLocally {
    private static WiniumDriver driver;
    private static Notepad notepad;


    @BeforeClass
    public static void init() throws MalformedURLException {
        PropertyUtil.initProperties();
        driver = new WindowsDesktop().initDriverLocally();
        notepad = new Notepad(driver);

    }

    @Test
    public void testTypeAndSaveLocally(){
        notepad.type("Shantonu Demo");
        notepad.saveFileAs("_MyFile.txt");
    }

    @AfterClass
    public static void quit(){
        notepad.close();
    }
}
