package ui.test.vasylenko.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.vasylenko.elements.AmazonHomeElements;
import ui.test.vasylenko.elements.AmazonSearchResultElements;

public class AmazonHome extends AmazonHomeElements {
    public AmazonHome(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public AmazonSearchResultElements search(String objectsForSearch){
        getSearchField().sendKeys(objectsForSearch);
        getSearchBtn().click();
        return new AmazonSearchResultElements(driver, jsExecutor);

    }

    public AmazonHomeElements logoClick(){
        getLogoImg().click();
        return this;
    }

}
