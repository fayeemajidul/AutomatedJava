package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AutomatePlatform implements WebDriver {
    @Test
    public static void createHealthCareFramework() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qavalidation.com/demo-form/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.findElement(By.linkText("About Us")).click();
        //Clicked on About Me Page:
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("col-8"))));
        WebElement elementRetrieve = driver.findElement(By.xpath("//div[@class = 'col-8']"));
        System.out.println(elementRetrieve.getText());
        Assert.assertEquals(elementRetrieve.getText(), "No One Knows New Yorkers Better Than We Do");

        driver.close();
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