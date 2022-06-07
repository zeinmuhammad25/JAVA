package mobileAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LatihanMobile2 {
    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities capabilities;

    public static void main(String[] args) throws MalformedURLException,
            InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "zxmfobv469kbgqw8");
        capabilities.setCapability("udid", "zxmfobv469kbgqw8");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("app", "C:\\Users\\TELKOM\\Downloads\\ToDo.apk");
            //capabilities.setCapability("appPackage", "staging.cicle");
        //capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, capabilities);

        Thread.sleep(2000);
        driver.findElement(By.id("fab")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("editTextTitre")).sendKeys("Pertemuan Automation Andoroid");
        MobileElement element = (MobileElement) driver.findElementById("editTextTitre");
        String elText = element.getText();
        System.out.println(elText);

        driver.findElement(By.id("action_save")).click();

        Thread.sleep(1000);
        MobileElement element2 = (MobileElement) driver.findElementById("textViewListView");
        String elText2 = element2.getText();
        System.out.println(elText2);

        if(elText.equals(elText2))
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("Failure");
        }
        driver.quit();
    }
}