import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class DayOneTest implements WebDriver {
    public static void main(String[] args){
    }

    @Test
    public static void amazonInterview(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        //All my web elements: 30 elements are in this one line.
        List <WebElement> products= driver.findElements(By.xpath("//h4[@class = 'product-name']"));
        String [] productToSearch = {"Broccoli", "Tomato", "Cucumber"};
        for(int i = 0; i < products.size(); i++){
            // 0. Format the Contents into the Product to Search cart.


            // 1. taking the name from each other product:
            String productName = products.get(i).getText();

            //2. Convert Product Array --> ArrayList
            List <String> searchForProduct = Arrays.asList(productToSearch);

            if(searchForProduct.contains(productName)){
                driver.findElements(By.xpath("//button[text() = 'ADD TO CART']")).get(i).click();
                //How to Implement Break: ArrayList does not allow breaks.
                //1st. Count the number of times this block is being executed.

            }
        }
    }
    @Test
    public static void addToCart(){
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Downloads/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        //Create List Of Elements:
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> items = driver.findElements(By.xpath("//h4[@class = 'product-name']"));
        //Create a List of Products
        ArrayList<String> productsToSearchFor = new ArrayList<>();
        productsToSearchFor.add("Cucumber");productsToSearchFor.add("Potato");productsToSearchFor.add("Tomato");productsToSearchFor.add("Broccoli");
        int counter = 0;

        //Create for Loop To grab name per element:
        for(int i = 0; i < items.size(); i++){

            //Grabs name of the Element in the list, splits it into two, takes what's needed.
            String[] nameGrabbedFromElement = items.get(i).getText().split("-");

            //Removes White Spaces from the String.
            String formattedName = nameGrabbedFromElement[0].trim();
            //System.out.println("Formatted Name is: " + formattedName);
            if(productsToSearchFor.contains(formattedName)){
                driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                //How to Implement Break: ArrayList does not allow breaks.
                //1st. Count the number of times this block is being executed.
                counter++;
                System.out.println("Counter Count :"  + counter);
                if(counter == productsToSearchFor.size()){
                    break;
                }

            }
        }
    }

    /*Abstract Methods:*/
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
