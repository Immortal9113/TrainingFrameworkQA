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
    protected final String BTN_CRYSTALS = "//a[@href='/uk/casino/slots/theme/crystals']";
    protected final String BTN_BOOKS = "//a[@href='/uk/casino/slots/theme/books']";

    protected final String BTN_NAVIGATION_ALL = "(//button[@class='NavigationBlock_item__LOflV NavigationBlock_all__3fD57'])[2]";


    protected final String SLOTS_LIST = "//li[@class='GameCardsGridVirtualized_item__dJBAi GameCardsGrid_item__l80pn']";
    protected final String CATEGORIES_LINKS = "(//ul[@class='NavigationBlock_list__r78n9'])[1]/li";
    protected final String CATEGORIES_SPAN = "(//ul[@class='NavigationBlock_list__r78n9'])[1]/li//span";

    protected CasinoSlotsElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public WebElement getBtnBooks() {
        return waitClickableElementByXpath(BTN_BOOKS);
    }

    public WebElement getBtnAllSlots() {
        return waitClickableElementByXpath(BTN_ALL_SLOTS);
    }

    public WebElement getBtnRecommended() {
        return waitClickableElementByXpath(BTN_RECOMMENDED);
    }

    public WebElement getBtnFruits() {

        return waitClickableElementByXpath(BTN_FRUITS);
    }

    public WebElement getBtnAnimals() {

        return waitClickableElementByXpath(BTN_ANIMALS);
    }

    public WebElement getBtnCrystals() {
        return waitClickableElementByXpath(BTN_CRYSTALS);
    }

    public WebElement getNvgBTN_all() {

        return waitClickableElementByXpath(BTN_NAVIGATION_ALL);
    }

    public WebElement getCategory(String category) {
        sleep(5000);
        List<WebElement> elements = waitPresenceOfElementsLocated(CATEGORIES_LINKS);
        List<WebElement> elementSpans = waitPresenceOfElementsLocated(CATEGORIES_SPAN);
        for (int i = 0; i < elementSpans.size(); i++) {
            System.out.println(category + elementSpans.get(i).getText());
            if (elementSpans.get(i).getText().equals(category)) return elements.get(i);
        }
        return null;
//                System.out.println(category + " Wrong category " + elementSpans.get(i).getText());
    }

    public List<WebElement> getListSlotsElements() {

        return waitPresenceOfElementsLocated(SLOTS_LIST);
    }

}

