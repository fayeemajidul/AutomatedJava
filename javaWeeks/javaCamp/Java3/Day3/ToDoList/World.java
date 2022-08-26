public class World{
    //Instance Field:
    Human human;
    Nature nature;
    Animals animal;
    public World(Human human, Nature nature, Animals animals){
        this.human = human;
        this.nature = nature;
        this.animal = animals;

    }
    public void worldFormation(){
        System.out.println(animal.getLegs());
        animal.eatFunction();
        animal.mateFunction();
        human.getHeartRate();
        nature.getBodiesOfWater();
        nature.homeForAnimals();
    }

}
