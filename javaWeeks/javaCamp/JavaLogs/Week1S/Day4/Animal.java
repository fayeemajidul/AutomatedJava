public class Animal{
    private int brain, legs; private boolean organs;

    public Animal(int brain, int legs, boolean organs){
        this.brain = brain; 
        this.legs = legs;
        this.organs = organs;
    }

    //Getters
    public int getBrain() {
        return brain;
    }
    public int getLegs() {
        return legs;
    }
    public boolean getOrgans(){
        return organs;
    }
    public boolean isMammal(){
        boolean accessor = getOrgans();
        if(accessor = true){
            System.out.println("is a mammal");
            return true;
        }
        else{
            return false;
        }
    }

    public void isEating(){
        System.out.println("Animal has the ability to eat");
    }
    public void isMoving(){
        System.out.println("Animal has the functionality to move");
    }
}