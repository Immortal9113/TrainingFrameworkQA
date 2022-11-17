package ui.test.vasylenko.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import ui.test.vasylenko.elements.AmazonSearchResultElements;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchResult extends AmazonSearchResultElements {
    public AmazonSearchResult(WebDriver driver, JavascriptExecutor jsExecutor) {
        super(driver, jsExecutor);
    }

    public boolean findLowerPrize() {
        List<String> prize = new ArrayList<>();
        searchPrizes().forEach(WebElement -> {
            String text = WebElement.getAttribute("innerText").substring(1);
            prize.add(text);
        });
        for (int i=0; i< prize.size(); i++){
                prize.get(i).replaceAll(",","");
        }
        double minPrize = Double.parseDouble(prize.get(0));
        for (int i=1; i<prize.size(); i++){
            if (Double.parseDouble(prize.get(i)) < minPrize){
                minPrize = Double.parseDouble(prize.get(i));
            }
        }
        return (Double.parseDouble(prize.get(0)) == minPrize);
    }

    public AmazonSearchResultElements useFilterLowToHighPrize(){
        getSortBtn().click();
        getLowToHighFilter().click();
        return new AmazonSearchResultElements(driver, jsExecutor);
    }
}





