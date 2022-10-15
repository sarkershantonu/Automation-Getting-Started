package org.automation.junit5.tests;

import org.automation.junit5.app.Calculator;
import org.junit.jupiter.api.BeforeAll;

public abstract class CalculatorTestBase {
    protected static Calculator calculator;
    @BeforeAll
    public static void initClass(){
        calculator = new Calculator();
    }

}
