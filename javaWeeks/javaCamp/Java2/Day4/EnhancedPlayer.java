public class EnhancedPlayer{
    //Instance Field:
    private String name;
    private int health = 100;
    private String weapon;
    //Constructor Field:
    public EnhancedPlayer(String name, int health, String weapon){
        this.name = name;
        if(health > 0 && health <= 100){
            this.health = health;
        }
        this.weapon = weapon;
    }
    //Instance Methods:
    public void loseHealth(int damage){
        this.health = health - damage;
        if(this.health <=0){
            System.out.println("Player is knocked out");
            //Reduce the number of lives remaining for player
        }
    }
    //Getter Methods:
    public int getHealth() {
        return health;
    }
    public String getWeapon() {
        return weapon;
    }
    public String getName() {
        return name;
    }
}