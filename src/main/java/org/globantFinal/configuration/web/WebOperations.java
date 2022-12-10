package org.globantFinal.configuration.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.PageFactory.initElements;

public class WebOperations {
    private final WebDriver driver;
    private final WebDriverWait wait;

    /**
     * Constructor to define the driver and the wait with its duration time
     *
     * @param driver WebDriver
     */
    public WebOperations(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10L);
        initElements(driver, this);
    }

    /**
     * Get the driver which is private
     *
     * @return driver of type WebDriver
     */
    public WebDriver getWebDriver() {
        return this.driver;
    }

    /**
     * Receives an element, waits for it to be clickable and clicks it.
     *
     * @param element of type WebElement
     */
    public void clickElement(WebElement element) {
        this.waitForClickable(element);
        element.click();
    }

    /**
     * Receives an element, waits for it to be clickable.
     *
     * @param element of type WebElement
     */
    public void waitForClickable(WebElement element) {
        this.wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Check an element (input) to be visible and write a text on it.
     *
     * @param element of type WebElement
     * @param text    to write
     */
    public void typeOnInput(WebElement element, String text) {
        this.waitForVisibility(element);
        element.sendKeys(text);
    }

    /**
     * Receives an element, waits for it to be visible.
     *
     * @param element of type WebElement
     */
    public void waitForVisibility(WebElement element) {
        this.wait.until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Receives an element, waits for it to be invisible.
     *
     * @param element of type WebElement
     */
    public void waitForInvisibility(WebElement element) {
        this.wait.until(ExpectedConditions.invisibilityOf(element));
    }

    /**
     * Receives an element, waits for it to be visible.
     * Go to the element to perform a mouse over
     *
     * @param element of type WebElement
     */
    public void mouseOver(WebElement element) {
        this.waitForVisibility(element);
        new Actions(getWebDriver()).moveToElement(element).perform();
    }

    /**
     * Receives an element, waits for it to be refreshed.
     *
     * @param element of type WebElement
     */
    public void refreshed(WebElement element) {
        this.wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
    }
}