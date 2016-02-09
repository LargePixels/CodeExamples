package net.largepixels.examples.generics.example4;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by johnminchuk on 2/9/16.
 */
public class TreeSetExample {

    class Book implements Comparable {
        String title;
        int rating;

        Book(String t, int r) {
            title = t;
            rating = r;
        }

        public int compareTo(Object b) {
            Book book = (Book) b;
            return title.compareTo(book.title);
        }

        public String toString() {
            return title;
        }
    }

    private void runMe() {
        TreeSet<Book> books = new TreeSet();
        books.add(new Book("Seven Habbits", 5));
        books.add(new Book("Girl with the Dragon Tattoo", 4));
        books.add(new Book("Seven Hobbits", 5 ));

        System.out.println(books);

        TreeSet<Book> booksRated = new TreeSet<>(new BookRatingCompare());
        booksRated.add(new Book("Seven Habbits", 5));
        booksRated.add(new Book("Girl with the Dragon Tattoo", 4));
        booksRated.add(new Book("Seven Hobbits", 5 ));

        System.out.println(booksRated);
        //The Seven H books both have a rating of 5 and that makes them equal, one of them will be removed, this is a set after all, here's a good example of how not to use this.
        //remember a treeset can keep unique items sorted, if they aren't unique they get replaced..

    }

    class BookRatingCompare implements Comparator<Book> {
        public int compare(Book one, Book two) {
            return two.rating - one.rating;
        }
    }

    public static void main(String args[]) {
        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.runMe();
    }
}
