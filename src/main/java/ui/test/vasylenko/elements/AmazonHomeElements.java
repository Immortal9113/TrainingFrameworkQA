package ui.test.vasylenko.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class AmazonHomeElements extends BasePage {
    public AmazonHomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    final String AMAZON_LOGO_IMG = "//a[@id='nav-logo-sprites']";
    final String DELIVER_TO_IMG = "//div[@id='glow-ingress-block']";
    final String SEARCH_FIELD = "//input[@id='twotabsearchtextbox']";
    final String SEARCH_BTN = "//input[@id='nav-search-submit-button']";


    public WebElement getLogoImg(){
        return waitClickableElementByXpath(AMAZON_LOGO_IMG);
    }

    public WebElement getDeliveryLogo(){
        return waitClickableElementByXpath(DELIVER_TO_IMG);
    }

    public  WebElement getSearchField(){
        return waitClickableElementByXpath(SEARCH_FIELD);
    }

    public WebElement getSearchBtn(){
        return waitPresenceOfElementLocated(SEARCH_BTN);
    }



}
