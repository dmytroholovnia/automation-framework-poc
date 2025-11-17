package ui;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.Driver;

@Getter
public class MainPage extends BasePage {

    @FindBy(xpath = "//*[text()='About']")
    private WebElement aboutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
