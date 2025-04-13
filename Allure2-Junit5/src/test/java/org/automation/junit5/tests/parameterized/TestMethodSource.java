package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.automation.junit5.core.StringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMethodSource extends CalculatorTestBase {
    @ParameterizedTest
    @MethodSource("org.automation.junit5.support.StringParameters#emptyStrings")
    public void testMethodSource(String input){
        assertTrue(isBlank(input));
    }

}
