package ui.test.vasylenko.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class AmazonLoginElements extends BasePage {
    public AmazonLoginElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }
    final String PHONE_NUMBER_FIELD = "//input[@id='ap_email']";
    final String CONTIN_BTN = "//input[@id='continue']";
    final String ERR_MESSAGE = "//div[@id='auth-error-message-box']";
    final String LOGIN_FIELD = "//span[@id = 'nav-link-accountList-nav-line-1']";

    public WebElement phoneNumberField(){
        return waitClickableElementByXpath(PHONE_NUMBER_FIELD);
    }

    public WebElement continBtn(){
        return waitClickableElementByXpath(CONTIN_BTN);
    }

    public WebElement errMessage(){
        return waitVisibleOfElement(ERR_MESSAGE);
    }

    public WebElement login(){
        return waitClickableElementByXpath(LOGIN_FIELD);
    }

}
