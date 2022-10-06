package ui.test.german.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestInit {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void goToGoogle() {
        driver.get("https://www.google.com/");
    }
    public void explicitWaitFor(String urlFraction) {
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(60));
    }
}