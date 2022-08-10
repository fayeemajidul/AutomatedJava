package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main{

    private static ArrayList <Album> albums = new ArrayList<Album>();
    private static void play(LinkedList <Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator <Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
        }else{
            System.out.println("Now playing, " + listIterator.next().toString());
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                //If quit:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
        
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;
                    
                case 4:
                

            }
        }
    }

    public static void main(String[] args) {
        //NEW INSTANCE
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.5);
        album.addSong("Loved you", 31.4);
        album.addSong("mackindatshaadi", 4.5);
        album.addSong("To the ceiling", 3.5);
        album.addSong("withoutU", 2.4);
        album.addSong("chasingThatJD", 3.1);
        album.addSong("doinga180*", 5);
        albums.add(album);

        //NEW INSTANCE
        album = new Album("Euphoria", "BTS");
        album.addSong("Loveyrselfpt2", 4.5);
        album.addSong("AirPlanePT2", 31.4);
        album.addSong("Butter", 4.5);
        album.addSong("Ceiling", 3.5);
        album.addSong("Euphoria", 2.4);
        album.addSong("Anpanman", 3.1);
        album.addSong("ON", 5);
        albums.add(album);

        LinkedList <Song> playList = new LinkedList<Song>();
        //INDEX 0: represents the album in the LinkedList, not the Song
        albums.get(1).addToPlayList("AirPlanePT2", playList);
        albums.get(1).addToPlayList("Euphoria", playList);
        albums.get(0).addToPlayList("Speed King", playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        play(playList);

    }
}
