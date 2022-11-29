import java.util.Random;

public class PokemonWorld {
    private String userName;
    private int stamina;
    private String elementType;
    private int health;
    Pokemon pokemon = new Pokemon();

    public PokemonWorld(String userName, int stamina){
        this.health = 100;
        this.userName = userName;
        if(stamina > 100){
            this.stamina = 100;
        }else if(stamina <= 0){
            this.stamina = 100;
        }else{
            this.stamina = 100;
        }
    }
    /**
     *
     * Getter and Setters
     */

    public String getElementType() {
        return elementType;
    }
    public int getStamina() {
        return stamina;
    }
    public String getUserName() {
        return userName;
    }
    public void setElementType(String elementType) {
        this.elementType = elementType;
    }
    public int getHealth() {
        return health;
    }

    public void determineElementType(){ 
        //Randomizes Element:

        Random rand = new Random();
        switch(rand.nextInt(1,5)){
            case 1:        
                setElementType("Water");                       
            case 2:
                setElementType("Fire");                       
            case 3:
                setElementType("Earth");                       
            case 4:
                setElementType("Lightning");                       
            case 5:
                setElementType("Wind");                       
        }
    }

    public void returnUserPortfolio(){
        health = getHealth();
        determineElementType();
        elementType = getElementType();
        userName = getUserName();
        System.out.println("Name : " + userName + "\nElement: " + elementType +"\nStamina: " + stamina + "\nHealth: " + health);
    }

}
