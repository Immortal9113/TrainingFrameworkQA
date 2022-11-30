package ui.test.kovalchuk.utils;

import lombok.SneakyThrows;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Actions {

    @SneakyThrows
    public static void scrollForElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(400);
    }
    @SneakyThrows
    public static void openInNewTab(WebElement webElement) {
        webElement.sendKeys(Keys.CONTROL, Keys.ENTER);
        Thread.sleep(200);

    }

    @SneakyThrows
    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,900000)");
        Thread.sleep(400);
    }

}
