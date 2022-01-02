import java.util.Random;

public class HexGenerator{
    public static void main(String[] args){
        giveMeHexNums();
    }
    public static void giveMeHexNums(){
        Random rand = new Random();
        int randomNum = rand.nextInt(0,100);
        System.out.println(randomNum);
    }
}