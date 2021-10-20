package pages.mail_page;

import io.qameta.allure.Step;
import org.openqa.selenium.By ;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static USERDATA.UserFile.userData.*;
import static constants.Constants.TimeOutConstants.DELAY;
import static pages.mail_page.Locators.locatorsMailPageCheckMessage.*;
import static pages.mail_page.Locators.locatorsMailPageWriteMessage.*;


@Test
public class MailPage extends BasePage {

    public MailPage(WebDriver driver) {
        super(driver);
    }

    By presFilterKey = By.cssSelector(FILTER_BTN);
    By themeFilter = By.xpath(THEME_FIELD_FILTER);
    By searchMessages = By.cssSelector(SEARCH_BUTTON);
    @Step("проверка сообщений")
    public MailPage checkMessages() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(presFilterKey).click();
        driver.findElement(themeFilter).sendKeys("Simbirsoft Тестовое задание");
        driver.findElement(searchMessages).click();
        return  this;
    }

    By messageQuantityPage = By.xpath(MESSAGE_QUANTITY_ON_PAGE);
    By messageQuantity = By.xpath(MESSAGE_QUANTITY);
    Integer one ;
    Integer two ;
    @Step("проверка количества сообщений")
    public MailPage checkQuantityMessages(){
        //total quantity messages *of*
      one = driver.findElements(messageQuantityPage).size();

      two = Integer.parseInt(driver.findElement(messageQuantity).getText());
        Assert.assertEquals(one,two);
        return this;
    }

    By writeBtn  = By.xpath(WRITE_BTN);
    By writeTo = By.cssSelector(WRITE_TO);
    By writeTheme = By.cssSelector(WRITE_THEME);
    By writeMsg = By.cssSelector(WRITE_MSG);
    By sendMsg = By.cssSelector(SEND_MSG);


    @Step("оптправка сообщений")
    public MailPage writeMessage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(writeBtn).click();
        TimeUnit.SECONDS.sleep(DELAY);

        driver.findElement(writeTo).sendKeys(RECIPIENT_LOGIN);
        TimeUnit.SECONDS.sleep(DELAY);

        driver.findElement(writeTheme).sendKeys("Simbirsoft Тестовое задание ");
        TimeUnit.SECONDS.sleep(DELAY);

        driver.findElement(writeMsg).sendKeys("Количество сообщений "+ one);
        TimeUnit.SECONDS.sleep(DELAY);
        driver.findElement(sendMsg).click();
        return this;
    }
}
