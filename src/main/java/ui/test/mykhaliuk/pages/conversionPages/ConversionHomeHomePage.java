package ui.test.mykhaliuk.pages.conversionPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ui.test.mykhaliuk.elements.conversionElements.ConversionHomeElements;

import java.util.ArrayList;

public class ConversionHomeHomePage extends ConversionHomeElements {
    public ConversionHomeHomePage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    @Step("Selecting Pound in dropdown options")
    public ConversionHomeHomePage selectPoundOption() {
        Select resultUnitsSelector = new Select(getResultUnitSelect());
        resultUnitsSelector.selectByVisibleText(getPoundOption());
        return this;
    }

    @Step("Asserting found converted values equal to precalculated data")
    public ConversionHomeHomePage assertConversion(ArrayList<Integer> lbList, ArrayList<Double> kgList) {
        for (int i = 0; i < lbList.size(); i++) {
            getGetInputNumberFrom().sendKeys(Keys.chord(Keys.CONTROL + "A" + Keys.RETURN), lbList.get(i).toString());
            String expected = String.format("%.6f", kgList.get(i));
            assertEquals(getGetInputNumberTo().getAttribute("value"), expected);
        }

        return this;
    }

    @Step("Switching to mass submenu")
    public ConversionHomeHomePage switchToMassSubMenu() {
        getMassSubMenu().click();
        return this;
    }
}
