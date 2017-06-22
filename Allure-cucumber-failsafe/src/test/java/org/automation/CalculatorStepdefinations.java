package org.automation;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import org.calculator.Calculator;
import org.junit.Assert;

/**
 * Created by shantonu on 5/11/16.
 */
public class CalculatorStepdefinations {

    private Calculator calculator;
    private double result;

    @Given("^I want to test calculator$")
    public void i_want_to_test_calculator() throws Throwable {
        calculator = new Calculator();
    }

    @Then("^I got (.+) as result$")
    public void i_got_as_result(double arg1) throws Throwable {
        Assert.assertEquals(result,arg1,0.05);
    }
    @When("^I in insert (.+) and (.+)$")
    public void i_in_insert(double arg1, double arg2) throws Throwable {

        result = calculator.add(arg1,arg2);
    }


}
