package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePage {
    Pages.ProfilePage profilePage = new Pages.ProfilePage();
    Pages.TutorialPage tutorialPage = new Pages.TutorialPage();
    Pages.NavigationBar navigationBar = new Pages.NavigationBar();

    @Then("should see Profile Page")
    public void shouldSeeProfilePage() throws Exception {
        profilePage.checkProfilePage();
    }

    @Given("Customer is on Profile Page")
    public void customerIsOnProfilePage() throws Exception {
        tutorialPage.clickSkipButton();
        navigationBar.clickCard("Profil");
        profilePage.checkProfilePage();
    }

    @Then("should see {string} forgot password")
    public void shouldSeeForgotPassword(String arg0) throws Exception {
        profilePage.checkForgotPassword(arg0);
    }

    @When("click {string} radio button")
    public void clickRadioButton(String arg0) throws Exception {
        profilePage.clickRadioButton(arg0);
    }

    @Then("should see {string} title")
    public void shouldSeeTitle(String arg0) throws Exception {
        profilePage.checkTitle(arg0);
    }

    @Then("should see {string} radio button")
    public void shouldSeeRadioButton(String arg0) throws Exception {
        profilePage.checkRadioButton(arg0);
    }

    @Then("should see {string} text on Email")
    public void shouldSeeTextOnEmail(String arg0) throws Exception {
        profilePage.checkTextOnEmail(arg0);
    }

    @Then("should see {string} text on Password")
    public void shouldSeeTextOnPassword(String arg0) throws Exception {
        profilePage.checkTextOnPassword(arg0);
    }

    @Then("should see Show Password Icon")
    public void shouldSeeShowPasswordIcon() {
        profilePage.checkShowPasswordIcon();
    }

    @Then("should see {string} login button")
    public void shouldSeeLoginButton(String arg0) {
        profilePage.checkLoginButton();
    }

    @Then("should see Phone Text Box")
    public void shouldSeePhoneTextBox() {
        profilePage.checkPhoneTextBox();
    }

    @When("click login button")
    public void clickLoginButton() {
        profilePage.clickLoginButton();
    }

    @Then("should see {string} Login Error Message")
    public void shouldSeeEmailEmptyMessage(String arg0) throws Exception {
        profilePage.SlideDownTextError(arg0);
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        profilePage.typeEmail(arg0);
    }


    @When("type Password {string}")
    public void typePassword(String arg0) {
        profilePage.typePassword(arg0);
    }




    @Then("should see {string} Email False message")
    public void shouldSeeEmailFalseMessage(String arg0) throws Exception {
        profilePage.checkEmailFalseMessage(arg0);
    }

    @When("type Email {string}, Password {string} and click login")
    public void typeEmailPasswordAndClickLogin(String arg0, String arg1) {
        profilePage.typeEmail(arg0);
        profilePage.typePassword(arg1);
        profilePage.clickLoginButton();
    }



    @Then("should see {string} Password False message")
    public void shouldSeePasswordFalseMessage(String arg0) throws Exception {
        profilePage.checkPasswordFalseMessage(arg0);
    }

}
