package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUpLoadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        var uploadPage = homePage.clickFileUpLoad();
        uploadPage.uploadFile("C:\\Users\\marco\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded files incorrect");
    }

}
