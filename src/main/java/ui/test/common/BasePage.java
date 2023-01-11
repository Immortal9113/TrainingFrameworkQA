package ui.test.common;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BasePage extends Base {
    protected final int BASE_WAIT = 15;
    protected final Logger logger;
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected FluentWait<WebDriver> fluentWait;
    protected JavascriptExecutor jsExecutor;

    protected BasePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        this.driver = driver;
        this.fluentWait = new FluentWait<>(driver).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class).withTimeout(Duration.ofSeconds(BASE_WAIT));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(BASE_WAIT));
        this.logger = LogManager.getLogger(this.getClass());
        this.jsExecutor = jsExecutor;
    }

    protected WebElement waitVisibleOfElement(String Xpath) {
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
        } catch (WebDriverException e) {
            logger.error("No visibility element: " + Xpath);
            fail("No visibility element: " + Xpath);
            return null;
        }
    }

    protected WebElement waitClickableElementByXpath(String Xpath) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Xpath)));
        } catch (WebDriverException e) {
            logger.error("No clickable element: " + Xpath);
            fail("No clickable element: " + Xpath);
            return null;
        }
    }

    protected WebElement waitPresenceOfElementLocated(String Xpath) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Xpath)));
        } catch (WebDriverException e) {
            logger.error("No presence of element: " + Xpath);
            fail("No presence of element: " + Xpath);
            return null;
        }
    }

    protected WebElement waitPresenceOfElementLocatedById(String id) {
        try {
            return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
        } catch (WebDriverException e) {
            logger.error("No presence of element with id: " + id);
            fail("No presence of element with id: " + id);
            return null;
        }
    }

    protected List<WebElement> waitElementsVisible(String xpath) {
        try {
            return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
        } catch (WebDriverException e) {
            logger.error("No presence of elements: " + xpath + e);
            fail("No presence of elements: " + xpath);
            return null;
        }
    }

    protected List<WebElement> waitPresenceOfElementsLocated(String Xpath) {
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(Xpath)));
        } catch (WebDriverException e) {
            logger.error("No presence of elements: " + Xpath);
            fail("No presence of elements: " + Xpath);
            return null;
        }
    }

    protected boolean waitInvisibilityOfElementLocated(String Xpath) {
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Xpath)));
        } catch (WebDriverException e) {
            logger.error("No presence of element: " + Xpath);
            fail("No presence of element: " + Xpath);
            return false;
        }
    }

    protected WebElement fluentWaitElement(String Xpath) {
        try {
            fluentWait.until(webDriver -> {
                logger.info("Rechecking with fluent");
                return webDriver.findElement(By.xpath(Xpath));
            });
        } catch (Exception E) {
            logger.error("No presence of element: " + Xpath);
            fail("No presence of element: " + Xpath);
            return null;
        }
        return null;
    }

    protected WebElement fluentWaitElementById(String id) {
        try {
            fluentWait.until(webDriver -> {
                logger.info("Rechecking with fluent");
                return webDriver.findElement(By.id(id));
            });
        } catch (Exception E) {
            logger.error("No presence of element with id: " + id);
            fail("No presence of element with id: " + id);
            return null;
        }
        return null;
    }

    protected List<WebElement> fluentWaitElements(String XPath) {
        try {
            fluentWait.until(webDriver -> {
                logger.info("Rechecking with fluent");
                return webDriver.findElements(By.xpath(XPath));
            });
        } catch (Exception E) {
            logger.error("No presence of elements: " + XPath);
            fail("No presence of elements: " + XPath);
            return null;
        }
        return null;
    }
}
