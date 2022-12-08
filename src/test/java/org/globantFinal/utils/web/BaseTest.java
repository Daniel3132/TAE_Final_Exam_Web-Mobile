/*
package org.globantFinal.espn.utils.tests;

import org.globantFinal.configuration.web.CustomWebDriverManager;
import org.globantFinal.espn.pages.HomePage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;



public class BaseTest {

    protected final String EMAIL = "utyd_qarr@kygur.com";
    protected final String PASSWORD = "hGWKrb7*ZU2Y,_.";
    protected HomePage home;
    private CustomWebDriverManager driver;

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    */
/*@Parameters({"browser", "url"})
    @BeforeTest
    public void testSetup(String browser, String url) {
        driver = new Driver();
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        home = new HomePage(driver.getDriver());
    }*//*


    @AfterTest
    public void tearDown() {
        driver.getDriver().quit();
    }

    protected void fastLogin() {
        home.switchToBanner();
        home.closeBanner();
        home.switchToHome();
        home.openLoginModal();
        home.switchToModal();
        home.fillUsernameEmailInput(EMAIL);
        home.fillPasswordInput(PASSWORD);
        home.submitLoginForm();
        home.switchToHome();
    }

}
*/
