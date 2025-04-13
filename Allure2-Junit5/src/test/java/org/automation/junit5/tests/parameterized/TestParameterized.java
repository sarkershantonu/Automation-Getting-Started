package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;

import static org.automation.junit5.core.StringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.*;

import org.automation.junit5.support.ErrorStringProvider;
import org.automation.junit5.support.VariableStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class TestParameterized extends CalculatorTestBase {

    static Stream<Arguments> arguments = Stream.of(
            Arguments.of(null,true),
            Arguments.of("",true),
            Arguments.of(" ",true),
            Arguments.of("shantonu",false));

    /**
     * todo:broken
     * Custom Annotation
     * VariableStream will inject variable field
     *
     * @param input
     * @param expected
     */
    @ParameterizedTest
    @VariableStream("arguments")
    public void customAnnotationForInput(String input, boolean expected){
    assertEquals(expected, isBlank(input));
    }




}
