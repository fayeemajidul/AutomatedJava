import JsonBody.JsonB;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;

public class RestJava {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("""
                {
                  "location": {
                    "lat": -38.383494,
                    "lng": 33.427362
                  },
                  "accuracy": 50,
                  "name": "Fayeem Crib",
                  "phone_number": "(1) 646 323 0222",
                  "address": "Omaha, New York, 1109",
                  "types": [
                    "Shoppity Shop",
                    "The dawgs"
                  ],
                  "website": "http://google.com",
                  "language": "English-IN"
                }""").when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200);
    }

    @Test
    public static void PostMapAPI() {
        RestAssured.baseURI = ("https://rahulshettyacademy.com");
        //Extracts the Entire Body of RestAPI.

        String responseLog = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(JsonB.AddPlace()).when().post("maps/api/place/add/json").then().assertThat().statusCode(200).body("scope", equalTo("APP")).extract().response().asString();

        //From Body --> Extracting Pieces of JSON:
        JsonPath jsonReader = new JsonPath(responseLog);
        String placeID = jsonReader.getString("place_id");

        RestAssured.baseURI = ("https://rahulshettyacademy.com");


        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").body("{\n" +
                "\"place_id\":\"" + placeID + ",\n" +
                "\"address\":\"70 Summer walk, USA\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}").when().put("maps/api/place/update/json").then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

    }
    //Different types of Methods:
    /*
    Cucumber Syntax.
    * Given - giving details
    * When - submit the API -- resource + http method
    * Then - Validation.
    * */
}
