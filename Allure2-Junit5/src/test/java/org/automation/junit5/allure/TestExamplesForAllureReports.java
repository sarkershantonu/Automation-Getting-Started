package org.automation.junit5.allure;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by shantonu on 3/29/2021
 */

public class TestExamplesForAllureReports extends CalculatorTestBase {
    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void testAdd(){
        assertEquals(30,myCal.add(25,5));
    }
    @Test
    @Severity(SeverityLevel.MINOR)
    public void testAddIntArray(){
        int[] data = {5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    public void testAddIntegerArray(){
        Integer[] data = new Integer[]{5,10,25,6,4};
        assertEquals(50,myCal.add(data));
    }
    @Test
    @Severity(SeverityLevel.TRIVIAL)
    public void testAddMixType(){
        Double[] data_double = new Double[]{15.0,25.1,4.9};
        Integer[] data_int = new Integer[]{15,5,10};
        assertEquals(45.0,myCal.add(data_double));
        assertEquals(30,myCal.add(data_int));
    }
    @Test
    @Severity(SeverityLevel.NORMAL)
    public void testAddDecimal(){
        double a = 2.4, b =5.2;
        assertEquals(7.6, myCal.add(a,b), "double adding ");
    }
}
