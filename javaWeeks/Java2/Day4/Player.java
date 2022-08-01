public class Player {
    //Instance Field
    public String fullName;
    public int hipPoints;
    public String weapon;
    //Instance Field:
    public void loseHealth(int damage){
        this.hipPoints = hipPoints - damage;
        if(this.hipPoints <=0){
            System.out.println("Player is knocked out");
            //Reduce the number of lives remaining for player
        }
    }
    public int healthRemaining(){
        return this.hipPoints;
    }

}
