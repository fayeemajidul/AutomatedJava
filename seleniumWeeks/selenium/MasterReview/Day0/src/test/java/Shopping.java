import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Shopping implements WebDriver {
    public static void main(String[] args){
        System.out.println("Testing the environment");
    }

    @Test
    public void POMOrientated(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        List <WebElement> itemsInPage = driver.findElements(By.className("product"));
        System.out.println(itemsInPage.size());

        for(WebElement items : itemsInPage){
            String itemFormat = items.findElement(By.className("product-name")).getText().split(" ")[0].trim();
            if(itemFormat.equalsIgnoreCase("Strawberry")){
                items.findElement(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])[1]")).click();
                break;
            }
        }

    }
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
