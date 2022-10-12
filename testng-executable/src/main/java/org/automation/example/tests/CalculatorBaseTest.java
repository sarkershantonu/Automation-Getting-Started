package org.automation.example.tests;

import org.automation.example.app.Calculator;
import org.automation.example.listeners.CalculatorTestLogger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(CalculatorTestLogger.class)
public abstract class CalculatorBaseTest {
    protected Calculator calculator;
    @BeforeClass
    public void initClass(){
        calculator = new Calculator();
    }

}
