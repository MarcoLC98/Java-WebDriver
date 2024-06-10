package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExampleOnePage {

    private WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingExampleOnePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.
                invisibilityOf(driver.findElement(loadingBar)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }

    public void clickStartFluentWait() {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(6))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

                wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingBar)));
    }
}