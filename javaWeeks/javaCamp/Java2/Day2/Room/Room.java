public class Room{
    //Instance Class:
    PlantClass plant; DeskClass desk; BedClass bed; 
    //Constructor Class:
    public Room(PlantClass plant, DeskClass desk, BedClass bed){
        this.plant = plant;
        this.desk = desk;
        this.bed = bed;
    }
    public void fullRoom(){
        //Serves as driver code, you should be able to reference each of the objects from each class.
        plant.plantStatus();
        System.out.println(plant.plantName);

        desk.personStudying();
        //Person is tired go nap.
        bed.energyRejuvenator();
    }
}