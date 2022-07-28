public class Lamp{
    //Instance Field:
    private String style; private boolean battery; private int globRating; private Brightness bright;

    //Constructor Field:
    //You will need to intialize the Bright In the Main Method:
    
    public Lamp(String style, boolean battery, int globRating, Brightness bright){
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
        this.bright = bright;
    }
    //Instance Methods:
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
        bright.brightnessFeature();
    }

    //Getters:
    public String getStyle(){
        return style;
    }
    public boolean battery(){
        return battery;
    }
    public int globRating(){
        return globRating;
    }
}