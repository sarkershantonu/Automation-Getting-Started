package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created by shantonu on 8/15/16.
 */
public class ScreenshotUtil {
    private static String ScreenPath = System.getProperty("user.dir")+"/screenshots/";
    private ScreenshotUtil(){}

    private static void saveImage(String name,String type, final Screenshot screenshot){
        File output = new File(ScreenPath+name+"."+type);
        try {
            ImageIO.write(screenshot.getImage(),type,output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void saveImage(String name, final Screenshot screenshot){
        File output = new File(ScreenPath+name+".png");
        try {

            ImageIO.write(screenshot.getImage(),"png",output);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void takeWith(String name,String type, WebElement element, WebDriver aDriver){
        AShot aShot = new AShot();
        Screenshot screenshot = aShot.takeScreenshot(aDriver,element);
        saveImage(name,type,screenshot);
    }

    /***
     * This will waiti 500ms to scroll and take full screenshot
     * This view point, you need to change based on application behavior
     * @param name
     * @param aDriver
     */
    public static void takeFullScreen(String name, WebDriver aDriver){
        takeFullScreen(name, aDriver, 500);
    }
    public static void takeFullScreen(String name, WebDriver aDriver, int scrollTimeout){
        saveImage(name, new AShot().shootingStrategy(ShootingStrategies.viewportPasting(scrollTimeout)).takeScreenshot(aDriver));
    }
}
