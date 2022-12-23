import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;

public class GrabAPIreq {
    @Test
    public void APIBackend(){
        RestAssured.baseURI = "https://api.openbrewerydb.org/breweries";
        String responsebody = given().queryParam("by_city","brooklyn").queryParams("per_page","50").when().get().body().asPrettyString();
//        System.out.println(responsebody);
        ArrayList <String> listOfBreweryInBrooklyn = new ArrayList<>();

        JsonPath jsReader = new JsonPath(responsebody);
        int sizeOfJson = jsReader.getInt("JsReader.size()");
        for(int i = 0; i < sizeOfJson; i++){
            String getState = jsReader.getString("state[" + i + "]");
            if(getState.equalsIgnoreCase("New York")){
                listOfBreweryInBrooklyn.add(jsReader.getString("name["+  i + "]"));
            }
        }
        System.out.println(listOfBreweryInBrooklyn);
    }
}

//Validate a piece of Data
