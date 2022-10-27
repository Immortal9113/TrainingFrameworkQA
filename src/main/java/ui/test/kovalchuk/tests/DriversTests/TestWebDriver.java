package ui.test.kovalchuk.tests.DriversTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ui.test.kovalchuk.tests.DriversTests.TestInit;

public class TestWebDriver extends TestInit {




    @Test
    public void runGoogle(){

        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchFilt().sendKeys("cats\n");
//        driver.findElement(By.xpath("//*[text()='Dog - Wikipedia']")).click();
//        driver.findElement(By.xpath("//span[text() ='Main page']")).click();
//        driver.findElement(By.xpath("//a[@href='https://www.mediawiki.org/wiki/']")).click();
//        driver.findElement(By.xpath("//input[@name='search']")).sendKeys("education\n");
//        driver.quit();
      
    }


    @Test
    public void runRozetka(){


        goToRozetka();
        driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("Iphone\n");

    }

    @Test
    public void runYahoo(){
       goToYahoo();
       driver.findElement(By.xpath("//input[@name=\"p\"]")).sendKeys("Ukraine\n");

    }
}
