package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractWaits {
    WebDriver driver;
    public AbstractWaits(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void abstractWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By)(element)));
    }
    //Our first real overloading experience
    public void abstractWait(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated((element)));
    }
    public void invisibleWait(By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
    }
    public void invisibleWait(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    /* -- Reliability -- */
    @FindBy(css = "[routerlink *= 'cart']")
    WebElement cartButton;
    public void clickCartButton(){
        cartButton.click();
    }
    @FindBy(css = "[routerlink *= 'myorders']")
    WebElement orders;
    public void clickOrderButton(){
        orders.click();
    }

    @FindBy(css = "[routerlink *= '']")
    WebElement home;
    public void clickHomeButton(){
        home.click();
    }
}
