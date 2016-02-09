package net.largepixels.examples.generics.example1;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class Song implements Comparable<Song> {

    String title;
    String artist;
    String rating;
    String bpm;

    Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }
}
