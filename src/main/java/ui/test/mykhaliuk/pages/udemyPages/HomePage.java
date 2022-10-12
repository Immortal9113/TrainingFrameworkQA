package ui.test.mykhaliuk.pages.udemyPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import ui.test.mykhaliuk.elements.udemyElements.HomeElements;

import java.util.Objects;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public void hoverOver(WebElement e) {
        Actions action = new Actions(driver);
        action.moveToElement(e).perform();
    }

    @Step("Search for keyword")
    public HomePage searchFor(String keywords) {
        getSearchForm().sendKeys(keywords, Keys.RETURN);
        return this;
    }

    @Step("Clicking heading bar close button & Hovering over categories menu button")
    public HomePage expandCategoriesMenu() {
        this.closeHeadingBar();
        this.hoverOver(getCategoriesButton());
        return this;
    }

    public void closeHeadingBar() {
        getHeadingBarCloseButton().click();
    }

    @Step("Hovering over development category item")
    public HomePage selectDevelopmentCategory() {
        hoverOver(getDevCategory());
        return this;
    }

    @Step("Click web dev category item")
    public HomePage clickWebDevCategory() {
        getWebDevCategory().click();
        return this;
    }

    @Step("Click data science category item")
    public HomePage clickDataScienceCategory() {
        getDataScienceCategory().click();
        return this;
    }

    @Step("Asserting web dev url")
    public boolean isWebDevPage() {
        String actualUrl = this.driver.getCurrentUrl();
        String targetUrl = "https://www.udemy.com/courses/development/web-development/";
        return Objects.equals(actualUrl, targetUrl);
    }

    @Step("Asserting data science url")
    public boolean isDataSciencePage() {
        String actualUrl = this.driver.getCurrentUrl();
        String targetUrl = "https://www.udemy.com/courses/development/data-science/";
        return Objects.equals(actualUrl, targetUrl);
    }

}
