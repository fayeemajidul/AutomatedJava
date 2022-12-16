package org.example;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDemo extends BaseTest{
    @Test
    public void basicsOfAppium() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        scrollToText("WebView");
        scrollToPosition("down",3,5);
    }
    @Test
    public void swipeGezsture(){
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Gallery']")).click();
        driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
        Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "true");

        WebElement element = (driver.findElement(By.xpath("(//android.widget.ImageView)[1]")));
        //Swipe:
        swipeGesture(element,"left",1);
        //Verified if swipe.
        Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"), "false");
 
    }
}
