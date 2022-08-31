package day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Types of Locators:
 *ID, XPATH, CSS Selector, Name, Tag Name, Link Text, Partial Link Text
 */

 //Syntax for Css Selector:
 /* By (Class Name) -> tagname.classname 
  * By (ID) -> tagname#id -> input#inputUsername

  General Syntax:
  *** 3: Tagname[attribute = 'value']
  input[placeholder = 'Username']

  //Implicit Waits: Tells you the amount of seconds to wait.
    ** driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());

    To Check for Unique Elements on a webpage, you can do $('CssSelector') --> to check if the element is unique.

 */

public final class App implements WebDriver {
    private App() {
    }
    public static void main(String[] args) {
        //Setting up the System first.
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver" );
        WebDriver driver = new FirefoxDriver();
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.id("email")).sendKeys("fayeemf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("King1234!");
        driver.findElement(By.className("btn-primary")).click();
        System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());

        //driver.quit();


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
