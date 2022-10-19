package ui.test.kovalchuk.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebDriver {
    @Test
    public void runGoogle(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dogs\n");
        driver.findElement(By.xpath("//*[text()='Dog - Wikipedia']")).click();
        driver.findElement(By.xpath("//span[text() ='Main page']")).click();
        driver.findElement(By.xpath("//a[@href='https://www.mediawiki.org/wiki/']")).click();
        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("education\n");
        driver.quit();
      
    }

    @Test
    public void clickEnterBtn(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com.ua/");
        driver.findElement(By.xpath("//a[text()='Войти']")).click();

    }
    @Test
    public  void  openRozetka(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rozetka.com.ua/ua/promo/banner_protectorday/?gclid=CjwKCAjw-rOaBhA9EiwAUkLV4opSWLu5LN7lvIRlicmgQESMvbbQgvLW26eDH_cctj6i01X8ZFhNXhoC0fgQAvD_BwE");

    }

}
