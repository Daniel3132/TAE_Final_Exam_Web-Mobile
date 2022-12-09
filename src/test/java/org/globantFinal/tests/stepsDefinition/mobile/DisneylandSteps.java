package org.globantFinal.tests.stepsDefinition.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globantFinal.pageObjects.screens.DashBoardScreen;
import org.globantFinal.pageObjects.screens.MapScreen;
import org.globantFinal.pageObjects.screens.TutorialScreen;
import org.globantFinal.pageObjects.screens.menu.MenuScreen;
import org.globantFinal.pageObjects.screens.menu.PrivacyAndLegalScreen;
import org.testng.Assert;

import static org.globantFinal.reporting.Reporter.info;

public class DisneylandSteps {


    ////////////////************** Category **************////////////////
    @Given("The user is on the dashboard screen")
    public void theUserIsOnTheDashboardScreen() {

        /*info("Go to dashboard Screen");


        info("Start Navigation to Map Screen");
        MapScreen map = (MapScreen) dashBoard.goToAScreen("map");

        info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");*/


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


    ////////////////************** Privacy & Legal **************////////////////
    @Given("The user navigate to Menu screen")
    public void theUserNavigateToMenuScreen() {
        /*log.info("Go to dashboard Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();

        log.info("Start Navigation to Menu Screen");
        MenuScreen menu = (MenuScreen) dashBoard.goToAScreen("menu");

        log.info("Scroll down");
        menu.swipeVerticalToEnd();

        log.info("Validate different categories are listed to select");
        validateCategories(menu);

        log.info("Go to Privacy And Legal Screen");
        PrivacyAndLegalScreen privacy = menu.goToPrivacyAndLegal();

        log.info("Validate Page Title is Displayed");
        Assert.assertTrue(privacy.checkTitleIsDisplayed(), "Title is not displayed");

        log.info("Validate options List is displayed");
        Assert.assertTrue(privacy.allOptionsAreIncluded(), "One or more options not displayed");


        */
    }

    @When("User navigate to Privacy & Legal")
    public void userNavigateToPrivacyLegal() {
        /*log.info("Validate My profile option is Displayed");
        Assert.assertTrue(menu.myProfileIsDisplayed(), "My profile option not displayed");

        log.info("Validate Property Rules option is Displayed");
        Assert.assertTrue(menu.propertyRulesIsDisplayed(), "Property Rules option not displayed");

        log.info("Validate Cast Compliment option is Displayed");
        Assert.assertTrue(menu.castComplimentIsDisplayed(), "Cast Compliment option not displayed");

        log.info("Validate Link to Account option is Displayed");
        Assert.assertTrue(menu.linkToAccountIsDisplayed(), "Link to Account option not displayed");

        log.info("Validate Car locator option is Displayed");
        Assert.assertTrue(menu.carLocatorIsDisplayed(), "Car locator option not displayed");

        log.info("Validate Help option is Displayed");
        Assert.assertTrue(menu.helpIsDisplayed(), "Help option not displayed");

        log.info("Validate Privacy and Legal option is Displayed");
        Assert.assertTrue(menu.privacyAndLegalIsDisplayed(), "Privacy and Legal option not displayed");*/
    }

    @Then("The app should display a list of options included Privacy Policy one")
    public void theAppShouldDisplayAListOfOptionsIncludedPrivacyPolicyOne() {
    }


    ////////////////************** Add Plans **************////////////////
    @Given("The user navigate to add plans")
    public void theUserNavigateToAddPlans() {
        /*log.info("Go to dashboard Screen");
        DashBoardScreen dashboard = loadDashBoardScreen();
        dashboard.dismissOptions();

        log.info("Navigate to Add Plans");
        dashboard.openAddPlans();

        log.info("Validate Reserve Dining option is enabled");
        Assert.assertTrue( dashboard.reserveDiningOptionIsEnabled(), "Reserve Dining option is not enabled" );*/
    }

    @When("The app shows the options list")
    public void theAppShowsTheOptionsList() {
    }

    @Then("The Reserve dining option is on the list")
    public void theReserveDiningOptionIsOnTheList() {
    }
}
