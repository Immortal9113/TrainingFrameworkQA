package ui.test.kovalchuk;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestYahoo extends TestInit{

    @Test
    public void clickEnterBtn() {

        goToYahoo();
        YahooHomePage yahooHomePage = new YahooHomePage(driver);
        yahooHomePage.getEnterBtn().click();


    }


}
