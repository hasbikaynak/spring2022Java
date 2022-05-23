package PracticeQuestions;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
        Type java code by using ternary. Ask user to enter two integers
        Write a program to print the maximum  one on the console.(Do not forget they may be equal)
        Critical values =( 1 , 1 ), (1,2)
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = input.nextInt();
        System.out.println("Please enter the first number");
        int b = input.nextInt();

        System.out.println(a==b? ("They are equal"):(a>b ?  "Maximum value is " + " " + a :   "Maximum value is "+ " " + b ));



    }
}
