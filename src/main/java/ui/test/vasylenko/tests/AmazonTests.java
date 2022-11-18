package ui.test.vasylenko.tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.vasylenko.elements.AmazonHomeElements;
import ui.test.vasylenko.elements.AmazonSearchResultElements;
import ui.test.vasylenko.pages.AmazonHome;
import ui.test.vasylenko.pages.AmazonLoginPage;
import ui.test.vasylenko.pages.AmazonSearchResult;

public class AmazonTests extends BaseTest {

    final String HomePageURL = "https://www.amazon.com/";
    final String RandomPageURL = "https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb";

    @Test
    public void testHeaders(){
        openUrl(HomePageURL);
        AmazonHomeElements amazonHomeElements = new AmazonHomeElements(driver, jsExecutor);

        Assert.assertTrue(amazonHomeElements.getLogoImg().isDisplayed());
        Assert.assertTrue(amazonHomeElements.getDeliveryLogo().isDisplayed());
        Assert.assertTrue(amazonHomeElements.getSearchBtn().isDisplayed());
    }

    @Test
    public void testSearchResult(){
        openUrl(HomePageURL);
        AmazonHome amazonHome = new AmazonHome(driver, jsExecutor);
        AmazonSearchResultElements amazonSearchResultElements = amazonHome.search("hp laptop");

        Assert.assertTrue(amazonSearchResultElements.getResultImg().isDisplayed());
        Assert.assertTrue(amazonSearchResultElements.searchResult().size() >10);
    }

    @Test
    @Description("Test filters low to high prize")
    public void testLowToHighFilter(){
        openUrl(HomePageURL);
        AmazonHome amazonHome = new AmazonHome(driver, jsExecutor);
        AmazonSearchResult amazonSearchResult = new AmazonSearchResult(driver, jsExecutor);
        amazonHome.search("keyboard");
        amazonSearchResult.useFilterLowToHighPrize();

        Assert.assertTrue(amazonSearchResult.findLowerPrize());

    }

    @Test
    public void testLogoImgClick(){
        openUrl(RandomPageURL);
        AmazonHome amazonHome = new AmazonHome(driver, jsExecutor);
        amazonHome.logoClick();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.com/ref=nav_logo");
    }

    @Test
    public void testErrorMessageLogin(){
        openUrl(HomePageURL);

        AmazonLoginPage amazonLoginPage = new AmazonLoginPage(driver, jsExecutor);
        amazonLoginPage
                .goToLoginPage()
                .setLogin("123");

        Assert.assertTrue(amazonLoginPage.errMessage().isDisplayed());
    }

}
