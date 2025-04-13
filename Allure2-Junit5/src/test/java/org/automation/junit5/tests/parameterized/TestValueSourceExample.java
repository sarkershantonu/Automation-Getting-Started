package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestValueSourceExample extends CalculatorTestBase {
    @ParameterizedTest
    @ValueSource(ints = {5,6,7})
    public void testValueSource(int input){
        assertEquals(input*2,myCal.add(input,input));
    }

}
