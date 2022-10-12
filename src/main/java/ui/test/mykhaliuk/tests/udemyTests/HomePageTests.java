package ui.test.mykhaliuk.tests.udemyTests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ui.test.mykhaliuk.pages.udemyPages.HomePage;
import ui.test.common.BaseTest;


public class HomePageTests extends BaseTest {
    public final static String homePageURL = "https://www.udemy.com/";

    @Test()
    @Description("'Java' keyword search")
    public void searchForJava() {
        HomePage homePage = new HomePage(driver, jsExecutor);
        openUrl(homePageURL);
        homePage.searchFor("Java");
    }

    @Test
    @Description("opening 'Data Science' category from dropdown menu")
    public void openDataScienceCategory() {
        HomePage homePage = new HomePage(driver, jsExecutor);
        openUrl(homePageURL);
        homePage
                .expandCategoriesMenu()
                .selectDevelopmentCategory()
                .clickDataScienceCategory();

        assertTrue(homePage.isDataSciencePage());
    }

    @Test
    @Description("opening 'Web Development' category from dropdown menu")
    public void openWebDevCategory() {
        HomePage homePage = new HomePage(driver, jsExecutor);
        openUrl(homePageURL);
        homePage
                .expandCategoriesMenu()
                .selectDevelopmentCategory()
                .clickWebDevCategory();

        assertTrue(homePage.isWebDevPage());
    }
}
