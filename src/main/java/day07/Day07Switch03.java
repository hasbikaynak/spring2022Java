package day07;

import java.util.Locale;
import java.util.Scanner;

public class Day07Switch03 {
    public static void main(String[] args) {
        //Ask user to enter a character if it`s a vowel letter print "Vowel", if it`s not vowel print "Not vowel", if it`s not a letter print "Enter a letter".

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter to check if it`s vowel or not");
        char letter = input.next().toLowerCase().charAt(0);

        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
                System.out.println("Not vowel");
                break;
            default:
                System.out.println("Enter a letter");
        }
    }
}
