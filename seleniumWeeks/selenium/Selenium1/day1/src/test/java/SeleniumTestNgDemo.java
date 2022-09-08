import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTestNgDemo {
    @Test
    public void sampleTestMethod(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.automationtesting.in");
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
}
