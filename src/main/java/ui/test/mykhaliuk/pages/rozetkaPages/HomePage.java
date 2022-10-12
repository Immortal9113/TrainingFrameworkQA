package ui.test.mykhaliuk.pages.rozetkaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.mykhaliuk.elements.rozetkaElements.HomeElements;

import static ui.test.mykhaliuk.utils.CommonActions.openInNewTab;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    @Step("Searching for \"Laptops\"")
    public HomePage searchForLaptops() {
        getSearchForm().sendKeys("Laptop");
        return this;
    }

    @Step("Cleaning search")
    public HomePage searchClean() {
        for (int i = 0; i < 20; i++) {
            openInNewTab(getSearchForm());
        }
        return this;
    }

    @Step("Searching for 'Keyboards'")
    public HomePage searchForKeyboards() {
        getSearchForm().sendKeys("Keyboard");
        return this;
    }

    @Step("Opening new laptops tab")
    public HomePage openLaptopsPageTab() {
        openInNewTab(getSearchFirstSuggestion());
        return this;
    }

    @Step("Opening new keyboards tab")
    public void openKeyboardsPageTab() {
        openInNewTab(getSearchFirstSuggestion());
    }
}