package PracticeQuestions;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
        * Ask user to enter two words. If the number of characters of the first word is even, then put the second word into the middle of the first word.
		 If the number of characters of second word is odd, then print on console "You can not put second word into the middle of the first word. Because it's number of character is odd.".
		 * */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String firstWord = input.next(); // Mehmet

        System.out.println("Enter second word");
        String secondWord = input.next(); // Hasbi

        if (firstWord.length() %2 == 0) {
            String firstWordByHalfBefore = firstWord.substring(0,firstWord.length()/2); //Meh
            String firstWordByHalfAfter = firstWord.substring(firstWord.length()/2); //met

            System.out.println(firstWordByHalfBefore + secondWord + firstWordByHalfAfter);
        }else {
            System.out.println("You can not put second word into the middle of the first word. Because it's number of character is odd.");
        }

    }
}
