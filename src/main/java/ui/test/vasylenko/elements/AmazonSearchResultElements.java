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

    final String LIST_OF_RESULTS = "//a[@class = 'a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']";

    public WebElement getResultImg(){
        return waitVisibleOfElement(RESULT_IMG);
    }

    public List<WebElement> searchResult(){
        return waitPresenceOfElementsLocated(LIST_OF_RESULTS);
    }


}


