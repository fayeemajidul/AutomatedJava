public class Health {
    //Instance Field:
    //Health Function controls the game: 
    //Hunger Adds to health, its the feed function
    //
    private int health = 100; private int hunger;

    //Default Constructor:
    public Health(){}
    public void feedFunction(){
        if(hunger <= 100){
            System.out.println("Can't feed Pokemon, your pokemon is already Full");
        }if(health < 20){
            while(health < 20){
                health--;
                death();
            }
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
}
