package steps.ui;

import core.CoreDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import ui.MainPage;

public class MainPageSteps {

    private final MainPage mainPage;

    public MainPageSteps() {
        this.mainPage = new MainPage(CoreDriver.getDriver());
    }

    @Given("I am on {string}")
    public void iAmOn(String url) {
        mainPage.navigate(url);
    }

    @When("I click on the About link")
    public void iClickOnTheAboutLink() {
        mainPage.getAboutButton().click();
        mainPage.getWaiter()
                .waitForAttribute(mainPage.getAboutButton(), "aria-current", "page");
    }

}
