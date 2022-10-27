package WebPages;

import Resources.ExtentReportListener;
import Resources.InitDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Set;


public class ShoppingDriver extends InitDriver implements WebDriver, ITestListener {

    //Configuring Extent Tests:
    ExtentReports extent = new ExtentReportListener().configElements();
    ExtentTest test;

    @Test
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD", "DesiredProduct", "COUNTRY"})
    public static void ShoppingFrameWorkImplementation(String URL, String KEY, String VALUE, String USER, String PASSWORD, String DesiredProduct, String COUNTRY) throws IOException {
        //Global Property:
        InitDriver globalDriver = new InitDriver();
        //Login Page
        LoginPage loginPage = globalDriver.launchApp(URL,KEY,VALUE);
        //Product Page
        ProductPage productPage = loginPage.loginInfo(USER, PASSWORD);
        //Cart Page
        CartPage cartPage = productPage.addProductToCart(DesiredProduct);
        //Check Out Page
        CheckOutPage checkOut = cartPage.verifyItemInCart(DesiredProduct);
        //Order Confirmation Page
        OrderConfirmPage confirmedOrder = checkOut.chooseCountry(COUNTRY);
        confirmedOrder.grabConfirmMessage();
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
        test = extent.createTest(result.getMethod().getMethodName());
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, result.getMethod().getMethodName() + ": working");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL, "FAILED TEST AT" + result.getName());
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
        extent.flush();
    }
}
