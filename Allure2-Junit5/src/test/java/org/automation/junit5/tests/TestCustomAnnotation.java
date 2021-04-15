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
    @CalculatorTest
    public void testAddGeneric(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }
}
