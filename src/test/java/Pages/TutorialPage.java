package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.DriverFactory;

public class TutorialPage {
     AppiumDriver driver;
    By content= By.id("android:id/content");
    By tvTitle=By.id("com.lcwaikiki.android:id/tvTitle");

    public TutorialPage() {
        this.driver = DriverFactory.getDriver();

    }

    public void IsOpened() {
        driver.findElement(content);
    }

    public void checkTvTutorial() {
        driver.findElement(tvTitle);
    }

    public void checkText(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void checkTitleDescription(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void checkButton(String arg0) {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
    }

    public void dragAndDropTvTutorial() {
        WebElement ele1= driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[2]/android.widget.ImageView"));
        WebElement ele2=driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.ImageView"));
        Actions action = new Actions(driver);
        action.dragAndDrop(ele1, ele2).build().perform();
    }

    public  void clickSkipButton() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")")).click();
    }

    public void checkTutorialTitle(String arg0) throws Exception {

        if(!arg0.equals(driver.findElement(tvTitle).getText()))
           throw new Exception("checkTutorialTitle");

    }


}
