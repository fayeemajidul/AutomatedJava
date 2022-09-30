import DesignPatternTest.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

public class Design_Pattern implements WebDriver, ITestListener {
    public static void main(String[] args){}

    @Test
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD", "productWeWant", "COUNTRY"})
    public static void domFrame(String URL, String KEY, String VALUE, String USER, String PASSWORD, String productWeWant, String COUNTRY) throws InterruptedException {
        //Window Properties
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();

        //Sign in Page Of Shopping
        LandingPage landingPage = new LandingPage(driver);
        landingPage.actionMethod(USER, PASSWORD);

        //Shopping Page:
        ProductPage productPage = new ProductPage(driver);
        List<WebElement> items = productPage.getShoppingItems();
        productPage.addProductToCart(productWeWant);
        Thread.sleep(1000); //Maybe create a longer wait:

        //Shopping Cart:
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCartButton();
        Thread.sleep(1000);
        cartPage.getProductName(productWeWant);

        //Checkout Page:
        CheckOutPage checkOut = new CheckOutPage(driver);
        checkOut.chooseCountry(COUNTRY);

        //Order Confirm Place: Retrieve Text:
        OrderConfirmPage confirmPage = new OrderConfirmPage(driver);
        confirmPage.getConfirmMessage();
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
        System.out.println("Failed at " + result.getName());
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
        System.out.println("Test Ran Successfully");
    }
}
