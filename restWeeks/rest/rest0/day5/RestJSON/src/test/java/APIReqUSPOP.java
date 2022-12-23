import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class APIReqUSPOP {
    /*
    * You Imported:
    *
    * RestAssured --
    * Hamcrest --
    * JsonPath --
    *
    * */
    @Test
    public void grabAPIdata(){
        baseURI = "https://datausa.io/api/data";
        String formattedData = given().queryParam("drilldowns","Nation").queryParams("measures","Population").when().get().body().asPrettyString();

        System.out.println(formattedData);
        JsonPath dataSerialization = new JsonPath(formattedData);
        int sizeOfJSON = dataSerialization.getInt("data.size()");
        for(int i = 0; i < sizeOfJSON; i++){
            String getPopulation = dataSerialization.getString("data[" + i + "].Population");
            System.out.println(getPopulation);
        }
    }
}
