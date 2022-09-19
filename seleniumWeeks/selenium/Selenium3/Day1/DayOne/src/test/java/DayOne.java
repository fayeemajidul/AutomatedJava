import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DayOne implements WebDriver {
    public static void main(String[] args){
    }
    @Test
    public static void webHandlePage(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        WebDriverWait waitUntil = new WebDriverWait(driver, Duration.ofMillis(5000));
        try{
            waitUntil.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().dismiss();
        }catch(Exception e){
            System.out.println("Alert is not present");
        }
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set <String> windows = driver.getWindowHandles();
        Iterator <String> numOfWindows = windows.iterator();
        //Go to Parent Window:
        String parentWindow = numOfWindows.next();
        //Go to the next window in the iterator:
        String childWindow = numOfWindows.next();
        //You have to switch to the childWindow:
        driver.switchTo().window(childWindow);
        waitUntil.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String userId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

    }
    @Test
    public static void practiceWindowHandle(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> windowIterator = windows.iterator();
        String parentWindow = windowIterator.next();
        String childWindow = windowIterator.next();

        driver.switchTo().window(childWindow);
        System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='New Window']")).getText());
        driver.switchTo().window(parentWindow);
        System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='Opening a new window']")).getText());


    }
    @Test
    public static void introToFrames(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://jqueryui.com/droppable/");
        //Frames are independent containers that contain outside
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        Actions drag = new Actions(driver);
        drag.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
    }
    @Test
    public static void framesPractice(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
        driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());
    }
    @Test
    public static void calendarHandling() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        //Creating a List of Days:
        List <WebElement> days = driver.findElements(By.className("ui-state-default"));
        for(WebElement day:days){
            if(day.getText().equals("29")){
                day.click();
                break;
            }
        }
    }
    /* Abstract Interface*/
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
