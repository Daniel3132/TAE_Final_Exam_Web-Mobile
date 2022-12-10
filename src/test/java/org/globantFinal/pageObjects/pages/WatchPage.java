package org.globantFinal.pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class WatchPage extends BasePage {
    @FindBy(css = "section.Carousel")
    private List<WebElement> cardsList;

    @FindBy(css = "div.Carousel__Wrapper--canScrollRight ul.Carousel__Inner li:nth-child(2) > a")
    private WebElement secondCard;

    @FindBy(css = "section.lightbox__contentBox")
    private WebElement cardSelectedModal;

    @FindBy(css = ".lightbox__closebtn")
    private WebElement closeBtnModal;

    public WatchPage(WebDriver driver) {
        super(driver);
    }

    /**
     * gets all the card
     * @return a list with all cards
     */
    public List<WebElement> getCards() {
        return cardsList.get(1).findElements(By.cssSelector("ul.Carousel__Inner li"));
    }

    /**
     * Check if a card contains an element
     * @param element to prove contain or not
     * @param selector
     * @return boolean
     */
    public boolean checkElementInCard(WebElement element, String selector) {
        return !element.findElement(By.cssSelector(selector)).getText().equals("");
    }

    /**
     * iterates all cards to prove them have a title
     * @return boolean for all have title
     */
    public boolean checkAllCardsTitle() {
        List<Boolean> titlesCheckedList = new ArrayList<>();
        for (int i = 0; i < getCards().size(); i++) {
            titlesCheckedList.add(checkElementInCard(getCards().get(i), "h2.WatchTile__Title"));
        }
        return !titlesCheckedList.contains(false);
    }

    /**
     * iterates all cards to prove them have a description
     * @return boolean for all have description
     */
    public boolean checkAllCardsDescription() {
        List<Boolean> descriptionsCheckedList = new ArrayList<>();
        for (int i = 0; i < getCards().size(); i++) {
            descriptionsCheckedList.add(checkElementInCard(getCards().get(i), ".WatchTile__Meta"));
        }
        return !descriptionsCheckedList.contains(false);
    }

    public void clickSecondCard() {
        super.clickElement(this.secondCard);
    }

    /**
     * @return boolean for close the modal button is displayed
     */
    public boolean closeBtnModalIsDisplayed() {
        super.waitForVisibility(this.closeBtnModal);
        return this.closeBtnModal.isDisplayed();
    }

    public void closeCardModal() {
        super.clickElement(this.closeBtnModal);
    }

    public void backHome() {
        super.getWebDriver().navigate().back();
    }
}
