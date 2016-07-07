package org.automation.ui;

import org.automation.api.ScreenBase;
import org.sikuli.script.FindFailed;

/**
 * Created by shantonu on 7/7/16.
 */
public abstract class UiBase extends ScreenBase{
    private String folder;

    public UiBase(String folder) {
        this.folder = folder;
    }

    public void click(String image) throws FindFailed {
        screen.wait(image).click();
    }

    public void defaultwait(){
        wait(2.0);
    }
    public void wait(double sec){
        screen.wait(sec);
    }
}
