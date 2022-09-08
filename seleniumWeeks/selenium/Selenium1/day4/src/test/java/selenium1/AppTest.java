package selenium1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

public class AppTest implements WebDriver {
    @Test
    public void sampleTestMethod(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("hello@gmail.com");
        driver.findElement(By.id("enterimg")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
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

// public void setUp() {
//     // code that will be invoked when this test is instantiated
//   }
  
//   @Test(groups = { "fast" })
//   public void aFastTest() {
//     System.out.println("Fast test");
//   }
  
//   @Test(groups = { "slow" })
//   public void aSlowTest() {
//      System.out.println("Slow test");
//   }