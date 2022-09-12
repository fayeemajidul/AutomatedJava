import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

// Practice with assertTrue, assertFalse, assertEquals = practice w/ assertions.
public class daytest implements  WebDriver{
    @Test
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://spicejet.com");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= 'SeniorCitizenDiscount']")).isSelected());

    }
    @Test
    public static void seleniumAssignment(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
        driver.findElement(By.id("checkBoxOption1")).click();
        Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
        /*Check for textBox*/
        System.out.println(driver.findElements(By.cssSelector("input [type ='checkbox']")).size());

    }

    @Test
    public static void calendarAutomation(){

        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1200));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Error");
        }
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(element);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i = 0; i < 4; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("autosuggest")).click();
        driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options){
            if(option.getText().equals("India")){
                option.click();
            }
            else{
                System.out.println("The available option: " + option + "was found instead");
            }
        }
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.cssSelector("a[value = 'BHO']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@class='dropdownDiv']//a[@value='MAA']")).click();
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Error");
        }
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Its enabled");
        }else{
            Assert.assertFalse(false);
        }
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            System.out.println("Error");
        }
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        driver.quit();
    }

    @Test
    /*Working With Alerts*/
    public static void alertsFire(){
        String text = "Fayeem";
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1200));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.id("name")).sendKeys(text);
        //WebDriver switches to Alerts: Selenium Scans for Alerts.
        driver.findElement(By.id("alertbtn")).click();
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());

        driver.findElement(By.id("confirmbtn")).click();
        driver.switchTo().alert().dismiss();
        System.out.println(driver.switchTo().alert().getText());
    }

    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "fast" })
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }


    /* Abstract Methods, from interface*/
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
