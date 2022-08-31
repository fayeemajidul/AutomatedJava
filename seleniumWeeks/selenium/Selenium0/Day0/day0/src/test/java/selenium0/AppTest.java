package selenium0;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App.
 */
class AppTest implements WebDriver {
    public static void main(String[] args) {
        // System.out.println("Hello, Fayeem. Please cheer up !");

        //Selenium: Chrome -- ChromeDriver: Different classes
        //Firefox = firefoxDriver --> Methods:
        //Selenium is just a framework that combines all methods of webdrivers into one coherent framework that can be implemented in all web browsers like chrome / firefox.
        //  ---- Methods Include ----
        //   * How to extract Data, how to get elements, etc.
        // You can also implement your own classes + Instanitate your own objects

        //If On Macbook do Option to reveal path name.

        /* Selenium will look for a key value, to understand how to access Chrome */

        //Key Value is: webdrive.chrome.driver
        System.setProperty("webdriver.chrome.driver", "/Users/fayeemmooktadeer/Downloads/chromedriving");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit(); 


        //Fire Fox Browser:
        //geckodriver invokes firefox
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driverz = new FirefoxDriver();
        driverz.close();

        /** Close Closes the current tab, quit closes all tabs opened by selenium */
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
