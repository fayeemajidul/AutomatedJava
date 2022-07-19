package Day1;
public class Car{
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //Mutator Variable: Object gets initialized and passes its argument into String model to update value of String.

    public void getModel(String model){ 
        this.model = model;
    }
}