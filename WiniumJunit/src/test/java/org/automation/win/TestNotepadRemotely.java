package org.automation.win;

import org.automation.win.app.config.PropertyUtil;
import org.automation.win.app.notepad.Notepad;
import org.automation.win.core.WindowsDesktop;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;

/**
 * Created by shantonu on 7/8/17.
 * //this will run remotely, please see readme for detail (https://github.com/sarkershantonu/Automation-Getting-Started/tree/master/WiniumJunit)
 *
 */
public class TestNotepadRemotely {
    private static WiniumDriver driver;
    private static Notepad notepad;


    @BeforeClass
    public static void init() throws MalformedURLException {
        PropertyUtil.initProperties();
        driver = new WindowsDesktop().initDriverInRemoteVM();
        notepad = new Notepad(driver);

    }

    @Test
    public void testTypeAndSaveRemotePC(){
        notepad.type("Shantonu Demo");
        notepad.saveFileInSpecificLocation(System.getProperty("vm.folder")+System.currentTimeMillis()+"_MyFile.txt");
    }
    @AfterClass
    public static void quit(){
        notepad.close();
    }
}
