package org.automation.junit5.tests;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExceptionTests extends CalculatorJunit5TestBase {

    @Test
    public void testAdd(){
        assertEquals(calculator.add(5.0,3L),8,"Addition Fail");
    }

    @Test
    public void testFail(){
        assertEquals(calculator.add(5.0,3),9,"Addition Fail");
    }
}
