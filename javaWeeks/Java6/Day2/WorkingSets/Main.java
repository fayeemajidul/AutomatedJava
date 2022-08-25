import java.util.*;

public class Main {
    public static void printActions(){
        
        try{
            System.out.println("press 0 -- to create a playlist");
            System.out.println("press 1 -- to add song to the playlist");
            System.out.println("press 2 -- to remove song from the playlist");
            System.out.println("press 3 -- to remove every song from the playlist");
            System.out.println("press 5 -- to merge playlists");
            System.out.println("press 5 -- to quit");
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }

    }
    public static void main(String[] arg){
        Scanner scanner  = new Scanner(System.in);
        boolean quit = false;

        while(!quit){
            System.out.println("\t WELCOME TO THE SPOTIFY PLAYLIST");
            printActions();
            int userInput = scanner.nextInt();
            switch(userInput){
                case 0:
                    scanner.nextLine();
                    System.out.println("Please enter a name for the Playlist");
                    String playlistName = scanner.nextLine();
                    new Songs(playlistName);
                    break;
                case 1:
                    System.out.println("Please enter the Song you'd like to enter");
                    String songName = scanner.nextLine();
                case 5:
                    System.out.println("Quitting the Program");
                    quit = true;

            }
        }
    }
}
