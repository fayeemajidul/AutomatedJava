import java.util.Random;

public class Hexadecimal {
    public static void main(String[] args){
        generateRandomNumber();
    }
    public static int generateRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(0,100);
    }
    public static void turnNumberToBinary(){
        int randNum = generateRandomNumber();
        System.out.println(randNum);
    }
}
