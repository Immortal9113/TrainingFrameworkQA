package ui.test.kovalchuk.LinkedInBot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.kovalchuk.BasePage;

public class LinkedInSignInPage extends BasePage {




    public LinkedInSignInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement inputUserName(){
        return  driver.findElement(By.xpath("//input[@id='username']"));
    }
    public WebElement inputPassword(){
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement enterBtn(){
        return  driver.findElement(By.xpath("//button[@class=\"btn__primary--large from__button--floating\"]"));
    }
}
