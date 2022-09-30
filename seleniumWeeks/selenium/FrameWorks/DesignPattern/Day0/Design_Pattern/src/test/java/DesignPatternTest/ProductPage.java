package DesignPatternTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;
import java.util.List;

public class ProductPage extends AbstractMethods{
    WebDriver driver;
    public ProductPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".mb-3")
    List <WebElement> items;
    By productsBy = By.cssSelector(".mb-3");
    By toastMessage = By.cssSelector("#toast-container");


    public List<WebElement> getShoppingItems(){;
        List<WebElement> items = driver.findElements(productsBy);
        //Waits for Products to appear
        abstractWait(productsBy);
        return items;
    }
    public WebElement getProductName(String productWeWant){
        List<WebElement> itemInCart = getShoppingItems();
        for(WebElement verifyItem : itemInCart){
            //Get the Product: [Get Text] + Add to cart.
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(productWeWant);
            if(productName){
                return verifyItem;
            }
        }
        return null;
    }
    public void addProductToCart(String productWeWant){
        WebElement item = getProductName(productWeWant); //We Want to get into Product scope not driver scope.
        item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        try{
            Thread.sleep(560);
        }catch(Exception ignored){}
        abstractWait(toastMessage);
    }

}