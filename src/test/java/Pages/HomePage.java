package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import util.DriverFactory;

public class HomePage {
    AppiumDriver driver;

    public HomePage() {
        this.driver = DriverFactory.getDriver();

    }
    public void checkHomePage() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hoş geldin\")"));

    }
}
