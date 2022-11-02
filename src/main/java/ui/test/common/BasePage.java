package ui.test.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BasePage extends Base {
    protected final int BASE_WAIT = 15;
    protected final Logger logger;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor jsExecutor;

    protected BasePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(BASE_WAIT));
        this.logger = LogManager.getLogger(this.getClass());
        this.jsExecutor = jsExecutor;
    }

    protected WebElement waitVisibleOfElement(String locator) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        } catch (WebDriverException e) {
            logger.error("No visibility element: " + locator);
            fail("No visibility element: " + locator);
            return null;
        }
    }

    protected WebElement waitClickableElementByXpath(String locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch (WebDriverException e) {
            logger.error("No clickable element: " + locator);
            fail("No clickable element: " + locator);
            return null;
        }
    }

    protected WebElement waitPresenceOfElementLocated(String locator) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
        } catch (WebDriverException e) {
            logger.error("No presence element: " + locator);
            fail("No presence element: " + locator);
            return null;
        }
    }protected WebElement waitPresenceOfElementLocatedById(String id) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        } catch (WebDriverException e) {
            logger.error("No presence element with id: " + id);
            fail("No presence element with id: " + id);
            return null;
        }
    }

    protected List<WebElement> waitPresenceOfElementsLocated(String locator) {
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        } catch (WebDriverException e) {
            logger.error("No presence elements: " + locator);
            fail("No presence elements: " + locator);
            return null;
        }
    }

    protected boolean waitInvisibilityOfElementLocated(String locator) {
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
        } catch (WebDriverException e) {
            logger.error("Element is visibility: " + locator);
            fail("Element is visibility: " + locator);
            return false;
        }
    }
}
