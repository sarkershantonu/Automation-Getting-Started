package org.automation.junit5.tests;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTestExample extends CalculatorTestBase {

    @ParameterizedTest
    @CsvFileSource(resources = "/addition.csv",numLinesToSkip = 1)
    public void testCSVfileParameter(String a, String b, String result){
        Assertions.assertEquals(Double.valueOf(result).doubleValue(),myCal.add(Double.valueOf(a).doubleValue(),Double.valueOf(b).doubleValue()));
    }

    @ParameterizedTest
    @CsvSource({})
    public void testCSVParseParameter(){

    }

    @ParameterizedTest
    @ValueSource(ints = {5,6,7})
    public void testValueSource(int input){
        Assertions.assertEquals(input*2,myCal.add(input,input));
    }

    @ParameterizedTest
    @NullSource
    public void testNullSource(String input_null){
        Assertions.assertTrue(null==input_null);
    }
    @ParameterizedTest
    @EmptySource
    public void testEmptySource(String input_empty){
        Assertions.assertTrue(input_empty.equals(""));
    }

    /***
     * One of the test will fail as it gives array of one null & empty string
     * @param input_Null_empty
     */
    @ParameterizedTest
    @NullAndEmptySource
    public void testEmptyNullSource(String input_Null_empty){
        Assertions.assertTrue(input_Null_empty.equals(""));
    }
}
