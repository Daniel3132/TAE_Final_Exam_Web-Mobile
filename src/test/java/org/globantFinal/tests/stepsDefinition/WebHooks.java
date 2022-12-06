package org.globantFinal.tests.stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.globantFinal.configuration.web.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class WebHooks {

    private static WebDriverManager driver;
    private String URL = "https://www.espnqa.com/?src=com&_adblock=true&espn=cloud";


    @Before
    public void setUp() {
        driver = new WebDriverManager();
        driver.getDriver().get(URL);
        driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.getDriver().quit();
    }

    public static WebDriver getDriver() {
        return driver.getDriver();
    }
}
