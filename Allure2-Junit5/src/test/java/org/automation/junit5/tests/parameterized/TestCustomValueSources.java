package org.automation.junit5.tests.parameterized;

import org.automation.junit5.support.*;
import org.junit.jupiter.params.ParameterizedTest;

public class TestCustomValueSources {
    @ParameterizedTest
    @MyFloatDataValueSource
    public void testFloatValueSource(float input){
        System.out.println(input);
    }
    @ParameterizedTest
    @MyBooleanDataValueSource
    public void testBooleanValueSource(boolean input){
        System.out.println(input);
    }

    @ParameterizedTest
    @MyLongDataValueSource
    public void testLongValueSource(long input){
        System.out.println(input);
    }

    @ParameterizedTest
    @MyShortDataValueSource
    public void testShortValueSource(short input){
        System.out.println(input);
    }
    @ParameterizedTest
    @MyCharDataValueSource
    public void testCharValueSource(char input){
        System.out.println( input);
    }
    @ParameterizedTest
    @MyDoubleDataValueSource
    public void testDoubleValueSource(double input){
        System.out.println( input);
    }
    @ParameterizedTest
    @MyIntDataValueSource
    public void testIntValueSource(int input){
        System.out.println( input);
    }
    @ParameterizedTest
    @MyClassAsValueSource
    public void testClassValueSource(Class<?> input){
        System.out.println( input.getDeclaredFields()[0]);//first field , usually ID
    }


}
