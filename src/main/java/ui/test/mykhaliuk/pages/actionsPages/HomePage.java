package ui.test.mykhaliuk.pages.actionsPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.mykhaliuk.elements.actionsElements.HomeElements;
import static ui.test.mykhaliuk.utils.CommonActions.dragAction;

public class HomePage extends HomeElements {
    public HomePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }
    @Step("Dragging element")
    public HomePage dragAndDropDraggable() {
        dragAction(driver, getDraggable(), getDroppable());
        return this;
    }
}
