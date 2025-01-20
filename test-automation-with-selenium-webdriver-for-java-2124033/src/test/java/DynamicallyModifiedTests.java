import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import page_objects.DynamicallyModifiedPage;

import static org.junit.jupiter.api.Assertions.*;

public class DynamicallyModifiedTests extends BaseTests {

    private DynamicallyModifiedPage dynamicallyModifiedPage;

    @BeforeEach
    public void launchPage(){
        driver.get("https://www.selenium.dev/selenium/web/dynamicallyModifiedPage.html");
        dynamicallyModifiedPage = new DynamicallyModifiedPage(driver);
    }

    @Test
    public void elementExists(){
        assertTrue(dynamicallyModifiedPage.isElementPresent());
    }

    @Test
    public void removeElement(){
        dynamicallyModifiedPage.clickDeleteButton();
        assertFalse(dynamicallyModifiedPage.isElementPresent());
    }
}