package ui;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class MainPage extends BasePage {

    @FindBy(xpath = "//a[text()='About']")
    private WebElement aboutButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage navigate(String url) {
        driver.navigate().to(url);
        //todo add waiter
        return this;
    }

}
