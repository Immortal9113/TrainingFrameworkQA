package ui.test.kovalchuk.pages.linkedInPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.kovalchuk.elements.linkedInElements.HomeElements;
import ui.test.kovalchuk.utils.Actions;

public class HomePage extends HomeElements {


    public HomePage(WebDriver driver, JavascriptExecutor jsExecutor) {

        super(driver, jsExecutor);
    }

    public HomePage clickMessageBtn() {
        getBtnMessage().click();
        return this;
    }

    public HomePage inputSearchField(String keys) {
        getSearchField().sendKeys(keys);
        return this;
    }

    public HomePage clickNextBtn() {
        getBtnNext().click();
        return this;
    }

    public HomePage clickPeopleBtn() {
        getBtnPeople().click();
        return this;
    }

    public boolean clickConnectBtn() {
        try {
            getBtnConnect();
            return true;
        } catch (Exception E) {
            return false;
        }
    }

    public void clickResponseBtn() {
        getBtnResponse().click();
    }

    public HomePage addsConnections(int amount) {
        for (int i = 0; i < amount; i++) {
            if (clickConnectBtn()){
                getBtnConnect().click();
                clickResponseBtn();
                //TODO scroll
                Actions.scrollDown(driver);
                clickNextBtn();
            }else{
                Actions.scrollDown(driver);
                clickNextBtn();
            }
        }
        return this;
    }
}

