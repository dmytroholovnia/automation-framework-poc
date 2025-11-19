package ui.component;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractComponent {

    public AbstractComponent(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
