package PolyChallenge;
public class Holden extends Car{
    public Holden(int cylinder, String name){
        super(cylinder, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Holden -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println("Holden -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println("Holden -> brake()");
    }
}