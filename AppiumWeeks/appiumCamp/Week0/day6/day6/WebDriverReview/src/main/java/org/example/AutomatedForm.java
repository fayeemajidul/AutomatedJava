package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AutomatedForm implements WebDriver {
    @Test
    public static void automateForm(){
        System.setProperty("webdriver.gecko.driver","/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qavalidation.com/demo-form/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        driver.findElement(By.id("g4072-fullname")).click();
        driver.findElement(By.id("g4072-fullname")).sendKeys("Fayeem Mooktadeer");

        driver.findElement(By.xpath("//div[@class = 'grunion-field-wrap grunion-field-email-wrap']//label")).click();
        driver.findElement(By.id("g4072-email")).sendKeys("mmookta1#@binghamton.edu");

        driver.findElement(By.xpath("//input[@class = 'telephone']")).click();
        driver.findElement(By.xpath("//input[@class = 'telephone']")).sendKeys("9144540222");

        Select selectGender = new Select(driver.findElement(By.id("g4072-gender")));
        selectGender.selectByVisibleText("Female");

        List <WebElement> radioOptions = driver.findElements(By.xpath("//label[@class = 'grunion-radio-label radio']"));
        System.out.println(radioOptions.size());

        Select QATools = new Select(driver.findElement(By.id("g4072-qatools")));
        QATools.selectByIndex(1);

        driver.findElement(By.id("contact-form-comment-g4072-otherdetails")).click();
        driver.findElement(By.id("contact-form-comment-g4072-otherdetails")).sendKeys("No other details needed to put in the box");
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
