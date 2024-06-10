package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.id;

public class FramesPage {
    private WebDriver driver;
    private By nestedFramesBtn = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void getLeftFrame() {
        driver.switchTo().frame(0).getTitle();
    }

}
