package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class OAuthAuthentication implements WebDriver {
    /*How to Automate with OAuth2.0 -- You need access token to retrieve the JSON file.

    * Connect user portal with googleAccounts portal
    * Google will send ClientCode
    * Application will use this code to authenticate google connection.
    * Allows you to retrieve: Access Token, First Name, Last Name, Email.
    *
    * \*/
    static String currentURL;
    static String parseCode;

    @Test
    public static void seleniumGrabURL() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/fayeemmooktadeer/Desktop/Grid/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com/o/oauth2/v2/auth/identifier?scope=https%3A%2F%2Fwww.googleapis.com%2Fauth%2Fuserinfo.email&auth_url=https%3A%2F%2Faccounts.google.com%2Fo%2Foauth2%2Fv2%2Fauth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php&service=lso&o2v=2&flowName=GeneralOAuthFlow");
        driver.findElement(By.id("identifierId")).sendKeys("fayeemtests@gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("Fayeem123456!");
        driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
        currentURL = driver.getCurrentUrl();
        parseCode = currentURL.split("code=")[1].split("&")[0];
    }

    @Test(dependsOnMethods = "seleniumGrabURL")
    public static void learningOAuth() {

        String accessTokenResponse = given().log().all().urlEncodingEnabled(false).queryParams("code", parseCode).queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").queryParams("client_secret","").queryParams("redirect_uri","https%3A%2F%2Frahulshettyacademy.com%2FgetCourse.php").queryParam("grant_type","authorization_code").when().log().all().get("https://www.googleapis.com/oauth2/v4/token").asString();

        JsonPath extractToken = new JsonPath(accessTokenResponse);
        String accessToken = extractToken.getString("access_token");

        String response = given().log().all().queryParam("access_token", accessToken).when().log().all().post("https://rahulshettyacademy.com/getCourse.php").asString();

        System.out.println(response);

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
