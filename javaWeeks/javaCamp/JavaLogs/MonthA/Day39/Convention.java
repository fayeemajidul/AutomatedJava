import java.util.Random;

public class Convention{
    public static void main(String[] args){
        System.out.println("Naming conventions");
        createRandomString();
        System.out.println("Reverse");
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
    }
}
