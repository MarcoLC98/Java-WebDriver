package nestedframes;

import base.BaseTests;
import org.testng.annotations.Test;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testNestedFrame() {
        var framesPage = homePage.clickFramesPage();
        framesPage.getLeftFrame();
    }
}
