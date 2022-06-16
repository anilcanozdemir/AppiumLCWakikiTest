package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import util.DriverFactory;

public class HomePage {
    AppiumDriver driver;
    By homePage=  MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hoş geldin\")");

    public HomePage() {
        this.driver = DriverFactory.getDriver();

    }
    public void checkHomePage() {
        driver.findElement(homePage);

    }
}
