package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static constants.Constants.DriverConstants.*;
import static constants.Constants.TimeOutConstants.*;

/**Create driver exmplar (for chrome need add chromedriver and path)
 * implicitly wait = 5 sec */
public class CommonActions {
    public static WebDriver createDriver() {
        System.setProperty(FIRE_FOX_PROPERTY, FIRE_FOX_PATH);
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICITY_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
