package ui.component;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class Footer {

    private final WebDriver driver;

    @FindBy(xpath = "//footer/descendant::a[normalize-space(text()) != '']")
    private WebElement authorLinkElement;

    public Footer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getAuthorName() {
        return authorLinkElement.getText();
    }
}
