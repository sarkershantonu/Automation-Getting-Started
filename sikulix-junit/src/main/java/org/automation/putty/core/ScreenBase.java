package org.automation.putty.core;

import org.automation.utils.AppProperties;
import org.automation.utils.SikuliUtil;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

/**
 * Created by shantonu on 7/6/16.
 */
public class ScreenBase {
   protected static Screen screen = new Screen();

    protected void clickAndWait(String path) throws FindFailed, FindFailed, InterruptedException {
        screen.wait(path).click();
        defaultWait();
    }
    protected void log(String message, Object... args){
        SikuliUtil.log(0,this.getClass(),message, args);
    }
    public void wait(double time) {

        SikuliUtil.waitFor(screen,time);
    }
    public void defaultWait() throws InterruptedException {
        SikuliUtil.defaultWait(screen);
    }
    public boolean isVisable(String targetImagepath) throws FindFailed {
        Match mactch = screen.exists(targetImagepath, AppProperties.waitForImage);
        if(mactch==null){
            return false;
        }
        return true;
    }
    protected void addImagePath(String path){
        ImagePath.add(path);
    }
    protected void setImagePath(String path){
        ImagePath.reset();
        ImagePath.setBundlePath(path);
    }
}
