package ui.test.mykhaliuk.elements.rozetkaElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class NotebooksElements extends BasePage {
    protected final String SIDEBAR_PRODUCER_SEARCH = "(//input[@class='sidebar-search__input ng-untouched ng-pristine ng-valid'])[1]";
    protected final String LENOVO_PRODUCER_CHECKBOX = "//a[@data-id='Lenovo']";
    protected final String LENOVO_PRODUCTS_LINKS = "//ul[@class='catalog-grid ng-star-inserted']//a[@class='goods-tile__picture ng-star-inserted']";

    protected NotebooksElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }
    public WebElement getSideBarSearch() {return waitPresenceOfElementLocated(SIDEBAR_PRODUCER_SEARCH);}
    public WebElement getLenovoProducerCheckBox() {return waitPresenceOfElementLocated(LENOVO_PRODUCER_CHECKBOX);}
    public java.util.List<WebElement> get20FirstProductsLinks(){return waitPresenceOfElementsLocated(LENOVO_PRODUCTS_LINKS);}
}
