package org.automation.tests.suites;

import org.automation.tests.TestCalculator;
import org.automation.tests.TestCalculatorWithCustomRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCalculator.class, TestCalculatorWithCustomRunner.class})
public class AllTests {
}
