package DesignPatternTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage extends  AbstractMethods{
    WebDriver driver;
    public CartPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Override
    public void clickCartButton() {
        super.clickCartButton();
    }
    @FindBy(xpath = "//div[@class='cartSection']/h3")
    List <WebElement> elements;

    @FindBy(css = ".totalRow button")
    WebElement rowButton;
    public void getProductName(String productWeWant){
        List<WebElement> itemInCart = elements;
        for(WebElement verifyItem : itemInCart){
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(productWeWant);
            Assert.assertTrue(productName);
            rowButton.click();

        }
    }
}
