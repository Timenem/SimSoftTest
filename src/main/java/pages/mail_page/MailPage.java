package pages.mail_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

import static USERDATA.UserFile.userData.*;
import static pages.mail_page.Locators.locatorsMailPageWriteMessage.*;


/**This class check mail page step 3*/
public class MailPage extends BasePage {

    public MailPage(WebDriver driver) {
        super(driver);
    }


    public MailPage checkMessages(){
        return this;
    }

    By writeBtn  = By.xpath(WRITE_BTN);
    By writeTo = By.cssSelector(WRITE_TO);
    By writeTheme = By.cssSelector(WRITE_THEME);
    By writeMsg = By.cssSelector(WRITE_MSG);
    By sendMsg = By.xpath(SEND_MSG);

    /**write text method */
    public MailPage writeMessage() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(writeBtn).click();
        TimeUnit.SECONDS.sleep(2);

        driver.findElement(writeTo).sendKeys(RECIPIENT_LOGIN);
        TimeUnit.SECONDS.sleep(2);

        driver.findElement(writeTheme).sendKeys("Simbirsoft Тестовое задание");
        TimeUnit.SECONDS.sleep(2);

        driver.findElement(writeMsg).sendKeys("123");
        driver.findElement(sendMsg).click();
        return this;
    }
}