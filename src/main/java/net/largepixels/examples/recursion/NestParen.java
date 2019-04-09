package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/8/19.
 *
 * Give me a string, I'll pop off the start and end if they are
 * matching parens pass the rest to the next room if they are not
 * return false
 */
public class NestParen {

    public static void main(String[] args) {
        NestParen nestParen = new NestParen();
        nestParen.runMe();
    }

    private void runMe() {
        String ex1 = "(())";
        String ex2 = "(";
        String ex3 = "((())";
        String ex4 = "((x)))";

        System.out.println(nestParen(ex1));
        System.out.println(nestParen(ex2));
        System.out.println(nestParen(ex3));
        System.out.println(nestParen(ex4));
    }

    private boolean nestParen(String str) {

        if (str.equals("")) {
            return true;
        }

        if (str.length() == 1) {
            return false;
        }

        String first = str.substring(0,1);
        String last = str.substring(str.length() -1 );
        String pass = str.substring(1, str.length() - 1);

        boolean rtn = false;

        if (first.equals("(") && last.equals(")")) {
            rtn = nestParen(pass);
        }

        return (rtn) ?  true : false;

    }
}


