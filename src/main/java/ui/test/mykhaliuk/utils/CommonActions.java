package ui.test.mykhaliuk.utils;

import lombok.SneakyThrows;
import org.openqa.selenium.*;

public class CommonActions {
    @SneakyThrows
    public static void scrollForElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(200);
    }
    @SneakyThrows
    public static void openInNewTab(WebElement webElement) {
        webElement.sendKeys(Keys.CONTROL, Keys.ENTER);
        Thread.sleep(200);
    }
}