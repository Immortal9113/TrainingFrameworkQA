package ui.test.kovalchuk.tests.DriversTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends BasePage{

    public YahooHomePage(WebDriver driver) {

        super(driver);
    }

    public WebElement getSearchField(){
        return driver.findElement(By.xpath("//input[@name=\"p\"]"));

    }

    public WebElement clickEnterBtn() {
        return driver.findElement(By.xpath("//a[@class=\"_yb_h5jxv\"]"));

    }
}
