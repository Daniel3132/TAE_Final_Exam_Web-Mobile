package org.globantFinal.tests.stepsDefinition.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.globantFinal.pageObjects.screens.DashBoardScreen;
import org.globantFinal.pageObjects.screens.TutorialScreen;
import org.globantFinal.utils.mobile.ConfigCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileHooks {
    public static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    /*@Before
    public void environmentSetUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ConfigCapabilities.deviceSetUp(capabilities);
        ConfigCapabilities.applicationSetUp(capabilities);
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
    }*/

    @After
    public void mobileApplicationEnd() {
        driver.quit();
    }


}
