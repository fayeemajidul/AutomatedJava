package WebPages;

import Resources.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductPage extends AbstractWaits {
    WebDriver driver;
    CartPage cartPage;
    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".mb-3")
    List<WebElement> items;

    By toastMessage = By.cssSelector("#toast-container");

    public WebElement getProductName(String DesiredProduct) {
        List<WebElement> itemInCart = items;
        for (WebElement verifyItem : itemInCart) {
            //Get the Product: [Get Text] + Add to cart.
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(DesiredProduct);
            if (productName) {
                return verifyItem;
            }
        }
        return null;
    }
    public CartPage addProductToCart(String DesiredProduct) {
        WebElement item = getProductName(DesiredProduct);
        item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        abstractWait(toastMessage);
        return new CartPage(driver);
    }
}
