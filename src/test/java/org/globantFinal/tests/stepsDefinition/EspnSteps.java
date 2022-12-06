package org.globantFinal.tests.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.globantFinal.pageObjects.pages.HomePage;
import org.testng.Assert;

import static org.globantFinal.reporting.Reporter.info;

public class EspnSteps {
    protected HomePage home;
    private String BROWSER = "CHROME";
    private String EMAIL = "epale@gmail.com";
    private String PASSWORD = "password";
    private String FIRSTNAME = "UserName";
    private String LASTNAME = "Testing";
    private String MESSAGE_LOGGED = "UserName Welcome!";


    @Given("User navigate to the Website")
    public void userNavigateToTheWebsite() {
        home = new HomePage(WebHooks.getDriver());
        //home.closeBanner();
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
        home.fillEmailInputForSignUp(EMAIL);
        info("Filling Password input");
        home.fillPasswordInputForSignUp(PASSWORD);
        home.switchToHome();
    }

    @Then("The page should display in logged state")
    public void thePageShouldDisplayInLoggedState() {
        home.modalIsClosed();
        home.mouseOverUserIcon();
        home.isOpenUserOptionsList();
        Assert.assertEquals(home.welcomeTextValue(), MESSAGE_LOGGED, "Welcome text is correct");

    }
}

