package ui.test.mykhaliuk.elements.rozetkaElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class HomeElements extends BasePage {
    protected final String SEARCH_FORM = "//div[@class='search-form__input-wrapper']//input";
    protected final String SEARCH_FIRST_SUGGEST_LINK = "(//a[@class='search-suggest__item-content search-suggest__item-text'])[1]";

    protected HomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public WebElement getSearchForm() {
        return waitClickableElementByXpath(SEARCH_FORM);
    }
    public WebElement getSearchFirstSuggestion() { return waitClickableElementByXpath(SEARCH_FIRST_SUGGEST_LINK);}
}
