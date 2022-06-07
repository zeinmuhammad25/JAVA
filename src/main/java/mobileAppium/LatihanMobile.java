package mobileAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LatihanMobile {
    private static AppiumDriver<MobileElement> driver;
    private static DesiredCapabilities capabilities;
    public static void main(String[] args) throws MalformedURLException,
            InterruptedException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "zxmfobv469kbgqw8");
        capabilities.setCapability("udid", "zxmfobv469kbgqw8");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        //ditanya ke devloper
        capabilities.setCapability("appPackage", "staging.cicle");
        capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url, capabilities);
        Thread.sleep(2000);
        MobileElement klikButtonSignIn=
                driver.findElement(By.xpath("//android.widget.TextView[@text='Sign in with Google']"));
        klikButtonSignIn.click();
        Thread.sleep(3000);
        MobileElement emailButton =
                driver.findElement(By.id("com.google.android.gms:id/account_display_name"));
        emailButton.click();
        Thread.sleep(7000);
        MobileElement continueButton =
                driver.findElement(By.xpath("//android.widget.Button[@text='Lanjutkan']"
                ));
        continueButton.click();
        Thread.sleep(6000);
        driver.quit();
    }
}
