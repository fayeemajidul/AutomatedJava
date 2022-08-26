public class myCaloriePal{
    private String firstName; private String lastName; private int weight; private double height; int age;

    //Mutator Methods: Setters:

    public void setProfileStats(String firstName, String lastName, int weight, double height, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }
    public double getHeight(){
        if(height > 7.0 || height < 4.8){
            System.out.println("Invalid Height Entry, please enter your height in feet w/o special characters");
            return 0;
        }else{
            double convertHeightToCM = (double)(height*30.48);
            return convertHeightToCM;
        }
    }

    public double getCalorieConversions(){
        double bodyWeightInKG = ((double) (weight/.4535));
        double heightInCM = getHeight();
        double maintainenceCalorie = ((double)(66.5+(13.8 * bodyWeightInKG) + 5*(heightInCM) )/(6.8 * age));
        return Math.round(maintainenceCalorie);
    }
    public void getProfileStates(){
        double calories = getCalorieConversions();
        System.out.println("Rendering your Stats:");
        System.out.println("First Name: " + firstName + "\nLast Name: "  + lastName + "\nHeight: " + getHeight() + " Weight: " + weight + " Age: " + age);
        System.out.println("Maintainence Calorie: " + calories);
    }
    
}