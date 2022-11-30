package ui.test.kovalchuk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.kovalchuk.pages.PariMatchPages.CasinoSlotsPage;
import ui.test.kovalchuk.utils.Actions;

public class TestsSlotsPariMatch extends BaseTest {

    private final String CasinoSlotsUrl = "https://parimatch.com/uk/casino/slots";

    @Test
    public void checkSlotRecommended(){
        CasinoSlotsPage casinoSlotsPage = new CasinoSlotsPage(driver,jsExecutor);
        openUrl(CasinoSlotsUrl);
        casinoSlotsPage
                .goToSlotsRecommended()
                .assertInPlace(15, "Juicy Fruits Sunshine Rich")
                .goToSlotsAllSlots()
                .assertInPlace(27,"Juicy Fruits Sunshine Rich")
                .goToSlotsFruits()
                .assertInPlace(18,"Juicy Fruits Sunshine Rich")
                .goToSlotsAnimals()
                .assertInPlace(14,"Mad Monkey");


    }








}
