package org.globantFinal.tests.stepsDefinition.web;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globantFinal.pageObjects.pages.HomePage;
import org.globantFinal.pageObjects.pages.WatchPage;
import org.globantFinal.utils.web.SignUpConstants;
import org.testng.Assert;

import static org.globantFinal.reporting.Reporter.info;

public class EspnSteps implements SignUpConstants {

    private final HomePage home = new HomePage(WebHooks.getDriver());
    private final WatchPage watch = new WatchPage(WebHooks.getDriver());


    ////////////////************** SingUp **************////////////////
    @Given("User navigate to the Website")
    public void userNavigateToTheWebsite() {
        home.closeBanner();
        home.switchToHome();
    }

    @Given("The user opens Login modal")
    public void theUserOpensLoginModal() {
        home.openLoginModal();
        home.switchToModal();
        info("Login modal is displayed");
        Assert.assertTrue(home.loginModalIsDisplayed());
        info("ESPN logo is displayed");
        Assert.assertTrue(home.ESPNLogoIsDisplayed());
        info("Login button is displayed");
        Assert.assertTrue(home.loginBtnIsDisplayed());
        info("SignUp button is displayed");
        Assert.assertTrue(home.signUpBtnIsDisplayed());
    }

    @When("The user navigate to Sign up form")
    public void theUserNavigateToSignUpForm() {
        info("click sign up button");
        home.clickSignUpBtn();
        info("X' close button");
        Assert.assertTrue(home.closeBtnSignUpIsDisplayed());
        info("‘Sign Up’ title is present");
        Assert.assertTrue(home.signUpTitleIsDisplayed());
        info("‘First Name’ input is present");
        Assert.assertTrue(home.firstNameInputIsDisplayed());
        info("‘Last name’ input is present");
        Assert.assertTrue(home.lastNameInputIsDisplayed());
        info("‘Email’ input is present");
        Assert.assertTrue(home.emailInputSignUpIsDisplayed());
        info("‘Password’ input is present");
        Assert.assertTrue(home.passwordInputSignUpIsDisplayed());
        info("‘Sign Up’ button");
        Assert.assertTrue(home.SignUpBtnIsDisplayed());
    }

    @And("The user fill the form with valid information")
    public void theUserFillTheFormWithValidInformation() {
        info("Filling First name input");
        home.fillFirstNameInput(FIRSTNAME);
        info("Filling Last name input");
        home.fillLastNameInput(LASTNAME);
        info("Filling Email input");
        home.fillEmailInputForSignUp();
        info("Filling Password input");
        home.fillPasswordInputForSignUp(PASSWORD);
        info("Submitting form");
        home.clickSignUpBtnSubmit();
        home.switchToHome();
        home.modalIsClosed();
    }

    @Then("The page should display in logged state")
    public void thePageShouldDisplayInLoggedState() {
        info("Open The user options menu by mouse hover");
        home.mouseOverUserIcon();
        home.isOpenUserOptionsList();
        info("Check the welcome text have the username");
        Assert.assertTrue(home.welcomeTextValue().contains(FIRSTNAME));
    }


    ////////////////************** Watch **************////////////////
    @Given("The user navigate to watch page")
    public void theUserNavigateToWatchPage() {
        info("Going to Watch page");
        home.goToWatch();
    }

    @When("The user interacts with carousels")
    public void theUserInteractsWithCarousels() {
        info("All cards in the second carousel have a title");
        Assert.assertTrue(watch.checkAllCardsTitle());
        info("All cards in the second carousel have a description");
        Assert.assertTrue(watch.checkAllCardsDescription());
        info("Open card information");
        watch.clickSecondCard();
        info("Close button is visible");
        Assert.assertTrue(watch.closeBtnModalIsDisplayed());
        info("Close the modal");
        watch.closeCardModal();
    }

    @Then("The user navigates back to home page")
    public void theUserNavigatesBackToHomePage() {
        info("Going back home page");
        watch.backHome();
    }


    ////////////////************** Logout **************////////////////
    @Given("The user is logged in")
    public void theUserIsLoggedIn() {
        home.openLoginModal();
        home.switchToModal();
        home.fillUsernameEmailInput(EMAIL);
        home.fillPasswordInput(PASSWORD);
        home.submitLoginForm();
        home.switchToHome();
    }

    @When("The user opens the user options menu")
    public void theUserOpensTheUserOptionsMenu() {
        home.modalIsClosed();
        home.mouseOverUserIcon();
        home.isOpenUserOptionsList();
    }

    @And("The user clicks logout button")
    public void theUserClicksLogoutButton() {
        home.clickLogoutBtn();
        home.userOptionsListMenuIsClosed();
    }

    @Then("The page should display in not logged state")
    public void thePageShouldDisplayInNotLoggedState() {
        home.mouseOverUserIcon();
        Assert.assertEquals(home.welcomeTextValue(), MESSAGE_NO_LOGGED, "Welcome text is correct");
    }
}
