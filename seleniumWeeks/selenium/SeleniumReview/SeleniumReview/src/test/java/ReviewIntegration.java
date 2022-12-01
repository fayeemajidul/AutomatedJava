import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ReviewIntegration {
    @Test
    public static void pageStructure(){

        //Overall Global stuff:
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Juicy Login Details: [DDT testing].
        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("fayeemajidul@gmail.com");
        driver.findElement(By.id("userPassword")).click();
        driver.findElement(By.id("userPassword")).sendKeys("Password123");
        driver.findElement(By.id("login")).click();
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.titleIs("Let's Shop"));

        //Now that we are on shopping page, we want to grab one item and add it to the cart.
        List <WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
        for(WebElement item : items){
            String formattedText = item.getText().split(" ")[0].trim();
            if(formattedText.equalsIgnoreCase("ZARA")){
                item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
            }
        }
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//ngx-spinner[@class='ng-tns-c31-1 ng-star-inserted']")));
        driver.findElement(By.cssSelector("[routerlink *= 'cart']")).click();
        driver.findElement(By.cssSelector(".totalRow button")).click();
        Select select = new Select(driver.findElement(By.xpath("(//select[@class='input ddl'])[1]")));
        select.selectByValue("03");


    }
}