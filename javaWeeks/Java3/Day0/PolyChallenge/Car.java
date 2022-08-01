package PolyChallenge;
public class Car{
    //Instance Field:
    private boolean engine = true; private int cylinder; private String name; private int wheels = 4;

    //Constructor
    public Car(){
        this(0, "No Name");
    }
    public Car(int cylinder, String name){
        this.cylinder = cylinder;
        this.name = name;
    }
    //Instance Methods:
    public void startEngine(){
        System.out.println("Car -> startEngine()");
    }
    public void accelerate(){
        System.out.println("Car -> accelerate()");
    }
    public void brake(){
        System.out.println("Car -> brake()");
    }
    //Getters
    public int getCylinder() {
        return cylinder;
    }
    public String getName() {
        return name;
    }
}