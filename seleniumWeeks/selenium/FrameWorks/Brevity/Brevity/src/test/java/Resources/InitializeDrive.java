package Resources;

import WebImplementation.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class InitializeDrive {
    WebDriver driver;
    public LandingPage landingPage;


    @Parameters({"URL", "KEY", "VALUE", "USER"})
    public WebDriver InitDrive(String URL, String KEY, String VALUE) throws IOException {
        //Global Properties Class
        Properties property = new Properties();
        FileInputStream file = new FileInputStream("/Users/fayeemmooktadeer/Desktop/AutomatedJava/seleniumWeeks/selenium/FrameWorks/Brevity/Brevity/src/test/java/Resources/global.properties");
        property.load(file);
        String browserName = property.getProperty("browser");
        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty(KEY, VALUE);
            driver = new FirefoxDriver();
            driver.get(URL);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        return driver;
    }
    @BeforeMethod
    @Parameters({"URL", "KEY", "VALUE"})
    public LandingPage launchApp(String URL, String KEY, String VALUE) throws IOException {
        driver = InitDrive(URL,KEY,VALUE);
        return new LandingPage(driver);
    }
}
