package org.automation.win.core;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.KeyboardSimulatorType;
import org.openqa.selenium.winium.WiniumOptions;

/**
 * Created by shantonu on 7/6/17.
 */
public class WiniumOptionsForNotePad extends DesktopOptions {

    public WiniumOptionsForNotePad(){
        init();
    }

    private void init(){
        this.setApplicationPath(System.getProperty("notepad.path"));
        this.setKeyboardSimulator(KeyboardSimulatorType.BasedOnWindowsFormsSendKeysClass);
        this.setLaunchDelay(Integer.valueOf(System.getProperty("init.launcher.delay")));
    }
}
