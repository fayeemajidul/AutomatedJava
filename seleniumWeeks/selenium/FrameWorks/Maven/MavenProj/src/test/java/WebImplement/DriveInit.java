package WebImplement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class DriveInit {
    public PageEntry pageEntry;
    WebDriver driver;
    @Parameters({"URL", "KEY", "VALUE"})
    public WebDriver driveConfig(String URL, String KEY, String VALUE){
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        System.setProperty(KEY, VALUE);
        firefoxOptions.addArguments("headless");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
    @Test
    @Parameters({"URL", "KEY", "VALUE"})
    public PageEntry setUpPageEntry(String URL, String KEY, String VALUE){
        driver = driveConfig(URL,KEY,VALUE);
        return new PageEntry(driver);
    }
}