package testMessages;

import testBase.BaseTest;

import static constants.Constants.UrlConstants.LINK;

public class MessageTest extends BaseTest {
    public void start() throws InterruptedException {
        basePage.openPage(LINK);
        loginPage.enterLogin();
        loginPage.enterPassword();
        mailPage.checkMessages();
        mailPage.writeMessage();
    }

}
