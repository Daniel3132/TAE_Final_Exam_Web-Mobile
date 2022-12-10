package org.globantFinal.tests.stepsDefinition.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globantFinal.pageObjects.screens.DashBoardScreen;
import org.globantFinal.pageObjects.screens.MapScreen;
import org.globantFinal.pageObjects.screens.menu.MenuScreen;
import org.globantFinal.pageObjects.screens.menu.PrivacyAndLegalScreen;
import org.testng.Assert;

import static org.globantFinal.reporting.Reporter.info;

public class DisneylandSteps {

    private DashBoardScreen dashBoard;
    private MapScreen map;
    private MenuScreen menu;
    private PrivacyAndLegalScreen privacy;

    ////////////////************** Category **************////////////////
    @Given("The user is on the dashboard screen")
    public void theUserIsOnTheDashboardScreen() {
        info("Go to dashboard Screen");
        dashBoard = MobileHooks.loadDashBoardScreen();
        dashBoard.dismissOptions();
    }

    @Given("The user navigate to map screen")
    public void theUserNavigateToMapScreen() {
        info("Start Navigation to Map Screen");
        map = (MapScreen) dashBoard.goToAScreen("map");

        info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");

        info("Validate Attractions option is selected by default");
        Assert.assertTrue(map.attractionIsSelected(), "Attractions option not selected");
    }

    @When("The user opens the category list")
    public void theUserOpensTheCategoryList() {
        info("Open the list to check is a List container");
        Assert.assertTrue(map.categoryListIsDisplayed(), "Categories container not displayed");
    }

    @Then("The app should display a list of options included Hotels one")
    public void theAppShouldDisplayAListOfOptionsIncludedHotelsOne() {
        info("Validate there are eleven options");
        Assert.assertTrue(map.categoriesOptionSizeIs11(), "There are not eleven options");

        info("Validate there is a 'Hotels' Option");
        Assert.assertTrue(map.checkHotelsOptionIsAvailable(), "'Hotels' option is missing");

        info("Validate there are all categories named correct");
        Assert.assertTrue(map.allCategoriesAreIncluded(), "There is one or more categories missing");
    }


    ////////////////************** Privacy & Legal **************////////////////
    @Given("The user navigate to Menu screen")
    public void theUserNavigateToMenuScreen() {
        info("Start Navigation to Menu Screen");
        menu = (MenuScreen) dashBoard.goToAScreen("menu");

        info("Scroll down");
        menu.swipeVerticalToEnd();

        info("Validate My profile option is Displayed");
        Assert.assertTrue(menu.myProfileIsDisplayed(), "My profile option not displayed");

        info("Validate Property Rules option is Displayed");
        Assert.assertTrue(menu.propertyRulesIsDisplayed(), "Property Rules option not displayed");

        info("Validate Cast Compliment option is Displayed");
        Assert.assertTrue(menu.castComplimentIsDisplayed(), "Cast Compliment option not displayed");

        info("Validate Link to Account option is Displayed");
        Assert.assertTrue(menu.linkToAccountIsDisplayed(), "Link to Account option not displayed");

        info("Validate Car locator option is Displayed");
        Assert.assertTrue(menu.carLocatorIsDisplayed(), "Car locator option not displayed");

        info("Validate Help option is Displayed");
        Assert.assertTrue(menu.helpIsDisplayed(), "Help option not displayed");

        info("Validate Privacy and Legal option is Displayed");
        Assert.assertTrue(menu.privacyAndLegalIsDisplayed(), "Privacy and Legal option not displayed");
    }

    @When("User navigate to Privacy & Legal")
    public void userNavigateToPrivacyLegal() {
        info("Go to Privacy And Legal Screen");
        privacy = menu.goToPrivacyAndLegal();
    }

    @Then("The app should display a list of options included Privacy Policy one")
    public void theAppShouldDisplayAListOfOptionsIncludedPrivacyPolicyOne() {
        info("Validate Page Title is Displayed");
        Assert.assertTrue(privacy.checkTitleIsDisplayed(), "Title is not displayed");

        info("Validate options List is displayed");
        Assert.assertTrue(privacy.allOptionsAreIncluded(), "One or more options not displayed");
    }


    ////////////////************** Add Plans **************////////////////
    @Given("The user navigate to add plans")
    public void theUserNavigateToAddPlans() {
        info("Navigate to Add Plans");
        dashBoard.openAddPlans();
    }

    @Then("The Reserve dining option is on the list")
    public void theReserveDiningOptionIsOnTheList() {
        info("Validate Reserve Dining option is enabled");
        Assert.assertTrue(dashBoard.reserveDiningOptionIsEnabled(), "Reserve Dining option is not enabled");
    }
}
