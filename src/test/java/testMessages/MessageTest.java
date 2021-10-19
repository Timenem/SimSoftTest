package testMessages;

import org.testng.annotations.Test;
import testBase.BaseTest;

import static constants.Constants.UrlConstants.LINK;

@Test(description = "this test check messages quantity and send feedback")
public class MessageTest extends BaseTest {
    public void start() throws InterruptedException {
        basePage.openPage(LINK);
        loginPage.enterLogin();
        loginPage.enterPassword();
        mailPage.checkMessages();
        mailPage.writeMessage();
    }

}
