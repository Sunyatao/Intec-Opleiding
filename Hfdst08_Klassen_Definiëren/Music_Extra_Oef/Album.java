package Hfdst08_Klassen_Definiëren.Music_Extra_Oef;

public class Album {

    private String albumTitle = "";
    private String artist = "";
    private String[] albumSongArray;
    private int year;

    public Album() {
        this("","",null,0);
    }

    public Album (String albumTitle, String artist, String[] albumSongArray, int year) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.albumSongArray = albumSongArray;
        this.year = 0;
        this.year = year;
    }
}
