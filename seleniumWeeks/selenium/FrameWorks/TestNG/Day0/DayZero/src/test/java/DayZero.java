import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/*We've learned
* TESTNG listeners
*  --> On test fail/success:
*  --> Where the test fails
*  --> using Assert.assertFails, to intentionally fail a test.
*  --> DataValidations
* */
public class DayZero implements WebDriver, ITestListener {
    public static void main(String[] args){
    }

    @Parameters({"KEY", "VALUE", "URL"})
    @Test
    public static void endToEndTest(String KEY, String VALUE, String URL) throws InterruptedException {
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.findElement(By.className("II2One")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("II2One")).sendKeys("Bangladesh");
        List <WebElement> elements = driver.findElements(By.xpath("//li[@role = 'option']"));
        for(WebElement element : elements){
            if(element.getText().contains("Albany")){
                System.out.println("Going to Albany");
            }
            System.out.println(element.getText());
        }
    }

    @Parameters({"KEY", "VALUE", "URL"})
    @Test
    public static void addToCart(String KEY, String VALUE, String URL) throws InterruptedException {
        System.setProperty(KEY, VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        //Get the Name and compare it:
        String [] itemsToSearchFor = {"Broccoli", "Cauliflower", "Cucumber"};
        List<WebElement> items = driver.findElements(By.className("product-name"));
        int j = 0;
        Thread.sleep(3000);
        for(WebElement item : items){
            String formattedCode = item.getText().split("-")[0].trim();
            List <String> itemsToSearch = Arrays.asList(itemsToSearchFor);
            if(itemsToSearch.contains(formattedCode)){
                driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
                j++;
                if (j == itemsToSearchFor.length){
                    break;
                }
            }
        }
    }
    @DataProvider
    public static Object[][] getData(){
        Object [][] data = new Object[3][2];
        data[0][0] = "kingster";
        data[0][1] = "junior";

        data[1][0] = "forty";
        data[1][1] = "five";

        data[2][0] = "sixty";
        data[2][1] = "nine_zairah";


        return data;
    }

    @Test(dataProvider = "getData")
    public static void dataTest(String username, String password){
        System.out.println(username + ": " +  password);
    }
    @Parameters({"KEY", "VALUE", "URL"})
    @Test
    public static void forYou(String KEY, String VALUE, String URL){
        System.setProperty(KEY,VALUE);
        WebDriver driver = new FirefoxDriver();
        driver.get(URL);

    }

    @Test
    public static void testMethod(){
        boolean basketballMan = true;
        Assert.assertFalse(basketballMan);
    }
    public void onTestStart(ITestResult result) {
        // not implemented
    }

    /**
     * Invoked each time a test succeeds.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS
     */
    public void onTestSuccess(ITestResult result) {
        // not implemented
        System.out.println("I miss her");
    }

    /**
     * Invoked each time a test fails.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#FAILURE
     */
    public void onTestFailure(ITestResult result) {
        // not implemented
        System.out.println("Failed execution from" + result.getName());
    }

    /**
     * Invoked each time a test is skipped.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SKIP
     */
    public void onTestSkipped(ITestResult result) {
        // not implemented
    }

    /**
     * Invoked each time a method fails but has been annotated with successPercentage and this failure
     * still keeps it within the success percentage requested.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
     */
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not implemented
    }

    /**
     * Invoked each time a test fails due to a timeout.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     */
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    /**
     * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
     * tag and calling all their Configuration methods.
     *
     * @param context The test context
     */
    public void onStart(ITestContext context) {
        // not implemented
    }

    /**
     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
     * run and all their Configuration methods have been called.
     *
     * @param context The test context
     */
    public void onFinish(ITestContext context) {
        // not implemented
    }
    /*Abstract Class*/
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
