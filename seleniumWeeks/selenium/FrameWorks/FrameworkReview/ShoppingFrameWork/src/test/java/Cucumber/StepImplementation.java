package Cucumber;

import Resources.InitDriver;
import WebPages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class StepImplementation extends InitDriver {
    InitDriver globalDriver = new InitDriver();
    LoginPage loginPage;
    ProductPage productPage;
    CartPage cartPage;
    CheckOutPage checkOutPage;
    OrderConfirmPage orderConfirm;

    @Given("I landed on Ecommerce Page")
    public void I_Landed_On_Ecommerce_Page() throws IOException {
    //Code executed here when given is executed
        loginPage = globalDriver.launchApp("https://rahulshettyacademy.com/client/","webdriver.gecko.driver","/Users/fayeemmooktadeer/Downloads/geckodriver");
    }
    @Given("^Logged in with username (.+) and password (.+)$")
    public void Logging_In_With_Credentials(String username, String password){
        productPage = loginPage.loginInfo(username, password);
        //Logs in with user credentials, takes values from Cucumber Examples.
    }
    @When("^I add the product (.+) to the cart$")
    public void Adding_Product_To_Cart(String productName){
        cartPage = productPage.addProductToCart(productName);
        //this step adds product to the cart
    }

    @When("^Checkout (.+)and verify$")
    public void Check_Out_Product(String productName){
        checkOutPage = cartPage.verifyItemInCart(productName);
        //This step will verify if the item is in the cart
    }
    @When("^Enter in (.+) then click check submit$")
    public void Customer_Info_Check_Out_Page(String country){
        orderConfirm = checkOutPage.chooseCountry(country);
        //All User Data is in this step then order is placed
    }
    @Then("{string} message is displayed on ConfirmationPage")
    public void ConfirmationPage(String confirm){
        orderConfirm.grabConfirmMessage();
        System.out.println("Printed from Cucumber: " + confirm);
        //Confirmation message printout
    }

}