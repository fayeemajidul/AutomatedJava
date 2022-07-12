public class Day1{
    //Instance Field
    public Day1(){} //Constructor Class
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else if(kiloBytes >= 0){
            int megabytes = kiloBytes/1024;
            int remainingKB  = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megabytes + "MB and " + remainingKB + " KB.");
        }
    }
}