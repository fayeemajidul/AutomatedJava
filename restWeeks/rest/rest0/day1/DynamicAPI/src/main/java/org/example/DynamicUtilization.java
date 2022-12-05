package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class DynamicUtilization {
    RestAssured restAssured = new RestAssured();
    static String uniqueId;
    static SessionFilter session = new SessionFilter();
    @Test(dataProvider = "bookData")
    public static void dynamicJSON(String name, String isbn, String aisle, String author){
        String responseApi = RestAssured.baseURI = "http://216.10.245.166";

        String statusResponse = given().log().all().header("Content-Type","application/json").body(JSONvalues.bookKeep(name, isbn, aisle, author)).when().post("/Library/Addbook.php").then().log().all().extract().response().asString();

        System.out.println(responseApi);

        JsonPath extractJSON = new JsonPath(statusResponse);
        String grabID = extractJSON.get("ID");
        System.out.println(grabID);

        //Logic for parsing Json and Looping Json
        int sizeOfBookList = extractJSON.getInt("books.size()");
        for(int i = 0; i < sizeOfBookList; i++){
            String getTitleOfBook = extractJSON.getString("[" + i + "].bookName"); //Grabs title for book.
            if(getTitleOfBook.equalsIgnoreCase("Harry Potter")){
                String getAisleNum = extractJSON.getString("Aisle");
                break;
            }
        }
    }
    @DataProvider(name = "bookData")
    public Object[][] getData(){
        return new Object[][]{{"Harry Potter", "13412", "ABC", "J.K Rowling"},{"12 Rules of Life", "41441", "cd41", "Jordan Peterson"},{"Lady Midnight", "41309", "412z", "Cassandra Clarke"}};
    }

    @Test
    public static void restJiraAuthentication(){
        baseURI = "http://localhost:8080";
        String jiraUniqueID = given().header("Content-Type", "application/json").body("{ \"username\": \"fayeemtests\", \"password\": \"Fayeem123456!\" }").log().all().filter(session).when().post("/rest/auth/1/session").then().extract().response().asString();

        JsonPath extractUniqueID = new JsonPath(jiraUniqueID);
        uniqueId = extractUniqueID.getString("session.value");
    }

    @Test
    public static void addCommentToJira(){
        restJiraAuthentication();
        baseURI = "http://localhost:8080";
        given().log().all().pathParam("key", "10101").header("content-type","application/json").body("""
                {
                    "body": "This is my first comment that only administrators can see.",
                    "visibility": {
                        "type": "role",
                        "value": "Administrators"
                    }
                }""").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201);

    }
    @Test
    public static void addAttachmentJIRA(){
        File file = new File("//dummy_path.txt");
        baseURI = "http://localhost:8080";
        given().log().all().header("X-Atlassian-Token", "no-check").filter(session).header("Content-Type","multipart/form-data").pathParam("key", "10101").multiPart(file).when().post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);
    }
    @Test
    public static void getIssuesValue(){
        baseURI = "http://localhost:8080";
        //Getting the Issue

        //Path gives entire JSON details, we boiled it down using filtration of QueryParameters
        String issueDetails = given().filter(session).pathParam("key", "1010").queryParam("fields", "comment").when().get("/rest/api/2/issue/{key}").then().log().all().extract().response().asString();

    }

    @Test(dataProvider = "ProvideData")
    public static void runDataProvider(String nameOfArray, String valueOfArray){
        System.out.println(nameOfArray + valueOfArray);

    }
    @DataProvider(name = "ProvideData")
    public static Object[][] provideDataSample(){
        return new Object[][]{{"Array1", "Values"},{"Array2", "Values"}};
    }
}