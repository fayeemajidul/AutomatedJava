package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class RestAssuredBasic implements WebDriver {
    /*
     * Rest Assured:
     * Given, When, Then --> Similar to Gherkin Syntax.
     * Given: All details given in contract (input details)
     * When --> Submit the API. Actions: response + http method.
     * Then --> Are just Validations using RestAssured + AssertThat
     * */
    static String placeID;
    static String placeAddress = "10102 Wakefield Road, USA";
    static SourceFile sourceFile = new SourceFile();
    @Test
    public static void addPlaceAPI(){
        String postBody = sourceFile.apiPostBody();
        //Validating addPlace with RestAssured Library.
        RestAssured.baseURI = "https://rahulshettyacademy.com";

        //Extracts the Response of the RestAPI:
        String statusResponse = given().queryParam("key","qaclick123").header("Content-Type","application/json").body(postBody).when().post("maps/api/place/add/json").then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server","Apache/2.4.41 (Ubuntu)").extract().asString();

        JsonPath extractJSON = new JsonPath(statusResponse);
        placeID = extractJSON.getString("place_id");
    }
    @Test
    public static void putPlaceAPI(){
        addPlaceAPI();
        baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\n" +
                "\"place_id\":\"" + placeID + "\",\n" +
                "\"address\":\"10102 Wakefield Road, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}\n").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
    }
    @Test
    public static void getPlaceAPI(){
        addPlaceAPI();
        putPlaceAPI();
        given().log().all().queryParam("key","qaclick123").queryParam("place_id",placeID).when().get("maps/api/place/get/json").then().log().all().assertThat().statusCode(200).body("address", equalTo(placeAddress));
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