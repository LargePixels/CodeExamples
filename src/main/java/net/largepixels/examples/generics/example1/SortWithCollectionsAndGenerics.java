package net.largepixels.examples.generics.example1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class SortWithCollectionsAndGenerics {


    private void runMe() {
        ArrayList<String> songList = new ArrayList();
        songList.add("Queens of the Stoneage - Go With The Flow");
        songList.add("Kinds of Leon - Supersoaker");
        songList.add("Beastie Boys - Sure Shot");

        System.out.println(songList);
        Collections.sort(songList);
        System.out.println("sort it...");
        System.out.println(songList);
        System.out.println("");

        //our song class must implement the Comparable interface before we can call sort on it, String already did that for us

        ArrayList<Song> objSongList = new ArrayList();
        objSongList.add(new Song("Sure Shot", "Beastie Boys", "4", "120"));
        objSongList.add(new Song("Go With the Flow", "Queens of the Stone Age", "5", "155"));
        objSongList.add(new Song("Supersoaker", "Kings of Leon", "4", "135"));

        System.out.println(objSongList);
        Collections.sort(objSongList);
        System.out.println("sort it...");
        System.out.println(objSongList);
        System.out.println("");

        //now lets sort them with a custom comparator

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(objSongList, artistCompare);
        System.out.println("sort by artist comparator...");
        System.out.println(objSongList);
    }

    public static void main(String args[]) {
        SortWithCollectionsAndGenerics sortWithCollectionsAndGenerics = new SortWithCollectionsAndGenerics();
        sortWithCollectionsAndGenerics.runMe();
    }

}
