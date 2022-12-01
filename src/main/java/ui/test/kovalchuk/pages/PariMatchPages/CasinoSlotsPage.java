package ui.test.kovalchuk.pages.PariMatchPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ui.test.kovalchuk.elments.PariMatchElements.CasinoSlotsElements;

import java.util.List;

public class CasinoSlotsPage extends CasinoSlotsElements {

    public CasinoSlotsPage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

public  CasinoSlotsPage goToSlotsBooks(){
        getBtnBooks().click();
        return this;
}
    public CasinoSlotsPage goToSlotsAllSlots(){
        getBtnAllSlots().click();
        return this;
    }
    public CasinoSlotsPage goToSlotsRecommended(){
        getBtnRecommended().click();
        return this;
    }
    public CasinoSlotsPage goToSlotsFruits(){
        getBtnFruits().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsAnimals(){
        getBtnAnimals().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsCrystals(){
        getBtnCrystals().click();;
        return this;
    }

    public CasinoSlotsPage openAllSlots (){
        getNvgBTN_all().click();
        return this;
    }
    //Assert.assertEquals(casinoSlotsPage.getListSlotsElements().get(15).getText(), "Juicy Fruits Sunshine Rich")
    public CasinoSlotsPage assertInPlace(int position, String title){
        sleep(4000);
        Assert.assertEquals(this.getListSlotsElements()
                .get(position)
                .getText(), title);
        return this;
    }


}
