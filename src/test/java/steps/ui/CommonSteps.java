package steps.ui;

import core.CoreDriver;
import io.cucumber.java.en.And;
import org.assertj.core.api.Assertions;
import ui.pages.MainPage;

public class CommonSteps {

    @And("I should see {string} mentioned")
    public void iShouldSeeMentioned(String expectedAuthorName) {
        MainPage mainPage = new MainPage(CoreDriver.getDriver());
        Assertions.assertThat(mainPage.getFooter().getAuthorName())
                .as("Invalid Author name in footer!")
                .isEqualTo(expectedAuthorName);
    }
}
