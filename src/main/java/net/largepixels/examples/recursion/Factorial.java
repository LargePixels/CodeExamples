package net.largepixels.examples.recursion;

/**
 * Created by johnminchuk on 4/8/19.
 */
public class Factorial {

    public static void main(String[] args) {
        Factorial fib = new Factorial();
        fib.runMe();
    }

    private void runMe() {

        int test1 = 1;  //1 = 1
        int test2 = 2;  //2 * 1 = 2
        int test3 = 3;  //3 * 2 * 1 = 6
        int test4 = 4;  //4 * 3 * 2 * 1 = 24

        System.out.println(factorial(test1));
        System.out.println(factorial(test2));
        System.out.println(factorial(test3));
        System.out.println(factorial(test4));

    }

    private int factorial(int n) {

        if (n == 1) return 1;

        return n * factorial(n - 1);

    }
}