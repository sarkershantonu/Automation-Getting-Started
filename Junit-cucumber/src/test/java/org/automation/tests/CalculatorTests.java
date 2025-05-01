package org.automation.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/cucumberReport",
        "json:target/cucumber.json" }
        , features = {"src/test/resources/features/calculator.feature"}
        , glue = {""})

public class CalculatorTests {
}
