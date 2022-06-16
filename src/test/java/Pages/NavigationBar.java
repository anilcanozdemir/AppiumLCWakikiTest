package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import util.DriverFactory;

public class NavigationBar {
     AppiumDriver driver;
    public NavigationBar() {
        this.driver = DriverFactory.getDriver();

    }
    public void checkSelectedNavigationButton(String arg0) throws Exception {
        MobileElement mobileElement = checkByText(arg0);
        if(mobileElement.isSelected())
        {

        }
        else
        {
            throw new Exception("checkSelectedNavigationButton");
        }

    }
    private AndroidElement checkByText(String arg0)
    {
        AndroidElement androidElement= (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
        return androidElement;
    }

    public void checkNavigationButton(String arg0) {
       checkByText(arg0);
    }

    public  void clickCard(String arg0) {
        checkByText(arg0).click();
    }
}
