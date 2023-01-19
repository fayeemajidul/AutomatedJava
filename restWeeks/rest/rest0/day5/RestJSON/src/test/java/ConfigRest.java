import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ConfigRest {
    public static void configureApiReq(){
        RestAssured.baseURI = "https://api.openbrewerydb.org/breweries";
        given().queryParam("","").get().then().assertThat().statusCode(401);
    }

    public static void main(String[] args){
        System.out.println("Testing the environment");

    }
}

