package ui.test.mykhaliuk.elements.conversionElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.BasePage;

public class ConversionHomeElements extends BasePage {
    private final String RESULT_UNITS_SELECT = "//select[@id='selectFrom']";
    private final String POUND_OPTION = "pounds (US & UK) [lbs]";
    private final String INPUT_FROM_NUMBER = "(//input[@class='inputNumber'])[1]";
    private final String INPUT_TO_NUMBER = "(//input[@class='inputNumber'])[2]";
    private final String MASS_SUBMENU = "//a[contains(text(), 'Mass')]";

    protected ConversionHomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }
    public WebElement getResultUnitSelect(){return waitPresenceOfElementLocated(RESULT_UNITS_SELECT);}
    public String getPoundOption(){return POUND_OPTION;}
    public WebElement getGetInputNumberFrom(){return waitPresenceOfElementLocated(INPUT_FROM_NUMBER);}
    public WebElement getGetInputNumberTo(){return waitPresenceOfElementLocated(INPUT_TO_NUMBER);}
    public WebElement getMassSubMenu(){return waitPresenceOfElementLocated(MASS_SUBMENU);}
}
