public class Animals {
    //What do Animals Have:
    private int brain; private int legs; private String name;
    public Animals(String name, int brain, int legs){
        this.name = name;
        this.brain = brain;
        this.legs = legs;
    }
    public void eatFunction(){
        System.out.println(name + " Is Eating");
    }
    public void huntFunction(){
        System.out.println(name + " is Hunting.");
    }
    public void mateFunction(){
        System.out.println(name + " is Mating.");
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
