package org.automation;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 5/9/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                //"html:target/cucumberReports/",
                "json:target/cucumberReports/cucumber.json" }
        , features = {"src/test/resources/org/automation"}
        , glue = {""})
public class CucumberRunner {
}
