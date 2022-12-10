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

public class MobileHooks {

    public static AndroidDriver<AndroidElement> driver;
    protected static TutorialScreen tutorialScreen;

    public void setUpStartApp() {
        tutorialScreen = new TutorialScreen(getDriver());
    }

    @Before
    public void environmentSetUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        ConfigCapabilities.deviceSetUp(capabilities);
        ConfigCapabilities.applicationSetUp(capabilities);
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException exception) {
            exception.printStackTrace();
        }
        setUpStartApp();
    }


    @After
    public void mobileApplicationEnd() {
        driver.quit();
    }

    /**
     * return the driver.
     *
     * @return driver
     * @author Arley.Bolivar
     */
    public AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    /**
     * return SignUpOrLogInScreen after close the alerts.
     *
     * @return SignUpOrLogInScreen
     * @author Arley.Bolivar
     */
    protected static DashBoardScreen loadDashBoardScreen() {
        tutorialScreen.startPermissionsProcess();
        return tutorialScreen.shareLocationPermissions();
    }
}
