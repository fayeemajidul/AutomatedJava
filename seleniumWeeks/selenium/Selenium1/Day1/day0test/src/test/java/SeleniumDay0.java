import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class SeleniumDay0 implements WebDriver {
    public static void main(String[] args){
    }

    @Test
    public static void amazonInterview(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i = 0; i < products.size(); i++){
            String productText = products.get(i).getText();
            if(productText.contains("Cucumber")){
                driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
                break;
            }
        }
    }


    /*Abstract Methods:*/
    @Override
    public void get(String url) {
    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
