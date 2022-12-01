package ui.test.kovalchuk.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.kovalchuk.pages.PariMatchPages.CasinoSlotsPage;
import ui.test.kovalchuk.utils.Actions;

public class TestsSlotsPariMatch extends BaseTest {

    private final String CasinoSlotsUrl = "https://parimatch.com/uk/casino/slots";

    @Test
    public void checkSlotsPosition(){
        CasinoSlotsPage casinoSlotsPage = new CasinoSlotsPage(driver,jsExecutor);
        openUrl(CasinoSlotsUrl);
        casinoSlotsPage
                .goToSlotsRecommended()
                .assertInPlace(12, "Juicy Fruits Sunshine Rich")
                .goToSlotsAnimals()
                .assertInPlace(14,"Mad Monkey")
                .assertInPlace(15,"Prime King Riches of the Ancient")
                .goToSlotsFruits()
                .assertInPlace(9,"Juicy Fruits Sunshine Rich")
                .goToSlotsBooks()
                .assertInPlace(20,"Reliquary of Ra")
                .assertInPlace(22,"Reliquary of Ra 6 Reels")
                .openAllSlots()
                .goToSlotsCrystals()
                .assertInPlace(24,"Hold and Spin");



    }








}
