package org.automation;


import io.qameta.allure.*;
import org.automation.core.TestingCalculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shantonu on 3/5/16.
 */

@Features({@Feature("CR 256 : Changing home screen template"),@Feature("F123423")})
@Stories({@Story("User can add two numbers"), @Story("User can sub two numbers"), @Story("User can multiply two numbers")})
public class TestCalculatorFullExample extends TestingCalculator {

    @Test

    @Step("Assertion for Addition")
    @Severity(SeverityLevel.CRITICAL)
    @Feature("CR 256A :This is adding ")
    @Story("User can add two numbers")
    public void testAddition(){
        Assert.assertEquals(25.0, aCalculator.add(10.0,15.0), 0.01);
    }

    @Test

    @Step("Assertion for Subtraction\n"+"\n SUB \n"+"New Line added")//does not work in multiple lines
    @Severity(SeverityLevel.BLOCKER)
    @Issue(value = "Ticket id 250")
    @Description("This is method")
    @Feature("CR 256B :This is Subtraction ")
    @Stories({@Story("User can sub two numbers"),@Story("This will do substruction"),
            @Story("Among two numbers")} )   //multi line stories
    public void testSub(){
        Assert.assertEquals(25.0, aCalculator.sub(10.0,15.0), 0.01);
    }

}
