package PolyChallenge;
public class Ford extends Car{
    public Ford(int cylinder, String name){
        super(cylinder, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Ford -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println("Ford -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println("Ford -> brake()");
    }
}