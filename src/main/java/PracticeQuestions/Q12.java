package PracticeQuestions;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Ask user to enter a String and count the number of 'a's come earlier than first occurrence of 'c'.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value");
        String s = input.next().toLowerCase(); // alabamacadacabaladi

        int countA = 0;


        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                    countA++;
            } else if (s.charAt(i)=='c') {
                break;
            }
        }
        System.out.println(countA); // 4
    }
}
