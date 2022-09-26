package org.automation.example.tests;

import org.automation.example.app.Calculator;
import org.testng.annotations.BeforeClass;

public abstract class CalculatorBaseTest {
    protected Calculator calculator;
    @BeforeClass
    public void initClass(){
        calculator = new Calculator();
    }

}
