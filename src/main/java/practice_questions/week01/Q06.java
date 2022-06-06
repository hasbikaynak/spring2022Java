package practice_questions.week01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        /*
         Ask user to enter a character and check if it is a letter.
         If it is not a letter print "Not Letter" on console.
         If it is letter check if it is lowercase or uppercase letter.
         If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character");
        char value = input.next().charAt(0);

        String result = (value>='A'&&value<='Z' || value>='a' && value<='z') ? (value>='A' && value<='Z'? "UPPERCASE": "lowercase") : "Not Letter";

        System.out.println(result);

//        if (value.replaceAll("[a-z,A-Z]","").length()!=0) {
//
//        }
    }
}
