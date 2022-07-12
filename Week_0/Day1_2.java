import java.lang.Math;
public class Day1_2{
    //Instance Field
    public Day1_2(){} //Constructor Class
    /**__________________________________ */
    /** !!!!!!! MAIN METHOD BELOW !!!!!!! */
    /**__________________________________ */
    public static void main(String[] args){
        /** Challenge 8: Area Calculator Output */
        // area(5.0);
        // area(-1);
        // area(5.0,4.0);

        /* Challenge 9 */
       //printYearssAndDays(525600);

       /* Challenge 10 */
       printEqual(1, 1, 1);
       printEqual(1, 1, 2);
       printEqual(-1, -1, -1);
       printEqual(1, 2, 3);
    }
    /**__________________________________ */
    /** !!!!!!! MAIN METHOD ABOVE !!!!!!! */
    /**__________________________________ */

    public static double area(double radius){
        /* Area for Circle */
        if(radius > 0){
            double areaOfCircle = Math.PI * Math.pow(radius, 2);
            System.out.println(areaOfCircle);
            return areaOfCircle;
        }
        return -1;
    }
    public static double area(double x, double y){
        /* Area for Rectangle */
        if(x >= 0 && y >= 0){
            double areaOfRectangle = x * y;
            System.out.println(areaOfRectangle);
            return areaOfRectangle;
        }
        return -1;
    }
    public static void printEqual(int num1, int num2, int num3){
        if((num1 < 0) || (num2 <0) || (num3 < 0)){
            System.out.println("Invalid Value");
        }else if((num1 == num2 && num2 == num3)){
            System.out.println("All numbers are equal");
        }else if((num1 != num2) && (num1 != num3) && (num2 != num3)){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
}

