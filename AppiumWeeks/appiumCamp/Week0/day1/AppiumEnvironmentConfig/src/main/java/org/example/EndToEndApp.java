package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class EndToEndApp extends BaseTest {
    @Test
    public void EcommerceApp() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Fayeem");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        List<WebElement> listOfCountries = driver.findElements(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView"));
        scrollToText("Bangladesh");
        driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
        Thread.sleep(3000);

        //Jordans Page
        scrollToText("Nike Blazer Mid '77");
        List <WebElement> shoes = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
        for(WebElement shoe:shoes){
            String shoeName = shoe.getAttribute("text");
            if(shoeName.equalsIgnoreCase("Nike Blazer Mid '77")){
                driver.findElement(By.id("com.androidsample.generalstore:id/productAddCart")).click();
                break;
            }
        }
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        double sumOfItems = 0;
        List<WebElement> itemInCart = driver.findElements(By.xpath("//android.widget.RelativeLayout"));
        for(WebElement item : itemInCart){
            double productPrice = Double.parseDouble(driver.findElement(By.id("com.androidsample.generalstore:id/productPrice")).getText().split("\\$")[1].split("//.")[0]);
            sumOfItems+= productPrice;
            System.out.println(sumOfItems);
            break;
        }
        double productPrice = Double.parseDouble(driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText().trim().split("\\$")[1].split("//.")[0]);
        Assert.assertEquals(sumOfItems,productPrice);
        Thread.sleep(3000);
        driver.findElement(AppiumBy.className("android.widget.CheckBox")).click();
        WebElement element = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
        longPress(element);
        Thread.sleep(3000);
        driver.findElement(By.id("android:id/button1")).click();
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(3000);

        //Hybrid Application: [Shift Scope to Web View from native application]
        driver.getContextHandles();
        driver.context("Webview"); // Sets the scope from native to Web application.


    }

}
