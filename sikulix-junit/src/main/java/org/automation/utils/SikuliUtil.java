package org.automation.utils;
import org.automation.putty.core.ScreenFactory;
import org.sikuli.basics.Debug;
import org.sikuli.basics.Settings;
import org.sikuli.script.*;

public class SikuliUtil {

    public static Screen typeOnScreen(Screen screen, String pathOfScreenImage, String text) throws FindFailed, InterruptedException {
        screen.wait(pathOfScreenImage).click();
        defaultWait(screen);
        screen.type(text);
        return screen;
    }


    public static Screen typeWithCoordinates(Screen screen, String pathOfScreenImage, String text, int x, int y) throws FindFailed {
        Match match = screen.find(pathOfScreenImage);
        match.setTargetOffset(x, y);
        match.click();
        waitFor(screen, 2 * AppProperties.defaultWait);
        screen.type(text);
        return screen;
    }

    
    public static Screen clickOn(Screen screen, String pathOfScreenImage) throws FindFailed, InterruptedException {
        screen.wait(pathOfScreenImage).click();
        defaultWait(screen);
        return screen;
    }

    
    public static Screen clickWithCoordinatesOn(Screen screen, String pathOfScreenImage, int x, int y) throws FindFailed, InterruptedException {
        Match match = screen.find(pathOfScreenImage);
        match.setTargetOffset(x, y);
        match.click();
        defaultWait(screen);
        return screen;
    }

    
    public static void defaultWait(Screen screen) throws InterruptedException {
        screen.wait(AppProperties.defaultWait);
    }

    public static void waitFor(Screen screen, double second) {
        screen.wait(second);
    }


    public static void clearField(Screen screen) {
        screen.type("a", KeyModifier.CMD);
        screen.type(Key.BACKSPACE);
    }

    
    public static void takeScreenShot(Screen screen, String message) {
        //// TODO: 4/1/2016
    }

    public static String getTimeStamp() {
        return Settings.getTimestamp();
    }

    public static String getUserExtPath() {
        return Settings.getDataPath();
    }

    public static String getSikuliDataPath() {
        return Settings.getDataPath();
    }

    public static void log(int level, Class t, String message, Object... args) {
        Debug.logx(level, t.getName() + message, args);
    }

    public static void setLogFile(String fileName) {
        Debug.setLogFile(fileName);
        // Debug.setUserLogFile("/sikuliLogs/"+System.currentTimeMillis()+".log");
    }
   public static void setDebugLogLevel(int x) {
        Debug.setDebugLevel(x);
    }

    //// TODO: 9/5/2016  
    public static boolean compare(Image source, Image target) {
        boolean result = false;
        return false;
    }
    public static boolean isTextPresent(String imagePath, String text) {
        boolean result = false;
        Settings.OcrTextRead = true;

        text = "";
        Settings.OcrTextRead = false;
        return false;
    }
    public static boolean isTextPresent(Image image, String text) {
        boolean result = false;


        return false;
    }

    public static boolean isImagePresent(String path) {
        Region r = ScreenFactory.getScreen().get(Region.RR);
        // Match match =
        return false;
    }

    public static String getTextFrom(Image image) {

        return "";
    }

    public static String getTextFrom(String imagePath) {

        return "";
    }
    //todo
    public static boolean getImageFromRegion(String imagePathOfRegion, String targetImagePath) {

        return false;
    }

    public static boolean clickOn(Region r) {
        r.click();
        return true;
    }
}
