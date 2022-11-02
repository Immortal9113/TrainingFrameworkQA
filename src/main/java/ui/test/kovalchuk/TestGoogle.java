package ui.test.kovalchuk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGoogle extends TestInit {




    @Test
    public void runGoogleTo (){

        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("dogs\n");



    }

    @Test
    public void clickEnterBtn() {

        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.clickEnterBtn().click();


    }

}

