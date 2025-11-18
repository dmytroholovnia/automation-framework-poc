package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

public class Waiter {

    private final WebDriverWait wait;

    public Waiter(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitForAttribute(WebElement element, String attributeName, String expectedValue) {
        wait.until((ExpectedCondition<Boolean>) d ->
                Objects.equals(element.getAttribute(attributeName), expectedValue)
        );
    }
}
