package WebImplement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class PageEntry {
    WebDriver driver;
    public PageEntry(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "userEmail")
    WebElement email;
    @FindBy(id = "userPassword")
    WebElement password;

    @FindBy(id = "login")
    WebElement login;

    @Parameters({"USER", "PASSWORD"})
    public void loginInfo(String USER, String PASSWORD) throws InterruptedException {
        email.sendKeys(USER);
        email.click();

        password.click();
        password.sendKeys(PASSWORD);
        login.click();
        Thread.sleep(3000);
        driver.close();
    }
}