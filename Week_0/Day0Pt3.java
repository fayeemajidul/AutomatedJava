public class Day0Pt3{
    //instance field
    public Day0Pt3(){} //constructor class
    public static void main(String[] args){
       // int highscore = calculateScore(true, 800, 5, 100);
        //calculateScore(true, 10000, 8, 200);
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Fayeem", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);


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
        }else if(playerScore >= 500 && playerScore < 1000){
            return 2;
        }else if(playerScore >= 100 && playerScore < 500){
            return 3;
        }else{
            return 4;
        }
    }
}