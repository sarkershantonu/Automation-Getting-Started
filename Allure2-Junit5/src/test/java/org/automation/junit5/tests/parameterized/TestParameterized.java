package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;

import static org.automation.junit5.core.StringUtil.isBlank;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.Month;
import java.util.stream.Stream;

public class TestParameterized extends CalculatorTestBase {

    static Stream<Arguments> arguments = Stream.of(
            Arguments.of(null,true),
            Arguments.of("",true),
            Arguments.of(" ",true),
            Arguments.of("shantonu",false));

    /**
     * Custom Annotation
     * TO DO : Currently Not Working
     * @param input
     * @param expected
     */
    @ParameterizedTest
    @VariableStream("arguments")
    public void customAnnotationForInput(String input, boolean expected){
    assertEquals(expected, isBlank(input));
    }



    @ParameterizedTest
    @MethodSource("org.automation.junit5.core.StringParameters#emptyStrings")
    public void testMethodSource(String input){
        assertTrue(isBlank(input));
    }

    /***
     * Custom Argument Provider
     * @param input
     */
    @ParameterizedTest
    @ArgumentsSource(ErrorStringProvider.class)
    public void testArgumentsSource(String input){
        assertTrue(isBlank(input));
    }
    @ParameterizedTest
    @ValueSource(ints = {5,6,7})
    public void testValueSource(int input){
        assertEquals(input*2,myCal.add(input,input));
    }

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
