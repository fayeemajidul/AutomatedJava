package org.example;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class LongPress extends BaseTest{
    public void basicsOfAppium() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='1. Custom Adapter']")).click();
        WebElement element = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ExpandableListView/android.widget.TextView[1]"));

        longPress(element);
        String textOfPopup = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.widget.TextView")).getText();

        Assert.assertEquals(textOfPopup, "Sample menu");
    }
 }
