import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DayTwo implements WebDriver {
    public static void main(String[] args){
        System.out.println("Testing the environment");
    }
    /*
    * Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
    * Iterator<String>it = windows.iterator();
    * String parentId = it.next();
    * String childId = it.next();
    * driver.switchTo().window(childId);
    * System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
    * driver.findElement(By.cssSelector(".im-para.red")).getText();
    * */
    @Test
    public static void endToEndTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        WebDriverWait explicit = new WebDriverWait(driver, Duration.ofSeconds(4));
        explicit.until(ExpectedConditions.visibilityOfElementLocated(By.className("blinkingText")));
        driver.findElement(By.cssSelector(".blinkingText")).sendKeys(Keys.chord(LEFT_CONTROL)).click();
        Thread.sleep(3000);
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        //Traversing through windows:
        driver.switchTo().window(childId);
        try{
            explicit.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("im-para.red")));
        }catch(Exception e){
            System.out.println("Can not locate element");
        }
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

    }
    @Test
    public static void endToEndTesting(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //Scrolling, in JavaScript:
        JavascriptExecutor javascriptDrive = (JavascriptExecutor) driver;
        javascriptDrive.executeScript("window.scroll(0,500)");
        //Scrolling Down the Bar?
        javascriptDrive.executeScript("document.querySelector('.tableFixHead')");

    }

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