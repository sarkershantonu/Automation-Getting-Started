package org.automation.junit5.tests.parameterized;

import org.automation.junit5.support.MyFloatDataValueSource;
import org.junit.jupiter.params.ParameterizedTest;

public class TestCustomValueSources {
    @ParameterizedTest
    @MyFloatDataValueSource
    public void testFloatValueSource(float input){
        System.out.println(input);
    }
}
