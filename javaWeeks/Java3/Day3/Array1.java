import java.util.Arrays;
import java.util.Scanner;

public class Array1{
    //Instance Field:
    //Constructor:
    public Array1(){}
    /* This Array Stores the List of Values */
    public static double [] dailyTempAverages(int numOfDays){
        double [] dailyTemperatures = new double [numOfDays];
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the temperatures for this week. \r");
        for(int i = 0; i < dailyTemperatures.length; i++){
            dailyTemperatures[i] = input.nextDouble();
            System.out.println("Day " + (i+1) + " = " + dailyTemperatures[i]);
        }
        System.out.println(Arrays.toString(dailyTemperatures));
        return dailyTemperatures;
    }
    public static int daysOverAverage(int numOfDays){
        double [] dayArray = dailyTempAverages(numOfDays);
        double average = 0;
        int dayAbove = 0;

        for(int i = 0; i < dayArray.length; i++){
            // Gets Average
            average = average += dayArray[i];
        }
        average = (double)(average)/(double)(dayArray.length);

        for(int i = 0; i < dayArray.length; i++){
            if(dayArray[i] > average){
                dayAbove++;
            }
        }
        System.out.println(average);
        System.out.println(dayAbove);
        return dayAbove;
    }
    public static void main(String[] args){
        daysOverAverage(7);
    }
}