package org.globantFinal.pageObjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    //Ad Banner
    @FindBy(css = ".promo-banner-container > iframe:nth-child(1)")
    private WebElement bannerIframe;
    @FindBy(css = ".PromoBanner__CloseBtn")
    private WebElement closeBannerBtn;


    //Login Elements
    @FindBy(id = "global-user-trigger")
    private WebElement IconUserToHover;

    @FindBy(css = "#sideLogin-left-rail > button.button-alt.med")
    private WebElement loginBtnHomePage;

    @FindBy(id = "oneid-iframe")
    private WebElement loginIframe;

    @FindBy(css = "div.view-starry-night > div:first-child")
    private WebElement loginModal;

    @FindBy(id = "logo")
    private WebElement espnLogoLoginIframe;

    @FindBy(id = "InputLoginValue")
    private WebElement usernameOrEmailInput;

    @FindBy(id = "InputPassword")
    private WebElement passwordInput;

    @FindBy(id = "BtnSubmit")
    private WebElement loginBtnSubmit;

    @FindBy(id = "BtnCreateAccount")
    private WebElement singUpBtnLoginIframe;

    @FindBy(css = "ul > li.user.hover > div > div > ul.account-management > li.display-user")
    private WebElement welcomeText;


    //Logout Elements
    @FindBy(css = "li.user > div > div > ul.account-management > li:nth-child(9) > a")
    private WebElement logoutBtn;

    @FindBy(linkText = "Watch")
    private WebElement watchBtn;

    @FindBy(css = "div.global-user:nth-child(2)")
    private WebElement userOptionsListMenu;


    //Deactivate User Elements
    @FindBy(css = "div.global-user:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")
    private WebElement espnProfileLink;

    @FindBy(id = "AccountDeleteLink")
    private WebElement deleteAccountLink;

    @FindBy(id = "oneid-iframe")
    private WebElement UpdateAccountModal;

    @FindBy(css = ".loading-indicator")
    private WebElement loadingSpinner;

    @FindBy(css = ".account-deleted-gating + #Title")
    private WebElement deleteAccountText;


    //Sign up Form Elements
    @FindBy(id = "close")
    private WebElement closeSignUpForm;

    @FindBy(css = "h2#Title span")
    private WebElement titleSignUp;

    @FindBy(id = "InputFirstName")
    private WebElement firstNameInput;

    @FindBy(id = "InputLastName")
    private WebElement lastNameInput;

    @FindBy(id = "InputEmail")
    private WebElement emailInputSignUp;

    @FindBy(id = "password-new")
    private WebElement passwordInputSignUp;

    @FindBy(id = "BtnSubmit")
    private WebElement signUpBtnSubmit;


    //Methods
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void mouseOverUserIcon() {
        super.waitForVisibility(IconUserToHover);
        super.mouseOver(this.IconUserToHover);
    }

    //Ad Banner
    public void switchToBanner() {
        super.getWebDriver().switchTo().frame(bannerIframe);
    }

    public void closeBanner() {
        try {
            if (bannerIframe.isDisplayed()) {
                switchToBanner();
                clickElement(closeBannerBtn);
            }
        } catch (Exception ignored) {
        }
    }

    //Login Methods
    public void openLoginModal() {
        super.clickElement(loginBtnHomePage);
    }

    public void switchToModal() {
        super.getWebDriver().switchTo().frame(loginIframe);
    }

    public void switchToHome() {
        super.getWebDriver().switchTo().defaultContent();
    }

    public boolean loginModalIsDisplayed() {
        super.waitForVisibility(loginModal);
        return loginModal.isDisplayed();
    }

    public boolean ESPNLogoIsDisplayed() {
        super.waitForVisibility(espnLogoLoginIframe);
        return espnLogoLoginIframe.isDisplayed();
    }

    public boolean loginBtnIsDisplayed() {
        super.waitForVisibility(loginBtnSubmit);
        return loginBtnSubmit.isDisplayed();
    }

    public boolean signUpBtnIsDisplayed() {
        super.waitForVisibility(singUpBtnLoginIframe);
        return singUpBtnLoginIframe.isDisplayed();
    }

    public void clickSignUpBtn() {
        super.clickElement(singUpBtnLoginIframe);
    }

    public void fillUsernameEmailInput(String user) {
        super.typeOnInput(usernameOrEmailInput, user);
    }

    public void fillPasswordInput(String password) {
        super.typeOnInput(passwordInput, password);
    }

    public void submitLoginForm() {
        super.clickElement(loginBtnSubmit);
    }

    public void modalIsClosed() {
        super.waitForInvisibility(loginIframe);
    }


    //Sign Up Methods
    public void fillFirstNameInput(String name) {
        super.typeOnInput(firstNameInput, name);
    }

    public void fillLastNameInput(String lastName) {
        super.typeOnInput(lastNameInput, lastName);
    }

    private String createRandomEmail() {
        return Math.random() * 999 +
                "Test_ESPN" +
                Math.random() * 999 +
                "@test.co";
    }

    public void fillEmailInputForSignUp() {
        super.typeOnInput(emailInputSignUp, createRandomEmail());
    }

    public void fillPasswordInputForSignUp(String password) {
        super.typeOnInput(passwordInputSignUp, password);
    }

    public boolean signUpTitleIsDisplayed() {
        super.waitForVisibility(titleSignUp);
        return titleSignUp.isDisplayed();
    }

    public boolean firstNameInputIsDisplayed() {
        super.waitForVisibility(firstNameInput);
        return firstNameInput.isDisplayed();
    }

    public boolean lastNameInputIsDisplayed() {
        super.waitForVisibility(lastNameInput);
        return lastNameInput.isDisplayed();
    }

    public boolean emailInputSignUpIsDisplayed() {
        super.waitForVisibility(emailInputSignUp);
        return emailInputSignUp.isDisplayed();
    }

    public boolean passwordInputSignUpIsDisplayed() {
        super.waitForVisibility(passwordInputSignUp);
        return passwordInputSignUp.isDisplayed();
    }

    public boolean closeBtnSignUpIsDisplayed() {
        super.waitForVisibility(firstNameInput);
        return firstNameInput.isDisplayed();
    }

    public boolean SignUpBtnIsDisplayed() {
        super.waitForVisibility(signUpBtnSubmit);
        return signUpBtnSubmit.isDisplayed();
    }

    public void clickSignUpBtnSubmit() {
        super.waitForClickable(signUpBtnSubmit);
        super.clickElement(signUpBtnSubmit);
    }


    //Watch Methods
    public void goToWatch() {
        super.clickElement(watchBtn);
        new WatchPage(getWebDriver());
    }


    //Logout Methods
    public void clickLogoutBtn() {
        super.waitForVisibility(logoutBtn);
        super.clickElement(logoutBtn);
    }

    public void userOptionsListMenuIsClosed() {
        super.waitForInvisibility(userOptionsListMenu);
    }

    public void isOpenUserOptionsList() {
        super.waitForVisibility(userOptionsListMenu);
    }

    public String welcomeTextValue() {
        return welcomeText.getText();
    }
}
