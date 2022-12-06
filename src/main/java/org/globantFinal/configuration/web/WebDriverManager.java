package org.globantFinal.configuration.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {
    private WebDriver driver;

    public WebDriverManager() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return this.driver;
    }

}
