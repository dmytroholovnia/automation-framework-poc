package ui.component;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Header extends AbstractComponent {

    @FindBy(xpath = "//a[text()='About']")
    private WebElement aboutButton;

    public Header(WebDriver driver) {
        super(driver);
    }
}
