package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HTMLsole {
    @Test
    public static void createSmokeTest() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://rahulshettyacademy.com/client");
        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("fayeemajidul@gmail.com");
        driver.findElement(By.id("userPassword")).click();
        driver.findElement(By.id("userPassword")).sendKeys("Password123");
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}