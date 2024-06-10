package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SliderTests extends BaseTests {
    /**
    ** add assertion
     **/
    @Test
    public void testRange() {
        var range = homePage.clickHorizontalSlider();
        range.slideRange();
    }

    /**
     * fix locator
     **/
    @Test
    public void testSlide() {
        var slider = homePage.clickHorizontalSlider();
        slider.slide(3);
        slider.slideRange();
    }
}
