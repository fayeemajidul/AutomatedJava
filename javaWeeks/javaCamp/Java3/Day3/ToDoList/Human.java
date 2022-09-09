import java.util.Random;

public class Human {
    //Instance Field:
    private String name; private int age; private int brain; private int legs;
    public Human(String name, int age, int brain, int legs){
        this.name = name;
        this.age = age;
        this.brain = brain;
        this.legs = legs;
    }
    //Instance Methods:
    public int randomNumber(){
        Random rand = new Random();
        int numberGenerator = rand.nextInt(0,1000);
        return numberGenerator;
    }
    public void getHeartRate(){
        int rand = randomNumber();
        System.out.println(name + " heart rate is at " + rand);
    }

    //Getters: 
    public int getAge() {
        return age;
    }
    public int getBrain() {
        return brain;
    }
    public int getLegs() {
        return legs;
    }
    public String getName() {
        return name;
    }
}