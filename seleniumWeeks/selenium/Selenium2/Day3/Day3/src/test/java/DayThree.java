import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DayThree implements WebDriver {
    public static void main(String[] args) throws InterruptedException {

    }

    @Test
    public static void ajaxPractice(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //Actions: MOUSEOVER nav-link-accountList
        WebElement actionLocator = driver.findElement(By.id("nav-link-accountList"));
        Actions mouseOver = new Actions(driver);
        mouseOver.moveToElement(actionLocator).build().perform();
        //Need to put build and perform.
        mouseOver.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().build().perform();

        mouseOver.moveToElement(actionLocator).contextClick().build().perform();
    }



    @Test
    public static void implicitWaits() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2400));
        System.out.println(driver.manage().timeouts().getImplicitWaitTimeout());
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        //Created Variables:
        String [] itemsToSearch = {"Cucumber" , "Potato", "Carrot", "Tomato", "Mushroom"};
        List <String> searchToArrayList = Arrays.asList(itemsToSearch);
        int count = 0;

        //Created list of Elements:
        List <WebElement> items = driver.findElements(By.xpath("//h4[@class = 'product-name']"));

        for(int i = 0; i < items.size(); i++){
            String[] nameOfProductGrabbed = items.get(i).getText().split("-");
            String formattedProductGrabbed = nameOfProductGrabbed[0].trim();
            if(searchToArrayList.contains(formattedProductGrabbed)){
                driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                count++;
                if (count == items.size()) {
                    break;
                }
            }
        }
        driver.findElement(By.xpath("//img[@alt = 'Cart']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.className("promoCode")).click();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();

        //Declare Explicit Wait:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo"))); //Waits until this is visible.

    }

    @Test
    public static void assignmentLogin() throws InterruptedException{
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        //Login {User, password}
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("learning");

        //Select whether DropDown :
        WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(0);

        //Select Radio button:
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
        //Explicit Wait Time:

    }

    /*Abstract Methods of WebDriver Below.*/
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
