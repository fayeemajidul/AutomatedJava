import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class GridTest implements WebDriver {
    @Test
    public static void gridTesting() throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setBrowserName("firefox");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.109:4444"), capability);
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("Hello World, Testing Selenium Grid");
        System.out.println(driver.getTitle());
        driver.close();
    }

    public static void main(String[] args){
        System.out.println("Formal Apology");
    }

    /*Implemented Abstract Methods */
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
