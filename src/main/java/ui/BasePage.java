package ui;

import core.Waiter;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.component.Footer;
import ui.component.Header;

import java.time.Duration;

@Getter
public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Waiter waiter;

    private final Header header;
    private final Footer footer;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.waiter = new Waiter(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigate(String url) {
        driver.navigate().to(url);
    }

}
