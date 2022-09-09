public class Motherboad {
    //Instance Field:
    private String model; private String manufacurer; private int ramSlots; private int cardSlots; String bios;

    //Constructor Method:
    public Motherboad(String model, String manufacurer, int ramSlots, int cardSlots,  String bios){
        this.model = model;
        this.manufacurer = manufacurer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    //Accessor Methods:
    public String getModel(){
        return model;
    }
    public String getManufacturer(){
        return manufacurer;
    }
    public int getRamSlots(){
        return ramSlots;
    }
    public int getCardSlots(){
        return cardSlots;
    }
    public String getBios(){
        return bios;
    }

    //Mutational Method:
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading . . .");
    }
}
