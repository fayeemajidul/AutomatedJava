import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ConfigureDriver {
    AppiumDriverLocalService service;
    AppiumDriver driver;
    WebDriverWait explicitWait;

    @BeforeTest
    public AppiumDriver startDriver() throws MalformedURLException {
        service = new AppiumServiceBuilder().withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity("");
        options.setAppPackage("");
        options.setDeviceName("");
        options.setPlatformName("");
        options.setAutomationName("");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        return driver;
    }
}
