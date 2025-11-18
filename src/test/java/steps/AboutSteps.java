package steps;

import core.CoreDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;
import ui.pages.AboutPage;

public class AboutSteps {

    private final AboutPage aboutPage;

    public AboutSteps() {
        this.aboutPage = new AboutPage(CoreDriver.getDriver());
    }

    @Then("I should be redirected to the about page")
    public void iShouldBeRedirectedToTheAboutPage() {
        Assertions.assertThat(aboutPage.getTitle())
                .isEqualTo("About");
    }

    @And("I should see information about the technical stuff")
    public void iShouldSeeInformationAboutTheTechnicalStuff() {
        Assertions.assertThat(aboutPage.getSubtitles())
                .contains("Technical stuff?");
    }
}
