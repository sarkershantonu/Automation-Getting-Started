package org.automation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by shantonu on 5/9/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumberReport","json:target/cucumber.json" }
        , features = {"src/test/resources/org/automation"}
        , glue = {""})
public class CucumberTest {
}
