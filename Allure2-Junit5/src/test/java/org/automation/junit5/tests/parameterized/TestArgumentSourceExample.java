package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.automation.junit5.support.ErrorStringProvider;
import org.automation.junit5.support.SpatialStringProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.automation.junit5.core.StringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestArgumentSourceExample extends CalculatorTestBase {
    /***
     * Custom Argument Provider
     * @param input
     */
    @ParameterizedTest
    @ArgumentsSource(ErrorStringProvider.class)
    public void testErrorsStringAsArgument(String input){
        assertTrue(isBlank(input));
    }
    @ParameterizedTest
    @ArgumentsSource(SpatialStringProvider.class)
    public void testCharacterStringAsArgument(String input){
        assertFalse(isBlank(input));
    }

}
