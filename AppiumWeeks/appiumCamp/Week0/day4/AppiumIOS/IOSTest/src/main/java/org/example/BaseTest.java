package org.example;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTest {
    public AppiumDriverLocalService service;
    public IOSDriver driver;
    public WebDriverWait explicitWait;

    @BeforeTest
    public void configureDriver() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start(); //Starts Service Programmatically.

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 14 Pro");
        options.setApp("/Users/fayeemmooktadeer/Library/Developer/Xcode/DerivedData/UIKitCatalog-ddyutxeztokwzkebynrekjpdxdga/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
        options.setPlatformVersion("16.2");
        options.setAutomationName("XCUITest");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"),options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @AfterTest
    public void StopSession(){
        service.stop();
        driver.quit();
    }
}
