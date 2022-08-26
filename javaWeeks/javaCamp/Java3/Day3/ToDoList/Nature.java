public class Nature {
    //Instance Field:
    private int bodiesOfWater; private int natureParks; private int Trees; private Animals animals;
    //Constructor Method:
    public Nature(int bodiesOfWater, int natureParks, int Trees){
        this.bodiesOfWater = bodiesOfWater; 
        this.natureParks = natureParks; 
        this.Trees = Trees;
    }
    public void homeForAnimals(){
        Animals animals = new Animals("Dory", 1, 2);
        animals.getLegs();
        int animalLegs = animals.getLegs();
        if(animalLegs > 0){
            System.out.println("Building a home for " + animals.getName());
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////
    //BECOME FUCKING SUCCESSFUL FAYEEM, BE SUCCESSFUL IMPROVE YOURSELF DEVELOP YOURSELF!
    ////////////////////////////////////////////////////////////////////////////////////

    public int getBodiesOfWater() {
        return bodiesOfWater;
    }
    public int getNatureParks() {
        return natureParks;
    }
    public int getTrees() {
        return Trees;
    }
}
