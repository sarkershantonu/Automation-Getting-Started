package org.automation.suits;

/**
 * Created by shantonu on 7/16/16.
 */
import org.automation.UnitTests.CalculatorTest;
import org.automation.UnitTests.MultipleDataLoader;
import org.easetech.easytest.annotation.ParallelSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@ParallelSuite(threads = 3)
@Suite.SuiteClasses({CalculatorTest.class, MultipleDataLoader.class})
public class ParallelSuit {
}
