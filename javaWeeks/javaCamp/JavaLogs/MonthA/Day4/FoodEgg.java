abstract class FoodMacro{
    //Create an Abstract class that can then be implemented or extended by base classes.
    double proteins;
    double fats;
    double carbs;
    double tastyScore;

    abstract void getMacroNutrients();
}

public class FoodEgg extends FoodMacro{
    //Food utilizes the Abstract class
    int tastyScore = 7;
    String type = "non-vegetarian";

    public FoodEgg(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;

    }
    @Override
    void getMacroNutrients() {
        System.out.println("An egg has " + this.proteins + " gms of protein, " + this.fats + " gms of fat and " + this.carbs + " gms of carbohydrates.");        
    }
}

class FoodCarbs extends FoodMacro{
    int tastyScore = 8;
    String type = "vegetarian";

    public FoodCarbs(double proteins, double fats, double carbs){
        this.proteins = proteins;
        this.fats = fats;
        this.carbs = carbs;

    }

    @Override
    void getMacroNutrients() {
        System.out.println("A slice of bread has " + this.proteins + " gms of protein, " + this.fats + " gms of fat and " + this.carbs + " gms of carbohydrates.");        
    }
}