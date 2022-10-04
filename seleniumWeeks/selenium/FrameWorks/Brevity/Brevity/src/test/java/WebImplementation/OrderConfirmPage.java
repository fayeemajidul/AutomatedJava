package WebImplementation;

import Resources.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrderConfirmPage extends AbstractWaits {
    WebDriver driver;
    public OrderConfirmPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "hero-primary")
    WebElement confirmText;
    public void getConfirmMessage(){
        abstractWait(By.className("hero-primary"));
        String confirm = confirmText.getText().trim().toUpperCase();
        Assert.assertEquals(confirm, "THANKYOU FOR THE ORDER.");
        System.out.println(confirm);

    }
}
