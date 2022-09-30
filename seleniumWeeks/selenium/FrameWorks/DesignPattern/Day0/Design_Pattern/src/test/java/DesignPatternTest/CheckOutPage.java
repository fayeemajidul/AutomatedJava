package DesignPatternTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends  AbstractMethods{
    WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[placeholder = 'Select Country']")
    WebElement country;

    @FindBy(xpath = "(//a[normalize-space()='Place Order'])[1]")
    WebElement placeOrder;

    public void chooseCountry(String chosenCountry){
        country.click();
        String formatCountry = chosenCountry.toLowerCase().substring(0,1).toUpperCase() + chosenCountry.substring(1).toLowerCase();
        country.sendKeys(formatCountry);
        abstractWait(By.cssSelector(".ta-results"));
        driver.findElement(By.xpath(String.format("//span[normalize-space()='%s']", formatCountry))).click();
        placeOrder.click();

    }
}