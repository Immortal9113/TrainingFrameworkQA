package ui.test.kovalchuk.tests;

import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.kovalchuk.pages.PariMatchPages.CasinoSlotsPage;

public class TestsSlotsPariMatch extends BaseTest {

    private final String CasinoSlotsUrl = "https://parimatch.com/uk/casino/slots";

    @Test
    public void checkSlotsPosition() {
        CasinoSlotsPage casinoSlotsPage = new CasinoSlotsPage(driver, jsExecutor);
        openUrl(CasinoSlotsUrl);
        casinoSlotsPage
                .goToSlotsRecommended()
//                check position 13
                .assertInPlace(12, "Juicy Fruits Sunshine Rich")
                .goToSlotsAnimals()
//                check position 15
                .assertInPlace(14, "Mad Monkey")
//                check position 16
                .assertInPlace(15, "Prime King Riches of the Ancient")
                .goToSlotsFruits()
//                check position 10
                .assertInPlace(9, "Juicy Fruits Sunshine Rich")
                .goToSlotsBooks()
//                check position 21
                .assertInPlace(20, "Reliquary of Ra")
//                check position 23
                .assertInPlace(22, "Reliquary of Ra 6 Reels");
    }

    @Test
    public void checkTitlesIn() {
        CasinoSlotsPage casinoSlotsPage = new CasinoSlotsPage(driver, jsExecutor);
        openUrl(CasinoSlotsUrl);

        casinoSlotsPage
                .openCategory("Топ")
                .getSlotsInCategory()
                .getSummary("Juicy Fruits Sunshine Rich", "Reliquary of Ra 6 Reels", "Reliquary of Ra Reels");
//                .openCategory("Новинки")
//                .getSlotsInCategory()
//                .getSummary("Juicy Fruits Sunshine Rich")
//                .openCategory("Рекомендуємо")
//                .getSlotsInCategory()
//                .getSummary("Juicy Fruits Sunshine Rich");
    }

}






