package day09;

import java.util.Scanner;

public class Day09StringManipulations01 {
    public static void main(String[] args) {
        /*
      *********** EBAY Interview Question *********** Type code to print just the unique characters in a String
        "Hello" ==> Heo
        * if indexOf() != lastIndexOf() then it`s not unique
        * */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to print its unique characters");
        String str = input.nextLine();

        char charAt0 = str.charAt(0);
        if (str.indexOf(charAt0) == str.lastIndexOf(charAt0)) {
            System.out.print(charAt0);
        }
        char charAt1 = str.charAt(1);
        if (str.indexOf(charAt1) == str.lastIndexOf(charAt1)) {
            System.out.print(charAt1);
        }
        char charAt2 = str.charAt(2);
        if (str.indexOf(charAt2) == str.lastIndexOf(charAt2)) {
            System.out.print(charAt2);
        }
        char charAt3 = str.charAt(3);
        if (str.indexOf(charAt3) == str.lastIndexOf(charAt3)) {
            System.out.print(charAt3);
        }
        char charAt4 = str.charAt(4);
        if (str.indexOf(charAt4) == str.lastIndexOf(charAt4)) {
            System.out.print(charAt4);
        }
    }
}
