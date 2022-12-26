package org.example;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.commons.collections.MapUtils;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.*;


public class RestPractice {
    @Test
    public void grabDetails(){
        HashMap<String, String> output = new HashMap<>();
        RestAssured.baseURI = "https://api.openbrewerydb.org/breweries";
        Response response = given().queryParams("by_city","brooklyn").queryParam("per_page","50").when().get().then().extract().response();
        String body = response.getBody().asPrettyString();
        Headers headers = response.getHeaders();

        JsonPath jsonPath = new JsonPath(body);
        int sizeOfJSON = jsonPath.getInt("jsonPath.size()");
        for(int i = 0; i < sizeOfJSON; i++){
            String State = jsonPath.getString("state [" + i + "]");
            String ID = jsonPath.getString("id[" + i + "]");
            if(State.equalsIgnoreCase("New York")){
                output.put(ID, State);
            }

        }
        MapUtils.debugPrint(System.out, "Brewery", output);
        System.out.println(output);
    }
}
