package org.globantFinal.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * Select the features that will run and the steps definition file for web
 */
@CucumberOptions(
        tags = "@web",
        features = {"src/test/java/org/globantFinal/tests/features/Espn.feature"},
        glue = {"org/globantFinal/tests/stepsDefinition/web"},
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"
        })

public class EspnCucumberRunnerTests extends AbstractTestNGCucumberTests {
}