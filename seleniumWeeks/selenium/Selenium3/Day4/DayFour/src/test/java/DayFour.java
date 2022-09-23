import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.List;
import java.util.Random;
import java.util.Set;

public class DayFour implements WebDriver {
    @Test
    public static void main(String[] args){
        System.out.println("Testing the environment");
    }
    @Test
    public static int randomNumberGenerator(){
        Random rand = new Random();
        return rand.nextInt(0,100);
    }
    @Test
    public static void method1(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test
    public static void method2(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test
    public static void method3(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test
    public static void method4(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test(groups = {"smoke"})
    public static void method5(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test(groups = {"smoke"})
    public static void method6(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test(groups = {"smoke"})
    public static void method7(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @Test(groups = {"smoke"})
    public static void method8(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Method: " + randomNumber);
    }

    @BeforeClass
    @Test(groups = {"smoke"})
    public static void method9(){
        int randomNumber = randomNumberGenerator();
        System.out.println("Before Class");
    }

    @BeforeTest
    @Test(groups = {"smoke"})
    public static void method10(){
        System.out.println("Before Test");
    }

    @BeforeSuite
    public static void essentialMethod(){
        System.out.println("Here are a list of numbers randomly generated");
    }

    @BeforeMethod
    public static void userNotifier(){
        System.out.println("\nUser has called the random Generator function");
    }

    @AfterMethod
    public static void thankYou(){
        System.out.println("Thank you for using Fayeem's random generator");
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
