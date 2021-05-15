package org.automation.utils;

import org.automation.putty.core.ScreenBase;
import org.sikuli.script.Image;

/**
 * Created by shantonu on 7/7/16.
 */
public class MatcherUtil extends ScreenBase{
    public static boolean isImagePresent(String path){
        return false; //// TODO: 7/7/16
    }

    public static boolean isTextPresent(String target){
        return false; //// TODO: 7/7/16
    }

    public static boolean areEqual(String subjectImagePath, String targetImagePath){
        return false; //// TODO: 7/7/16
    }
    public static boolean areEqual(Image subjectImagePath, Image targetImagePath){
        return false; //// TODO: 7/7/16
    }

    /***
     * todo
     * Takes 2 images, points differences in red marking
     * @param subjectImagePath
     * @param targetImagePath
     * @return
     */
    public static Image getDifference(Image subjectImagePath, Image targetImagePath){
        return null;
    }
}
