package ui.test.german.pages.labaPages;

import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.german.elements.HomeElements;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver, JavascriptExecutor jsExecutor){
        super(driver, jsExecutor);
    }
@Step
    public HomePage clickSearchBtn(){
        getClickSearchBtn().click();
        return this;
    }
    @Step
    public HomePage clickBtnOnlineCourses(){
        getClickOnlineCoursesBtn().click();
        return this;
    }
}


