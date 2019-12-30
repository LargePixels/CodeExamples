package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/9/19.
 */
public class PairStar {

    public static void main(String[] args) {
        PairStar pairStar = new PairStar();
        pairStar.runMe();
    }

    private void runMe() {

        String ex1 = "hello";
        String ex2 = "xxyy";
        String ex3 = "aaaa";

        System.out.println(pairStar(ex1));
        System.out.println(pairStar(ex2));
        System.out.println(pairStar(ex3));

    }

    //abc    length = 3
    //012
    public String pairStar(String str) {

        if (str.equals("")) {
            return "";
        }

        if (str.length() == 1) {
            return str;
        }

        String first = str.substring(0,1);
        String second = str.substring(1,2);
        String joined = "";

        if (first.equals(second)) {
            joined = first + "*";
        }
        else {
            joined = first;
        }

        return joined + pairStar(str.substring(1,str.length()));

    }

}
