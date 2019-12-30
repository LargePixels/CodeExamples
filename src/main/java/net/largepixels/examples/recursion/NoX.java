package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/9/19.
 */
public class NoX {

    public static void main(String[] args) {
        NoX noX = new NoX();
        noX.runMe();
    }

    private void runMe() {

        /*
            noX("xaxb") → "ab"
            noX("abc") → "abc"
            noX("xx") →
        */

        String ex1 = "xa";
        String ex2 = "xaxb";
        String ex3 = "abc";
        String ex4 = "xx";

        System.out.println(noX(ex1));
        System.out.println(noX(ex2));
        System.out.println(noX(ex3));
        System.out.println(noX(ex4));

    }

    public String noX(String str) {

        if (str.equals("")) {
            return "";
        }

        String head = str.substring(0,1);
        String tail = str.substring(1, str.length());

        if (head.equals("x")) {
            head = "";
        }

        return head + noX(tail);

    }

}
