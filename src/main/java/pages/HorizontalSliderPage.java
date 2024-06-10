package pages;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slide = By.cssSelector("input[control-id='ControlID-1']");
    private By range = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slide(int number) {
        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(slide);
        actions.moveToElement(slider).dragAndDropBy(slider, number, 0).build();
        actions.perform();
    }

    public String slideRange() {
        return driver.findElement(range).getText();
    }
}
