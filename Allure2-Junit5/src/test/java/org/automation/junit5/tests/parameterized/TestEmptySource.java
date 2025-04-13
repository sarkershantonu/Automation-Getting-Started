package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.automation.junit5.core.StringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEmptySource extends CalculatorTestBase {
    @ParameterizedTest
    @NullSource
    public void testNullSource(String input_null){
        assertTrue(null==input_null);
    }
    @ParameterizedTest
    @EmptySource
    public void testEmptySource(String input_empty){
        assertTrue(input_empty.equals(""));
    }

    /***
     * One of the test will fail as it gives array of one null & empty string
     * @param input_Null_empty
     */
    @ParameterizedTest
    @NullAndEmptySource
    public void testEmptyNullSource(String input_Null_empty){
        assertTrue(isBlank(input_Null_empty));
    }

}
