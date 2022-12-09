package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;



public class RestAssuredReview {
    @Test
    public static void runAutomationSuite(){
        RestAssured.baseURI = "http://216.10.245.166";
        String extractID = given().log().all().headers("Content-Type","application/json").body("""
                {
                "name":"Great See4s with Rahul",
                "isbn":"3144ef141k",
                "aisle":"4111",
                "author":"Rahul D3eez"
                }""").when().post("Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath gettingID = new JsonPath(extractID);
        String ID = gettingID.getString("ID");
        System.out.println(ID);
    }
}