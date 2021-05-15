package org.automation.putty.core;

import org.sikuli.script.Screen;

/**
 * Created by sarkers on 4/15/2016.
 */
public class ScreenFactory {
    private static Screen aScreen = null;

    public static Screen getScreen(){
        if(aScreen==null){
            aScreen = new Screen();
        }
        return aScreen;
    }

    public static void exit(){
        aScreen=null;
    }
}
