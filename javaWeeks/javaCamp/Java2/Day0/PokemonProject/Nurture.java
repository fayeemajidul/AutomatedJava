import java.util.Scanner;

public class Nurture extends Pokemon{
    //Instance Field
    //Constructor Field
    public Nurture(String name, int health, String elementType, int chemistry, int strength){
        super(name, health, elementType, chemistry, strength);

    }
    public void hunger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to feed your Pokemon:\n Type 1: for Burger \n Type 2: Energy Pills \n Type 3: Cooling Aloe");
        int foodSelected = scanner.nextInt();
        scanner.close();
        switch(foodSelected){
            case 1:
                System.out.println("You Chose Burger !");
                strength += 8;
                health += 5;
                chemistry += 2;
                break;
            case 2:
                System.out.println("You Chose Energy Pills!");
                health += 2;
                chemistry += 10;
                strength += 3;
                
            case 3:
                System.out.println("You Chose Cooling Aloe");
                health += 10;
                strength += 2;
                chemistry += 3;
        }
    }@Override
    public void userProfile() {
        super.userProfile();
        hunger();
        System.out.println("Updated User Profile");
        super.userProfile();
    }
}