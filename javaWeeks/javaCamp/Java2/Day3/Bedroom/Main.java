public class Main{
    //Instance Field:
    //Constructor Field:
    public Main(){}
    public static void main(String[] args) {
        Brightness roomBrightness= new Brightness(72, .05, "Purple");
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12, "Off-White");
         
        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75, roomBrightness);

        Bedroom bedRoom = new Bedroom(wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}