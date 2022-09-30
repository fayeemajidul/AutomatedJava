package DesignPatternTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;
import java.util.List;

public class ProductPage extends AbstractMethods{
    WebDriver driver;
    public ProductPage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }
    @FindBy(css = ".mb-3")
    List <WebElement> items;
    By productsBy = By.cssSelector(".mb-3");
    By toastMessage = By.cssSelector("#toast-container");


    public List<WebElement> getShoppingItems(){;
        List<WebElement> items = driver.findElements(productsBy);
        System.out.println(items);
        //Waits for Products to appear
        abstractWait(productsBy);
        try{
            Thread.sleep(3000);

        }catch(Exception ignored){}
        //Returns the list of items in the set:
        return items;
    }
    public WebElement getProductName(String productWeWant){
        List<WebElement> itemInCart = getShoppingItems();
        WebElement foundElement = null;
        for(WebElement verifyItem : itemInCart){
            //Get the Product: [Get Text] + Add to cart.
            boolean productName = (verifyItem.getText().split(" ")[0].trim()).equalsIgnoreCase(productWeWant);
            if(productName){
                foundElement = verifyItem;
            }
        }
        return foundElement;
    }
    public void addProductToCart(String productWeWant){
        WebElement item = getProductName(productWeWant); //We Want to get into Product scope not driver scope.
        item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
        abstractWait(toastMessage);
    }
}