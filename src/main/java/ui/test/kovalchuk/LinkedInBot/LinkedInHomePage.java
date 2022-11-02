package ui.test.kovalchuk.LinkedInBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.test.kovalchuk.BasePage;

import java.time.Duration;

public class LinkedInHomePage extends BasePage {




    public LinkedInHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement searchField (){
        return driver.findElement(By.xpath("//input[@class='search-global-typeahead__input always-show-placeholder']"));
    }

    public  WebElement getNextBtn() {
        return driver.findElement(By.xpath("//button[@aria-label='Next']"));
    }

    public WebElement getClickButtonPeople(){
        return getClickableElement("//button[text()='People']");
    }

    public WebElement getClickButtonConnect() {
        return driver.findElement(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--secondary ember-view']//span[text()='Connect']"));
    }
    public WebElement getClickButtonSendResponse(){
        return  driver.findElement(By.xpath("//button[@aria-label='Send now']"));
    }
//    WebElement buttonPeople = new WebDriverWait(driver, Duration.ofSeconds(5))
//            .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='People']")));
}

