package GlobalProperties;

import POMstructure.InitialLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class InitDrive {
    WebDriver driver = null;
    public InitialLoginPage initialLoginPage;
    @Parameters({"URL", "KEY", "VALUE"})

    public WebDriver DriverInit(String URL, String KEY, String VALUE) throws IOException {

        Properties property = new Properties();
        FileInputStream getPropertyPath = new FileInputStream("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Cucumber/FlightUtility/src/test/java/GlobalProperties/GlobalData.properties"); // We're getting the file path of properties, FileInputStream reads the data.
        property.load(getPropertyPath);
        String browser = property.getProperty("browser");

        if(browser.equalsIgnoreCase("firefox")){
            System.setProperty(KEY, VALUE);
            driver = new FirefoxDriver();
            driver.get(URL);
        }else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/fayeemmooktadeer/Downloads/chromedriver");
            driver = new ChromeDriver();
            driver.get(URL);
        }
        assert driver != null;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        return driver;
    }

    @BeforeMethod
    @Parameters({"URL", "KEY", "VALUE"})
    public InitialLoginPage initAndLaunchApp(String URL, String KEY, String VALUE) throws IOException {
        driver = DriverInit(URL,KEY,VALUE);
        initialLoginPage = new InitialLoginPage(driver);
        return initialLoginPage;
    }
}
