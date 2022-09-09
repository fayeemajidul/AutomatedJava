package day0week1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * UAI components:
 * Handling Static Dropdowns
 * Handling Dynamic Dropdowns
 * Handling Checkboxes
 * Handling Radio Buttons
 * Handling Text Buttons
 * Handling Alert-Java popups
 * Selenium WebDriver Form Methods
 */

public final class App implements WebDriver{
    private App() {}

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        // flightProgram(driver);
        //autoSuggestive(driver);
        checkboxTexting(driver);
    }

    public static void practice(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        WebElement selectDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select = new Select(selectDropDown);
        select.selectByValue("USD");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("INR");
        System.out.println(select.getFirstSelectedOption().getText());
        // System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
    }
    public static void flightProgram(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Drop Down Config
        WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(element);
        driver.manage().window().maximize();
        dropdown.selectByIndex(3);
        try{
            Thread.sleep(1200);
        } catch (Exception e){
            System.out.println("Error");
        }
        System.out.println(dropdown.getFirstSelectedOption().getText());

        //* Moving on to Number of People */
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i = 0; i < 5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

        //Departing From.
        //input[@id='ctl00_mainContent_ddl_originStation1_CTXT']
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Delhi (DEL)')]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();
        // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
        //You can do Parent to child Xpath to access elements.
    }
    public static void autoSuggestive(WebDriver driver){
        /** Auto Suggestive Feature w/ Selenium */
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*Select all options First for Dynamic Suggestion:
         * Converting the options into a list: which you can then access by indexes:
        */
        List <WebElement> options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item'] a"));

        for(WebElement option : options){
            if(option.getText().equals("India")){
                option.click();
                break;
            }
        }

    }
    public static void completeFlightCheckout(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        //Wait this number of seconds:
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

        WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select element = new Select(dropdown);
        element.selectByIndex(3);
        System.out.println(element.getFirstSelectedOption().getText());
        /* Select Who's going */
        driver.findElement(By.id("divpaxinfo")).click();
        for(int i = 0; i < 5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Delhi')]")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        driver.findElement(By.xpath("//td[@class = 'mapbg'] //a [@value = 'MAA']")).click();
        driver.findElement(By.id("autosuggest")).click();

        /** Auto Suggestive Property */
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        try{
            Thread.sleep(1000);
        } catch (Exception e){
            System.out.println("Error");
        }

        List <WebElement> options = driver.findElements(By.cssSelector("li[class  = 'ui-menu-item'] a"));

        for (WebElement option:options){
            if(option.getText().equals("India")){
                option.click();
                break;
            }
        }
        driver.quit();
    }
    public static void checkboxTexting(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_chk_friendsandfamily']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Error");
        }
        System.out.println(driver.findElements(By.xpath("//input[@type = 'checkbox']")).size());
        driver.quit();
        }




    //WebDriver Abstract Methods:
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
