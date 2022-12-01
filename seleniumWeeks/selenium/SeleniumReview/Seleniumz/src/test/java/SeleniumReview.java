import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class SeleniumReview implements WebDriver {
    @Test
    @Parameters({"Items"})
    public static void createRobustFramework(String Items){
        //Window Properties:
        // To tweak for better performance: Import IofileReader and set to global properties.
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        //Landing Page: Make sure to separate then parse with POM structure, and Abstract Modules:
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("products")));
        List <WebElement> listOfProducts = driver.findElements(By.xpath("//h4[@class ='product-name']"));
        System.out.println("Size is: " + listOfProducts.size());
//
        for(WebElement item : listOfProducts){
            String itemText =  item.getText().split(" ")[0].trim();
            System.out.println(itemText);
            if(Items.equalsIgnoreCase(itemText)){
                driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
                break;
            }
        }
        driver.findElement(By.xpath("//a[@class = 'cart-icon']")).click();
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'action-block']/button")));
        driver.findElement(By.xpath("//div[@class = 'action-block']/button")).click();

        driver.findElement(By.className("promoCode")).click();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();

        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
        Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
        driver.findElement(By.xpath("//button[normalize-space() = ('Place Order')]")).click();


        //Selenium Last Page:
        explicitWait.until(ExpectedConditions.titleIs("GreenKart - veg and fruits kart"));
        Select select = new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//div//select")));
        select.selectByVisibleText("United States");
        driver.findElement(By.className("chkAgree")).click();
        driver.findElement(By.xpath("//button[normalize-space() = 'Proceed']")).click();
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