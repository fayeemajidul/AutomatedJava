package day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Types of Locators:
 *ID, XPATH, CSS Selector, Name, Tag Name, Link Text, Partial Link Text
 Verification: CSSselector + XPath:
 $() for Css, $x() for Xpath.

 General Thumb of thumb choose unique Elements
 */

public final class App implements WebDriver {
    private App() {
    }
    public static void main(String[] args) {
        //instagramSignup();
        amazonSignup();
    }

//Syntax for Css Selector:
 /* By (Class Name) -> tagname.classname 
  * By (ID) -> tagname#id -> input#inputUsername

  General Syntax:
  *** 3: Tagname[attribute = 'value']
  input[placeholder = 'Username']

  //Implicit Waits: Tells you the amount of seconds to wait.
    ** driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());

    To Check for Unique Elements on a webpage, you can do $('CssSelector') --> to check if the element is unique.

    //Xpath to locate button:
    // (//buttton[text() = 'Log Out'])
    // (//*[text() = 'Log Out'])


 */
    public static void cssSelectorPath(){
        
        //Initializing Web Driver.
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver" );
        WebDriver driver = new FirefoxDriver();

        //Calling Web Methods:
        driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.id("email")).sendKeys("fayeemf@gmail.com");
        driver.findElement(By.id("password")).sendKeys("King1234!");
        driver.findElement(By.className("btn-primary")).click();
        System.out.println(driver.findElement(By.cssSelector("div.bodySmall")).getText());

    }

    public static void linkXPath(){
        //Just enter in the text in the <a> tag, nothing too complicated.
        //Syntax for Xpath: //<TagName>[@attribute = 'value']

        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver" );
        WebDriver driving = new FirefoxDriver();
        driving.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driving.get("https://sso.teachable.com/secure/9521/identity/login/password");
        driving.findElement(By.linkText("Sign Up")).click();
        driving.findElement(By.xpath("//input[@id = 'user_name']")).sendKeys("John Doe");
        driving.findElement(By.xpath("//input[@id = 'user_email']")).sendKeys("johndoe@gmail.com");
        driving.findElement(By.className("password")).sendKeys("Johndoe123");
        driving.findElement(By.xpath("//input[@type = 'checkbox']")).click();
        driving.findElement(By.className("btn-primary")).click();

        //driving.quit();
    }
    //Implicit Waits for objects to show on the page
    //Thread waits for the program to execute.
    public static void flightTest(){
        //Syntax for Xpath: //<TagName>[@attribute = 'value']
        /* Testing the flights. */
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Port Blair");
        driver.findElement(By.cssSelector("input.select_CTXT valid")).click();
        driver.findElement(By.className("select_CTXT")).click();
        driver.findElement(By.linkText("Bangkok (BKK)")).click();
        //driver.quit();
    }
    //  (//option[@value='Sep'])[1]
    //  option[value='Sep']
    //  *** 3: Tagname[attribute = 'value']

    //For Dynamic objects:
    //Last four values will change, so you can do driver.FindElements.(By.cssSelector("tagname[attribute *= 'value']"));
    /** To access child properities
     * xpath Parent: //tagname[@attribute = 'value']
     * xpath Child: //tagname[@attribute = 'value']/tagname[1]
     */

    public static void instagramSignup(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.roblox.com/");
        driver.findElement(By.id("signup-username")).click();
        driver.findElement(By.id("signup-username")).sendKeys("yeowhatsupman1");
        driver.findElement(By.id("signup-password")).click();
        driver.findElement(By.id("signup-password")).sendKeys("King1234!");
        driver.findElement(By.className("icon-password-show-v2")).click();
        driver.findElement(By.id("MaleButton")).click();
        driver.findElement(By.id("MonthDropdown")).click();
        driver.findElement(By.id("signup-button"));
        
        }
        public static void amazonSignup(){
            //Initialize Communication
            System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
            WebDriver driver = new FirefoxDriver();
            // methods:
            driver.get("https://www.amazon.com/");
            driver.findElement(By.id("nav-link-accountList")).click();
            //Sign up page:
            driver.findElement(By.linkText("Create your Amazon account")).click();
            driver.findElement(By.id("ap_customer_name")).sendKeys("Big Boss Miah");
            driver.findElement(By.xpath("//input[@type = 'email']")).click();
            driver.findElement(By.xpath("//input[@type = 'email']")).sendKeys("bigboss13234@gmail.com");
            driver.findElement(By.cssSelector("input[type = 'password']")).click();
            driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("King1234!");
            driver.findElement(By.cssSelector("#ap_password_check")).click();
            driver.findElement(By.cssSelector("#ap_password_check")).sendKeys("King1234!");
            //Finalize:
            System.out.println(driver.findElement(By.id("legalTextRow")).getText());
            try {
                Thread.sleep(2400);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            //Assert.assertEquals(driver.findElement(By.id("legalTextRow")).getText(), "By creating an account, you agree to Amazon's Conditions of Use and Privacy Notice.");

            


            //Quit:
            try {
                Thread.sleep(2400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
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
