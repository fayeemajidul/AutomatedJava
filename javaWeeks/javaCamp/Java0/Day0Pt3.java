import java.lang.Math;
public class Day0Pt3{
    //instance field
    public Day0Pt3(){} //constructor class
    public static void main(String[] args){
       // int highscore = calculateScore(true, 800, 5, 100);
        //calculateScore(true, 10000, 8, 200);
        // int highScorePosition = calculateHighScorePosition(1500);
        // displayHighScorePosition("Fayeem", highScorePosition);
        // highScorePosition = calculateHighScorePosition(900);
        // displayHighScorePosition("Bob", highScorePosition);
        // highScorePosition = calculateHighScorePosition(400);
        // displayHighScorePosition("Percy", highScorePosition);
        // highScorePosition = calculateHighScorePosition(50);
        // displayHighScorePosition("Gilbert", highScorePosition);
        // checkNumber(1);
        printConversion(0);
    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus ){
        if (gameOver){
            int finalScore = (score) + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was "  + finalScore);
        }
        return -1;
    }
    public static void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }else if(playerScore >= 100){
            return 3;
        }
            return 4;
    }
    public static void checkNumber(int number){
        if(number == 0){
            System.out.println("Equal to 0");
        }else{
            String isPositive = (number > 0) ? "Positive":"Negative";
            System.out.println(isPositive);
        }
    }
    /** Coding Challenges
     * Challenge: Speed Converter
     */
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour >= 0){
            double milesPerHour = (double)(kilometersPerHour / 1.609);
            long roundedNum = Math.round(milesPerHour);
            return roundedNum;
        }else{
            return -1;
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            double conversion = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h  = " + conversion + " mi/h" );
        }
    }
}