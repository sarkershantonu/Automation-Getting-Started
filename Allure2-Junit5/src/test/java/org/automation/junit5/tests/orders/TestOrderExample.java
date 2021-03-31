package org.automation.junit5.tests.orders;

import org.automation.Calculator;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderExample extends CalculatorTestBase {
    @BeforeEach
    public void initTest(){
        myCal = new Calculator();
    }
    @Test
    @Order(1)
    public void testAddSingle(){
        assertEquals(30,myCal.add(25,5));
    }
    @Test
    @Order(5)
    public void testAddInt(){
        int[] data = {5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    @Order(3)
    public void testAddArray(){
        Integer[] data = new Integer[]{5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    @Order(2)
    public void testAddGeneric(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }
    @Test
    @Order(4)
    public void testAddDecimal(){
        double a = 2.4, b =5.2;
        assertEquals(7.6, myCal.add(a,b), "double adding ");
    }
}
