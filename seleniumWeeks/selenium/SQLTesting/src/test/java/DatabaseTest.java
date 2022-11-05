import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.*;
import java.util.List;
import java.util.Set;

public class DatabaseTest implements WebDriver {
    public static void main(String[] args) throws SQLException {
        //Setting up SQL connection to Selenium Webdriver:
        String host = "localhost";
        String port = "3306";
        Connection connectionMethod = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/testDatabase","root","King1234!");
        Statement filePath = connectionMethod.createStatement();

        //Execute
        ResultSet setResult = filePath.executeQuery("select * from EmployeeInfo where name = 'sam'");

        while(setResult.next()){
            //without .next, you are in "-1" index, with next you are in "0" index.
            //Traverses through each element, without next there is no initiation or going into the Array.
            System.out.println(setResult.getString("location"));
            System.out.println(setResult.getString("location"));
        }

    }

    /* Abstract Method Implementation */
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
