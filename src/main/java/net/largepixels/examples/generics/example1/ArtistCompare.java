package net.largepixels.examples.generics.example1;

import java.util.Comparator;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class ArtistCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
        return one.artist.compareTo(two.artist);
    }
}
