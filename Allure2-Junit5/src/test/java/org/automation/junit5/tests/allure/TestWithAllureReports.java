package org.automation.junit5.tests.allure;

import io.qameta.allure.*;
import org.automation.junit5.core.CalculatorTestBase;
import org.automation.junit5.core.ScreenShotUtil;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shantonu on 3/29/2021
 */
@Epic("We Need to Develop A calculator")
@Feature("Adding two values")
@Story("An User should be able to add ")
@Owner("shantonu")
public class TestWithAllureReports extends CalculatorTestBase {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Adding two int ")
    @Lead("shantonu.sarker")
    @Owner("shantonu")
    @Story("An User should be able to add two numbers")
    @Issue("WW-21")
    @Epic("Adding functionality of Adding two int ")
    public void testAdd(){
        assertEquals(30,myCal.add(25,5));
    }

    @Test
    @Epics({@Epic("Adding functionality of Adding two int "),@Epic("A screenshot should be taken when we are adding")})
    public void testAddWIthScreenshot() throws IOException, AWTException {
        assertEquals(30,myCal.add(25,5));
        ScreenShotUtil.capturePNG();
    }
    @Test
    @Description("Adding two Strings ")
    @Owner("shantonu")
    @Lead("shantonu.sarker")
    @Story("An User should be able to add two strings")
    @Severity(SeverityLevel.CRITICAL)
    public void testAddStrings(){
        assertEquals("shantonusarker",myCal.add("shantonu","sarker"));
    }


    @Test
    @Severity(SeverityLevel.MINOR)
    @Lead("shantonu.sarker")
    @Description("Adding all items from an int Array")
    @Owner("shantonu")
    @Story("An User should be able to add all items in an array if integers")
    public void testAddIntArray(){
        int[] data = {5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Adding all items from an Integer Array")
    @Lead("shantonu.sarker")
    @Owner("shantonu")
    @Story("An User should be able to add all items in an array if integers")
    @Issue("WW-25")
    @Link(name = "requirements", url="https://www.programiz.com/c-programming/examples/add-numbers",type = "Trello")
    public void testAddIntegerArray(){
        Integer[] data = new Integer[]{5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }

    @Test
    @Severity(SeverityLevel.TRIVIAL)
    @Description("Adding two integer & double values")
    @Lead("shantonu.sarker")
    @Owner("shantonu")
    @Story("An User should be able to add integer & double numbers")
    public void testAddMixType(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Adding two decimal values")
    @Flaky
    @Lead("shantonu.sarker")
    @Owner("shantonu")
    @Story("An User should be able to add two numbers")
    public void testAddDecimal(){
        double a = 2.4, b =5.2;
        assertEquals(7.6, myCal.add(a,b), "double adding ");
    }
}
