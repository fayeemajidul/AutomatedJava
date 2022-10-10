package GlobalProperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractWaits {
    WebDriver driver;
    WebDriverWait explicitWait;

    public AbstractWaits(WebDriver driver){
        super();
        this.driver = driver;
        explicitWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);
    }
    public void AbstractWaitInvis(WebElement element){
        explicitWait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void AbstractWaitVis(WebElement element){
        explicitWait.until(ExpectedConditions.visibilityOf(element));
    }


}
