package Pokemon;
public class Health {
    //Instance Field:
    //Health Function controls the game: 
    //Hunger Adds to health, its the feed function
    //
    private int health = 100; private int hunger = 100;

    //Default Constructor:
    public Health(){}

    // Instance Methods:
    public void feedFunction(){
        if(hunger <= 100){
            System.out.println("Can't feed Pokemon, your pokemon is already Full");
        }if(health < 20){
            while(health < 20){
                //This should decrease every round by 5
                health-=5;
                death();
            }
        }
    }
    public void feedMove(){
        if(hunger < 100){
            System.out.println("You Chose To Feed Your Pokemon!");
            int differenceBetweenHunger = 100 - hunger;
            hunger += differenceBetweenHunger;
        }
    }
    public void death(){
        //There should be two ways to die
        //1 Form hunger and one from Health
        if(hunger == 0){
            System.out.println("Your Pokemon has died from Hunger");
        }else if(health == 0){
            System.out.println("Your Pokemon has died from Battle");
        }
    }
    //Getters:
    public int getHealth() {
        return health;
    }
    public int getHunger() {
        return hunger;
    }
}
