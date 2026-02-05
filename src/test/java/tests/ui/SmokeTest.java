package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void verifyPageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.length() > 0, "Title should not be empty");
    }
}
