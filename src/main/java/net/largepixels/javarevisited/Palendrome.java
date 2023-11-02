package net.largepixels.javarevisited;

import java.util.Scanner;

public class Palendrome {

    public static void main(String args[]) {

        System.out.println("Please Enter a number : ");
        int palindrome = new Scanner(System.in).nextInt();

        System.out.println( 12345 % 10);

        if (isPalindrome(palindrome)) {
            System.out.println("Number : " + palindrome + " is a palindrome");
        } else {
            System.out.println("Number : " + palindrome + " is not a palindrome");
        }

    }

    /*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;  // get last num
            reverse = reverse * 10 + remainder;  //append remainder to reverse
            palindrome = palindrome / 10;  //remove last number
        }

        // if original and the reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {  // equals works here because these are not strings..
            return true;
        }
        return false;
    }

}



