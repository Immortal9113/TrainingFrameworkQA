package ui.test.mykhaliuk.tests.fluentTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Date;

import static org.testng.AssertJUnit.fail;

public class fluentTests {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String fileURL = System.getProperty("user.dir");
        driver.get(fileURL + "/src/main/resources/html/ElementsWithDelay.html");
        fluentWaitPresenceOfElementLocatedById("dynamicLink", driver);
        System.out.println("found element at " + new Date());
    }


    protected static WebElement fluentWaitPresenceOfElementLocatedById(String id, WebDriver driver) {
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .withTimeout(Duration.ofSeconds(30));
        try {
            fluentWait.until(webDriver -> {
                System.out.println("Rechecking with fluent");
                return webDriver.findElement(By.id(id)).getText().equals("Here You Go....");
            });
        } catch (Exception E) {
            System.out.println("No presence of element with id: " + id);
            fail("No presence of element with id: " + id);
            return null;
        }
        return null;
    }
}
