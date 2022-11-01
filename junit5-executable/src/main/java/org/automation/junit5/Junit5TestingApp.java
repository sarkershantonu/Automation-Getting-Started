package org.automation.junit5;

import org.automation.junit5.runner.Junit5Runner;
import org.automation.junit5.tests.AdhocTests;
import org.automation.junit5.tests.ExceptionTests;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Junit5TestingApp
{
    public static void main( String[] args )
    {
        runJunit5Tests();

    }

    public static void runJunit5Tests(){
        System.out.println( "Starting Junit5 Test Runner" );

        Junit5Runner runner = new Junit5Runner(Arrays.asList(new Class[]{AdhocTests.class, ExceptionTests.class}));
        runner.runAll();
    }
}
