import java.util.Random;

public class puzzle{
    public static void main(String[] args){
        System.out.println("testing the environment");
        creatingTheArray();
    }

    public static void creatingTheArray(){
        Random rand = new Random();
        for(int i = 0; i < 10; i++){
            System.out.println(rand.nextInt(0,100));
        }
    }
}