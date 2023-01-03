package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumEnvironment extends BaseTest {
    @Test
    public void AppiumBasics() throws MalformedURLException, InterruptedException {
        Thread.sleep(5000);
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
        String assertionText = driver.findElement(By.id("android:id/alertTitle")).getText();
        Assert.assertEquals(assertionText,  "WiFi settings");
        driver.findElement(By.id("android:id/edit")).click();
        driver.findElement(By.id("android:id/edit")).sendKeys("rahulshetty");
        driver.findElement(By.id("android:id/edit")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("android:id/button1")).click();

    }
}


















//    //Creating an Android Driver:
//    //Appium Server Code :
//
//    UiAutomator2Options androidOptions = new UiAutomator2Options();
//        androidOptions.setDeviceName("Fayeem");
//                androidOptions.setApp("/Users/fayeemmooktadeer/Desktop/LearningJava/appiumWeeks/appiumCamp/Week0/day1/AppiumEnvironmentConfig/src/main/resources/ApiDemos-debug.apk");
//
//
//                AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), androidOptions);