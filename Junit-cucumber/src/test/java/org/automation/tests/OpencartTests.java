package org.automation.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/cucumberReport",
        "json:target/cucumber.json" }
        , features = {
        "src/test/resources/features/search.feature",
        "src/test/resources/features/search2.feature"
}
        , glue = {""})

public class OpencartTests {
}
