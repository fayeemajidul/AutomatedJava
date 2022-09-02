package selenium3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Hello world!
 */
public final class App implements WebDriver {
    private App() {}
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        practiceXPathChild(driver);
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
