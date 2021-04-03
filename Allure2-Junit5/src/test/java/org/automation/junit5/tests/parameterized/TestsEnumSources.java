package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by shantonu on 4/2/2021
 */
public class TestsEnumSources extends CalculatorTestBase {
    @ParameterizedTest
    @EnumSource(Month.class)
    public void testEnumSource(Month month){
        assertTrue(month.getValue()>=1&& month.getValue()<=12);
    }
    @ParameterizedTest
    @EnumSource
    public void testEnumSourceNoClass(Month month){
        assertTrue(month.getValue()>=1&& month.getValue()<=12);
    }

    /**
     * Non Leap Year testing
     * false = not leap year
     * @param month
     */
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JANUARY","MARCH","MAY","JULY"})
    public void testEnumSourceWithData(Month month){
        assertEquals(31,month.length(false));
    }
    @ParameterizedTest
    @EnumSource(value = Month.class, names = { "FEBRUARY","APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}, mode = EnumSource.Mode.EXCLUDE)
    public void testEnumSourceExcludeData(Month month){
        assertEquals(31,month.length(false));
    }
    @ParameterizedTest
    @EnumSource(value = Month.class, names = ".+Y",mode = EnumSource.Mode.MATCH_ANY)
    public void testEnumWithDataRegex(Month month){
        assertTrue(month.toString().endsWith("Y"),"Not Ends with Y");

    }

    /***
     * Customizing Display Names
     * @param month
     */
    @ParameterizedTest(name = "Test {index} : {0} has 30 dates")
    @EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testEnumSourceCustomName(Month month){
        assertEquals(30, month.length(false));
    }
}
