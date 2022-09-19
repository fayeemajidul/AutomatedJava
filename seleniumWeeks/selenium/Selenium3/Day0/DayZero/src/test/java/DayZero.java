import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Iterator;
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
    public static void practicingWindowHandles(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".blinkingText")).click();

        //Stores the Windows in the set.
        Set<String> windows = driver.getWindowHandles();
        

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
        driver.findElement(By.id("ap_password")).sendKeys("Phone123!");
        driver.findElement(By.id("ap_password_check")).sendKeys("Phone123!");
        driver.findElement(By.id("continue")).click();
    }
    @Test
    public static void testingWindows(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".blinkingText")).click();
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofMillis(10000));
        Set<String> windows = driver.getWindowHandles(); // grabs the present window handles: [Parent window is the one used by get, child is the one you are trying to invoke/ click]
        Iterator <String> iterateWindow = windows.iterator();
        //Grabs the parent window from the iterator method: --> iterator.next gets the 0 element. [0,1]
        String parentWindow = iterateWindow.next();
        String childWindow = iterateWindow.next();
        driver.switchTo().window(childWindow);

        //https://rahulshettyacademy.com/documents-request
        //driver.quit();

        //
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
