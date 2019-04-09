package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/3/19.
 */
public class DuplicateRemoval {

    public static void main(String[] args) {
        DuplicateRemoval duplicateRemoval = new DuplicateRemoval();
        duplicateRemoval.runMe();
    }

    private void runMe() {
        String word1 = "buzz";
        String word2 = "pizza";
        String word3 = "a";
        String word4 = "yyzzza";

        System.out.println("----- Recursive Solution -----");

        System.out.println(rmDupesRec(word1));
        System.out.println(rmDupesRec(word2));
        System.out.println(rmDupesRec(word3));
        System.out.println(rmDupesRec(word4));

        System.out.println("----- Iter Solution -----");

        //iterative solution just for fun
        System.out.println(rmDupesIter(word1));
        System.out.println(rmDupesIter(word2));
        System.out.println(rmDupesIter(word3));
        System.out.println(rmDupesIter(word4));
    }

    private String rmDupesIter(String word) {

        char[] chars = word.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            if (i < chars.length - 2 ) {
                while (chars[i] == chars[i+1]) {
                    i++;
                }
                sb.append(chars[i]);
            }
            else {                                      //don't forget to add the last item in the array to SB
                sb.append(chars[i]);
            }

        }

        return sb.toString();
    }

    private String rmDupesRec(String word) {

        if (word.length() == 0 )
            return word;

        if (word.length() >= 2) {
            int i = 0;
            while (word.charAt(i) == word.charAt(i+1) && i < word.length() -2) {
                i++;
            }
            word = word.substring(i);
        }

        String deDuped = rmDupesRec(word.substring(1));

        return word.charAt(0) + deDuped;

    }
}
