package WebPages;

import Resources.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class ShoppingDriver implements WebDriver, ITestListener {
    @Test
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD"})
    public static void ShoppingFrameWorkImplementation(String URL, String KEY, String VALUE, String USER, String PASSWORD) throws IOException {

        //Global Property:

        InitDriver globalDriver = new InitDriver();
        LoginPage loginPage = globalDriver.launchApp(URL,KEY,VALUE);
        ProductPage productPage = loginPage.loginInfo(USER, PASSWORD);


//        driver.findElement(By.xpath("//button[@routerlink = '/dashboard/cart']")).click();
//        //Assert if Product is in the Cart.
//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='cartSection']/h3")));
//        String verifyText = (driver.findElement(By.xpath("//div[@class='cartSection']/h3")).getText());
//        boolean productName = (verifyText.split(" ")[0].trim()).equalsIgnoreCase(desiredProduct);
//        Assert.assertTrue(productName);
//        driver.findElement(By.cssSelector(".totalRow button")).click();
//
//        driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("443");
//
//        driver.findElement(By.xpath("(//input[@type='text'])[3]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Rahul Miah");
//
//        driver.findElement(By.xpath("(//input[@type='text'])[4]")).click();
//        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("rahulshettyacademy");
//
//        driver.findElement(By.cssSelector("button[type = 'submit']")).click();
//        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//ngx-spinner[@class='ng-tns-c31-3 ng-star-inserted']")));
//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mt-1.ng-star-inserted")));
//
//        String couponApplied = driver.findElement(By.cssSelector(".mt-1.ng-star-inserted")).getText();
//        Assert.assertEquals(couponApplied, "* Coupon Applied");
//
//        driver.findElement(By.cssSelector("[placeholder = 'Select Country']")).click();
//        String formatCountry = chosenCountry.toLowerCase().substring(0,1).toUpperCase() + chosenCountry.substring(1).toLowerCase();
//        driver.findElement(By.cssSelector("[placeholder = 'Select Country']")).sendKeys(formatCountry);
//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//        driver.findElement(By.xpath(String.format("//span[normalize-space()='%s']", formatCountry))).click();
//        driver.findElement(By.xpath("(//a[normalize-space()='Place Order'])[1]")).click();
//
//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hero-primary")));
//        String confirm = driver.findElement(By.className("hero-primary")).getText().trim().toUpperCase();
//        Assert.assertEquals(confirm, "THANKYOU FOR THE ORDER.");
//        System.out.println(confirm);

    }

    /*Abstract Methods*/
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
