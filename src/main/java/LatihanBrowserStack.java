import java.net.URL;
import java.util.List;
import java.util.function.Function;
import java.net.MalformedURLException;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LatihanBrowserStack {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "zeinazhari_BMDhF5");
        caps.setCapability("browserstack.key", "jpQpneXvp5pdVskr8M3c");

        // Set URL of the application under test
        caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");

        // Specify device and os_version for testing
        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");

        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.AccessibilityId("Search Wikipedia")));
        searchElement.click();
        AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
                ExpectedConditions.elementToBeClickable(
                        MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
        insertTextElement.sendKeys("BrowserStack");
        Thread.sleep(5000);
        List<AndroidElement> allProductsName = driver.findElementsByClassName(
                "android.widget.TextView");
        assert(allProductsName.size() > 0);


        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();

    }
}
