package org.automation.junit5.tests;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExample extends CalculatorTestBase {

    @ParameterizedTest
    @CsvFileSource(resources = "/addition.csv",numLinesToSkip = 1)
    public void testCSVfileParameter(String a, String b, String result){

    }

    @ParameterizedTest
    @CsvSource({})
    public void testCSVParseParameter(){

    }

    @ParameterizedTest
    @ValueSource
    public void testValueSource(){

    }

}
