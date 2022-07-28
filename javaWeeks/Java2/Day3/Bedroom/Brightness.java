public class Brightness {
    //Instance Field:
    private int brightness; private double opacity; private String lightColor;
    //Constructor Method:
    public Brightness(int brightness, double opacity, String lightColor){
        this.brightness = brightness;
        this.opacity = opacity;
        this.lightColor = lightColor;
    }

    public void brightnessFeature(){
        System.out.println("Light Sensitivity Mode is on, your brightness is at " + brightness + ". Your opacity is at " + opacity + ". The color of your lights are " + lightColor + ".");

    }
}
