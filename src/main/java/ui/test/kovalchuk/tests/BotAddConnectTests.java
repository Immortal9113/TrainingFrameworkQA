package ui.test.kovalchuk.tests.linkedInTests;

import org.testng.annotations.Test;
import ui.test.common.BaseTest;
import ui.test.kovalchuk.pages.linkedInPages.HomePage;
import ui.test.kovalchuk.pages.linkedInPages.SignInPage;

public class BotAddConnectTests extends BaseTest {

private final String HomePageUrl = "https://www.linkedin.com/feed/";
private final String SignInUrl = "https://www.linkedin.com/checkpoint/lg/sign-in-another-account";


@Test
public void botAddHR(){
    HomePage homePage = new HomePage(driver,jsExecutor);
    SignInPage signInPage = new SignInPage(driver,jsExecutor);
    openUrl(SignInUrl);
    signInPage
            .enterCredentials("budimport123@gmail.com","goldgold12345")
            .clickEnterBtn();
    homePage
            .inputSearchField("HR lead\n")
            .clickPeopleBtn()
            .addsConnections(3);

}

}
