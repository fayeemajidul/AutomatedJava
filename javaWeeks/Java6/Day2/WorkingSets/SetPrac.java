import java.util.HashSet;
import java.util.*;

public class SetPrac{
    //INSTANCE FIELD:
    String playlistName;
    Set <String> songSet;

    //Creating a PlayList:

    public SetPrac(String playlistName){
        this.playlistName = playlistName;
        songSet = new HashSet<>();
    }

    //Instance Methods:

    public String getPlaylistName() {
        return playlistName;
    }
    public Set<String> getSongSet() {
        //Secures our data.
        return new HashSet<>();
    }

    public void addSongs(){
        songSet.add("Adding a Song");

    }
}