package POMstructure;

import GlobalProperties.AbstractWaits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    By chooseTops = xpath("(//img[@class='replace-2x'])[1]"); //Chooses Tops

    public void navigateToItems(){
        womenSection.click();
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        AbstractWaitVis((WebElement) chooseTops);
        driver.findElement(chooseTops).click();

    }

}
