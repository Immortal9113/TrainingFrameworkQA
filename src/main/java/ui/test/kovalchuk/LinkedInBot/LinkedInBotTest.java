package ui.test.kovalchuk.LinkedInBot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import ui.test.kovalchuk.TestInit;

import java.time.Duration;

public class LinkedInBotTest extends TestInit {



//    public static void scrollForElement(WebElement element, WebDriver drv) {
//        ((JavascriptExecutor) drv).executeScript("arguments[0].scrollIntoView(true);", element);
//    }

    @Test
    public void hr_ConnectBot() {

        goToLinkedIn();
        LinkedInSignInPage linkedInSignInPage = new LinkedInSignInPage(driver);
        LinkedInHomePage linkedInHomePage = new LinkedInHomePage(driver);

        linkedInSignInPage.inputUserName().sendKeys("budimport123@gmail.com");
        linkedInSignInPage.inputPassword().sendKeys("goldgold12345");
        linkedInSignInPage.enterBtn().click();
        linkedInHomePage.searchField().sendKeys("HR\n");

//        WebElement buttonPeople = new WebDriverWait(driver, Duration.ofSeconds(5))
//            .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='People']")));

        linkedInHomePage.getClickButtonPeople().click();
        sleep(2000);


        for (int i = 0; i < 10; i++) {
            sleep(3000);
            linkedInHomePage.getClickButtonConnect().click();
            sleep(1000);
            linkedInHomePage.getClickButtonSendResponse().click();

            sleep(2000);
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,800000)");

            sleep(2000);
            linkedInHomePage.getNextBtn().click();
        }




//        List connectList = new ArrayList<>();
//
//       connectList.addAll(driver.findElements(By.xpath("//button[@class='artdeco-button artdeco-button--2 artdeco-button--secondary ember-view']//span[text()='Connect']")));
//        System.out.println(connectList.size());
//
//        for (Object s : connectList) {
//            System.out.println(s);
//        }


    }






}
