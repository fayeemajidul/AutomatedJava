package POMstructure;

import GlobalProperties.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.By.className;
import static org.openqa.selenium.By.xpath;

public class NavigateToItem extends AbstractWaits {
    WebDriver driver;
    public NavigateToItem(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (className = "sf-with-ul")
    WebElement womenSection;

    By article = className("product-name");

    public void navigateToItems(){
        womenSection.click();
        WebElement chooseTops  = driver.findElement(xpath("(//img[@class='replace-2x'])[1]")); //Chooses Tops
        AbstractWaitVis(chooseTops);
        chooseTops.click();

        JavascriptExecutor scrollDown = (JavascriptExecutor)driver;
        scrollDown.executeScript("window.scrollBy(0,600)");

        Actions mouseAction = new Actions(driver);
        List <WebElement> clothes = driver.findElements(article);
        for(WebElement cloth : clothes){
            String productGrabbed = cloth.getText().split(" ")[0].trim();
            if(productGrabbed.equalsIgnoreCase("Blouse")){
                mouseAction.moveToElement(driver.findElement(article)).build().perform();
                driver.findElement(By.cssSelector("button.ajax_add_to_cart_button.btn.btn-default")).click();
            }
        }
    }

}
