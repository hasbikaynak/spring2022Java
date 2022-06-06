package day05;

import java.util.Scanner;

public class Day05Modulus {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer value");
        int n = scanner.nextInt();

        int absN = Math.abs(n); // this is the absolute value.

        //Ask user to enter an integer the print the last digit of the integer on the console
         int lasDigit =  absN%10;
         System.out.println("Last digit of your number are:" + " " +lasDigit); // takes the last digit of the number.

        //Ask user to enter his birth year, then print just last 2 digits on the console
        int lastTwoDigit = absN % 100;
        System.out.println("Last two digit of your number are:" + " " + lastTwoDigit);

        //Ask user to enter an integer then check if the number is even

        if (absN %2==0 ) {
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }

        //Ask user to enter a 3 digits integer the find the sum of the digits
        int last = absN % 10;

        absN /= 10; // first 2 digits of the number
        int second = absN % 10;

        absN /= 10; //first digit of the number
        int first = absN;


        System.out.println(first + second + last);
    }
}
