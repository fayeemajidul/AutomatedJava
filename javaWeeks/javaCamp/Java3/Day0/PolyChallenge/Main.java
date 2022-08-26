package PolyChallenge;
public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}
    public static void main(String[] args) {
        Car Car = new Car(8, "Base car");
        Car.startEngine();
        Car.accelerate();
        Car.brake();
         
        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
         
        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();
         
        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}