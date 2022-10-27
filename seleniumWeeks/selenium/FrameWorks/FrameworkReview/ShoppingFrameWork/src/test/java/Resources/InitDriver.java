package Resources;
import WebPages.LoginPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;

import java.io.File;
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

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException
    {
        TakesScreenshot screenShot = (TakesScreenshot)driver;
        File source = screenShot.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/FrameworkReview/ShoppingFrameWork/src/test/java/Sources/" + testCaseName + ".png"));
        FileUtils.copyFile(source, file);
        return System.getProperty(System.getProperty("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/FrameworkReview/ShoppingFrameWork/src/test/java/Sources/" + testCaseName + ".png"));
    }

    public LoginPage launchApp(String URL, String KEY, String VALUE) throws IOException {
        driver = InitializeDriver(URL, KEY, VALUE);
        return new LoginPage(driver);
    }
}