import DesignPatternTest.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Design_Pattern implements WebDriver, ITestListener {
    public static void main(String[] args){}

    @Test
    @Parameters({"URL", "KEY", "VALUE"})
    public static void domFrame(String URL, String KEY, String VALUE) throws InterruptedException {
        //Window Properties
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        //Sign in Page Of Shopping
        LandingPage landingPage = new LandingPage(driver);
        landingPage.actionMethod("fayeemajidul@gmail.com", "Password123");

        //Install Waits:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
        }catch(Exception e){
            System.out.println("Loaded Page");
        }

        String productWeWant = "ZARA";
        String nastyString = "//div[@class='col-lg-4 col-md-6 col-sm-10 offset-md-0 offset-sm-1 mb-3 ng-star-inserted']//div[1]//div[1]//button[2]";

        //Shopping Page:

        for(WebElement item : items){
            //Get the Product: [Get Text] + Add to cart.
            String productName = (item.findElement(By.cssSelector("b")).getText().split(" ")[0].trim());
            if(productName.equalsIgnoreCase(productWeWant)){
                item.findElement(By.xpath(nastyString)).click();
            }
        }
        //Install another wait, wait for the loading.
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("#toast-container"))));
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//li)[4]")).click();
        Thread.sleep(3000);
        //Verify if our cart has the Item we searched for originally.
        List<WebElement> itemInCart = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));

        for(WebElement verifyItem : itemInCart){
            //Get the Product: [Get Text] + Add to cart.
            System.out.println("In here");
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(productWeWant);
            Assert.assertTrue(productName);
            driver.findElement(By.cssSelector(".totalRow button")).click();
        }
        //Checkout Page:
        driver.findElement(By.cssSelector("[placeholder = 'Select Country']")).click();
        driver.findElement(By.cssSelector("[placeholder = 'Select Country']")).sendKeys("india");

        //WebDriver Wait:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

        //Click on Element
        driver.findElement(By.xpath("//span[normalize-space()='India']")).click();

        driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();

        //Order Confirm Place: Retrieve Text:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hero-primary")));
        String confirmMessage = driver.findElement(By.className("hero-primary")).getText().trim().toUpperCase();
        Assert.assertEquals(confirmMessage, "THANKYOU FOR THE ORDER.");

    }

    /*Abstract Methods:*/
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

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
