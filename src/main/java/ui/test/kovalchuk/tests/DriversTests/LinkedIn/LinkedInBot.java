package ui.test.kovalchuk.tests.DriversTests.LinkedIn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LinkedInBot {

    WebDriver driver;


    @Test
    public void goToLinkedIn(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
        driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("budimport123@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("goldgold12345");
        driver.findElement(By.xpath("//button[@class=\"btn__primary--large from__button--floating\"]")).click();
        driver.findElement(By.xpath("//input[@class=\"search-global-typeahead__input always-show-placeholder\"]")).sendKeys("HR\n");

        WebElement buttonPeople = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class=\"search-reusables__primary-filter\"][2]//button")));
//        driver.findElement(By.xpath("//li[@class=\"search-reusables__primary-filter\"][2]//button")).click();
        buttonPeople.click();



    }

}
