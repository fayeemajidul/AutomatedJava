import java.util.*;

public class Main {
    public static void printActions(){
        
        try{
            System.out.println("press 0 -- to create a playlist");
            System.out.println("press 1 -- to add song to the playlist");
            System.out.println("press 2 -- to remove song from the playlist");
            System.out.println("press 3 -- to remove every song from the playlist");
            System.out.println("press 4 -- to quit");
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }

    }
    public static void main(String[] arg){
        try (Scanner scanner = new Scanner(System.in)) {
            boolean quit = false;
            Songs playList = new Songs("PlayList");

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
                        scanner.nextLine();
                        System.out.println("Please enter the Song you'd like to enter");
                        String songName = scanner.nextLine();
                        try{
                            playList.addSongs(songName);

                        }catch(Exception e){
                            System.out.println("Not yet initialized");
                        }
                        break;
                    case 2:
                        scanner.nextLine();
                        System.out.println("Please enter the song you'd like to remove");
                        String removedSong = scanner.nextLine();
                        playList.removeSong(removedSong);    
                        break;                
                    case 3:
                        scanner.nextLine();
                        System.out.println("Are you sure you want to remove every single song from your playlist?");
                        if(scanner.nextLine().toLowerCase().equals("yes")){
                            playList.clearPlaylist();
                            break;
                        }
                    case 4:
                        System.out.println("Quitting the Program");
                        quit = true;

                }
            }
        }
    }
}
