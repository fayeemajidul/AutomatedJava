public class Lamborghini extends Car{
    //Instance Fields:
    int speed;
    public Lamborghini(int speed) {
        super(speed);
    }
    public void ChangingGears(){
        if(speed > 10){
            System.out.println("Changing to gear 1");
        }
    }
    @Override
    public void applyingBrakes() {
        super.applyingBrakes();
        System.out.println("Applying Brakes was called from the Child Class");
    }
}