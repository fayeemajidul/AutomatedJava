package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Set;

public class ScreenShot implements WebDriver, ITestListener {
    ExtentReports extent;

    public void config(){
        //ExtentReports, ExtentSparkReporter
        System.out.println("In here");
        File path = new File("/Users/fayeemmooktadeer/Desktop/LearningJava/seleniumWeeks/selenium/FrameWorks/Brevity/Brevity/src/test/java/Sources");
        //Created a path where extent reports will be generated.
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Automation Results");

        extent = new ExtentReports();
        //Extent is dependent on ExtentSpark, think of Extent class as an executioner.
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Fayeem");
    }
    WebDriver driver;
    @Test
    public void initDrive(){
        ExtentTest uniqueObject = extent.createTest("Initial Demo");
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/client");
        driver.close();
        uniqueObject.fail("Result does not match");
        extent.flush();
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
