package ui.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ui.BasePage;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AboutPage extends BasePage {

    @FindBy(xpath = "//h1")
    private WebElement titleElement;

    @FindBy(xpath = "//h3")
    private List<WebElement> subTitleElements;

    public AboutPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return titleElement.getText();
    }

    public List<String> getSubtitles() {
        return subTitleElements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }
}
