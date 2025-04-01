package org.automation;

import org.junit.runner.RunWith;

/**
 * Created by shantonu on 5/9/16.
 * update apr 1 , 2025
 */
@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "src/test/resources/features",
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "progress",
                "summary"
        }
)
public class CucumberRunner {
}
