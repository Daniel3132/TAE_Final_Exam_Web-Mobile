package org.globantFinal.tests.stepsDefinition.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globantFinal.pageObjects.screens.DashBoardScreen;
import org.globantFinal.pageObjects.screens.MapScreen;
import org.globantFinal.pageObjects.screens.TutorialScreen;
import org.globantFinal.utils.mobile.ConfigCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

import static org.globantFinal.reporting.Reporter.info;

public class DisneylandSteps {

    @Given("The user is on the dashboard screen")
    public void theUserIsOnTheDashboardScreen() {
        TutorialScreen tutorial = new TutorialScreen(mobileHooks.getDriver());
        info("Go to dashboard Screen");
        DashBoardScreen dashBoard = tutorial.loadDashBoardScreen();

        info("Start Navigation to Map Screen");
        MapScreen map = (MapScreen) dashBoard.goToAScreen("map");

        info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");


        //tapCategoryList(map);
    }

    @Given("The user navigate to map screen")
    public void theUserNavigateToMapScreen() {
        info("theUserNavigateToMapScreen");
    }

    @When("The user opens the category list")
    public void theUserOpensTheCategoryList() {
        info("theUserOpensTheCategoryList");
    }

    @Then("The app should display a list of options included Hotels one")
    public void theAppShouldDisplayAListOfOptionsIncludedHotelsOne() {
        info("theAppShouldDisplayAListOfOptionsIncludedHotelsOne");
    }
}
