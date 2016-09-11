package org.automation.unitTests.parameter;

import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Parameter;

/**
 * Created by shantonu on 9/11/16.
 * Allure parameters are all about environment parameters
 * This is default way to use this
 */
public class TestWithParameterDefaultExample extends TestingCalculator {

    @Parameter("PC OS Name")
    private String osName;
    @Parameter("PC browser")
    private String browser;
    @Parameter("PC Resolution")
    private String resolution;
    @Test
    public void testAddition() {
        osName = "XP";
        resolution = "1024x768";
        browser = "Firefox";
        Assert.assertEquals(25.0, aCalculator.add(10.0, 15.0), 0.01);
    }
    @Test
    public void testSub(){//fail example
        osName = "Win7";
        resolution = "1920x1080";
        browser = "Internet Explorer";
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }
    @Test
    public void testMul(){

        osName = "MAC";
        resolution = "3840x2160";
        browser = "Safari";
        Assert.assertEquals(250.0, aCalculator.mul(10.0,25.0), 0.01);
    }
    @Test
    public void testDiv(){
        osName = "WIN10";
        resolution = "3840x2160";
        browser = "Chrome";
        Assert.assertEquals(5.0, aCalculator.div(250.0,50.0), 0.01);
    }
    @Test
    public void testReminder(){
        osName = "Ubuntu";
        resolution = "3840x2160";
        browser = "Firefox";
        Assert.assertEquals(1.0, aCalculator.mod(25.0,3.0), 0.01);
    }

}
