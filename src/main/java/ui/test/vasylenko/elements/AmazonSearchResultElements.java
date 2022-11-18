package ui.test.vasylenko.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

import java.util.List;

public class AmazonSearchResultElements extends BasePage {

    public AmazonSearchResultElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    final String RESULT_IMG = "//span[text()='RESULTS']";
    final String LOW_TO_HIGH_BTN = "//a[@id = 's-result-sort-select_1']";
    final String LIST_OF_RESULTS = "//a[@class = 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";
    final String LIST_OF_PRIZES = "//span[@class = 'a-offscreen']";
    final String SORT_BY_BTN = "//span[@class = 'a-dropdown-label']";
    public WebElement getResultImg(){
        return waitVisibleOfElement(RESULT_IMG);
    }
    public WebElement getSortBtn(){
        return waitClickableElementByXpath(SORT_BY_BTN);
    }
    public WebElement getLowToHighFilter(){
        return waitClickableElementByXpath(LOW_TO_HIGH_BTN);
    }

    public List<WebElement> searchResult(){
        return waitPresenceOfElementsLocated(LIST_OF_RESULTS);
    }

    public List<WebElement> searchPrizes(){
        return waitPresenceOfElementsLocated(LIST_OF_PRIZES);
    }

}


