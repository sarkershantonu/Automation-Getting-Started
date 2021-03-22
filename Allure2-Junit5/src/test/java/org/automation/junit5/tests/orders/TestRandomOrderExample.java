package org.automation.junit5.tests.orders;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class TestRandomOrderExample extends CalculatorTestBase {
}
