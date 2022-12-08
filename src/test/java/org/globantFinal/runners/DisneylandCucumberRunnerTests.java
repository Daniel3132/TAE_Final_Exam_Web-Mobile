package org.globantFinal.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@mobile",
        features = {"src/test/java/org/globantFinal/tests/features/Disneyland.feature"},
        glue = {"org/globantFinal/tests/stepsDefinition/mobile"},
        plugin = {
                "pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json"
        })

public class DisneylandCucumberRunnerTests extends AbstractTestNGCucumberTests {
}