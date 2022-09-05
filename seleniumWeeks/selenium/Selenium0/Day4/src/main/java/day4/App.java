package day4;

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
        // staticDropdown(driver);
        passengersOnBoard(driver);
    }

    public static void navigatePractice(WebDriver driver){
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.navigate().to("http://www.tomatotimers.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id = 'pomodoro_timer_button']")).click();
        driver.findElement(By.xpath("//img[@id = 'startButton']")).click();
        driver.navigate().back();
        try {
            Thread.sleep(1300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    public static void staticDropdown(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        //Selenium has Select Class: Constructor Needs Element
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropDown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        //Select by Attribute:
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.deselectAll();

        try{
        Thread.sleep(2000);
        } catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
    public static void passengersOnBoard(WebDriver driver){
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        try{
            Thread.sleep(1400);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for(int i = 1; i < 9; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        try{
            Thread.sleep(1400);
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.quit();
    }


    //WEBDRIVER ABSTRACT METHODS:
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
    public void quit() {}
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
