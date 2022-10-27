package ui.test.kovalchuk.tests.DriversTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {
    WebDriver driver;



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearnDown(){
        driver.quit();
    }



    public void goToRozetka(){

        driver.get("https://rozetka.com.ua/");
    }

    public void goToGoogle(){
        driver.get("https://www.google.com.ua/");

    }

    public void goToYahoo(){

        driver.get("https://www.yahoo.com/");
    }

}
