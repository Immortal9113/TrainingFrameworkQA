package ui.test.mykhaliuk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class HomeElements extends BasePage {
    public String SEARCH_FORM = "/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/form[1]/input[2]";
    public String CATEGORIES_BUTTON = "//span[contains(text(),'Categories')]";
    public String DEV_CATEGORY = "//div[@class='udlite-block-list-item-content' and text() = 'Development']";
    public String WEB_DEV_CATEGORY_ITEM = "//div[@class='udlite-block-list-item-content' and text() = 'Web Development']";
    public String DATA_SCIENCE_CATEGORY_ITEM = "//div[@class='udlite-block-list-item-content' and text() = 'Data Science']";
    public String HEADING_SMART_BAR_CLOSE_BUTTON = "//div[@data-purpose='smart-bar-container']//button[@type='button']";

    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeadingBarCloseButton() {
        return waitClickableElementByXpath(HEADING_SMART_BAR_CLOSE_BUTTON);
    }

    public WebElement getSearchForm() {
        return waitClickableElementByXpath(SEARCH_FORM);
    }

    public WebElement getCategoriesButton() {
        return waitVisibleOfElement(CATEGORIES_BUTTON);
    }

    public WebElement getDevCategory() {
        return waitClickableElementByXpath(DEV_CATEGORY);
    }

    public WebElement getWebDevCategory() {
        return waitVisibleOfElement(WEB_DEV_CATEGORY_ITEM);
    }

    public WebElement getDataScienceCategory() {
        return waitVisibleOfElement(DATA_SCIENCE_CATEGORY_ITEM);
    }
}
