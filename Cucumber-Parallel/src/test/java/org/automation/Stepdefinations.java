package org.automation;

import cucumber.api.java.en.*;
import org.calculator.Calculator;
import org.junit.Assert;

/**
 * Created by shantonu on 5/11/16.
 */
public class Stepdefinations {

    private Calculator calculator;
    private double result;
    private Exception actualException;

    @Given("^I want to test calculator$")
    public void i_want_to_test_calculator() throws Throwable {
        calculator = new Calculator();
    }

    @Then("^I got (.+) as result$")
    public void i_got_as_result(double arg1) throws Throwable {
        Assert.assertEquals(result, arg1, 0.05);
    }

    @When("^I insert (.+) and (.+) for adding$")
    public void i_in_insert_for_adding(double arg1, double arg2) throws Throwable {
        result = calculator.add(arg1, arg2);
    }


    @When("^I insert (.+) and (.+) for subtraction$")
    public void iInsertAndForSubtraction(double arg0, double arg1) throws Throwable {
        result = calculator.sub(arg0, arg1);
    }

    @When("^I insert (.+) and (.+) for multiplication$")
    public void iInsertAAndBForMultiplication(double arg0, double arg1) throws Throwable {
        result = calculator.mul(arg0, arg1);
    }

    @When("^I insert (.+) and (.+)for division$")
    public void iInsertAndForDivision(double arg0, double arg1) throws Throwable {
        try {
            result = calculator.div(arg0, arg1);
        } catch (Exception e) {
            actualException =e;
        }
    }

    @Then("^I got Exception (.+)")
    public void iGotArithmeticException(String aException) throws Throwable {
        //Assert.assertEquals("Exception MissMatch",aException,((ArithmeticException) actualException).getClass().getSimpleName());
        Assert.assertEquals("Exception MissMatch",aException,actualException.getClass().getSimpleName());
    }
}
