package WebPages;

import Resources.AbstractWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class LoginPage extends AbstractWaits {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "userEmail")
    WebElement userEmail;

    @FindBy(id = "userPassword")
    WebElement userPassword;

    @FindBy(css = ".btn.btn-block.login-btn")
    WebElement loginButton;

    @Parameters({"USER", "PASSWORD"})
    public ProductPage loginInfo(String USER, String PASSWORD){
        userEmail.sendKeys(USER);
        userPassword.sendKeys(PASSWORD);
        loginButton.click();

        ProductPage productPage;
        productPage = new ProductPage(driver);
        return productPage;
    }
}