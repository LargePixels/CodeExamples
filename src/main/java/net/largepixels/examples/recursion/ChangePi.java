package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/8/19.
 */
public class ChangePi {
    public static void main(String[] args) {
        ChangePi changePi = new ChangePi();
        changePi.runMe();
    }

    private void runMe() {
        String ex1 = "xpix";
        String ex2 = "pip";
        String ex3 = "pipi";

        System.out.println(changePi(ex1));
        System.out.println(changePi(ex2));
        System.out.println(changePi(ex3));
    }

    private String changePi(String str) {

        if (str.length() == 1) {
            return str;
        }

        if (str.isEmpty()) {
            return "";
        }

        String first = "";
        String rest = "";

        if (str.substring(0,2).equals("pi")) {
            first = "3.14";
            rest = str.substring(2, str.length());
        }
        else {
            first = str.substring(0,1);
            rest = str.substring(1, str.length());
        }

        return first + changePi(rest);
    }
}
//012
//pip  = 3


//create space for first
//create space for rest
//if beings with pi place +2 into rest
//place 3.14 into first
//if not begin with pi
//place +1 into first
//place +1 into rest
//changePi(first + changePi(rest));
