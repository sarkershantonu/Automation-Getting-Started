package org.automation.tests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 5/9/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty",
        "html:target/cucumberReport",
        "json:target/cucumber.json" }
        , features = {"src/test/resources/features"}
        , glue = {""})

public class CucumberTest {
}
