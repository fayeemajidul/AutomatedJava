package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class RestAssuredBasic {
    /*
     * Rest Assured:
     * Given, When, Then --> Similar to Gherkin Syntax.
     * Given: All details given in contract (input details)
     * When --> Submit the API. Actions: response + http method.
     * Then --> Are just Validations using RestAssured + AssertThat
     * */
    @Test
    public static void addPlaceAPI(){
        SourceFile sourceFile = new SourceFile();
        String postBody = sourceFile.apiPostBody();

        //Validating addPlace with RestAssured Library.
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(postBody).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP")).header("Server","Apache/2.4.41 (Ubuntu)");

    }
    public static void main(String[] args) {
    }
}