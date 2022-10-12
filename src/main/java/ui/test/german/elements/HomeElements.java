package ui.test.german.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.test.common.*;

public class HomeElements extends BasePage {

    protected HomeElements(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public String SEARCH_BUTTON = "//span[@class='hidden-md-down']";
    public String ONLINE_COURSES_BUTTON = "//div[@id='course-btn-toggle']";
    public String MARKETING_BUTTON = "//a[@href='/uk/lecture/marketing-and-pr/tag=marketing']";
    public String FREE_WEBINAR_BUTTON= "//img[@src='/uploads/banner/full_size/1920kh60-62ea922781d32659116750.png']";
    public String LOGO = "//div[@class='logo__box d-flex']";

    public WebElement getClickSearchBtn(){return waitClickableElementByXpath(SEARCH_BUTTON);}
    public WebElement getClickOnlineCoursesBtn(){return waitClickableElementByXpath(ONLINE_COURSES_BUTTON);}
    public WebElement getMarketingBtn(){return waitVisibleOfElement(MARKETING_BUTTON);}
    public WebElement getFreeWebinarBtn(){ return waitClickableElementByXpath(FREE_WEBINAR_BUTTON);}
    public WebElement getClickLogo(){ return waitClickableElementByXpath(LOGO);}
}