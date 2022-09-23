import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class FunctionalParameterTest implements WebDriver {
    public static void main(String[] args){}

    @Parameters ({"URL", "KEY", "VALUE"})
    @Test
    public static void signUpPage(String URL, String setUpKey, String setUpValue){
        System.setProperty(setUpKey, setUpValue);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.withTimeout(Duration.ofSeconds(3));

    }
    @DataProvider
    @Test
    public static Object[][] getData(){
        Random rand = new Random();
        Object [][] dataEntered = new Object[3][2];
        //1st Set
        dataEntered[0][0] = "Bangladesh";
        dataEntered[0][1] = "Price of Flight: " + rand.nextInt(0,1000);

        //2nd Set
        dataEntered[1][0] = "Europe";
        dataEntered[1][1] = "Price of Flight: " + rand.nextInt(0,900);

        //3rd Set
        dataEntered[2][0] = "China";
        dataEntered[2][1] = "Price of Flight: " + rand.nextInt(0,1600);
        return dataEntered;
    }

    @Test(dataProvider = "getData")
    public static void DataProvider(String nameOfCountry, String priceOfFlight){
        System.out.println("\nCountry: " + nameOfCountry);
        System.out.println("Price: " + priceOfFlight);
        for(int i = 0; i < 10; i++){
            System.out.print("-");
        }
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
