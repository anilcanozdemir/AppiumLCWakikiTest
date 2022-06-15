package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TutorialPage {

    Pages.TutorialPage tutorialPage = new Pages.TutorialPage();

    @Given("Customer  opened LcWaikiki App")
    public void customerOpenedLcWaikikiApp() {
        tutorialPage.IsOpened();
    }

    @Then("should see TvTutorial")
    public void shouldSeeTvTutorial() {
        tutorialPage.checkTvTutorial();
    }

    @Then("should see {string} text")
    public void shouldSeeText(String arg0) {
        tutorialPage.checkText(arg0);
    }

    @Then("should see {string} title description")
    public void shouldSeeTitleDescription(String arg0) {
        tutorialPage.checkTitleDescription(arg0);
    }

    @Then("should see {string} button")
    public void shouldSeeButton(String arg0) {
        tutorialPage.checkButton(arg0);
    }



    @When("drag and drop TvTutorial")
    public void dragAndDropTvTutorial() {
        tutorialPage.dragAndDropTvTutorial();
    }

    @When("click Skip button")
    public void clickSkipButton() {
        tutorialPage.clickSkipButton();
    }


    @Then("should see {string} tutorial-title")
    public void shouldSeeTutorialTitle(String arg0) throws Exception {
        tutorialPage.checkTutorialTitle(arg0);
    }


}
