import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DayTwo implements WebDriver {
    public static void main(String[] args){
        System.out.println("Remember your value, Fayeem. Remember what makes you different and what puts you on the top. Remember all the sacrifices you have already been through");
    }

    public static void implicitWaits() throws InterruptedException{
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    @Test
    public static void amazonPage() throws InterruptedException {
        // The Set-Up:
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        Thread.sleep(1000);

        //Created Variables:
        String [] itemsToSearch = {"Cucumber" , "Potato", "Carrot", "Tomato", "Mushroom"};
        List <String> searchToArrayList = Arrays.asList(itemsToSearch);
        int count = 0;

        //Created list of Elements:
        Thread.sleep(1000);
        List <WebElement> items = driver.findElements(By.xpath("//h4[@class = 'product-name']"));

        Thread.sleep(1000);
        for(int i = 0; i < items.size(); i++){
            String[] nameOfProductGrabbed = items.get(i).getText().split("-");
            String formattedProductGrabbed = nameOfProductGrabbed[0].trim();
            if(searchToArrayList.contains(formattedProductGrabbed)){
                driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                count++;
                if (count == items.size()) {
                    break;
                }
            }
        }
    }
    /*Abstract Methods: */

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
