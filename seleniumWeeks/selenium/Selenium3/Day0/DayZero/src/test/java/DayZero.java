import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class DayZero implements WebDriver {
    public static void main(String[] args){
        System.out.println("Testing the environment");
    }
    @Test
    public static void amazonTrialPage(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //Implicit Wait Time:
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        //Create an Explicit Wait Time:
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicit.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav-link-accountList")));
        //Set Up Mouse Actions:
        WebElement element = driver.findElement(By.id("nav-link-accountList"));
        Actions mouseAction = new Actions(driver);
        mouseAction.moveToElement(element).build().perform();
        mouseAction.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
        //How do I hit enter after that?
    }
    @Test
    public static void amazonSignUpPage(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        //Create an Explicit Wait Time:
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("createAccountSubmit")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("John Doe");
        driver.findElement(By.id("ap_email")).sendKeys("6463214391");
        driver.findElement(By.id("ap_password")).sendKeys("Phobe123!");
        driver.findElement(By.id("ap_password_check")).sendKeys("Phobe123!");
        driver.findElement(By.id("continue")).click();
    }

    /* Import Abstract Methods: */
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
