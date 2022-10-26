package WebPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    WebDriver driver;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

}

//        //Create a Explicit Wait:
//        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
//
//        //Based of Selected Product, Add to cart:
//        List <WebElement> items = driver.findElements(By.cssSelector(".mb-3"));
//        for(WebElement item: items){
//            String productName = item.getText().split(" ")[0].trim();
//            if(productName.equalsIgnoreCase(desiredProduct)){
//                //Click Add to Cart button:
//                item.findElement(By.cssSelector(".card-body button:last-of-type")).click();
//            }
//        }
//        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-tns-c31-1.ng-star-inserted")));
//