package org.example;

import io.restassured.path.json.JsonPath;

public class SourceFile {
    public String apiPostBody(){
        return"""
                {
                  "location": {
                    "lat": -38.383494,
                    "lng": 33.427362
                  },
                  "accuracy": 50,
                  "name": "Fayeems house",
                  "phone_number": "(+91) 983 893 3937",
                  "address": "29, side layout, cohen 09",
                  "types": [
                    "shoe park",
                    "shop"
                  ],
                  "website": "http://google.com",
                  "language": "French-IN"
                }
                """;
    }
    public String apiPutBody(){
        return """
                {
                "place_id":"c3d6756f83599c4f716e1c32f43db8b7",
                "address":"10102 Wakefield Road, USA",
                "key":"qaclick123"
                }
                """;
    }
    public JsonPath rawToJSON(String response){
        return new JsonPath(response);
    }
    public static String apiContract(){
        return """
                {

                "dashboard": {

                "purchaseAmount": 910,

                "website": "rahulshettyacademy.com"

                },

                "courses": [

                {

                "title": "Selenium Python",

                "price": 50,

                "copies": 6

                },

                {

                "title": "Cypress",

                "price": 40,

                "copies": 4

                },

                {

                "title": "RPA",

                "price": 45,

                "copies": 10

                }

                ]

                }""";
    }

}
