package org.automation.junit5.allure;

import io.qameta.allure.*;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shantonu on 3/29/2021
 */
@Epic("We Need to Develop A calculator")
@Feature("Adding two values")
@Story("An User should be able to add ")
@Owner("shantonu")
public class TestAdditionExamplesForAllureReports extends CalculatorTestBase {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    @Description("Adding two int ")
    @Lead("shantonu.sarker")
    @Owner("shantonu")
    @Story("An User should be able to add two numbers")
    public void testAdd(){
        assertEquals(30,myCal.add(25,5));
    }

    @Test
    @Description("Adding two Strings ")
    @Owner("shantonu")
    @Lead("shantonu.sarker")
    @Story("An User should be able to add two strings")
    public void testAddStrings(){
        assertEquals("shantonusarker",myCal.add("shantonu","sharker"));
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
