package POMstructure;

import GlobalProperties.AbstractWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class InitialLoginPage extends AbstractWaits {
    WebDriver driver;
    public NavigateToItem navigate;


    public InitialLoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (className = "login")
    WebElement login;

    @FindBy(id = "email")
    WebElement userEmail;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement submitButton;

    @Parameters({"USER", "PASSWORD"})
    public void loginSetup(String USER, String PASSWORD){
        AbstractWaitVis(login);
        login.click();

        Actions mouseAction = new Actions(driver);
        mouseAction.click(userEmail).sendKeys(USER).build().perform();
        mouseAction.click(password).sendKeys(PASSWORD).build().perform();
        mouseAction.click(submitButton).build().perform();
    }

    public NavigateToItem signIn (String USER, String PASSWORD){
        loginSetup(USER, PASSWORD);
        return new NavigateToItem(driver);
    }
}

