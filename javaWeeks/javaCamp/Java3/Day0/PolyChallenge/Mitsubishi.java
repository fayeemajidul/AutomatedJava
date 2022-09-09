package PolyChallenge;
public class Mitsubishi extends Car{
    public Mitsubishi(int cylinder, String name){
        super(cylinder, name);
    }
    @Override
    public void startEngine(){
        System.out.println("Mitsubishi -> startEngine()");
    }
    @Override
    public void accelerate(){
        System.out.println("Mitsubishi -> accelerate()");
    }
    @Override
    public void brake(){
        System.out.println("Mitsubishi -> brake()");
    }
}
