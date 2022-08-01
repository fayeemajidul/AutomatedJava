public class Printer{
    //Instance Field:
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplex;
    //Constructor Method:
    public Printer(int tonerLevel, int pagesPrinted, boolean duplex){
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }
    //Instance Methods:
    public int addToner(int tonerAmount){
        if(tonerAmount + tonerAmount > 100){
            return -1;
        }else{
            return tonerAmount += tonerAmount;
        }
    }
    //Getter Methods:
    public boolean getDuplex(){
        return duplex;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}


