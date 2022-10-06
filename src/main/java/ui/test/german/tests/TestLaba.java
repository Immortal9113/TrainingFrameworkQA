package ui.test.german.tests;

import org.testng.annotations.Test;
import ui.test.german.pageObject.LabaHomePage;

import java.time.Duration;

public class TestLaba extends TestInit{

 @Test
 public void checkBtnOnlnCourses() throws InterruptedException {
  LabaHomePage labaHomePage= new LabaHomePage(driver);
  labaHomePage.navigateLaba();

  labaHomePage.getClickBtnOnlineCourses().click();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  labaHomePage.getBtnMarketing().click();
 }

 @Test
 public void checkBtnMaterials(){
  LabaHomePage labaHomePage = new LabaHomePage(driver);
  labaHomePage.navigateLaba();

  labaHomePage.getCheckBtnFreeWebinar().click();
 }

 @Test
 public void checkLogoBtn(){
  LabaHomePage labaHomePage = new LabaHomePage(driver);
  labaHomePage.navigateLaba();

  labaHomePage.getLogo().click();
 }

 }
