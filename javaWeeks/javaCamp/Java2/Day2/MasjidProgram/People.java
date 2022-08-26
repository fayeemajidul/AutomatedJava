import java.util.Scanner;

public class People {
    //Instance Field:
    String prayerRecital; boolean wudu; Pray pray; Read read;
    //Constructor Field
    public People(Pray pray,  Boolean wudu, Read read){
        this.pray = pray;
        this.wudu = wudu;
        this.read = read;
    }
    public void Namaz(){
        if(wudu = true){
            performRakats();
            Scanner userInput = new Scanner(System.in);
            System.out.println("Would you like to recite the quran?");
            String decision = userInput.nextLine();
            if(decision.toLowerCase().equals("yes")){
                read.canRead();
            }else if(decision.toLowerCase().equals("no")){
                System.out.println("Astagufurallah");
            }
        }
    }
    public void performRakats(){
        for(int i = 0; i < 2; i++){
            pray.reciteSurahs();
        }
    }
}
