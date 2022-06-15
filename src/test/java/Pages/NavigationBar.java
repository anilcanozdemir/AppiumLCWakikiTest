package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import util.DriverFactory;

public class NavigationBar {
     AppiumDriver driver;
    public NavigationBar() {
        this.driver = DriverFactory.getDriver();

    }
    public void checkSelectedNavigationButton(String arg0) throws Exception {
        MobileElement mobileElement = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
        if(mobileElement.isSelected())
        {

        }
        else
        {
            throw new Exception("checkSelectedNavigationButton");
        }

    }


    public void checkNavigationButton(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public  void clickCard(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")")).click();
    }
}
