package org.globantFinal.tests.stepsDefinition.web;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.globantFinal.configuration.web.WebDriverManager;
import org.globantFinal.utils.web.PageConstants;
import org.openqa.selenium.WebDriver;


public class WebHooks implements PageConstants {

    private static WebDriverManager driver;

    public static WebDriver getDriver() {
        return driver.getDriver();
    }

    @Before
    public void initBrowser() {
        driver = new WebDriverManager();
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.getDriver().quit();
    }
}
