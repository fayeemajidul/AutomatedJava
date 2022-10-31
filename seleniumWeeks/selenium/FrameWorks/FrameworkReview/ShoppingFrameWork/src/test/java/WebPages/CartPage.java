package WebPages;

import Resources.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage extends AbstractWaits {
    WebDriver driver;
    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Override
    public void clickCartButton() {
        super.clickCartButton();
    }

    @FindBy(xpath = "//div[@class='cartSection']/h3")
    List<WebElement> elements;

    @FindBy(css = ".totalRow button")
    WebElement rowButton;

    By invisibleStar = By.cssSelector(".ng-tns-c31-1.ng-star-inserted");
    By productInCart = By.xpath("//div[@class='cartSection']/h3");
    public CheckOutPage verifyItemInCart(String DesiredProduct){
        //Create explicit wait only when NG-Start is invisible.
        invisibleWait(invisibleStar);
        clickCartButton();

        abstractWait(productInCart);
        System.out.println(elements);
        for(WebElement verifyItem : elements){
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(DesiredProduct);
            Assert.assertTrue(productName);
            rowButton.click();
        }
        return new CheckOutPage(driver);
    }
}

