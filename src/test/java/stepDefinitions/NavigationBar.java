package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class NavigationBar {

    Pages.NavigationBar navigationBar = new Pages.NavigationBar();
    @When("click {string} card in the navigationBar")
    public void clickCardInTheNavigationBar(String arg0) {
        navigationBar.clickCard(arg0);
    }

    @Then("should see {string} navigation button")
    public void shouldSeeNavigationButton(String arg0) {
        navigationBar.checkNavigationButton(arg0);
    }

    @Then("should see {string} selected navigation button")
    public void shouldSeeSelectedNavigationButton(String arg0) throws Exception {
        navigationBar.checkSelectedNavigationButton(arg0);
    }
}
