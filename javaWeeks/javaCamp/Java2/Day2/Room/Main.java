public class Main{
    // Instnce Field
    public Main(){}
    public static void main(String[] args) {
        BedClass sleepy = new BedClass(5);
        People tommy = new People("tommy", 16);
        PlantClass plantMan = new PlantClass("Planty", 55, 1);
        DeskClass desk = new DeskClass(4, 4, tommy);
        Room myRoom = new Room(plantMan, desk, sleepy);
        myRoom.fullRoom();
    }
}