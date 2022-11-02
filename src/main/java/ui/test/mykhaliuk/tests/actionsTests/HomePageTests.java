package ui.test.mykhaliuk.tests.actionsTests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.mykhaliuk.pages.actionsPages.HomePage;

public class HomePageTests extends BaseTest {
    private final String homePageURL = "https://www.selenium.dev/selenium/web/mouse_interaction.html";
    @Test()
    @Description("Drag and drop homepage test")
    public void draggedElementInsertsIntoSearch() {
        HomePage homePage = new HomePage(driver, jsExecutor);
        openUrl(homePageURL);
        homePage
                .dragAndDropDraggable();
    }
}
