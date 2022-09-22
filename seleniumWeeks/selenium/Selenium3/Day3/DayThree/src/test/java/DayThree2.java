import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DayThree2 {
    public static void main(String[] args){
        System.out.println("Hello world");
    }
    @Test
    public void ploan(){
        System.out.println("This is the sign up page");
    }
    @BeforeTest
    public void preRequisite(){
        System.out.println("I will execute first");
    }
}
