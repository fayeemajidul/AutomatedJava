
public class Trainers {
    //* purpose of the trainers class is to get the strength and level of the trainer to understand the adaptability of the trainer to the Pokemon */
    String name; int level;
    public Trainers(String name, int level){
        this.name = name;
        this.level = level;
    }
    public Trainers(){
        this("uninputted name", 0);
    }

    //Getter Methods:
    public int getLevel() {
        return level;
    }
    public String getName() {
        return name;
    }

    /* Regular Methods:  */
    

}
