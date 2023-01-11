package ui.test.kovalchuk.pages.PariMatchPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import ui.test.kovalchuk.elments.PariMatchElements.CasinoSlotsElements;

import java.util.ArrayList;
import java.util.List;


public class CasinoSlotsPage extends CasinoSlotsElements {
    ArrayList<String> slotsInCurrentCategory = new ArrayList<>();
    String currentCategory;
    List<WebElement> slotsElementsPartition;

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
        return this;
    }

    public CasinoSlotsPage openAllSlots() {
        getNvgBTN_all().click();
        return this;
    }

    public CasinoSlotsPage assertInPlace(int position, String title) {
        sleep(4000);
        Assert.assertEquals(this.getListSlotsElements().get(position).getText(), title);
        return this;
    }

    public int checkIdByName(String title) {
        List<WebElement> listOfSlots = this.getListSlotsElements();

        for (WebElement element : listOfSlots) {
            if (element.getText().equals(title)) {
                return listOfSlots.indexOf(element);
            }
        }
        return 0;
    }

    public CasinoSlotsPage openCategory(String category) {
        getCategory(category).click();
        return this;

    }

    public boolean scrolledToFooterCheck() {
        long pageHeight = (long) jsExecutor.executeScript("return document.body.scrollHeight");
        long totalScrolledHeight = (long) jsExecutor.executeScript("return parseInt(window.pageYOffset + window.innerHeight)");

        return (pageHeight - 1) <= totalScrolledHeight;
    }

    public CasinoSlotsPage getSlotsInCategory() {
        this.slotsElementsPartition = this.getListSlotsElements();
        boolean scrolledToFooter = false;
        while (!scrolledToFooter) {
            for (WebElement slot : getListSlotsElements()) {
                if (!this.slotsInCurrentCategory.contains(slot.getText()))
                    this.slotsInCurrentCategory.add(slot.getText());
            }
            scrolledToFooter = this.scrolledToFooterCheck();
            jsExecutor.executeScript("window.scrollBy(0,600)", "");
        }
        return this;
    }

    public CasinoSlotsPage getSummary(String... titles) {
        //        for (String title : titles) {
//            summary.append(title).append(" ").append(checkIdByName(title)).append(" ;");
//        }
        System.out.println(this.slotsInCurrentCategory);
        System.out.println(this.slotsInCurrentCategory.size());
        System.out.println("Summary of " + this.currentCategory + " category:");
        return this;
    }
}


