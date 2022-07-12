public class Day1{
    //Instance Field
    public Day1(){} //Constructor Class
    public static void main(String[] args){
        /** Challenge 2 Output */
        // printMegaBytesAndKiloBytes(2500);
        // printMegaBytesAndKiloBytes(-1024);
        // printMegaBytesAndKiloBytes(5000);

        /** Challenge 3 Output */
        //System.out.println(shouldWakeUp(true, 44));

        /** Challenge 4 Output */
        //System.out.println(isLeapYear(2400));

        /** Challenge 5 Output */
        System.out.println(areEqualByThreeDEcimalPlaces(-3.123, 3.123));
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        /** CHALLENGE 2
         * Converts Kilobytes to Megabytes
         */
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else if(kiloBytes >= 0){
            int megabytes = kiloBytes/1024;
            int remainingKB  = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megabytes + "MB and " + remainingKB + " KB.");
        }
    }
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        /** CHALLENGE 3 
         * Function returns true if dog barks
        */
        if(isBarking){
            isBarking = (hourOfDay < 8 || hourOfDay > 22)? true:false;
            if(hourOfDay < 0 || hourOfDay > 23){
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year%4 == 0){
                if(year%100==0){
                    if(year%400==0){
                        return true;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    public static boolean areEqualByThreeDEcimalPlaces(double num1, double num2){
        num1 = (int)((num1)*1000);
        num2 = (int)((num2)*1000);
        boolean isEqual = (num1 == num2)? true:false;
        if(isEqual){
            return true;
        }else{
            return false;
        }
    }
}