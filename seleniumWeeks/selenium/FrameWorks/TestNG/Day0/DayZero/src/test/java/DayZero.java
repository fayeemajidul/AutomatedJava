import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DayZero implements WebDriver {
    public static void main(String[] args){
    }

    @Parameters({"KEY", "VALUE", "URL"})
    @Test
    public static void endToEndTest(String KEY, String VALUE, String URL) throws InterruptedException {
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("II2One")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("II2One")).sendKeys("Bangladesh");
        List <WebElement> elements = driver.findElements(By.xpath("//li[@role = 'option']"));
        for(WebElement element : elements){
            if(element.getText().contains("Albany")){
                System.out.println("Going to Albany");
            }
            System.out.println(element.getText());
        }
    }

    @Parameters({"KEY", "VALUE", "URL"})
    @Test
    public static void addToCart(String KEY, String VALUE, String URL) throws InterruptedException {
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        //Get the Name and compare it:
        String [] itemsToSearchFor = {"Brocolli", "Cauliflower", "Cucumber"};
        List<WebElement> items = driver.findElements(By.className("product-name"));
        int j = 0;
        Thread.sleep(3000);
        for(WebElement item : items){
            String formattedCode = item.getText().split("-")[0].trim();
            List <String> itemsToSearch = Arrays.asList(itemsToSearchFor);
            if(itemsToSearch.contains(formattedCode)){
                driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
                j++;
                if (j == itemsToSearchFor.length){
                    break;
                }
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
