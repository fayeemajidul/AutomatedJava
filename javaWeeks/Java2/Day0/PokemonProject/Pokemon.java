import java.util.Random;
import java.util.Scanner;
public class Pokemon{
    //Instance Field:
    static String name; int health; String elementType; int strength; int chemistry;

    //Constructor Method:
    public Pokemon(){
        this("Unnamed Pokemon", 0, "default element", 0, 0);
    }
    public Pokemon(String name, int health, String elementType, int chemistry, int strength ){
        this.health = health;
        this.elementType = elementType;
        this.chemistry = chemistry;
        this.strength = strength;
    }

    //GUI; for User Profiel

    public void userProfile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Choose the element for your Pokemon: Earth, Lightning, Fire, Water");
        this.elementType = scanner.nextLine();
        elementType();
        for(int i = 0; i < 10; i++){
            System.out.print("-");
        }
        System.out.println(" \n\t\t/ User Stats / \n" + "Pokemon Name: " + name);
        System.out.println("Health: " + this.health);
        System.out.println("Element Type: " + this.elementType);
        System.out.println("Chemistry: " + this.chemistry);
        for(int i = 0; i < 10; i++){
            System.out.print("-");
        }
        scanner.close();
    }
    //Getter Function
    public int arbitraryValue(){
        Random rand = new Random();
        int randomValue = rand.nextInt(0,100);
        return randomValue;
    }

    //Accessors: Mutation Methods:
    public void attackFunction(){
        Random rand = new Random();
        this.strength = rand.nextInt(0,100);
        System.out.println(name + " default strength has been updated to " + strength);
    }
    public void elementType(){
        int randomValue = arbitraryValue();
        switch(elementType.toLowerCase()){
            case "lightning":
            this.chemistry = randomValue;
            break;

            case "earth":
            this.chemistry = randomValue;
            break;

            case "fire":
            this.chemistry = randomValue;
            break;

            case "water":
            this.chemistry = randomValue;
            break;
        } 
    }
}