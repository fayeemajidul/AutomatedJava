package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTestConfig {
    public AndroidDriver driver;
    public AppiumDriverLocalService service;
    public WebDriverWait explicitWait;
    @BeforeTest
    public AndroidDriver startSession() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start(); //Starts Service, programmatically.

        UiAutomator2Options androidOptions = new UiAutomator2Options();
        androidOptions.setPlatformName("android");
        androidOptions.setDeviceName("AndroEN");
        androidOptions.setAutomationName("UIAutomator2");
        androidOptions.setAppPackage("com.dice.app.jobs");
        androidOptions.setAppActivity("com.dice.app.jobs.activities.MainDiceActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),androidOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        return driver;
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        service.stop();
    }
}
