package selenium3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Hello world!
 */
public final class App implements WebDriver {
    private App() {}
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        // practiceXPathChild(driver);
        demoApplication(driver);
        disableCaptcha(driver);
    }

    public static void practiceXPathChild(WebDriver driver){
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        driver.findElement(By.xpath("//a[@class = 'login']")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[@id = 'email_create']")).click();
        driver.findElement(By.xpath("//input[@id = 'email_create']")).sendKeys("dummyemailqeqw1@gmail.com");
        driver.findElement(By.xpath("//button[@id = 'SubmitCreate']")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //input[@id='id_gender1'])[1
        //Second Sign in page:
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.xpath("//input[@id = 'customer_firstname']")).click();
        driver.findElement(By.xpath("//input[@id = ''customer_firstname]")).sendKeys("Zahmed");
        driver.findElement(By.xpath("//input[@id = 'customer_lastname'")).click();
        driver.findElement(By.xpath("//input[@id = 'customer_lastname'")).sendKeys("Zairah");
    }
    public static void demoApplication(WebDriver driver){
        driver.get("https://phptravels.com/demo/");
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("fayetvl");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Z.");
        driver.findElement(By.xpath("//input[@placeholder='Business Name']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Business Name']")).sendKeys("Fayeevorite Corporation");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("fayeevorite@gmail.com");

        
    }
    public static void disableCaptcha(WebDriver driver){
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("start-maximized");
    
        options.addArguments("disable-infobars");
    
        options.addArguments("--disable-extensions"); 
    
        driver = new FirefoxDriver(options);
    
        driver.get("https://phptravels.com/demo/"); 
    
        new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class = 'recaptcha-checkbox-border']")));
    
        new WebDriverWait(driver, Duration.ofMillis(3000)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.recaptcha-checkbox-border"))).click(); 
    }

    /** Abstract Methods: */
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
