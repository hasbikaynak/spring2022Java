package day06;

import java.util.Scanner;

public class Day06NestedTernary {
    public static void main(String[] args) {
        /*
            Type java code by using nested ternary.
Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
        */

//        Scanner input = new Scanner(System.in);
//        int leapYear = input.nextInt();

//       String result = leapYear %100 == 0 ? (leapYear %400 == 0 ? "Leap year" : "Not leap year") : (leapYear %4 == 0 ? "Leap" : "Not leap");
//
//        System.out.println(result);

        String s = "Tom Hanks";

        String result2 = s.startsWith("A")? String.valueOf(s.length()): String.valueOf(s.charAt(0));
        System.out.println(result2);

        // String.valueOf() ==> type casting , valueOf() will make it String
        // If you have different data types in ternary, to see outputs on the console you can put the ternary directly inside the sout


    }
}
