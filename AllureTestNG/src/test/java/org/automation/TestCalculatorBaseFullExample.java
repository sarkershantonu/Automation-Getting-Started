package org.automation;


import io.qameta.allure.*;
import org.automation.core.TestCalculatorBase;

import org.automation.testng.annotation.AppId;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by shantonu on 3/5/16.
 */

@Features({@Feature("CR 256 : Changing home screen template")})
@Stories({@Story("User can add two numbers"), @Story("User can sub two numbers"),
        @Story("User can multiply two numbers")})
public class TestCalculatorBaseFullExample extends TestCalculatorBase {

    @Test
    @Description("This will add two numbers")
    @Step("Assertion for Addition")
    @Severity(SeverityLevel.CRITICAL)

    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

    @Test
    @Description("This will substract two numbers")
    @Step("Assertion for Substraction")
    @Severity(SeverityLevel.BLOCKER)
    @Issue(value = "Ticket id 250")
    @AppId( profileIds = "256")
    public void testSub(){
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }

}
