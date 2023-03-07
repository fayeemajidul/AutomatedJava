import java.util.Random;

public class SnakeLength{
    public static void main(String[] args){
        int snakeTotalLength = createRandomGeneratedNumber(); 
        System.out.println("Total Length of the Snake is " + snakeTotalLength);
    }
    public static int createRandomGeneratedNumber(){
        Random rand = new Random();
        return rand.nextInt(0,100);
    }
}