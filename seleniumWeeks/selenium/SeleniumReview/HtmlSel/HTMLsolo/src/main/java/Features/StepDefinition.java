package Features;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class StepDefinition {
    WebDriver driver;
    public void GiveDriverLife(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }
    @Given("Entered username and password in given field")
    public void I_Entered_Username_And_Password_In_Given_Field() throws InterruptedException {
        GiveDriverLife();
        driver.findElement(By.id("userEmail")).sendKeys("fayeemajidul@gmail.com");
        driver.findElement(By.id("userPassword")).click();
        driver.findElement(By.id("userPassword")).sendKeys("Password123");
    }
    @When("Clicked on login button")
    public void I_Clicked_On_Login_Button() throws InterruptedException {
        driver.findElement(By.id("login")).click();
        Thread.sleep(3000);
        driver.quit();
    }
    @Then("User directed to the shopping page")
    public void User_Directed_To_The_Shopping_Page(){
        System.out.println(driver.getTitle());
    }
}
