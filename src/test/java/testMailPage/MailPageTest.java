package testMailPage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.login_page.LoginPage;
import testBase.BaseTest;
import testLoginPage.LoginPageTest;

import static constants.Constants.UrlConstants.LINK;

@Test(description = "this test check write and send method")
public class MailPageTest extends BaseTest {
    public void start() throws InterruptedException {
        basePage.openPage(LINK);
        loginPage.enterLogin();
        loginPage.enterPassword();
        mailPage.writeMessage();
    }

}
