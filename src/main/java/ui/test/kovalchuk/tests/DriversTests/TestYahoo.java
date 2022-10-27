package ui.test.kovalchuk.tests.DriversTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit{


    @Test
    public void clickEnterBtn() {

        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.clickEnterBtn().click();

    }
    @Test
    public void searchField(){
        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getSearchField().sendKeys("Ukraine\n");


    }
}
