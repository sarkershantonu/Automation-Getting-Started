package org.automation.junit5.tests;

import org.automation.junit5.core.CalculatorTestBase;
import org.automation.junit5.core.NameGenerator;
import org.junit.jupiter.api.DisplayNameGeneration;

@DisplayNameGeneration(NameGenerator.class)
public class DisplayNameGenerationExample extends CalculatorTestBase {
}
