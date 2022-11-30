package ui.test.kovalchuk.elements.linkedInElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.test.common.BasePage;

public class HomeElements extends BasePage {

    protected final String MESSAGE_BTN = "//a[@class='app-aware-link  global-nav__primary-link'])[3]')";
    protected final String SEARCH_FIELD = "//input[@class='search-global-typeahead__input always-show-placeholder']";
    protected final String NEXT_BTN = "//button[@aria-label='Next']";
    protected final String PEOPLE_BTN = "//button[text()='People']";
    protected final String CONNECT_BTN = "//button[@class='artdeco-button artdeco-button--2 artdeco-button--secondary ember-view']//span[text()='Connect']";
    protected final String SEND_RESPONSE_BTN = "//button[@aria-label='Send now']";

    protected final String NOTIFICATIONS_BTN = "//a[@href='https://www.linkedin.com/notifications/?filter=all&refresh=true']";

    protected final String ClOSE_BTN_MESSAGE_WND = "//button[@id='ember418']";

    protected final String SEND_MESSAGE_BTN = "//button[@class='msg-form__send-button artdeco-button artdeco-button--1']";

    protected HomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }



    public WebElement getNotificationBtn() {
        return waitClickableElementByXpath(NOTIFICATIONS_BTN);
    }
    public WebElement getBtnMessage() {
        return waitClickableElementByXpath(MESSAGE_BTN);
    }

    public WebElement getSearchField() {
        return waitClickableElementByXpath(SEARCH_FIELD);
    }

    public WebElement getBtnPeople() {
        return waitClickableElementByXpath(PEOPLE_BTN);
    }

    public WebElement getBtnNext() {
        return waitClickableElementByXpath(NEXT_BTN);
    }

    public WebElement getBtnConnect() {
        return waitClickableElementByXpath(CONNECT_BTN);
    }

    public WebElement getBtnResponse() {
        return waitClickableElementByXpath(SEND_RESPONSE_BTN);
    }

    //TODO Bot for Say cograts
//    [class="message-anywhere-button artdeco-button artdeco-button--secondary artdeco-button--default"]
//    Say congrats
    //button[@class="msg-form__send-button artdeco-button artdeco-button--1"]
//    Send Message




}
