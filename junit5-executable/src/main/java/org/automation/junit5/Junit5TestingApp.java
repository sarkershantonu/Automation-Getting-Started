package org.automation.junit5;

import org.automation.junit5.runner.Junit5TestClassRunner;
import org.automation.junit5.runner.Junit5TestPackageRunner;
import org.automation.junit5.tests.AdhocTests;
import org.automation.junit5.tests.ExceptionTests;

/**
 * Hello world!
 *
 */
public class Junit5TestingApp
{
    public static void main( String[] args )
    {
        runJunit5PackageTests();

    }

    public static void runJunit5Tests(){
        System.out.println( "Starting Junit5 Test Runner" );

        Junit5TestClassRunner runner = new Junit5TestClassRunner(new Class[]{AdhocTests.class, ExceptionTests.class});
        runner.run();
    }
    public static void runJunit5PackageTests(){
        System.out.println( "Starting Junit5 Package Runner" );

        Junit5TestPackageRunner runner = new Junit5TestPackageRunner("org.automation.junit5.tests");
        runner.run();
    }
}
