package WebImplement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class DriveInit {
    public PageEntry pageEntry;
    WebDriver driver;
    @Parameters({"URL", "KEY", "VALUE"})
    public WebDriver driveConfig(String URL, String KEY, String VALUE){

        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
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