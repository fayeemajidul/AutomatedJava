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
        // System.out.println(areEqualByThreeDEcimalPlaces(-3.123, 3.123));

        /** Challenge 6 Output */
        //System.out.println(hasEqualSum(1, -1, 0));

        /**Challenge 7 Output */
        // System.out.println(hasTeen(22, 23, 34));

        /* METHOD OVERLOADING */
        // calculateScore("Fayeem", 100);
        // calculateScore(75);
        int centimeterCalculated = (int) calcFeetAndInchesToCentimeters(5, 8);
        calcFeetAndInchesToCentimeters(centimeterCalculated);
        calcFeetAndInchesToCentimeters(100);

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
        //** Challenge 4: input year, tells you if it's a leap */
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
        /** Challenge 5: Equal 3 decimals to see if true/false */
        num1 = (int)((num1)*1000);
        num2 = (int)((num2)*1000);
        boolean isEqual = (num1 == num2)? true:false;
        if(isEqual){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasEqualSum(int num1, int num2, int sum){
        /** Challenge 6: Sum Verifier */
        boolean isSum = ((num1 + num2) == sum)? true:false;
        if(isSum){
            return true;
        }else{
            return false;
        }
    }
    public static boolean hasTeen(int teenOne, int teenTwo,int teenThree){
        /** Challenge 7: Has Teen */
        if((teenOne >= 13 && teenOne <= 19) || (teenTwo >= 13 && teenTwo <= 19) ||(teenThree >= 13 && teenThree <= 19)){
            return true;
        }else{
            return false;
        }
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("player " + "Unnamed Player scored " + score + " points");
        return score * 1000; 
    }
    public static int calculateScore(){
        System.out.println("No player, no player score ");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inch){
        boolean isFeet = (feet >= 0)? true:false;
        boolean isInches = (inch >=0 && inch <=12)? true:false;
        if(isFeet || isInches){
            double totalCenti = (feet*12)*2.54;
            totalCenti += (inch*2.54);
            System.out.println(feet + " feet " + inch + " inch " + totalCenti + " centimeters");
            return totalCenti;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(int inch){
        boolean isInches = (inch >=0)? true:false;
        if(isInches){
            int feet = (int)(inch/12);
            int remainingInches = (int)inch%12;
            System.out.println(inch + " inches:  " + feet + " feet & " + remainingInches + " inch");
            return calcFeetAndInchesToCentimeters(feet, inch);
        }
        return -1;
    }
}