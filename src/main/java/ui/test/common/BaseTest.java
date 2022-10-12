package ui.test.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Base {
    private final Logger logger = LogManager.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected JavascriptExecutor jsExecutor;
    String loggerConfPath = "src/main/java/ui/test/common/logger.properties";

    @BeforeMethod
    public void setUp() {
        PropertyConfigurator.configure(loggerConfPath);
        logger.info("Started setting up the driver");
        String headless = System.getProperty("headless");
        if (headless == null) {
            headless = "";
        }
        ChromeOptions chromeOptions = new ChromeOptions();
        if (headless.contains("true")) {
            chromeOptions.setHeadless(true);
        }
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        if (headless.equals("headless")) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        } else {
            driver.manage().window().maximize();
        }
        jsExecutor = (JavascriptExecutor) driver;
        logger.info("Finished setting up the driver");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
//        logger.info("Quite driver");
//        driver.quit();
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }
}