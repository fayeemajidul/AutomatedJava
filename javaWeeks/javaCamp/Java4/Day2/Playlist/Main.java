package Playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main{

    private static ArrayList <Album> albums = new ArrayList<Album>();
    
    private static void play(LinkedList <Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        scanner.close();
        ListIterator <Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
        }else{
            System.out.println("Now playing, " + listIterator.next().toString());
            //printmenu();
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
                if(!forward) {
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()) {
                    System.out.println("Now playing " + listIterator.next().toString());
                } else {
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
                break;

                case 2:
                if(forward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now Playing " + listIterator.previous().toString());
                }else{
                    System.out.println("We are the start of the playlist");
                    forward = true;
                }
                    break;

                case 3:
                if(forward){
                    //need to figure out direction
                    if(listIterator.hasPrevious()){
                        System.out.println("Now replaying song" + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the list");     
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                }
                    break;

                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available Actions: \n press");
        System.out.println("1 - to quit");
        System.out.println("2 - to play next song");
        System.out.println("3 - to go back to prev");
        System.out.println("4- to list all songs");
        System.out.println("5 - to print actions");

    }
    private static void printList(LinkedList <Song> playList){
        Iterator <Song> iterator = playList.iterator();
        System.out.println ("======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println ("======================");
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
        albums.get(0).addToPlayList("Stormbringer", playList);
        albums.get(0).addToPlayList("Loved you", playList);
        albums.get(0).addToPlayList("mackindatshaadi", playList);
        albums.get(0).addToPlayList("withoutU", playList);
        albums.get(0).addToPlayList("chasingThatJD", playList);
        albums.get(0).addToPlayList(2, playList);
        albums.get(1).addToPlayList(3, playList);
        play(playList);

    }
}
