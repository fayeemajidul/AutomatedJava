import java.util.ArrayList;
import java.util.Scanner;

public class IP{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        ipFormat();
    }
    public static void ipFormat(){
        System.out.println("Please enter your IP address");
        ArrayList <Object> IPS = new ArrayList<Object>();
        String IP = scan.nextLine();
        char [] charIPArray= IP.toCharArray();
        for(int i = 0; i < charIPArray.length; i++){
            IPS.add(charIPArray[i] + ".");
        }  

        List <
    }
}