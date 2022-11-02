package ui.test.kovalchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    public WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    protected void sleep(long millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void goToGoogle(){
        driver.get("https://www.google.com.ua/");

    }

    public void goToYahoo() {
        driver.get("https://www.yahoo.com/");
    }

    public void goToLinkedIn(){
        driver.get("https://www.linkedin.com/checkpoint/lg/sign-in-another-account");
    }

}
