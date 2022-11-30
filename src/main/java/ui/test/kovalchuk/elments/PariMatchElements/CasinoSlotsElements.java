package ui.test.kovalchuk.elments.PariMatchElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

import java.util.List;

public class CasinoSlotsElements extends BasePage {

    protected final String BTN_ALL_SLOTS = "(//a[@href='/uk/casino/slots/categories/slots'])[1]";
    protected final String BTN_RECOMMENDED = "(//a[@href='/uk/casino/slots/categories/recommended'])[1]";
    protected final String BTN_FRUITS = "//a[@href='/uk/casino/slots/theme/fruits']";
    protected final String BTN_ANIMALS = "//a[@href='/uk/casino/slots/theme/animal']";

    protected final String SLOTS_LIST = "//li[@class='GameCardsGridVirtualized_item__dJBAi GameCardsGrid_item__l80pn']";

    protected CasinoSlotsElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public WebElement getBtnAllSlots (){
        return waitClickableElementByXpath(BTN_ALL_SLOTS);
    }
    public WebElement getBtnRecommended () {
        return waitClickableElementByXpath(BTN_RECOMMENDED);
    }
    public WebElement getBtnFruits () {
        return waitClickableElementByXpath(BTN_FRUITS);
    }
    public WebElement getBtnAnimals (){
        return waitClickableElementByXpath(BTN_ANIMALS);
    }

    public List<WebElement> getListSlotsElements(){
        return waitPresenceOfElementsLocated(SLOTS_LIST);
    }
}
