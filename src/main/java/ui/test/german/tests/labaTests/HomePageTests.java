package ui.test.german.tests.labaTests;

import org.testng.annotations.Test;
import ui.test.german.pages.labaPages.HomePage;
import ui.test.common.*;

public class HomePageTests extends BaseTest {
 public final static String homePageUrl = "https://l-a-b-a.com/uk";

 @Test
 public void checkBtnOnlineCourses() {
  HomePage homePage = new HomePage(driver, jsExecutor);
  openUrl(homePageUrl);
  homePage.getClickOnlineCoursesBtn().click();
 }

 @Test
 public void checkLogoBtn() {
  HomePage homePage = new HomePage(driver, jsExecutor);
  openUrl(homePageUrl);
  homePage.getClickLogo().click();
 }
}