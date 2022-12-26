package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Appium extends BaseTestConfig{
    public void accessElements(){
        driver.findElement(AppiumBy.accessibilityId("This Is ID"));
        driver.findElement(By.xpath("//tag[@look = 'attritubte']"));
        driver.findElement(AppiumBy.accessibilityId("Cool"));
        driver.findElement(AppiumBy.androidUIAutomator("GotIt"));
    }
}
