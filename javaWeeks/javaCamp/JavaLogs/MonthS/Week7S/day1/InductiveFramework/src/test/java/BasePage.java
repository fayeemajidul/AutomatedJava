import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class BasePage implements WebDriver{
    WebDriver driver;

    @BeforeTest
    public void setupDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable notifications");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);
        driver = new ChromeDriver(options);
    }
    @Test
    public void basePage() throws InterruptedException {
        driver.get("https://solutions-test.inductivehealth.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Creating logic for landing page for sign-in pipeline:
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("inductiveEpitraxAdmin");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("Pass!234");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();
        Thread.sleep(3000);

        //Test Case Execution Navigate that this is the users Profile:
        String ProfileID = driver.findElement(By.cssSelector(".text-base.font-semibold.text-ih-navy-700")).getText();
        Assert.assertEquals(ProfileID, "Epitrax Inductive");
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }


    //Implemented Methods:
    @Override
    public void get(String url) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
