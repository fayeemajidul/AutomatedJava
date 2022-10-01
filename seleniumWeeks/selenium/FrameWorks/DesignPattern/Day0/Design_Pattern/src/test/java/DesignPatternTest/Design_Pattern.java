package DesignPatternTest;

import GlobalComponents.GlobalComponents;
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

public class Design_Pattern extends GlobalComponents implements WebDriver, ITestListener {
    public static void main(String[] args){}

    @Test
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD", "productWeWant", "COUNTRY"})
    public void submitOrder(String URL, String KEY, String VALUE, String USER, String PASSWORD, String productWeWant, String COUNTRY) throws InterruptedException, IOException {
        //Window Properties
        GlobalComponents globalComponents = new GlobalComponents();
        LandingPage landingPage = globalComponents.launchApp(URL,  KEY, VALUE);

        //Sign in Page Of Shopping
        ProductPage productPage = landingPage.actionMethod(USER, PASSWORD);
        List<WebElement> items = productPage.getShoppingItems();
        CartPage cartPage = productPage.addProductToCart(productWeWant);
        Thread.sleep(1000); //Maybe create a longer wait:
        cartPage.clickCartButton();
        Thread.sleep(1000);
        cartPage.getProductName(productWeWant);
        //Checkout Page:
        CheckOutPage checkOut = cartPage.getProductName("productWeWant");
        OrderConfirmPage confirmPage = checkOut.chooseCountry(COUNTRY); //instantiate a new object.
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
