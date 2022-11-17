package ui.test.vasylenko.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.vasylenko.elements.AmazonLoginElements;

public class AmazonLoginPage extends AmazonLoginElements {
    public AmazonLoginPage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public AmazonLoginPage setLogin(String s) {
        phoneNumberField().sendKeys(s);
        continBtn().click();
        return this;
    }

    public AmazonLoginPage goTologinPage() {
        login().click();
        return this;
    }
}

