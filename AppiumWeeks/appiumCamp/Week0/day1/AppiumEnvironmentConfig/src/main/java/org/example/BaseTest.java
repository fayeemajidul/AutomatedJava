package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void startSession() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start(); //Starts Service, programmatically.

        UiAutomator2Options androidOptions = new UiAutomator2Options();
        androidOptions.setDeviceName("FayeemPhone");
        androidOptions.setApp("/Users/fayeemmooktadeer/Desktop/AutomatedJava/AppiumWeeks/appiumCamp/Week0/day1/AppiumEnvironmentConfig/src/main/resources/General-Store.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),androidOptions);
    }
    public void longPress(WebElement element){
        ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(),"duration", 2000));
    }

    public void scrollToText(String textToView) throws InterruptedException {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + textToView + "\"));"));
        Thread.sleep(500);
    }

    public void scrollToPosition(String direction,int forceOfGesture, int stopAtPosition){
        boolean canScrollMore;
        int i = 0;
        do{
            //Scroll using dimensions:
            canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
                    "left", 100, "top", 100, "width", 200, "height", 200,
                    "direction", direction,
                    "percent", 3.0
            ));
            i++;
        }while (i < 5);
    }

    public void swipeGesture(WebElement element, String direction, int swipeForce){
        ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
                "elementId",((RemoteWebElement)element).getId(),
                "direction", direction.toLowerCase(),
                "percent", swipeForce
        ));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
        service.stop();
    }
}

/*
 * Need to Set Up connection to phone, and Appium server.
 * Capabilities, device settings, etc.
 * */