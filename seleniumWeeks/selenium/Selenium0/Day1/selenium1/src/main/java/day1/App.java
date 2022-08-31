package day1;

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
    private App() {
    }
    public static void main(String[] args) {
        //Setting up the System first.
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver" );
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        System.out.println(driver.hashCode());
        driver.navigate();


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
