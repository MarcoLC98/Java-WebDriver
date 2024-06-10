package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpLoadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUpLoadPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickUpLoadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutPathOfFile) {
        driver.findElement(inputField).sendKeys(absolutPathOfFile);
        clickUpLoadButton();
    }

    public String getUploadedFile() {
        return driver.findElement(uploadedFiles).getText();
    }

}
