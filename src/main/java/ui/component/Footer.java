package ui.component;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Footer extends AbstractComponent {

    @FindBy(xpath = "//footer/descendant::a[normalize-space(text()) != '']")
    private WebElement authorLinkElement;

    public Footer(WebDriver driver) {
        super(driver);
    }

    public String getAuthorName() {
        return authorLinkElement.getText();
    }
}
