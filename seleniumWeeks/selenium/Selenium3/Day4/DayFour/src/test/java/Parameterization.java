import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Parameterization implements WebDriver {
    public static void main(String[] args){
        System.out.println("");
    }

    @Parameters({"URL", "numbers"})
    @Test
    public static void doingTest(String URL, String numbers){
        System.out.println(URL);
        System.out.println(numbers);
    }
    @DataProvider
    @Test
    public static Object[][] getData(){
        //1st combination = username + password - good credit history
        //2nd combination = username + password - no credit history
        //3rd combination = fraudulent credit history
        //3d Arrays ---- Rows + Columns: Each row --> number of data input, column is value:
        Object [][] data = new Object [3][2];
        data[0][0] = "firstUsername";
        data[0][1] = "firstPassword";
        //2nd set
        data[1][0] = "secondSetUsername";
        data[1][1] = "secondSetPassword";

        //3rd set
        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdSetPassword";

        /*3d TABLE  ___C1____||___C2_____
        * Row 0:   || [0 ,0] || [0, 1] ||
        * Row 1:   || [1, 0] || [1 ,1] ||
        * Row 2:   || [2, 0] || [2, 1] ||
        * *        __________||________
        /
         */

        //Once Completed entering Data, data will then get transferred over to testcases
        return data;
    }

    @Test(dataProvider = "getData")
    public void MobilesignoutCarLoan(String username, String password){
        System.out.println(username);
        System.out.println(password);

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
