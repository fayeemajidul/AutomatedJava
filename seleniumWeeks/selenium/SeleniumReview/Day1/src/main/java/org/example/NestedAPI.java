package org.example;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NestedAPI {
    public static void nestedAPILearning(){
        JsonPath extractParse = new JsonPath(SourceFile.apiContract());
        int numOfCourses = (extractParse.getInt("courses.size()"));
//        System.out.println(numOfCourses);
        int purchasedAmount = (extractParse.getInt("dashboard.purchaseAmount"));
//        System.out.println(purchasedAmount);
        String nameOfCourseTitle1 = extractParse.getString("courses[0].title");
        String nameOfCourseTitle2 = extractParse.getString("courses[1].title");
        String nameOfCourseTitle3 = extractParse.getString("courses[2].title");
//        System.out.println(nameOfCourseTitle1 + " " + nameOfCourseTitle2 + " " + nameOfCourseTitle3);
        for(int i = 0; i < numOfCourses; i++){
            String extractTitle = extractParse.getString("courses["+ i + "].title");
            int extractPrice = extractParse.getInt("courses[" + i + "].price");
            System.out.println(extractTitle);
            System.out.println(extractPrice);
            if(extractTitle.contentEquals("RPA")){
                int extractCopies = extractParse.getInt("courses[" + i + "].copies");
                System.out.println(" RPA Copies: " + extractCopies);
                break;
            }
        }
        int sumOfCourse = 0;
        for(int i = 0; i < numOfCourses; i++){
            //Add Price + Copies and Store into Accumulator:
            int priceOfCourse  = extractParse.getInt("courses[" + i + "].price");
            int extractCopies = extractParse.getInt("courses[" + i + "].copies");
            sumOfCourse += (priceOfCourse * extractCopies);
        }
        Assert.assertEquals(sumOfCourse, purchasedAmount);

    }
}
