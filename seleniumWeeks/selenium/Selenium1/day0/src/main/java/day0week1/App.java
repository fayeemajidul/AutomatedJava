package day0week1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * UAI components:
 * Handling Static Dropdowns
 * Handling Dynamic Dropdowns
 * Handling Checkboxes
 * Handling Radio Buttons
 * Handling Text Buttons
 * Handling Alert-Java popups
 * Selenium WebDriver Form Methods
 */

public final class App implements WebDriver{
    private App() {}

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://github.com/fayeemajidul");
        driver.manage().window().maximize();
    }

    public void staticDropdown(WebDriver driver){
        WebElement selectDropDown = driver.findElement(By.xpath("//header[@body = 'value']"));
        Select dropdown = new Select(selectDropDown);
    }

    //WebDriver Abstract Methods:
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
