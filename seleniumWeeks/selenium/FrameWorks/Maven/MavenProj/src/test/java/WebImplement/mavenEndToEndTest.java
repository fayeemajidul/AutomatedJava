package WebImplement;

import Resources.ExtentReporterFile;
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

import java.util.List;
import java.util.Set;

public class mavenEndToEndTest implements WebDriver, ITestListener {
    ExtentReports extent = ExtentReporterFile.configElements();
    ExtentTest test;
    public static void main(String[] args){
        System.out.println("Code path");
    }

    @Test
    @Parameters({"URL", "KEY", "VALUE", "USER", "PASSWORD"})
    public static void mavenEndEnd(String URL, String KEY, String VALUE, String USER, String PASSWORD) throws InterruptedException {
        DriveInit driveInit = new DriveInit();
        PageEntry pageEntry = driveInit.setUpPageEntry(URL, KEY, VALUE);
        pageEntry.loginInfo(USER, PASSWORD);

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
        ITestListener.super.onFinish(context);
    }
}
