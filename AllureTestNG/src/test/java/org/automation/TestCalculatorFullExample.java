package org.automation;


import org.automation.unitTests.TestingCalculator;

import org.automation.testng.annotation.AppId;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.*;
import ru.yandex.qatools.allure.model.SeverityLevel;

/**
 * Created by shantonu on 3/5/16.
 */
@Title("This is for testing calculator")
@Features("CR 256 : Changing home screen template")
@Stories({"User can add two numbers", "User can sub two numbers", "User can multiply two numbers"})
@Description("This is class ")
//@Listeners({RetryListener.class})

public class TestCalculatorFullExample extends TestingCalculator {

    @Test
    @Title("This will add two numbers")
    @Step("Assertion for Addition")
    @Severity(SeverityLevel.CRITICAL)
    @Features("CR 256A :This is adding ")
    @Stories("User can add two numbers")
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

    @Test
    @Title("This will substract two numbers")
    @Step("Assertion for Substraction")
    @Severity(SeverityLevel.BLOCKER)
    @Issue(value = "Ticket id 250")
    @Description("This is method")
    @Features("CR 256B :This is Subtraction ")
    @Stories("User can sub two numbers")
    @AppId( profileIds = "256")
    public void testSub(){
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }

}
