package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_Example1 = By.xpath("//a[text()='Example 1: Element on page that is hidden']");


    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExampleOnePage clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExampleOnePage(driver);
    }
}
