package org.automation.junit5.tests.parameterized;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.FieldSource;

import java.util.Arrays;
import java.util.List;

public class TestFieldSource extends CalculatorTestBase {

    static List<Integer> firstInputs = Arrays.asList(new Integer[] {25,30,40});
    static List<Integer> secondInput = Arrays.asList(new Integer[] {25,30,40});
    static List<Integer> results = Arrays.asList(new Integer[] {50,60,80});

    @ParameterizedTest
    @FieldSource({"firstInputs","secondInput","results"})
    public void testFieldSource(Integer a, Integer b, Integer result){
        Assertions.assertEquals(result,myCal.add(a,b));
    }
}
