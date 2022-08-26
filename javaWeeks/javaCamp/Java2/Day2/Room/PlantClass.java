public class PlantClass{
    //Instance Field:
    String plantName;
    int waterLevel;
    int fruits;
    //Constructor Class:
    public PlantClass(String plantName, int waterLevel, int fruits){
        this.plantName = plantName; 
        this.waterLevel = waterLevel;
        this.fruits = fruits;
    }
    //Instance Methods:
    public void plantStatus(){
        if(waterLevel >= 75){
            deadPlant();
            System.out.println("plant is dead");
        }else if(waterLevel > 25 && waterLevel < 75){
            fruits += 1;
            System.out.println("plant is not dead");

        }else{
            deadPlant();
            System.out.println("plant is dead");
        }
    }
    public void waterPlants(){
        System.out.println("Watering your plants!");
        fruits += 10;
        waterLevel += 40;
    }
    public void deadPlant(){
        waterLevel -= waterLevel;
        System.out.println(" Oh no you either water your plant too much or you didn't water it enough !");
        System.out.println(waterLevel);
    }

    //Accessor Methods:
    public String getPlantName(){
        return plantName;
    }
    public int waterLevel(){
        return waterLevel;
    }
    public int fruits(){
        return fruits;
    }
}