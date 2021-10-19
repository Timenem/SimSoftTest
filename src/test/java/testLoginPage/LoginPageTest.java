package testLoginPage;

import org.testng.annotations.Test;
import pages.BasePage;
import testBase.BaseTest;

import static constants.Constants.UrlConstants.LINK;

@Test(description ="this method check autohorization" )
public class LoginPageTest extends BaseTest {
    public void start() throws InterruptedException {
        basePage.openPage(LINK);
        loginPage.enterLogin();
        loginPage.enterPassword();
    }

}
