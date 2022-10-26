package Resources;
import WebPages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class InitDriver {
    WebDriver driver;
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD"})
    public WebDriver InitializeDriver(String URL, String KEY, String VALUE) throws IOException {
        //Global Properties Class: Reading the File.
        Properties property = new Properties();
        FileInputStream file = new FileInputStream("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/FrameworkReview/ShoppingFrameWork/src/test/java/Resources/property.properties");
        property.load(file);
        String browserName = property.getProperty("browser"); //Getting the Variable from property class.

        if(browserName.equalsIgnoreCase("firefox")){
            System.setProperty(KEY, VALUE);
            driver = new FirefoxDriver();
        }
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return driver;
    }

    @BeforeMethod
    public LoginPage launchApp(String URL, String KEY, String VALUE) throws IOException {
        driver = InitializeDriver(URL, KEY, VALUE);
        return new LoginPage(driver);
    }
}