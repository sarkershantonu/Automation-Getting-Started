package org.automation.junit5.tests;

import org.automation.junit5.app.Calculator;
import org.automation.junit5.reporting.TestLoggerExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TestLoggerExtension.class)
public abstract class CalculatorJunit5TestBase {
    protected static Calculator calculator;
    @BeforeAll
    public static void initClass(){
        calculator = new Calculator();
    }

}
