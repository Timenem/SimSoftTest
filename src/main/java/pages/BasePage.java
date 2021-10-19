package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constants.TimeOutConstants.EXPECTED_WAIT;

/**Base page scenario */
public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void openPage(String url){
    /**This method open send  link*/
        driver.get(url);
    }

    /**This method wait element until is created */
    public WebElement waitElement(WebElement element){
        new WebDriverWait(driver,EXPECTED_WAIT ).until(ExpectedConditions.visibilityOf(element));
        return element;
    }


}
