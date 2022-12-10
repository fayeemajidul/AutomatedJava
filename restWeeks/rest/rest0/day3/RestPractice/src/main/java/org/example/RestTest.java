package org.example;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RestTest {
    public void creatBooking(){
        //Getting Response -- Logs The Response.
        //Response response  = given().get("https://restful-booker.herokuapp.com/booking").then().log().all().extract().response();

        //Test 1: Grab response:
        Response response  = given().get("https://restful-booker.herokuapp.com/booking").then().extract().response();

        //Test 2: Get Headers:
        Headers header = given().get("https://restful-booker.herokuapp.com/booking").getHeaders();
        System.out.println(header);


        //Test 3: Assert if Header is there in response.

        Headers keyValue = response.getHeaders();
        for(Header singleHeader : keyValue){
            String headerName = singleHeader.getName();
            String headerValue = singleHeader.getValue();

            Assert.assertEquals(response.getHeader(headerName),headerValue);


            System.out.println(singleHeader.getName() + ":" + singleHeader.getValue());
        }

        //Test 4: Add Headers to response type:
        Header putNewHeader = new Header("Preference","Women");

        RestAssured.given().header("Preference","Women");

    }
}