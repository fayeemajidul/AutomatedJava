package Playlist;

public class Song{
    private String title;
    private double duration; 

    public Song(String title, double duration){
        this.title = title;
        this.duration = duration;
    }

    //Instance Methods:
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    ///////////////////////////////////////////////////////////////
    //////////////////////My Implementation////////////////////////
    ///////////////////////////////////////////////////////////////

    // public String toString() {
    //     Song song = new Song(title, duration);
    //     return song.title +  " : " +  song.duration;
    // }

}


