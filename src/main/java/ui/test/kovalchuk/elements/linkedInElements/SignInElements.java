package ui.test.kovalchuk.elements.linkedInElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class SignInElements extends BasePage {

protected final String INPUT_USER_NAME = "//input[@id='username']";
protected final String INPUT_PASSWORD = "//input[@id='password']";
protected final String ENTER_BTN = "//button[@class='btn__primary--large from__button--floating']";

    protected SignInElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public WebElement getInputUserName() {
        return waitClickableElementByXpath(INPUT_USER_NAME);
    }

    public WebElement getInputPassword() {
        return waitClickableElementByXpath(INPUT_PASSWORD);
    }

    public WebElement getEnterBtn() {
        return waitClickableElementByXpath(ENTER_BTN);
    }
}
