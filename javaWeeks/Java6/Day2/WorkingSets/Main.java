import java.util.*;

public class Main {
    public static void main(String[] arg){
        Scanner scanner  = new Scanner(System.in);
        SetPrac setPrac = new SetPrac("SongsByYourMom");
        boolean quit = false;

        while(!quit){
            System.out.println("\t WELCOME TO THE SPOTIFY PLAYLIST");
            int userInput = scanner.nextInt();
            switch(userInput){
                case 0:
                    System.out.println("Quitting the Program");
                    quit = true;

            }
        }
    }
}
