package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicUtilization {
    RestAssured restAssured = new RestAssured();
    @Test(dataProvider = "bookData")
    public static void dynamicJSON(String name, String isbn, String aisle, String author){
        String responseApi = RestAssured.baseURI = "http://216.10.245.166";

        String statusResponse = given().log().all().header("Content-Type","application/json").body(JSONvalues.bookKeep(name, isbn, aisle, author)).when().post("/Library/Addbook.php").then().log().all().extract().response().asString();

        System.out.println(responseApi);

        JsonPath extractJSON = new JsonPath(statusResponse);
        String grabID = extractJSON.get("ID");
        System.out.println(grabID);
    }
    @DataProvider(name = "bookData")
    public Object[][] getData(){
        return new Object[][]{{"Harry Potter", "13412", "ABC", "J.K Rowling"},{"12 Rules of Life", "41441", "cd41", "Jordan Peterson"},{"Lady Midnight", "41309", "412z", "Cassandra Clarke"}};
    }
}