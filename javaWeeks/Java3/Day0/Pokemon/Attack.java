import java.util.Random;

public class Attack{
    //Should use energy as a form of move stability:
    //If energy is < 0
    private int strength; private int energy;
    public Attack(int strength, int energy){
        this.strength = strength;
        this.energy = energy;
        }
    public Random RandomFunction(){
        Random rand = new Random();
        return rand;
    }
    public void specialMove1(){
        energy -=10;
        double criticalDamage = energyFunction();
        energyFunction();
        double attackDamage = RandomFunction().nextInt(0,100) * criticalDamage;
        System.out.println("Pokemon used Special Move 1, it had a damage of " + attackDamage);
    }
    public void specialMove2(){
        energy -=20;
        double criticalDamage = energyFunction();
        energyFunction();
        double attackDamage = RandomFunction().nextInt(0,100) * criticalDamage;
        System.out.println("Pokemon used Special Move 2, it had a damage of " + attackDamage);
    }
    public double energyFunction(){
        if(energy >= 85){
            //Create an attack critical bonus of 10%
            double criticalDamage  = 1.10;
            return criticalDamage;
        }else if(energy < 25){
            double criticalDamage = .65;
            return criticalDamage;
        }
        return -1;
    }
}


//Finished Attack Function Just need to add a hunger component to increase Energy:
//In order to do that I need to play with the Health function:
//Work on health function after break health shoudl directly affect the energy function in this file
//First create a hunger function on health to then implement on energy