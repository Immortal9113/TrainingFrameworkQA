package ui.test.mykhaliuk.pages.rozetkaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.mykhaliuk.elements.rozetkaElements.NotebooksElements;

import static ui.test.mykhaliuk.utils.CommonActions.openInNewTab;

public class NotebooksPage extends NotebooksElements {

    public NotebooksPage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    @Step("Searching for Lenovo brand")
    public NotebooksPage searchForLenovoBrand() {
        getSideBarSearch().sendKeys("Lenovo");
        getLenovoProducerCheckBox().click();
        return this;
    }

    @Step("Opening first 20 Lenovo product tabs")
    public void open20FirstProductsTabs() {
        for (int i = 0; i < 20; i++) {
            openInNewTab(get20FirstProductsLinks().get(i));
        }
    }
}
