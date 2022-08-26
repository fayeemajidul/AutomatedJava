public class BedClass {
    int napTime;
    public BedClass(int napTime){
        this.napTime = napTime;
    }
    public void energyRejuvenator(){
        if(napTime >= 9){
            System.out.println("You are more than rested, might even be dead");
        }else if (napTime > 2 && napTime <= 8){
            System.out.println("You have the perfect level of energy");
        }else{
            System.out.println("Not rested enough or too much rest !");
        }
    }    
}
