import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class DayOneTest implements WebDriver {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        dayOneTEST();
    }
    @Test
    public static void dayOneTEST(){
        //Learned that you can't add parameters with TestNG :o
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.sephora.com/");
        try{
            //Wait for two seconds
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Ran into an error");
        }

        driver.quit();
        System.out.println("Successfully have ran Test One. TestNG synchronized. ");
    }

    /*Abstract Java methods: */
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
