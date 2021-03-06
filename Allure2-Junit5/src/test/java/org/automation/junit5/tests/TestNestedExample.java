package org.automation.junit5.tests;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestNestedExample extends CalculatorTestBase {
    public void testAddArray(){
        Integer[] data = new Integer[]{5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    @Tag("releaseA")
    public void testAddGeneric(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }

    @Nested
    class TestDecimalNumbers {

        @Test
        @Tag("releaseB")
        public void testAddDecimal(){
            double a = 2.4, b =5.2;
            assertEquals(7.6, myCal.add(a,b), "double adding ");
        }
    }
}
