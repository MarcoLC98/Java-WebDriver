package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testContextMenu() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerAlertBox();
        contextMenuPage.alert_getText();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu", "Alert text incorrect");
        contextMenuPage.alert_clickToAccept();
    }
}
