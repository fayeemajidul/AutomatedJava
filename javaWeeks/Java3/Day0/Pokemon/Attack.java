import java.util.Random;

public class Attack{
    //Should use energy as a form of move stability:
    //If energy is < 0
    private int strength; private int energy; private Health health;
    public Attack(int strength, int energy, Health health){
        this.strength = strength;
        this.energy = energy;
        }
    
    //Instance Methods:

    public Random RandomFunction(){
        Random rand = new Random();
        return rand;
    }
    public void specialMove1(){
        int hunger = health.getHunger();
        hunger -= 20;
        energy -=10;
        double criticalDamage = energyFunction();
        energyFunction();
        double strength = RandomFunction().nextInt(0,100) * criticalDamage;
        System.out.println("Pokemon used Special Move 1, it had a damage of " + strength);
    }
    public void specialMove2(){
        int hunger = health.getHunger();
        hunger -= 20;
        energy -=25;
        double criticalDamage = energyFunction();
        energyFunction();
        double strength = RandomFunction().nextInt(20,100) * criticalDamage;
        System.out.println("Pokemon used Special Move 2, it had a damage of " + strength);
    }
    public void specialMove3(){
        int hunger = health.getHunger();
        int healthBar = health.getHealth();
        health.feedMove();
        healthBar += 10;
        energy +=20;
        System.out.println("Pokemon used Special Move 3");
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
