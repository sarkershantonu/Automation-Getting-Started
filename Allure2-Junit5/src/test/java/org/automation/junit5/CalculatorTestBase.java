package org.automation.junit5;

import org.automation.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTestBase {
    protected Calculator myCal;

    @BeforeAll
    public static void initForAllTest(){

    }
    @AfterAll
    public static void cleanupForAllTest(){

    }

}
