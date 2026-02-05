package tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegressionTest extends BaseTest {

    @Test
    public void verifyCurrentUrl() {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains("example"), "URL validation failed");
    }
}
