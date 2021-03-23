package org.automation.junit5.tests;

import org.automation.Calculator;
import org.automation.junit5.core.CalTest;
import org.automation.junit5.core.CalculatorTest;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCustomAnnotation extends CalculatorTestBase {
    @BeforeEach
    public void initTest(){
        myCal = new Calculator();
    }
    @CalculatorTest
    @CalTest
    public void testWithCustomAnnotation(){
        assertEquals(30,myCal.add(25,5));
    }
}
