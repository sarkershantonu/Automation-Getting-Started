package org.automation.junit5.tests;

import org.automation.junit5.core.CalculatorTestBase;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderExample extends CalculatorTestBase {
}
