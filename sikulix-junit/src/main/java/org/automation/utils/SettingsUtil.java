package org.automation.utils;

import org.sikuli.basics.Debug;
import org.sikuli.basics.Settings;
import org.sikuli.script.TextRecognizer;
/**
 * Created by shantonu on 7/7/16.
 */
public class SettingsUtil {
   public static void setDefaultSettings(){
        TextRecognizer recog = TextRecognizer.getInstance();
        Settings.ActionLogs=true;
        Settings.setShowActions(true);
        Settings.setImageCache(128);//64 default

    }

    private static void logSettings(){
        Settings.UserLogs = true;
        Settings.UserLogTime = true;
        Settings.ActionLogs = true;
        Settings.UserLogPrefix = "Mf_";

        Settings.MinSimilarity=98.5;
        // Debug.shouldHighlight();
    }
    // ---------------- this setting are only for debugging purposes----------------------


    public static void highlightOn(){
        Debug.highlightOn();
    }

    public static void highlightOff(){
        Debug.highlightOff();
    }
}
