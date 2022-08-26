import java.util.Scanner;

public class Vehicle{
    //Instance Field:
    boolean movement; int speed; boolean isCar;
    //Constructor Method:
    //____________________________//

    public Vehicle(){
        //Default Constructor:
        this(0);
    }
    public Vehicle(int speed){
        this.speed = speed;
    }
    //____________________________//
    //Accessor Methods:
    public void steering(boolean movement){
        if(speed > 0){
            this.movement = true;
        }else{
            this.movement = false;
        }
    }
    public boolean isCar(boolean isCar){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you in a car?");
        String userInput = scanner.nextLine();
        boolean maybeCar = userInput.toLowerCase().equals("yes")? true:false;
        scanner.close();
        return maybeCar;
    }
}