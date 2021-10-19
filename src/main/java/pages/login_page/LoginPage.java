package pages.login_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static USERDATA.UserFile.userData.*;
import static pages.login_page.Locators.locatorsLoginPage.*;

/**This class check authorization page step 2 **/
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By inputLogin = By.id(LOGIN_FIELD);
    By nextButton = By.xpath(BUTTON_NEXT);
    By inputPassword = By.cssSelector(PASSWORD_FIELD);

    /**enter login*/
    public LoginPage enterLogin(){
        driver.findElement(inputLogin).sendKeys(USER_LOGIN);
        driver.findElement(nextButton).click();
        return this;
    }
    /**enter password method*/
    public LoginPage enterPassword() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(inputPassword).sendKeys(USER_PASSWORD);
        driver.findElement(nextButton).click();
        return this;

    }

}
