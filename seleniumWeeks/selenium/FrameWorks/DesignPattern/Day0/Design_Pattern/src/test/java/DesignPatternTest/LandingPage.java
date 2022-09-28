package DesignPatternTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractMethods{
    WebDriver driver;
    public LandingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //Initializes the elements in this Class.
    }
    //No driver, so we need to initialize it in the constructor:)
    //Element 1: User ID
    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(id = "login")
    WebElement loginButton;

    public void actionMethod(String email, String password){
        userEmail.sendKeys(email);
        userPassword.sendKeys(password);
        loginButton.click();

    }

}
