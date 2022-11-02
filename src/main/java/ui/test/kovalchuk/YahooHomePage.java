package ui.test.kovalchuk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YahooHomePage extends BasePage{

    public WebElement getEnterBtn(){
        return  driver.findElement(By.xpath("//a[@class='_yb_1rtzu'][text()='Sign in'] "));
    }

    public YahooHomePage(WebDriver driver) {
        super(driver);
    }

}
