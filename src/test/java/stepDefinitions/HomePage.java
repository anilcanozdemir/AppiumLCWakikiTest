package stepDefinitions;

import Pages.NavigationBar;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;



public class HomePage {
    Pages.HomePage homePage = new Pages.HomePage();
    Pages.TutorialPage tutorialPage = new Pages.TutorialPage();
        @Given("Customer is on Home page")
        public void customerIsOnHomePage() {
            tutorialPage.clickSkipButton();
            homePage.checkHomePage();
        }

    @Then("should see Home page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }
}
