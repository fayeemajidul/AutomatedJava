import java.util.Random;

public class Convention{
    public static void main(String[] args){
        System.out.println("Naming conventions");
        createRandomString();
        System.out.println("Reverse");
        System.out.println("Will it break?");
        System.out.println("Even more break?");

    }
    public static void createRandomString(){
        Random rand = new Random();
        // System.out.println("Testing the environment + your age is : " + age);
        int age = 0;

        while(age != 21){
            System.out.println(age + "is not your age");
            age++;
            if(age == 21){
                break;
            }
        }
        for(int i = 0 ; i < 4; i++){
            System.out.println("Loopty loop");
        }
        int count  = 0;
        do{
            System.out.println("Testing the environment");
            count++;
        }while(count != 5);
    }
}
