import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    //Instance Field
    private String name;
    private String weapon;
    int hitPoints;
    int strength;
    //Constructor Class
    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    //Accessor Methods:
    public int getHitPoints() {
        return hitPoints;
    }
    public String getName() {
        return name;
    }
    public int getStrength() {
        return strength;
    }
    public String getWeapon() {
        return weapon;
    }

    //Mutator Methods:
    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }public void setName(String name) {
        this.name = name;
    }public void setStrength(int strength) {
        this.strength = strength;
    }public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    //Overide
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
    @Override
    public List <String> write(){
        List<String> values = new ArrayList<String>();
        values.add(this.name);
        values.add(1,"" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3,"" + this.weapon);

        return values;
    }
    @Override
    public void read(List <String> savedValues){
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
