package day06;

import java.util.Scanner;

public class Day06NestedIfStatement02 {
    public static void main(String[] args) {
        /*
        Type java code by using nested if() statement.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");
        int leapYear = input.nextInt();

        boolean myCondition = (leapYear %100 == 0 && leapYear %400 == 0) || (leapYear %100 != 0 && leapYear %4 == 0);

        String result = myCondition ? "Leap year" : "Not a leap year";
        System.out.println(result);
    }
}
