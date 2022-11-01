import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

@Test
public class SeleniumDriver implements WebDriver {
    @Test
    public void flightUtility() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().fullscreen();

        //Getting AutoSuggestive Element
        Actions mouseActions = new Actions(driver);
        WebElement element = driver.findElement(By.id("autosuggest"));
        element.click();
        element.sendKeys("Ind");

        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(4));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class = 'ui-menu-item'] a")));

        List <WebElement> countryOptions = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));

        for(WebElement country : countryOptions){
            if(country.getText().equalsIgnoreCase("India")){
                country.click();
            }
        }

        Select selectElement = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        selectElement.selectByVisibleText("USD");

        driver.navigate().refresh();

        Thread.sleep(3000);
        driver.close();


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
