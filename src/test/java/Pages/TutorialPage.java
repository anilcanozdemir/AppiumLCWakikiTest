package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.DriverFactory;

public class TutorialPage {
     AppiumDriver driver;
    By content= By.id("android:id/content");
    By tvTitle=By.id("com.lcwaikiki.android:id/tvTitle");
    By skipButton=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/tvNext\")");
    By imageView1=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[2]/android.widget.ImageView");
By imageView2=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout[1]/android.widget.ImageView");
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
      checkByText(arg0);
    }
    private AndroidElement checkByText(String arg0)
    {
        AndroidElement androidElement= (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\""+arg0+"\")"));
        return androidElement;
    }
    public void checkTitleDescription(String arg0) {
        checkByText(arg0);
    }

    public void checkButton(String arg0) {
        checkByText(arg0);
    }

    public void dragAndDropTvTutorial() {
        WebElement ele1= driver.findElement(imageView1);
        WebElement ele2=driver.findElement(imageView2);
                Actions action = new Actions(driver);
        action.dragAndDrop(ele1, ele2).build().perform();
    }

    public  void clickSkipButton() {
        driver.findElement(skipButton).click();
    }

    public void checkTutorialTitle(String arg0) throws Exception {

        if(!arg0.equals(driver.findElement(tvTitle).getText()))
           throw new Exception("checkTutorialTitle");

    }


}
