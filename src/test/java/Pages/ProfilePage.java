package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.DriverFactory;

import java.util.List;

public class ProfilePage {
    AppiumDriver driver;
    By forgotPassword = By.id("com.lcwaikiki.android:id/textForgotPassword");
    By textviewTitleAccount = By.id("com.lcwaikiki.android:id/textviewTitleAccount");
    By headerLogin = By.id("com.lcwaikiki.android:id/headerLogin");
    By radioButtons = By.className("android.widget.RadioButton");

    public ProfilePage() {
        this.driver = DriverFactory.getDriver();

    }

    public void checkProfilePage() throws Exception {

        if (!driver.findElement(textviewTitleAccount).getText().equals("Profil"))
            throw new Exception("checkProfilePage");

    }

    public void checkForgotPassword(String arg0) throws Exception {

        if (!driver.findElement(forgotPassword).getText().equals(arg0))
            throw new Exception("checkForgotPassword");
    }

    public void clickRadioButton(String arg0) throws Exception {
        this.findRadioButton(arg0).click();

    }

    public void checkTitle(String arg0) throws Exception {
        if (!driver.findElement(headerLogin).getText().equals(arg0))
            throw new Exception("checkTitle");

    }

    public void checkRadioButton(String arg0) throws Exception {
        this.findRadioButton(arg0);

    }

    private AndroidElement findRadioButton(String arg0) throws Exception {
        List<AndroidElement> androidElements = driver.findElements(radioButtons);
        for (AndroidElement androidElement : androidElements
        ) {
            if (androidElement.getText().equals(arg0))
                return androidElement;


        }
        throw new Exception("findRadioButton");
    }

    public void checkTextOnEmail(String arg0) throws Exception {
        if (!driver.findElement(By.id("com.lcwaikiki.android:id/edtEmail")).getText().equals(arg0))
            throw new Exception("checkTextOnEmail");
    }

    public void checkTextOnPassword(String arg0) throws Exception {
        if (!driver.findElement(By.id("com.lcwaikiki.android:id/edtPassword")).getText().equals(arg0))
            throw new Exception("checkTextOnPassword");
    }

    public void checkShowPasswordIcon() {
        driver.findElement(By.id("com.lcwaikiki.android:id/text_input_end_icon"));
    }

    public void checkLoginButton() {
        driver.findElement(By.id("com.lcwaikiki.android:id/buttonLogin"));
    }

    public void checkPhoneTextBox() {
        driver.findElement(By.id("com.lcwaikiki.android:id/radioBtnPhone"));

    }

    public void clickLoginButton() {
        driver.findElement(By.id("com.lcwaikiki.android:id/buttonLogin")).click();

    }


    public void SlideDownTextError(String arg0) throws Exception {

        if (!driver.findElement(By.id("com.lcwaikiki.android:id/slideDownText")).getText().equals(arg0))
            throw new Exception("SlideDownTextError");
    }

    public void typeEmail(String arg0) {
        this.tapEmail().sendKeys(arg0);

    }


    public void typePassword(String arg0) {
        this.tapPassword().sendKeys(arg0);

    }

    public void checkPasswordFalseMessage(String arg0) throws Exception {


        if (!driver.findElement(By.id("com.lcwaikiki.android:id/errortextPassword")).getText().equals(arg0))
            throw new Exception("checkPasswordFalseMessage");
    }

    public void checkEmailFalseMessage(String arg0) throws Exception {


        if (!driver.findElement(By.id("com.lcwaikiki.android:id/errortextEmail")).getText().equals(arg0))
            throw new Exception("checkEmailFalseMessage");
    }




    private AndroidElement tapEmail() {
        AndroidElement androidElement= (AndroidElement) driver.findElement(By.id("com.lcwaikiki.android:id/edtEmail"));
        androidElement.click();
        return androidElement;
    }

    private AndroidElement tapPassword() {
        AndroidElement androidElement= (AndroidElement) driver.findElement(By.id("com.lcwaikiki.android:id/edtPassword"));
        androidElement.click();
        return androidElement;
    }
}
