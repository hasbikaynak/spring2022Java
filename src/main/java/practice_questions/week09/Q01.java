package practice_questions.week09;

import java.util.Scanner;

public class Q01 {
    //Ask user to enter 2 chars and print on console the chars between them.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first char");
        char char1 = input.next().charAt(0);
        System.out.println("enter second char");
        char char2 = input.next().charAt(0);

        int first =Math.min(char1,char2);
        int second =Math.max(char1,char2);

            for (int i = first + 1; i < second; i++) {
                System.out.print((char)i+ " ");
            }

    }
}
