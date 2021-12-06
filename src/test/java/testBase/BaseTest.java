import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    String USER_PASSWORD ="";
    String USER_LOGIN = "";
    String ANOTHER_LOGIN = "";

    public static final String LOGIN_FIELD = "identifierId";
    public static final String BUTTON_NEXT = "//span[.='Далее']";
    public static final String PASSWORD_FIELD ="[aria-label='Введите пароль']";

    public static final String WRITE_BTN = "//*[contains(text(),'Compose')]";
    public static final String WRITE_TO = "[aria-label='To']";
    public static final String WRITE_THEME = "[aria-label='Subject']";
    public static final String WRITE_MSG = "div[aria-label='Message Body']";
    public static final String SEND_MSG = ".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3";

    @BeforeAll
    public static void setup(){
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        Configuration.browser = "firefox";
        open("https://mail.google.com");
    }

    @Test
    public void authorisationToMail(){
        $(By.id(LOGIN_FIELD)).setValue(USER_LOGIN);
        $(By.xpath(BUTTON_NEXT)).click();
        $(By.cssSelector(PASSWORD_FIELD)).setValue(USER_PASSWORD);
        $(By.xpath(BUTTON_NEXT));
    }

    @Test
    public void sendMessage(){
        $(By.xpath(WRITE_BTN)).click();
        $(By.cssSelector(WRITE_TO)).setValue(ANOTHER_LOGIN);
        $(By.cssSelector(WRITE_THEME)).setValue("test");
        $(By.cssSelector(WRITE_MSG)).setValue("quantity");
        $(By.cssSelector(SEND_MSG)).click();
    }

}

