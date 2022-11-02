package ui.test.mykhaliuk.elements.actionsElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class HomeElements extends BasePage {
    protected final String DRAGGABLE_ID = "draggable";
    protected final String DROPPABLE_ID = "droppable";

    protected HomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }
    public WebElement getDraggable(){
        return waitPresenceOfElementLocatedById(DRAGGABLE_ID);
    }
    public WebElement getDroppable(){
        return waitPresenceOfElementLocatedById(DROPPABLE_ID);
    }
}
