import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class DayThree implements WebDriver {
    public static void main(String[] args){
        System.out.println("Hold yourself accountable.");
        System.out.println("Don't be a fool to your desires");
    }
    public static void endToEndPractice() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        //Auto suggestive:
        driver.findElement(By.id("autocomplete")).click();
        driver.findElement(By.id("autocomplete")).sendKeys("Ind");
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        Thread.sleep(3000);
        for (WebElement option : options) {
            System.out.println(option.getText());
            if (option.getText().equals("India")) {
                option.click();
                break;
            } else {
                System.out.println("not found");
            }
        }
    }

    @Test
    public static void WebLoginHomeLoan(){
        System.out.println("Testing from Web");
    }
    @Test
    public static void MobileLoginHomeLoan(){
        System.out.println("Testing from Mobile");
    }
    @Test
    public static void LoginAPIHomeLoan(){
        System.out.println("Testing from Login");
    }



    /*Abstract Methods*/
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
