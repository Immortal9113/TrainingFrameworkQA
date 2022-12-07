package ui.test.kovalchuk.pages.PariMatchPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ui.test.kovalchuk.elments.PariMatchElements.CasinoSlotsElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CasinoSlotsPage extends CasinoSlotsElements {

    public CasinoSlotsPage(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public CasinoSlotsPage goToSlotsBooks() {
        getBtnBooks().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsAllSlots() {
        getBtnAllSlots().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsRecommended() {
        getBtnRecommended().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsFruits() {
        getBtnFruits().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsAnimals() {
        getBtnAnimals().click();
        return this;
    }

    public CasinoSlotsPage goToSlotsCrystals() {
        getBtnCrystals().click();
        ;
        return this;
    }

    public CasinoSlotsPage openAllSlots() {
        getNvgBTN_all().click();
        return this;
    }

    //Assert.assertEquals(casinoSlotsPage.getListSlotsElements().get(15).getText(), "Juicy Fruits Sunshine Rich")
    public CasinoSlotsPage assertInPlace(int position, String title) {
        sleep(4000);
        Assert.assertEquals(this.getListSlotsElements()
                .get(position)
                .getText(), title);
        return this;
    }

    public int checkIdByName(String title) {
        List<WebElement> listOfSlots = this.getListSlotsElements();

        for (WebElement element : listOfSlots) {

            if (element.getText().equals(title)) {
                return listOfSlots.indexOf(element);
//                System.out.println(listOfSlots.indexOf(element));

            }
        }




//        for (int index  = 0; index  < listOfSlots.size() ;  index++) {
//
//           WebElement element = listOfSlots.get(index);
//
//            if (element.getText().equals(title)) {
//                System.out.println(listOfSlots.indexOf(element));
//                break;
//            }
        return 0;
    }

   public CasinoSlotsPage openCategory(String category){
        getCategory(category).click();
        return this;

}
    public CasinoSlotsPage checkCategory(String category, String... titles ) {
        this.openCategory(category);
        this.checkAllSlotsLoaded(titles);
        StringBuilder summary = new StringBuilder("Summary of " + category + " Category:");
        for (String title: titles) {
            summary.append(title).append(" ").append(checkIdByName(title)).append(" ;");

        }
        System.out.println(summary);
        return this;
    }

    public CasinoSlotsPage checkAllSlotsLoaded(String[] titles){

        while (titles.length > 0 ){
            List<WebElement> listOfSlots = this.getListSlotsElements();
            for (WebElement element : listOfSlots) {
                for (String title : titles) {
                    if (element.getText().equals(title)){
                        List<String> tmpList = new ArrayList<>(Arrays.asList(titles));
                        tmpList.remove(title);
                        titles = tmpList.toArray(new String[0]);
                    }
                }
            }
            jsExecutor.executeScript("window.scrollBy(0,3500)","");
            sleep(8000);
        }
        return this;

    }

}



