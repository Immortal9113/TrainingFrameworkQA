package ui.test.kovalchuk.elments.PariMatchElements.linkedInElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class HomeElements extends BasePage {

    protected final String MESSAGE_BTN = "//a[@class='app-aware-link  global-nav__primary-link'])[3]')";
    protected final String SEARCH_FIELD = "//input[@class='search-global-typeahead__input always-show-placeholder']";
    protected final String NEXT_BTN = "//button[@aria-label='Next']";
    protected final String PEOPLE_BTN = "//button[text()='People']";
    protected final String CONNECT_BTN = "//button[@class='artdeco-button artdeco-button--2 artdeco-button--secondary ember-view']//span[text()='Connect']";
    protected final String SEND_RESPONSE_BTN = "//button[@aria-label='Send now']";


    protected HomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public WebElement getBtnMessage(){
        return waitClickableElementByXpath(MESSAGE_BTN);
    }
    public WebElement getSearchField(){
        return waitClickableElementByXpath(SEARCH_FIELD);
    }
    public WebElement getBtnPeople(){
        return waitClickableElementByXpath(PEOPLE_BTN);
    }
    public WebElement getBtnNext(){
        return waitClickableElementByXpath(NEXT_BTN);
    }
    public WebElement getBtnConnect(){
        return waitClickableElementByXpath(CONNECT_BTN);
    }
    public WebElement getBtnResponse(){
        return waitClickableElementByXpath(SEND_RESPONSE_BTN);
    }



}
