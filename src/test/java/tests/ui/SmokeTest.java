package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest {

    @Test
    public void verifyPageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.length() > 0, "Title should not be empty");
    }
}
// Smoke UI tests
