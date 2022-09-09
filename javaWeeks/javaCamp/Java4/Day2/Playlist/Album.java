package Playlist;
import java.util.ArrayList;
import java.util.LinkedList;

public class Album{
    String name;
    ArrayList <Song> songs;
    String artist;

    //Constructor Method:
    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    //Instance Methods:
    public boolean addSong(String title, double duration){
        //Checks is Songs were added
        // I would need a findSong method?
        if(findSong(title) == null){
            //Add Song, because Arraylist is empty
            this.songs.add(new Song(title, duration));
        }
        return false;
    }
    private Song findSong(String title){
        //Alternative way to check list of entries.
        //Test to see if song exists: Null if it doesn't exist:
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNumber, LinkedList <Song> playList){
        int index = trackNumber -1; //represents the end of the list.

        //if the songs are within the range. Add the song to the list.

        if((index > 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong =  findSong(title);
        if(checkedSong!=null){
            playlist.add(checkedSong);
            return true;

        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }


}