package ui.test.mykhaliuk.tests.conversionTests;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.mykhaliuk.data_providers.ConversionDataProviders;
import ui.test.mykhaliuk.pages.conversionPages.ConversionHomeHomePage;

import java.util.ArrayList;

public class ConversionTests extends BaseTest {
    private static final String HOME_URL = "https://www.digitaldutch.com/unitconverter/";

    @Test(dataProvider = "randomWeightData", dataProviderClass = ConversionDataProviders.class)
    @Description("mass conversion test with data providers")
    public void massConversionTest(ArrayList<Integer> lbList, ArrayList<Double> kgList) {
        ConversionHomeHomePage conversionHomePage = new ConversionHomeHomePage(driver, jsExecutor);

        openUrl(HOME_URL);
        conversionHomePage
                .switchToMassSubMenu()
                .selectPoundOption()
                .assertConversion(lbList, kgList);
    }
}
