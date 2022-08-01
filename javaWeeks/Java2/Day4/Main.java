public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}
    public static void main(String[] args){
        EnhancedPlayer newPlayer = new EnhancedPlayer("Fayeem", 50, "Deez nuts");
        System.out.println(newPlayer.getHealth());
        newPlayer.loseHealth(100);
        // Player player = new Player();
        // player.name = "Fayeem";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining Health = " + player.healthRemaining());

        // damage = 11;
        // player.loseHealth(damage);
        // System.out.println("Remaining Health = " + player.healthRemaining());
    }
}