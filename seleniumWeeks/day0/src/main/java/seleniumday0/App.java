package seleniumday0;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App implements WebDriver{
    public static void main( String[] args )
    {
        
        //Step One is Invoking the Browser:
        //Selenium: Chrome -- ChromeDriver: Different classes
        //Firefox = firefoxDriver --> Methods:
        //Selenium is just a framework that combines all methods of webdrivers into one coherent framework that can be implemented in all web browsers like chrome / firefox.
        //  ---- Methods Include ----
        //   * How to extract Data, how to get elements, etc.
        // You can also implement your own classes + Instanitate your own objects

        //If On Macbook do Option to reveal path name.
        
        ChromeDriver driver = new ChromeDriver();
        WebDriver driving = new ChromeDriver();
        System.setProperty(key, /Users/fayeemmooktadeer/Downloads/chromedriver)

        System.out.println( "Hello World!" );
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public WebElement findElement(By by) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void get(String url) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getCurrentUrl() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPageSource() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getTitle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getWindowHandle() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> getWindowHandles() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Options manage() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Navigation navigate() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void quit() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public TargetLocator switchTo() {
        // TODO Auto-generated method stub
        return null;
    }
}
