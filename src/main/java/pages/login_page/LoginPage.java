package pages.login_page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static USERDATA.UserFile.userData.*;
import static pages.login_page.Locators.locatorsLoginPage.*;

@Test
//@Description("This class check authorization page step")
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By inputLogin = By.id(LOGIN_FIELD);
    By nextButton = By.xpath(BUTTON_NEXT);
    By inputPassword = By.cssSelector(PASSWORD_FIELD);

    @Step("ввод логина ")
    public LoginPage enterLogin(){
        driver.findElement(inputLogin).sendKeys(USER_LOGIN);
        driver.findElement(nextButton).click();
        return this;
    }
    @Step("ввод пароля")
    public LoginPage enterPassword() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(inputPassword).sendKeys(USER_PASSWORD);
        driver.findElement(nextButton).click();
        return this;

    }

}
