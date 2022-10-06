package ui.test.german.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LabaHomePage extends BasePage {

    public LabaHomePage(WebDriver driver){
        super(driver);
    }

    public void navigateLaba(){
        driver.get("https://l-a-b-a.com/uk");
    }

    public WebElement getSearch(){
        return driver.findElement(By.xpath("//span[@class='hidden-md-down']"));
    }
    public WebElement getClickBtnOnlineCourses(){
        return driver.findElement(By.xpath("//div[@id='course-btn-toggle']"));
    }
    public WebElement getBtnMarketing(){
        return driver.findElement(By.xpath("//a[@href='/uk/lecture/marketing-and-pr/tag=marketing']"));
    }

    public  WebElement getCheckPageOnlineCourses(){
        return driver.findElement(By.xpath("//div[@class='nav__box nav__box-courses active']"));
    }
    public WebElement getCheckBtnFreeWebinar(){
        return driver.findElement(By.xpath("//img[@src='/uploads/banner/full_size/1920kh60-62ea922781d32659116750.png']"));
    }
    public WebElement getLogo(){
        return driver.findElement(By.xpath("//div[@class='logo__box d-flex']"));

    }
}


