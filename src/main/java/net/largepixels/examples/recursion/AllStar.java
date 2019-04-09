package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/5/19.
 */
/*
  Place a pound sign between all characters in a string recursively.
 */
public class AllStar {

    public static void main(String[] args) {
        AllStar allStar = new AllStar();
        allStar.runMe();
    }

    private void runMe() {
        String word1 = "abc";
        String word2 = "ab";
        String word3 = "3.14";
        String word4 = "";

        System.out.println(allStar(word1));
        System.out.println(allStar(word2));
        System.out.println(allStar(word3));
        System.out.println(allStar(word4));
    }

    public String allStar(String str) {
        if (str.equals("")) {
            return "";
        }

        String f = String.valueOf(str.charAt(0));
        String r = str.substring(1);

        String rtn = allStar(r);

        if (!rtn.equals("")) {
            rtn = "*" + rtn;
        }

        return f + rtn;
    }

}
