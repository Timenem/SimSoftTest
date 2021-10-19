package testBase;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.BasePage;
import pages.login_page.LoginPage;
import pages.mail_page.MailPage;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected MailPage mailPage = new MailPage(driver);
    @AfterTest
    /**clear cookies (optional)**/
    public void clearCookiesAndLocalStorage(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.manage().deleteAllCookies();
        javascriptExecutor.executeScript("window.sessionStorage.clear()");
    }


    @AfterSuite
    /**close browser*/
    public void close(){
        driver.quit();
    }

}
