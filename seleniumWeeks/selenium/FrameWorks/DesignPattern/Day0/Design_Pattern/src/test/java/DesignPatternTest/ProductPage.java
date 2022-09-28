package DesignPatternTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(css = ".mb-3")
    List <WebElement> items;
}


