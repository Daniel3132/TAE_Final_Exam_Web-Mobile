package org.globantFinal.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@web",
        features = {"src/test/java/org/globantFinal/tests/features/ESPN.feature"},
        glue = {"org/globantFinal/tests/stepsDefinition"},
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"
        })

public class EspnCucumberRunnerTests extends AbstractTestNGCucumberTests {
}