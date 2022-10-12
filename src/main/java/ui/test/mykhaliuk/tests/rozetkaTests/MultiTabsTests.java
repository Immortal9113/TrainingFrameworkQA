package ui.test.mykhaliuk.tests.rozetkaTests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.mykhaliuk.pages.rozetkaPages.HomePage;
import ui.test.mykhaliuk.pages.rozetkaPages.NotebooksPage;

import java.util.ArrayList;


public class MultiTabsTests extends BaseTest {
    private final String homePageURL = "https://rozetka.com.ua/";

    @Test()
    @Description("Multiple tabs handling test")
    public void searchTwoBrandsOfLaptopsInDifferentTabs() {
        HomePage homePage = new HomePage(driver, jsExecutor);
        NotebooksPage laptopsPage = new NotebooksPage(driver, jsExecutor);
        openUrl(homePageURL);
        homePage
                .searchForLaptops()
                .openLaptopsPageTab()
                .searchClean()
                .searchForKeyboards()
                .openKeyboardsPageTab();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));
        laptopsPage
                .searchForLenovoBrand()
                .open20FirstProductsTabs();
        tabs = new ArrayList<>(driver.getWindowHandles());
        for (int i = tabs.size() - 1; i > 0; i--) {
            driver.switchTo().window(tabs.get(i));
            driver.close();
        }
    }

}
