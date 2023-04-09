package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Main implements WebDriver {
    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
//        driver.get("https://solutions-test.inductivehealth.com");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//        driver.manage().window().maximize();
//

//        driver.findElement(By.id("username")).click();
//        driver.findElement(By.id("username")).sendKeys("fayeem.mooktadeer@inductivehealth.com");
//        driver.findElement(By.xpath("//input[@id = 'password']")).click();
//        driver.findElement(By.id("password")).sendKeys("King1234!");
//        driver.findElement(By.xpath("//input[@value='Sign in']")).click();




    }
    @Test
    public void runSolutonsFramework(){
        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        driver.get("https://solutions-test.inductivehealth.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("fayeem.mooktadeer@inductivehealth.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).click();
        driver.findElement(By.id("password")).sendKeys("King1234!");
        driver.findElement(By.xpath("//input[@value='Sign in']")).click();

        WebDriverWait explicitWait = new WebDriverWait(driver,Duration.ofSeconds(3));
        explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@class='text-sm']"))));

        Actions mouseActions = new Actions(driver);
        mouseActions.moveToElement(driver.findElement(By.xpath("(//div[@class='items-center flex my-2'])[1]")));

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