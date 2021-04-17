package org.automation.junit5.tests.intance;

import org.automation.Calculator;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shantonu on 4/17/2021
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestPerClassInstanceExample extends CalculatorTestBase {
    public TestPerClassInstanceExample(){
        System.out.println("TEST INSTANCE, single for each test class");//should print once though two method present
    }
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
}
