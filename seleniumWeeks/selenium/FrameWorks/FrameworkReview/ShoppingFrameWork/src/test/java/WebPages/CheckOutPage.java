package WebPages;

import Resources.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends AbstractWaits {
    WebDriver driver;
    public CheckOutPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "(//input[@type='text'])[2]")
    WebElement CVV;
    @FindBy (xpath = "(//input[@type='text'])[3]")
    WebElement cardName;
    @FindBy (xpath = "(//input[@type='text'])[4]")
    WebElement coupon;
    @FindBy (css = "button[type = 'submit']")
    WebElement submitCoupon;
    @FindBy(css = "[placeholder = 'Select Country']")
    WebElement country;
    @FindBy(xpath = "(//a[normalize-space()='Place Order'])[1]")
    WebElement placeOrder;
    @FindBy(xpath = "//ngx-spinner[@class='ng-tns-c31-3 ng-star-inserted']")
    WebElement couponApplied;
    By couponSuccess = By.cssSelector(".mt-1.ng-star-inserted");

    public void paymentInput(){
        CVV.sendKeys("443");
        cardName.sendKeys("Rahul Miah");
        coupon.sendKeys("rahulshettyacademy");
        submitCoupon.click();
        invisibleWait(couponApplied);
        abstractWait(couponSuccess);

        String couponApplied = driver.findElement(couponSuccess).getText();
        Assert.assertEquals(couponApplied, "* Coupon Applied");
    }

    public OrderConfirmPage chooseCountry(String COUNTRY){
        paymentInput();
        String formatCountry = COUNTRY.toLowerCase().substring(0,1).toUpperCase() + COUNTRY.substring(1).toLowerCase(); //Capitalize.
        country.sendKeys(formatCountry);
        abstractWait(By.cssSelector(".ta-results"));
        driver.findElement(By.xpath(String.format("//span[normalize-space()='%s']", formatCountry))).click();
        placeOrder.click();
        return new OrderConfirmPage(driver);
    }
}