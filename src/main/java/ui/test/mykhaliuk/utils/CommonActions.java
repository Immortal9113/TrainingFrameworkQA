package ui.test.mykhaliuk.utils;

import lombok.SneakyThrows;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

/*
build()
Generates a composite action containing all actions so far, ready to be performed
(and resets the internal builder state, so subsequent calls to build() will contain fresh sequences).
performe()
A convenience method for performing the actions without calling build() first.
*/


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
    @SneakyThrows
    public static void keyAction(WebElement element, WebDriver driver, String charSequence) {
        Actions actions = new Actions(driver);
        actions
                .keyDown(element, charSequence);
    }
    @SneakyThrows
    public static void dragAction(WebDriver driver, WebElement draggable, WebElement droppable) {
        Actions actions = new Actions(driver);
        actions
                .dragAndDrop(draggable, droppable)
                .perform();
    }
}