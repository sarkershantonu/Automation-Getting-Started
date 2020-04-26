package org.automation.junit5.tests;

import org.automation.Calculator;
import org.automation.junit5.CalculatorTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestAddition extends CalculatorTestBase {
    @BeforeEach
    public void initTest(){
        myCal = new Calculator();
    }
    @Test
    public void testAddSingle(){
        assertEquals(30,myCal.add(25,5));
    }
    @Test
    public void testAddInt(){
        int[] data = {5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    public void testAddArray(){
        Integer[] data = new Integer[]{5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    public void testAddGeneric(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }
}
