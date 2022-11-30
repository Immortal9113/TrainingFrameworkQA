package ui.test.kovalchuk.pages.linkedInPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.kovalchuk.elements.linkedInElements.SignInElements;

public class SignInPage extends SignInElements {


    public SignInPage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public SignInPage enterCredentials(String login, String password){
        getInputUserName().sendKeys(login);
        sleep(200);
        getInputPassword().sendKeys(password);
        return this;
    }

    public SignInPage clickEnterBtn(){
        getEnterBtn().click();
        return this;
    }
}
