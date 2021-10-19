package testMailPage;

import org.testng.annotations.Test;
import testBase.BaseTest;

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
