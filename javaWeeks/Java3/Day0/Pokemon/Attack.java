import java.util.Random;

public class Attack{
    //Should use energy as a form of move stability:
    //If energy is < 0
    private int strength; private int energy; private Health health;
    public Attack(int strength, int energy, Health health){
        this.strength = strength;
        this.energy = energy;
        this.health = health;
        }
    
    //Instance Methods:

    public Random RandomFunction(){
        Random rand = new Random();
        return rand;
    }
    public void specialMove1(){
        if(energyDepleted() && health.getHunger() < 5){
            System.exit(0);
        }else{
            int hunger = health.getHunger();
            hunger -= 20;
            energy -=10;
            double criticalDamage = energyFunction();
            energyFunction();
            double strength = RandomFunction().nextInt(0,100) * criticalDamage;
            System.out.println("Pokemon used Special Move 1, Move 1 had a damage of " + strength);
        }
    }
    public void specialMove2(){
        if(energyDepleted() && health.getHunger() < 5){
            System.exit(0);
        }
        else{
            int hunger = health.getHunger();
            hunger -= 20;
            energy -=25;
            double criticalDamage = energyFunction();
            energyFunction();
            double strength = RandomFunction().nextInt(20,100) * criticalDamage;
            System.out.println("Pokemon used Special Move 2, Move 2 had a damage of " + strength);
        }
    }

    public void specialMove3(){
        int hunger = health.getHunger();
        int healthBar = health.getHealth();
        health.feedMove();
        healthBar += 10;
        energy +=20;
        System.out.println("Pokemon used Special Move 3\nYour hunger is now: " + hunger + "\nYour energy is: " + energy);
    }
    
    public boolean energyDepleted(){
        /** Stops Program if energy = 0 */
        boolean energyDepleted = false;
        if(energy < 5){
            System.out.println("Your Pokemon has Fainted");
            energyDepleted = true;
            return energyDepleted;
        }
        return energyDepleted;
    }

    public double energyFunction(){
        /** Function Creates Critical Damage Returns it and Adds it to Damage Function */
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